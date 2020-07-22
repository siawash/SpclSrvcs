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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIISSU2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIISSU2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.GetUnitOTPOperationService;

@Api(value = "GetUnitOTPOperationRest")
@RestController
@RequestMapping("/srvGetUnitOTPOperation")
public class GetUnitOTPOperationRest {
	@Autowired
	private GetUnitOTPOperationService GetUnitOTPOperationService;


	@ApiOperation(tags = "GetUnitOTPOperation", value = " - EGIISSU2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGIISSU2")
	public EGIISSU2Response EGIISSU2(@RequestBody EGIISSU2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return GetUnitOTPOperationService.EGIISSU2(request);
	}

}
