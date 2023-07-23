 package com.onesoft.result.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.onesoft.result.dao.ResultDao;
import com.onesoft.result.entity.Result;
import com.onesoft.result.repository.ResultRepository;

@Service
public class ResultService {
	@Autowired
	RestTemplate rt;
	@Autowired
	ResultDao rd;
	@Autowired
	ResultRepository rr;

	public String all() {

		String url = "http://localhost:8081/marksheet/getall";
		String ur1 = "http://localhost:8081/marksheet/sem1/";
		String ur2 = "http://localhost:8081/marksheet/sem2/";
		String ur3 = "http://localhost:8082/students/getname/";
		ResponseEntity<List<Result>> re = rt.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Result>>() {
				});
		List<Result> r1 = re.getBody();

		for (Result x : r1) {
			ResponseEntity<Integer> s1 = rt.exchange(ur1 + x.getRollnumber(), HttpMethod.GET, null, Integer.class);
			int sem1 = s1.getBody();
			ResponseEntity<Integer> s2 = rt.exchange(ur2 + x.getRollnumber(), HttpMethod.GET, null, Integer.class);
			int sem2 = s2.getBody();
			ResponseEntity<String> s3 = rt.exchange(ur3 + x.getRollnumber(), HttpMethod.GET, null, String.class);
			String name = s3.getBody();
			x.setName(name);
			x.setTotal(sem1 + sem2);
			x.setPercenatge(x.getTotal() / 4);

		}
		rr.saveAll(r1);
		return "added";

	}

	public String Dele() {
		rr.deleteAll();
		return "delet";
	}

	public List<Result> getall() {

		return rd.getall();
	}

	public Result max() {

		return rd.getall().stream().sorted(Comparator.comparingDouble(Result::getPercenatge).reversed()).findFirst()
				.get();
	}

}
