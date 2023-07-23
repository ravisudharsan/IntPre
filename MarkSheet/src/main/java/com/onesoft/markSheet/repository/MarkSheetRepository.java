package com.onesoft.markSheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onesoft.markSheet.entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Integer> {
	@Query(value = "select sem1total from marksheet where rollnumber like ? ", nativeQuery = true)
	public Integer sem1(int a);

	@Query(value = "select sem2total from marksheet where rollnumber like ? ", nativeQuery = true)
	public Integer sem2(int a);

}
