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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICFRMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICFRMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICRGMO3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICRGMO3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EISACRD1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EISACRD1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.MobileNoRegistrationService;

@Api(value = "MobileNoRegistrationRest")
@RestController
@RequestMapping("/srvMobileNoRegistration")
public class MobileNoRegistrationRest {
	@Autowired
	private MobileNoRegistrationService MobileNoRegistrationService;


	@ApiOperation(tags = "MobileNoRegistration", value = " - EICFRMN2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEICFRMN2")
	public EICFRMN2Response EICFRMN2(@RequestBody EICFRMN2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return MobileNoRegistrationService.EICFRMN2(request);
	}

	@ApiOperation(tags = "MobileNoRegistration", value = " - EICRGMO3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEICRGMO3")
	public EICRGMO3Response EICRGMO3(@RequestBody EICRGMO3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return MobileNoRegistrationService.EICRGMO3(request);
	}

	@ApiOperation(tags = "MobileNoRegistration", value = " - EISACRD1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEISACRD1")
	public EISACRD1Response EISACRD1(@RequestBody EISACRD1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return MobileNoRegistrationService.EISACRD1(request);
	}

}
