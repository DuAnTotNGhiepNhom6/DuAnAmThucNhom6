package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.HoaDon;
import com.example.model.HoaDon_Id;

public interface HoaDonRepo extends JpaRepository<HoaDon, HoaDon_Id>{

}
