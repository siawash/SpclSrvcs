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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCSRVC3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCSRVC3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUSTS3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGCUSTS3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGSRVIF1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGSRVIF1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERCRCST3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.ERCRCST3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.CustomerservicesMonitorService;

@Api(value = "CustomerservicesMonitorRest")
@RestController
@RequestMapping("/srvCustomerservicesMonitor")
public class CustomerservicesMonitorRest {
	@Autowired
	private CustomerservicesMonitorService CustomerservicesMonitorService;


	@ApiOperation(tags = "CustomerservicesMonitor", value = " - EGCSRVC3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCSRVC3")
	public EGCSRVC3Response EGCSRVC3(@RequestBody EGCSRVC3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CustomerservicesMonitorService.EGCSRVC3(request);
	}

	@ApiOperation(tags = "CustomerservicesMonitor", value = " - EGCUSTS3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGCUSTS3")
	public EGCUSTS3Response EGCUSTS3(@RequestBody EGCUSTS3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CustomerservicesMonitorService.EGCUSTS3(request);
	}

	@ApiOperation(tags = "CustomerservicesMonitor", value = " - EGSRVIF1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGSRVIF1")
	public EGSRVIF1Response EGSRVIF1(@RequestBody EGSRVIF1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CustomerservicesMonitorService.EGSRVIF1(request);
	}

	@ApiOperation(tags = "CustomerservicesMonitor", value = " - ERCRCST3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprERCRCST3")
	public ERCRCST3Response ERCRCST3(@RequestBody ERCRCST3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CustomerservicesMonitorService.ERCRCST3(request);
	}

}
