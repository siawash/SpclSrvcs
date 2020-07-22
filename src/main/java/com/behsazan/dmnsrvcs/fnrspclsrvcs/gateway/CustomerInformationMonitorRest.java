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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUSI7Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUSI7Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUST5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCCUST5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCOGAC5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCOGAC5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.CustomerInformationMonitorService;

@Api(value = "CustomerInformationMonitorRest")
@RestController
@RequestMapping("/srvCustomerInformationMonitor")
public class CustomerInformationMonitorRest {
	@Autowired
	private CustomerInformationMonitorService CustomerInformationMonitorService;


	@ApiOperation(tags = "CustomerInformationMonitor", value = " - EGCCUSI7", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCCUSI7")
	public EGCCUSI7Response EGCCUSI7(@RequestBody EGCCUSI7Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CustomerInformationMonitorService.EGCCUSI7(request);
	}

	@ApiOperation(tags = "CustomerInformationMonitor", value = " - EGCCUST5", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCCUST5")
	public EGCCUST5Response EGCCUST5(@RequestBody EGCCUST5Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CustomerInformationMonitorService.EGCCUST5(request);
	}

	@ApiOperation(tags = "CustomerInformationMonitor", value = " - EGCOGAC5", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCOGAC5")
	public EGCOGAC5Response EGCOGAC5(@RequestBody EGCOGAC5Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CustomerInformationMonitorService.EGCOGAC5(request);
	}

}
