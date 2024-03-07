package com.example.forest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.forest.bean.ForestConfiguration;

@RestController
public class ForestConfigurationController {
	
	@GetMapping("/limits")
	public ForestConfiguration retrieveForestConfigurations() {
		return new ForestConfiguration(100, 1);
	}

}
