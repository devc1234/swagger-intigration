package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Book implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 9055695345939895978L;


	@Id
	@GeneratedValue
	private int bookid;
	
	
	private String bookname;
	
	private double price;
	
	
}
