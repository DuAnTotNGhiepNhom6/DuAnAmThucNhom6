package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Monan")
@Getter
@Setter
public class MonAn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_monan;
	String tenmon;
	float giamon;
	String mota;
	String anhmon;
	Boolean dacbiet;
	
	@ManyToOne@JoinColumn(name = "id_loaimonan")
	LoaiMonAn loaimonan;
}
