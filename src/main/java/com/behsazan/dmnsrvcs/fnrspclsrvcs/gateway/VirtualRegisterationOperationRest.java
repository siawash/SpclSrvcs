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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIEDTRQ1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIEDTRQ1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIREGRQ1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIREGRQ1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.VirtualRegisterationOperationService;

@Api(value = "VirtualRegisterationOperationRest")
@RestController
@RequestMapping("/srvVirtualRegisterationOperation")
public class VirtualRegisterationOperationRest {
	@Autowired
	private VirtualRegisterationOperationService VirtualRegisterationOperationService;


	@ApiOperation(tags = "VirtualRegisterationOperation", value = " - EIEDTRQ1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEIEDTRQ1")
	public EIEDTRQ1Response EIEDTRQ1(@RequestBody EIEDTRQ1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return VirtualRegisterationOperationService.EIEDTRQ1(request);
	}

	@ApiOperation(tags = "VirtualRegisterationOperation", value = " - EIREGRQ1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEIREGRQ1")
	public EIREGRQ1Response EIREGRQ1(@RequestBody EIREGRQ1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return VirtualRegisterationOperationService.EIREGRQ1(request);
	}

}
