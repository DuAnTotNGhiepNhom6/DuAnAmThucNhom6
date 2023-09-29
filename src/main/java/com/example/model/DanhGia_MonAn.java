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
@Table(name = "danhgia_monan")
@IdClass(DanhGiaMonAn_Id.class)
@Getter
@Setter
public class DanhGia_MonAn {
	@Id
	@ManyToOne@JoinColumn(name = "id_user")
	Users users;
	@Id
	@ManyToOne@JoinColumn(name = "id_monan")
	MonAn monan;
	Integer star;
	String comment;
}
