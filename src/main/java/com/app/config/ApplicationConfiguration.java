package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.service.FourWheeler;
import com.service.TwoWheeler;
import com.service.VehicleService;

@Configuration
public class ApplicationConfiguration {

	@Bean("vehicleService")
	public VehicleService getVehicleService() {
		return new VehicleService("Suzuki");
	}
	
	@Bean("two-wheeler")
	//@Bean
	public TwoWheeler getTwoWheeler() {
		return new TwoWheeler();
	}
	
	@Bean("four-wheeler")
	//@Bean
	public FourWheeler getFourWheeler() {
		return new FourWheeler();
	}
}
