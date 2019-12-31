package com.ikea.examples.controller;

enum HttpStatus {
	Test("20000000");
	 
	 private String statusCode;

	private HttpStatus(String statusCode) {
		this.statusCode = statusCode;
	}

}
