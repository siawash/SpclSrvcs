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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUNLC1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUNLC1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGHCUST5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGHCUST5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCANCU1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCANCU1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCDTCU3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCDTCU3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCHNGS1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCHNGS1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BranchOTPTOperationService;

@Api(value = "BranchOTPTOperationRest")
@RestController
@RequestMapping("/srvBranchOTPTOperation")
public class BranchOTPTOperationRest {
	@Autowired
	private BranchOTPTOperationService BranchOTPTOperationService;


	@ApiOperation(tags = "BranchOTPTOperation", value = " - EGCUNLC1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCUNLC1")
	public EGCUNLC1Response EGCUNLC1(@RequestBody EGCUNLC1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BranchOTPTOperationService.EGCUNLC1(request);
	}

	@ApiOperation(tags = "BranchOTPTOperation", value = " - EGHCUST5", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGHCUST5")
	public EGHCUST5Response EGHCUST5(@RequestBody EGHCUST5Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BranchOTPTOperationService.EGHCUST5(request);
	}

	@ApiOperation(tags = "BranchOTPTOperation", value = " - EUCANCU1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUCANCU1")
	public EUCANCU1Response EUCANCU1(@RequestBody EUCANCU1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BranchOTPTOperationService.EUCANCU1(request);
	}

	@ApiOperation(tags = "BranchOTPTOperation", value = " - EUCDTCU3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUCDTCU3")
	public EUCDTCU3Response EUCDTCU3(@RequestBody EUCDTCU3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BranchOTPTOperationService.EUCDTCU3(request);
	}

	@ApiOperation(tags = "BranchOTPTOperation", value = " - EUCHNGS1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUCHNGS1")
	public EUCHNGS1Response EUCHNGS1(@RequestBody EUCHNGS1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BranchOTPTOperationService.EUCHNGS1(request);
	}

}
