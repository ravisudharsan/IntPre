package com.onesoft.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class BankDao {
	@Autowired
	BankRepository bankrepo;
	
	public String postvalues(List<Bank> banks) {
		bankrepo.saveAll(banks);
		return "Successfully Posted";
		
	}
	
	public List<Bank> getall() {
		return bankrepo.findAll();
	}
	
	public String getIfscCodebybranch(String branch) {
		return bankrepo.getIfscCodebybranch(branch);
	}
	
	public ResponseEntity<String> update(int id) {
                 Bank b=bankrepo.findById(id).get();
                 b.setBranch("Uthangarai");
                 bankrepo.save(b);
                 return ResponseEntity.ok("Updated");
}



}
