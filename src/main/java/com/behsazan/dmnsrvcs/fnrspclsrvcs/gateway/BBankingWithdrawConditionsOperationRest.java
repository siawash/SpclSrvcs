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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCWDWC3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCWDWC3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCCWC4Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCCWC4Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICWDWC2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICWDWC2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BBankingWithdrawConditionsOperationService;

@Api(value = "BBankingWithdrawConditionsOperationRest")
@RestController
@RequestMapping("/srvBBankingWithdrawConditionsOperation")
public class BBankingWithdrawConditionsOperationRest {
	@Autowired
	private BBankingWithdrawConditionsOperationService BBankingWithdrawConditionsOperationService;


	@ApiOperation(tags = "BBankingWithdrawConditionsOperation", value = " - EGCWDWC3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCWDWC3")
	public EGCWDWC3Response EGCWDWC3(@RequestBody EGCWDWC3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingWithdrawConditionsOperationService.EGCWDWC3(request);
	}

	@ApiOperation(tags = "BBankingWithdrawConditionsOperation", value = " - EICCCWC4", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEICCCWC4")
	public EICCCWC4Response EICCCWC4(@RequestBody EICCCWC4Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingWithdrawConditionsOperationService.EICCCWC4(request);
	}

	@ApiOperation(tags = "BBankingWithdrawConditionsOperation", value = " - EICWDWC2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEICWDWC2")
	public EICWDWC2Response EICWDWC2(@RequestBody EICWDWC2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingWithdrawConditionsOperationService.EICWDWC2(request);
	}

}
