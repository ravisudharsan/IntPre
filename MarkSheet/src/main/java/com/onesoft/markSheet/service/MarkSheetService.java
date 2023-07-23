package com.onesoft.markSheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.markSheet.dao.MarkSheetDao;
import com.onesoft.markSheet.entity.MarkSheet;
import com.onesoft.markSheet.repository.MarkSheetRepository;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao md;

	@Autowired
	MarkSheetRepository mss;

	public String addall(List<MarkSheet> a) {
		for (MarkSheet x : a) {
			x.setSem1total(x.getSem1theory() + x.getSem1pratical());
			x.setSem2total(x.getSem2pratical() + x.getSem2theory());

		}
		mss.saveAll(a);

		return "added";

	}

	public String delete() {

		return md.delete();
	}

	public List<MarkSheet> getall() {

		return md.getall();
	}

	public Integer sem1(int a) {

		return md.sem1(a);
	}

	public Integer sem2(int a) {

		return md.sem2(a);
	}

}
