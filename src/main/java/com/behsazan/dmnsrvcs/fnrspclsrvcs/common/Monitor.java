package com.behsazan.dmnsrvcs.fnrspclsrvcs.common;

import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.common.Response;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Monitor {

	@Autowired
	private AppLogger appLogger;

	@Value("${spring.profiles.active}")
	private String profile;

	@Around(value = "execution(* com.behsazan.dmnsrvcs.fnrspclsrvcs.dao.*.*(..)) && args(input)")
   public Object log(ProceedingJoinPoint joinPoint, Object input) {

		JsonObject core2LogData = null;
		Response response;

		try {

			if (input instanceof Request) {
				core2LogData = ((Request) input).getLogInfo(profile);
				response = (Response) joinPoint.proceed();
				if (response.getErrorCode() != 0)
					core2LogData.addProperty("errorType", "20");
			} else {
				return joinPoint.proceed();
			}			

		} catch (Throwable throwable) {

			if (core2LogData == null)
				core2LogData = new JsonObject();

			core2LogData.addProperty("exception", throwable.getMessage() + " - cause: " + throwable.getCause());
			core2LogData.addProperty("errorType", "30");

			Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
			@SuppressWarnings("unchecked")
			Class<Response> clazz = (Class<Response>) method.getReturnType();
			try {
				response = clazz.newInstance();
				response.setException(throwable.getMessage());
				response.setErrorCode(-100);
			} catch (Exception e) {
				response = Response.getInstance(-100, e.getMessage());
			}
		}

		core2LogData.add("output", AppUtil.toJsonElement(response));
		appLogger.log(core2LogData);

		return response;
	}
}

