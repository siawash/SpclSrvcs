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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCHKAC1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCHKAC1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPSDTL1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPSDTL1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPWREQ1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPWREQ1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGRQDTL1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGRQDTL1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.PassWordMonitorService;

@Api(value = "PassWordMonitorRest")
@RestController
@RequestMapping("/srvPassWordMonitor")
public class PassWordMonitorRest {
	@Autowired
	private PassWordMonitorService PassWordMonitorService;


	@ApiOperation(tags = "PassWordMonitor", value = " - EGCHKAC1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCHKAC1")
	public EGCHKAC1Response EGCHKAC1(@RequestBody EGCHKAC1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return PassWordMonitorService.EGCHKAC1(request);
	}

	@ApiOperation(tags = "PassWordMonitor", value = " - EGPSDTL1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGPSDTL1")
	public EGPSDTL1Response EGPSDTL1(@RequestBody EGPSDTL1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return PassWordMonitorService.EGPSDTL1(request);
	}

	@ApiOperation(tags = "PassWordMonitor", value = " - EGPWREQ1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGPWREQ1")
	public EGPWREQ1Response EGPWREQ1(@RequestBody EGPWREQ1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return PassWordMonitorService.EGPWREQ1(request);
	}

	@ApiOperation(tags = "PassWordMonitor", value = " - EGRQDTL1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGRQDTL1")
	public EGRQDTL1Response EGRQDTL1(@RequestBody EGRQDTL1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return PassWordMonitorService.EGRQDTL1(request);
	}

}
