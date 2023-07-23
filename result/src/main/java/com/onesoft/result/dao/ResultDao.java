package com.onesoft.result.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.result.entity.Result;
import com.onesoft.result.repository.ResultRepository;
@Repository
public class ResultDao {
	@Autowired
	ResultRepository rr;

	public List<Result> getall() {

		return rr.findAll();
	}


}
