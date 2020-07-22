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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDSRVCE3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EDSRVCE3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIASRVC1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIASRVC1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICSRVC9Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EICSRVC9Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCPSW3Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCCPSW3Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCSRVC7Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUCSRVC7Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUMDFSV5Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUMDFSV5Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.SpecialServiceRegisteratoinService;

@Api(value = "SpecialServiceRegisteratoinRest")
@RestController
@RequestMapping("/srvSpecialServiceRegisteratoin")
public class SpecialServiceRegisteratoinRest {
	@Autowired
	private SpecialServiceRegisteratoinService SpecialServiceRegisteratoinService;


	@ApiOperation(tags = "SpecialServiceRegisteratoin", value = " - EDSRVCE3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEDSRVCE3")
	public EDSRVCE3Response EDSRVCE3(@RequestBody EDSRVCE3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return SpecialServiceRegisteratoinService.EDSRVCE3(request);
	}

	@ApiOperation(tags = "SpecialServiceRegisteratoin", value = " - EIASRVC1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEIASRVC1")
	public EIASRVC1Response EIASRVC1(@RequestBody EIASRVC1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return SpecialServiceRegisteratoinService.EIASRVC1(request);
	}

	@ApiOperation(tags = "SpecialServiceRegisteratoin", value = " - EICSRVC9", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEICSRVC9")
	public EICSRVC9Response EICSRVC9(@RequestBody EICSRVC9Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return SpecialServiceRegisteratoinService.EICSRVC9(request);
	}

	@ApiOperation(tags = "SpecialServiceRegisteratoin", value = " - EUCCPSW3", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUCCPSW3")
	public EUCCPSW3Response EUCCPSW3(@RequestBody EUCCPSW3Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return SpecialServiceRegisteratoinService.EUCCPSW3(request);
	}

	@ApiOperation(tags = "SpecialServiceRegisteratoin", value = " - EUCSRVC7", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUCSRVC7")
	public EUCSRVC7Response EUCSRVC7(@RequestBody EUCSRVC7Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return SpecialServiceRegisteratoinService.EUCSRVC7(request);
	}

	@ApiOperation(tags = "SpecialServiceRegisteratoin", value = " - EUMDFSV5", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUMDFSV5")
	public EUMDFSV5Response EUMDFSV5(@RequestBody EUMDFSV5Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return SpecialServiceRegisteratoinService.EUMDFSV5(request);
	}

}
