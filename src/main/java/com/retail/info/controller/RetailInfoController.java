package com.retail.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.info.domain.RetailInfo;
import com.retail.info.repository.RetailRepository;

@RestController
public class RetailInfoController {
	
	@Autowired
	RetailRepository rp;
	
	@RequestMapping("/Hello")
	public List<RetailInfo> productDisplay()
	{
		return rp.findAll();
	}

}