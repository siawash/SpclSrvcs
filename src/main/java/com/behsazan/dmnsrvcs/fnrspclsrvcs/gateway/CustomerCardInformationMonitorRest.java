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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACRC6Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCACRC6Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.CustomerCardInformationMonitorService;

@Api(value = "CustomerCardInformationMonitorRest")
@RestController
@RequestMapping("/srvCustomerCardInformationMonitor")
public class CustomerCardInformationMonitorRest {
	@Autowired
	private CustomerCardInformationMonitorService CustomerCardInformationMonitorService;


	@ApiOperation(tags = "CustomerCardInformationMonitor", value = " - EGCACRC6", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCACRC6")
	public EGCACRC6Response EGCACRC6(@RequestBody EGCACRC6Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CustomerCardInformationMonitorService.EGCACRC6(request);
	}

}
