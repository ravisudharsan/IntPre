package com.onesoft.markSheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.markSheet.entity.MarkSheet;
import com.onesoft.markSheet.service.MarkSheetService;

@RestController
@RequestMapping("/marksheet")
public class MarkSheetController {
	@Autowired
	MarkSheetService ms;
	
	@PostMapping("/addall")
	public String addall(@RequestBody List<MarkSheet> a) {
		return ms.addall(a);
	}
	@DeleteMapping("/deleteall")
	public String delete() {
		return ms.delete();
	}
	@GetMapping("/getall")
	public List<MarkSheet> getall(){
		return ms.getall();
	}
	@GetMapping("/sem1/{a}")
	public Integer sem1(@PathVariable int a) {
		return ms.sem1(a);
	}
	@GetMapping("/sem2/{a}")
	public Integer sem2(@PathVariable int a) {
		return ms.sem2(a);
	}

}
