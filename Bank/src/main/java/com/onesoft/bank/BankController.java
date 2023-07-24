package com.onesoft.bank;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	private BankService bankser;
	
	@Autowired
	public BankController(BankService bankser) {
		this.bankser=bankser;
	} 
	
	@GetMapping(value = "/add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}
	
	@PostMapping("/postvalues")
	public String postvalues(@RequestBody List<Bank> banks) {
		return bankser.postvalues(banks);
		
	}
	
	@GetMapping(value="/getAll")
	public List<Bank> getall() {
		return bankser.getall();
	}
	
	@GetMapping(value="/getIfscCodebybranch/{branch}")
	public String getIfscCodebybranch(@PathVariable String branch) {
		return bankser.getIfscCodebybranch(branch);
	}
	
	@PutMapping(value="/update/{id}")
	public ResponseEntity<String> update(@PathVariable int id) {
		return bankser.update(id);
	}
	
	@GetMapping(value="/duplicate")
	public String get(String a) {
		int count=0;
		char[] ch=a.toCharArray();String ch1 = "";
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					
				}
			}if(count==1) {
				ch1=ch1+ch[i];
			}
			count=count-count;
		}
		return ch1;
	}

}
