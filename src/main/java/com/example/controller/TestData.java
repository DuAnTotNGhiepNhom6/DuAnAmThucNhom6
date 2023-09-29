package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.DauBep;
import com.example.model.HoaDon;
import com.example.model.HoaDonChiTiet;
import com.example.model.LoaiMonAn;
import com.example.repository.DanhGiaMonAnRepo;
import com.example.repository.DatLichRepo;
import com.example.repository.DatMonTruocRepo;
import com.example.repository.DauBepRepo;
import com.example.repository.HoaDonChiTietRepo;
import com.example.repository.HoaDonRepo;
import com.example.repository.LoaiMonAnRepo;
import com.example.repository.MonAnRepo;
import com.example.repository.SanhRepo;
import com.example.repository.UsersRepo;

@Controller
public class TestData {
	@Autowired
	DanhGiaMonAnRepo danhGiaMonAnRepo;
	@Autowired
	DatLichRepo datLichRepo;
	@Autowired
	DatMonTruocRepo datMonTruocRepo;
	@Autowired
	DauBepRepo dauBepRepo;
	@Autowired
	HoaDonRepo hoaDonRepo;
	@Autowired
	HoaDonChiTietRepo hoaDonChiTietRepo;
	@Autowired
	LoaiMonAnRepo loaiMonAnRepo;
	@Autowired
	MonAnRepo monAnRepo;
	@Autowired
	SanhRepo sanhRepo;
	@Autowired
	UsersRepo usersRepo;
	
	@GetMapping("TestData")
	@ResponseBody
	public List<?> test() {
		
		return hoaDonChiTietRepo.findAll();
	}
}																									
