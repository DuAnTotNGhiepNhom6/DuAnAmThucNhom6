package com.example.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Datlich")
@Getter
@Setter
public class DatLich {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_datlich;
	@Temporal(TemporalType.DATE)
	@Column(name = "Ngaydat")
	Date ngaydat = new Date();
	Integer soluongnguoi;
	String sdt_nguoidat;
	float tiendatcoc;
	
	@ManyToOne@JoinColumn(name = "id_user")
	Users user;
	@ManyToOne@JoinColumn(name = "id_sanh")
	Sanh sanh;
}
