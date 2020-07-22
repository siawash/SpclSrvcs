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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.AGBBGSS2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.AGBBGSS2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDCREGP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDCREGP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCAO1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCAO1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSL2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSL2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBSREX1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBSREX1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACCL5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACCL5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCRREP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCRREP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUCUS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUCUS3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBEXSR1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBEXSR1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBMAMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIBMAMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICREGP3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICREGP3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERWDCND3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERWDCND3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCADMN2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCADMN2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCUST1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCUST1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BBankingServiceOperationService;

@Api(value = "BBankingServiceOperationRest")
@RestController
@RequestMapping("/srvBBankingServiceOperation")
public class BBankingServiceOperationRest {
	@Autowired
	private BBankingServiceOperationService BBankingServiceOperationService;


	@ApiOperation(tags = "BBankingServiceOperation", value = " - AGBBGSS2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprAGBBGSS2")
	public AGBBGSS2Response AGBBGSS2(@RequestBody AGBBGSS2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.AGBBGSS2(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EDCREGP2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEDCREGP2")
	public EDCREGP2Response EDCREGP2(@RequestBody EDCREGP2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EDCREGP2(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EGBBCAO1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBBCAO1")
	public EGBBCAO1Response EGBBCAO1(@RequestBody EGBBCAO1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EGBBCAO1(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EGBBCSL2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBBCSL2")
	public EGBBCSL2Response EGBBCSL2(@RequestBody EGBBCSL2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EGBBCSL2(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EGBSREX1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBSREX1")
	public EGBSREX1Response EGBSREX1(@RequestBody EGBSREX1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EGBSREX1(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EGCACCL5", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCACCL5")
	public EGCACCL5Response EGCACCL5(@RequestBody EGCACCL5Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EGCACCL5(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EGCRREP2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCRREP2")
	public EGCRREP2Response EGCRREP2(@RequestBody EGCRREP2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EGCRREP2(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EGCUCUS3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCUCUS3")
	public EGCUCUS3Response EGCUCUS3(@RequestBody EGCUCUS3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EGCUCUS3(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EIBEXSR1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEIBEXSR1")
	public EIBEXSR1Response EIBEXSR1(@RequestBody EIBEXSR1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EIBEXSR1(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EIBMAMN2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEIBMAMN2")
	public EIBMAMN2Response EIBMAMN2(@RequestBody EIBMAMN2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EIBMAMN2(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EICREGP3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEICREGP3")
	public EICREGP3Response EICREGP3(@RequestBody EICREGP3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EICREGP3(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - ERWDCND3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprERWDCND3")
	public ERWDCND3Response ERWDCND3(@RequestBody ERWDCND3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.ERWDCND3(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EUCADMN2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUCADMN2")
	public EUCADMN2Response EUCADMN2(@RequestBody EUCADMN2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EUCADMN2(request);
	}

	@ApiOperation(tags = "BBankingServiceOperation", value = " - EUCCUST1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUCCUST1")
	public EUCCUST1Response EUCCUST1(@RequestBody EUCCUST1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceOperationService.EUCCUST1(request);
	}

}
