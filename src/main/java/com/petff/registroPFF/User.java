package com.petff.registroPFF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idusuarios", unique=true, nullable=false)
	
	//Atributos
	int idusuarios;
	String name;
	String lastNames;
	String email;
	String password;
	String img_url;
	String username;

	//Constructor
	public User(int idusuarios, String name, String lastNames, String email, String password, String img_url, String username) {
		super();
		this.idusuarios = idusuarios;
		this.name = name;
		this.lastNames = lastNames;
		this.email = email;
		this.password = password;
		this.img_url = img_url;
		this.username = username;
	}
	
	//Constructor vacío
		public User() {
			
		}

	//Getters y Setters
		
	public String getName() {
		return name;
	}

	public int getIdusuarios() {
		return idusuarios;
	}

	public void setIdusuarios(int idusuarios) {
		this.idusuarios = idusuarios;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	//Método toString
	@Override
	public String toString() {
		return "User [name=" + name + ", lastNames=" + lastNames + ", email=" + email + ", password=" + password
				+ ", img_url=" + img_url + ", username=" + username + "]";
	}
	
	
	
}
