package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Loaimonan")
@Getter
@Setter
public class LoaiMonAn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_loaimonan;
	String loaimonan;
}
