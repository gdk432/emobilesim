package com.emobile.application.feignclient;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.emobile.application.dto.TariffResponse;

@FeignClient(value ="tarrif-service", url = "http://localhost:9125/tariffies/tarif")

public interface TarifPlanServiceProxy {

	@GetMapping("/planId")
	public Optional<TariffResponse> getPlanId(@PathVariable Integer planId);
}
