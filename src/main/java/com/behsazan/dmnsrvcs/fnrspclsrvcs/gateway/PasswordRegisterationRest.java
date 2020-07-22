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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCPSW4Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICCPSW4Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICNFRQ1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICNFRQ1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.PasswordRegisterationService;

@Api(value = "PasswordRegisterationRest")
@RestController
@RequestMapping("/srvPasswordRegisteration")
public class PasswordRegisterationRest {
	@Autowired
	private PasswordRegisterationService PasswordRegisterationService;


	@ApiOperation(tags = "PasswordRegisteration", value = " - EICCPSW4", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEICCPSW4")
	public EICCPSW4Response EICCPSW4(@RequestBody EICCPSW4Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return PasswordRegisterationService.EICCPSW4(request);
	}

	@ApiOperation(tags = "PasswordRegisteration", value = " - EICNFRQ1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEICNFRQ1")
	public EICNFRQ1Response EICNFRQ1(@RequestBody EICNFRQ1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return PasswordRegisterationService.EICNFRQ1(request);
	}

}
