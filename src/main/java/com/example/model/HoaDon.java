package com.example.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Hoadon")
@Getter
@Setter
@IdClass(HoaDon_Id.class)
public class HoaDon {
	@JsonIgnore
	@Id
	@ManyToOne@JoinColumn(name = "id_hoadon")
	HoaDonChiTiet hoadon;
	@Id
	@ManyToOne@JoinColumn(name = "id_monan")
	MonAn monan;
	@ManyToOne@JoinColumn(name = "id_sanh")
	Sanh sanh;
	Integer soluong;
}
