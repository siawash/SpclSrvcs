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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPSWRP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGPSWRP1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.PasswordRequestOperationService;

@Api(value = "PasswordRequestOperationRest")
@RestController
@RequestMapping("/srvPasswordRequestOperation")
public class PasswordRequestOperationRest {
	@Autowired
	private PasswordRequestOperationService PasswordRequestOperationService;


	@ApiOperation(tags = "PasswordRequestOperation", value = " - EGPSWRP1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGPSWRP1")
	public EGPSWRP1Response EGPSWRP1(@RequestBody EGPSWRP1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return PasswordRequestOperationService.EGPSWRP1(request);
	}

}
