package com.example.model;

import java.util.Date;

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
@Table(name = "Datmontruoc")
@Getter
@Setter
@IdClass(DatMonTruoc_Id.class)
public class DatMonTruoc {
	@Id
	@ManyToOne
	@JoinColumn(name = "id_datlich")
	DatLich datlich;
	@Id
	@ManyToOne
	@JoinColumn(name = "id_monan")
	MonAn monan;
	
	Integer soluong;
	String ghichu;
}
