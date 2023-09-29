package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.DatMonTruoc;
import com.example.model.DatMonTruoc_Id;

public interface DatMonTruocRepo extends JpaRepository<DatMonTruoc, DatMonTruoc_Id>{
	
}
