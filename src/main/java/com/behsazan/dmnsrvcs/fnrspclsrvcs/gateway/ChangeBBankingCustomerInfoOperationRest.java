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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGICHAC5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGICHAC5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUICPSW3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUICPSW3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUISTCM3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUISTCM3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.ChangeBBankingCustomerInfoOperationService;

@Api(value = "ChangeBBankingCustomerInfoOperationRest")
@RestController
@RequestMapping("/srvChangeBBankingCustomerInfoOperation")
public class ChangeBBankingCustomerInfoOperationRest {
	@Autowired
	private ChangeBBankingCustomerInfoOperationService ChangeBBankingCustomerInfoOperationService;


	@ApiOperation(tags = "ChangeBBankingCustomerInfoOperation", value = " - EGICHAC5", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGICHAC5")
	public EGICHAC5Response EGICHAC5(@RequestBody EGICHAC5Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return ChangeBBankingCustomerInfoOperationService.EGICHAC5(request);
	}

	@ApiOperation(tags = "ChangeBBankingCustomerInfoOperation", value = " - EUICPSW3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUICPSW3")
	public EUICPSW3Response EUICPSW3(@RequestBody EUICPSW3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return ChangeBBankingCustomerInfoOperationService.EUICPSW3(request);
	}

	@ApiOperation(tags = "ChangeBBankingCustomerInfoOperation", value = " - EUISTCM3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUISTCM3")
	public EUISTCM3Response EUISTCM3(@RequestBody EUISTCM3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return ChangeBBankingCustomerInfoOperationService.EUISTCM3(request);
	}

}
