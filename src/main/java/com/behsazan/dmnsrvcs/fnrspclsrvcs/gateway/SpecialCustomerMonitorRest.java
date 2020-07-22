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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINFOC1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINFOC1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.SpecialCustomerMonitorService;

@Api(value = "SpecialCustomerMonitorRest")
@RestController
@RequestMapping("/srvSpecialCustomerMonitor")
public class SpecialCustomerMonitorRest {
	@Autowired
	private SpecialCustomerMonitorService SpecialCustomerMonitorService;


	@ApiOperation(tags = "SpecialCustomerMonitor", value = " - EGINFOC1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGINFOC1")
	public EGINFOC1Response EGINFOC1(@RequestBody EGINFOC1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return SpecialCustomerMonitorService.EGINFOC1(request);
	}

}
