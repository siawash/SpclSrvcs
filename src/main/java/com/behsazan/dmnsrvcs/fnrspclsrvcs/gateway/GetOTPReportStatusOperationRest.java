package com.behsazan.dmnsrvcs.fnrspclsrvcs.gateway;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import io.jsonwebtoken.Claims;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import springfox.documentation.annotations.ApiIgnore;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EROTPRE3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EROTPRE3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.GetOTPReportStatusOperationService;

@Api(value = "GetOTPReportStatusOperationRest")
@RestController
@RequestMapping("/srvGetOTPReportStatusOperation")
public class GetOTPReportStatusOperationRest {
	@Autowired
	private GetOTPReportStatusOperationService GetOTPReportStatusOperationService;


	@ApiOperation(tags = "GetOTPReportStatusOperation", value = " - EROTPRE3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEROTPRE3")
	public EROTPRE3Response EROTPRE3(@RequestBody EROTPRE3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return GetOTPReportStatusOperationService.EROTPRE3(request);
	}

}
