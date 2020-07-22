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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCHMO4Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCHMO4Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCMBCT2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCMBCT2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.MobileNumberAssessService;

@Api(value = "MobileNumberAssessRest")
@RestController
@RequestMapping("/srvMobileNumberAssess")
public class MobileNumberAssessRest {
	@Autowired
	private MobileNumberAssessService MobileNumberAssessService;


	@ApiOperation(tags = "MobileNumberAssess", value = " - EGCCHMO4", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCCHMO4")
	public EGCCHMO4Response EGCCHMO4(@RequestBody EGCCHMO4Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return MobileNumberAssessService.EGCCHMO4(request);
	}

	@ApiOperation(tags = "MobileNumberAssess", value = " - EGCMBCT2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCMBCT2")
	public EGCMBCT2Response EGCMBCT2(@RequestBody EGCMBCT2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return MobileNumberAssessService.EGCMBCT2(request);
	}

}
