package org.tnsif.questiontwo;

//Abstract Bero class
abstract class Bero {
 protected String beroType;
 protected String beroColour;
 protected double price;

 public Bero(String beroType, String beroColour) {
     this.beroType = beroType;
     this.beroColour = beroColour;
 }

 // Getter and Setter methods for attributes
 public String getBeroType() {
     return beroType;
 }

 public void setBeroType(String beroType) {
     this.beroType = beroType;
 }

 public String getBeroColour() {
     return beroColour;
 }

 public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public void setBeroColour(String beroColour) {
     this.beroColour = beroColour;
 }

 public abstract void calculatePrice();
}

