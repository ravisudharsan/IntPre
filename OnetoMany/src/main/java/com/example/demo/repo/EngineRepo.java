package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Engine;

public interface EngineRepo extends JpaRepository<Engine, Integer> {

}
