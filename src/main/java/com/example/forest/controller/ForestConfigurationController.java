package com.example.forest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.forest.Configuration;
import com.example.forest.bean.ForestConfiguration;

@RestController
public class ForestConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public ForestConfiguration retrieveForestConfigurations() {
		return new ForestConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
