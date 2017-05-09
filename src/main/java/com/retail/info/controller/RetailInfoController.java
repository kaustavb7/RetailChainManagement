package com.retail.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.info.domain.RetailInfo;
import com.retail.info.repository.RetailRepository;

@RestController
public class RetailInfoController {
	
	@Autowired
	RetailRepository retailRepository;
	
	@RequestMapping("/findAll")
	public List<RetailInfo> productDisplay()
	{
		return retailRepository.findAll();
	}
	
	@RequestMapping("/findOne/{id}")
	public RetailInfo findById(@PathVariable("id") Integer retailId) {
        return retailRepository.findOne(retailId);
    }
 
   /* public RetailInfo findByName(String productName) {
        return retailRepository.findByName(productName);
    }*/
	
	@RequestMapping("/save")
	public void saveUser(RetailInfo retailInfo) {
		retailRepository.save(retailInfo);
    }
	
	@RequestMapping("/updateUser")
	public void updateUser(RetailInfo retailInfo){
        	saveUser(retailInfo);
    }
 
	@RequestMapping("/delete")
    public void deleteUserById(int retailId){
    	retailRepository.delete(retailId);
    }
 
	@RequestMapping("/deleteAll")
    public void deleteAllUsers(){
    	retailRepository.deleteAll();
    }
}