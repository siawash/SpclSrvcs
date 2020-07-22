package com.behsazan.dmnsrvcs.fnrspclsrvcs.common;

import com.google.gson.JsonObject;
import io.jsonwebtoken.Claims;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class AppLogger {

    private Logger core2Logger = LogManager.getLogger("core2Logger");    

	public void log(JsonObject info) {
		core2Logger.info(info);
	}	

	public void log(Claims claims) {
		core2Logger.info(AppUtil.toJson(claims));
	}	
	
	public void log(String message) {
		core2Logger.info(message);
	}
}

