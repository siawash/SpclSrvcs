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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBRACH1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBRACH1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.BranchesInformationMonitorService;

@Api(value = "BranchesInformationMonitorRest")
@RestController
@RequestMapping("/srvBranchesInformationMonitor")
public class BranchesInformationMonitorRest {
	@Autowired
	private BranchesInformationMonitorService BranchesInformationMonitorService;


	@ApiOperation(tags = "BranchesInformationMonitor", value = " - EGBRACH1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBRACH1")
	public EGBRACH1Response EGBRACH1(@RequestBody EGBRACH1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return BranchesInformationMonitorService.EGBRACH1(request);
	}

}
