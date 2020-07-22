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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINTNM1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGINTNM1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.ChannelCommonOperationService;

@Api(value = "ChannelCommonOperationRest")
@RestController
@RequestMapping("/srvChannelCommonOperation")
public class ChannelCommonOperationRest {
	@Autowired
	private ChannelCommonOperationService ChannelCommonOperationService;


	@ApiOperation(tags = "ChannelCommonOperation", value = " - EGINTNM1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGINTNM1")
	public EGINTNM1Response EGINTNM1(@RequestBody EGINTNM1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return ChannelCommonOperationService.EGINTNM1(request);
	}

}
