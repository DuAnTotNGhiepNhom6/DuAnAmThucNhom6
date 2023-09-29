package com.example.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Sanh")
@Getter
@Setter
public class Sanh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_sanh;
	String ten_sanh;
	Integer soluongchua;
	float giatien;
	String picture;
	String motasanh;
}
