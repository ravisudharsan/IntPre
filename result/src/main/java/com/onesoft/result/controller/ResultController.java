package com.onesoft.result.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.result.entity.Result;
import com.onesoft.result.service.ResultService;

@RestController
@RequestMapping("/result")
public class ResultController {
	@Autowired
	ResultService rs;
	
	@PostMapping("/addall")
	public String all() {
		return rs.all();
		
	}
	@DeleteMapping("/delete")
	public String Dele() {
		return rs.Dele();
	}
	@GetMapping("/getall")
	public List<Result> getall(){
		return rs.getall();
	}
	@GetMapping("/max")
	public Result max() {
		return rs.max();
	}

}
