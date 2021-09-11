package com.coforge.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {

	@GetMapping
	public String getMessage() {
		return "Hii";
	}
}
