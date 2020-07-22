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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBCSAM1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBCSAM1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUACSMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUACSMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BBankingCustomerAmntOperationService;

@Api(value = "BBankingCustomerAmntOperationRest")
@RestController
@RequestMapping("/srvBBankingCustomerAmntOperation")
public class BBankingCustomerAmntOperationRest {
	@Autowired
	private BBankingCustomerAmntOperationService BBankingCustomerAmntOperationService;


	@ApiOperation(tags = "BBankingCustomerAmntOperation", value = " - EGBCSAM1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBCSAM1")
	public EGBCSAM1Response EGBCSAM1(@RequestBody EGBCSAM1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingCustomerAmntOperationService.EGBCSAM1(request);
	}

	@ApiOperation(tags = "BBankingCustomerAmntOperation", value = " - EUACSMN2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUACSMN2")
	public EUACSMN2Response EUACSMN2(@RequestBody EUACSMN2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingCustomerAmntOperationService.EUACSMN2(request);
	}

}
