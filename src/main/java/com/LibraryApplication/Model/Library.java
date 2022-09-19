package com.LibraryApplication.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Library_table")
public class Library {
@Id
private int id;
@Column(name="name")
private String name;
@Column(name="Quantity")
private int quantity;
public Library(int id, String name, int quantity) {
	super();
	this.id = id;
	this.name = name;
	this.quantity = quantity;
}

public Library() {

}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}
