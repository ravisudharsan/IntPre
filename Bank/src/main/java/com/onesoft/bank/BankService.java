package com.onesoft.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BankService {
	
	@Autowired
	BankDao bankdao;
	
	public String postvalues(List<Bank> banks) {
		return bankdao.postvalues(banks);
		
	}
	
	public List<Bank> getall() {
		return bankdao.getall();
	}
	
	public String getIfscCodebybranch(String branch) {
		return bankdao.getIfscCodebybranch(branch);
	}
	
	public ResponseEntity<String> update(int id) {
		               return bankdao.update(id);   
	}

}
