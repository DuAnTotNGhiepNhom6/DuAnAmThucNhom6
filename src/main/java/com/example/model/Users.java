package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Users")
@Getter
@Setter
public class Users {
	@Id
	String id_user;
	String password;
	String hoten;
	String sdt;
	String email;
	String avatar;
	String role;
}
