package com.onesoft.markSheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onesoft.markSheet.entity.MarkSheet;
import com.onesoft.markSheet.repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository mr;

	public String delete() {
		mr.deleteAll();
		return "deleted";
	}

	public List<MarkSheet> getall() {

		return mr.findAll();
	}

	public Integer sem1(int a) {

		return mr.sem1(a);
	}

	public Integer sem2(int a) {

		return mr.sem2(a);
	}

}
