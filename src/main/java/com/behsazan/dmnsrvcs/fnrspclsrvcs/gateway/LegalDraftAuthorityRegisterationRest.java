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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICACAU1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICACAU1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICRDAU3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICRDAU3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCRDS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCRDS3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.LegalDraftAuthorityRegisterationService;

@Api(value = "LegalDraftAuthorityRegisterationRest")
@RestController
@RequestMapping("/srvLegalDraftAuthorityRegisteration")
public class LegalDraftAuthorityRegisterationRest {
	@Autowired
	private LegalDraftAuthorityRegisterationService LegalDraftAuthorityRegisterationService;


	@ApiOperation(tags = "LegalDraftAuthorityRegisteration", value = " - EICACAU1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEICACAU1")
	public EICACAU1Response EICACAU1(@RequestBody EICACAU1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return LegalDraftAuthorityRegisterationService.EICACAU1(request);
	}

	@ApiOperation(tags = "LegalDraftAuthorityRegisteration", value = " - EICRDAU3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEICRDAU3")
	public EICRDAU3Response EICRDAU3(@RequestBody EICRDAU3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return LegalDraftAuthorityRegisterationService.EICRDAU3(request);
	}

	@ApiOperation(tags = "LegalDraftAuthorityRegisteration", value = " - EUCCRDS3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUCCRDS3")
	public EUCCRDS3Response EUCCRDS3(@RequestBody EUCCRDS3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return LegalDraftAuthorityRegisterationService.EUCCRDS3(request);
	}

}
