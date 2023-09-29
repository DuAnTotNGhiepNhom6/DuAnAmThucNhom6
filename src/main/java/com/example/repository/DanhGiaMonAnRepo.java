package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.DanhGiaMonAn_Id;
import com.example.model.DanhGia_MonAn;

public interface DanhGiaMonAnRepo extends JpaRepository<DanhGia_MonAn, DanhGiaMonAn_Id>{

}
