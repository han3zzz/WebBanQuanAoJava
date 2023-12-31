package com.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Product_KichThuoc")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product_KichThuoc implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "idKichThuoc")
	private KichThuoc kichThuoc;
	@ManyToOne
	@JoinColumn(name = "idProduct")
	private Product product;
	@Column(name = "soLuong")
	private Integer soLuong;
	
}
