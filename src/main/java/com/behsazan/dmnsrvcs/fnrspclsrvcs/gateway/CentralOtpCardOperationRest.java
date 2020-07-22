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
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGBNRGN1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIBOTP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIBOTP1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIOTPR2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGIOTPR2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGOTPOA1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EGOTPOA1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIANOTP1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EIANOTP1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUANOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EUANOTP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EULSOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EULSOTP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURETSR1Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURETSR1Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURMOTP2Request;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.dto.EURMOTP2Response;
import com.behsazan.dmnsrvcs.fnrspclsrvcs.service.CentralOtpCardOperationService;

@Api(value = "CentralOtpCardOperationRest")
@RestController
@RequestMapping("/srvCentralOtpCardOperation")
public class CentralOtpCardOperationRest {
	@Autowired
	private CentralOtpCardOperationService CentralOtpCardOperationService;


	@ApiOperation(tags = "CentralOtpCardOperation", value = " - EGBNRGN1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGBNRGN1")
	public EGBNRGN1Response EGBNRGN1() {
		return CentralOtpCardOperationService.EGBNRGN1();
	}

	@ApiOperation(tags = "CentralOtpCardOperation", value = " - EGIBOTP1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGIBOTP1")
	public EGIBOTP1Response EGIBOTP1(@RequestBody EGIBOTP1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CentralOtpCardOperationService.EGIBOTP1(request);
	}

	@ApiOperation(tags = "CentralOtpCardOperation", value = " - EGIOTPR2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGIOTPR2")
	public EGIOTPR2Response EGIOTPR2(@RequestBody EGIOTPR2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CentralOtpCardOperationService.EGIOTPR2(request);
	}

	@ApiOperation(tags = "CentralOtpCardOperation", value = " - EGOTPOA1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEGOTPOA1")
	public EGOTPOA1Response EGOTPOA1(@RequestBody EGOTPOA1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CentralOtpCardOperationService.EGOTPOA1(request);
	}

	@ApiOperation(tags = "CentralOtpCardOperation", value = " - EIANOTP1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEIANOTP1")
	public EIANOTP1Response EIANOTP1(@RequestBody EIANOTP1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CentralOtpCardOperationService.EIANOTP1(request);
	}

	@ApiOperation(tags = "CentralOtpCardOperation", value = " - EUANOTP2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEUANOTP2")
	public EUANOTP2Response EUANOTP2(@RequestBody EUANOTP2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CentralOtpCardOperationService.EUANOTP2(request);
	}

	@ApiOperation(tags = "CentralOtpCardOperation", value = " - EULSOTP2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEULSOTP2")
	public EULSOTP2Response EULSOTP2(@RequestBody EULSOTP2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CentralOtpCardOperationService.EULSOTP2(request);
	}

	@ApiOperation(tags = "CentralOtpCardOperation", value = " - EURETSR1", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEURETSR1")
	public EURETSR1Response EURETSR1(@RequestBody EURETSR1Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CentralOtpCardOperationService.EURETSR1(request);
	}

	@ApiOperation(tags = "CentralOtpCardOperation", value = " - EURMOTP2", produces="application/json", consumes = "application/json")
	@PostMapping(value = "/v1/oprEURMOTP2")
	public EURMOTP2Response EURMOTP2(@RequestBody EURMOTP2Request request, @ApiIgnore @RequestAttribute Claims jwt) {
		request.setTokenInfo(jwt);
		return CentralOtpCardOperationService.EURMOTP2(request);
	}

}
