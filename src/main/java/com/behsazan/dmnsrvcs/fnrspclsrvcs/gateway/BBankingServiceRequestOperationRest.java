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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBASG2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBASG2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSS2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBCSS2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGBS1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGBS1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGES1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBGES1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBSEB1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBBSEB1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIIASGN7Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIIASGN7Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUENTBK3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUENTBK3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BBankingServiceRequestOperationService;

@Api(value = "BBankingServiceRequestOperationRest")
@RestController
@RequestMapping("/srvBBankingServiceRequestOperation")
public class BBankingServiceRequestOperationRest {
	@Autowired
	private BBankingServiceRequestOperationService BBankingServiceRequestOperationService;


	@ApiOperation(tags = "BBankingServiceRequestOperation", value = " - EGBBASG2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBBASG2")
	public EGBBASG2Response EGBBASG2(@RequestBody EGBBASG2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceRequestOperationService.EGBBASG2(request);
	}

	@ApiOperation(tags = "BBankingServiceRequestOperation", value = " - EGBBCSS2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBBCSS2")
	public EGBBCSS2Response EGBBCSS2(@RequestBody EGBBCSS2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceRequestOperationService.EGBBCSS2(request);
	}

	@ApiOperation(tags = "BBankingServiceRequestOperation", value = " - EGBBGBS1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBBGBS1")
	public EGBBGBS1Response EGBBGBS1(@RequestBody EGBBGBS1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceRequestOperationService.EGBBGBS1(request);
	}

	@ApiOperation(tags = "BBankingServiceRequestOperation", value = " - EGBBGES1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBBGES1")
	public EGBBGES1Response EGBBGES1(@RequestBody EGBBGES1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceRequestOperationService.EGBBGES1(request);
	}

	@ApiOperation(tags = "BBankingServiceRequestOperation", value = " - EGBBSEB1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBBSEB1")
	public EGBBSEB1Response EGBBSEB1(@RequestBody EGBBSEB1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceRequestOperationService.EGBBSEB1(request);
	}

	@ApiOperation(tags = "BBankingServiceRequestOperation", value = " - EIIASGN7", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEIIASGN7")
	public EIIASGN7Response EIIASGN7(@RequestBody EIIASGN7Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceRequestOperationService.EIIASGN7(request);
	}

	@ApiOperation(tags = "BBankingServiceRequestOperation", value = " - EUENTBK3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUENTBK3")
	public EUENTBK3Response EUENTBK3(@RequestBody EUENTBK3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BBankingServiceRequestOperationService.EUENTBK3(request);
	}

}
