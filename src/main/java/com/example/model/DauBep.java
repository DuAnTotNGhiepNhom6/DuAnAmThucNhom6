package com.example.model;

import jakarta.persistence.Column;
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
@Table(name = "daubep")
@Getter
@Setter
public class DauBep {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_daubep;
	String tendaubep;
	String avartar_daubep;
	String gioithieu;
	Boolean gioitinh;
}
