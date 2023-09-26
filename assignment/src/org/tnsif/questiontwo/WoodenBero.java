package org.tnsif.questiontwo;

//WoodenBero class
class WoodenBero extends Bero {
 private String woodType;

 public WoodenBero(String beroType, String beroColour, String woodType) {
     super(beroType, beroColour);
     this.woodType = woodType;
 }

 // Getter and Setter method for woodType
 public String getWoodType() {
     return woodType;
 }

 public void setWoodType(String woodType) {
     this.woodType = woodType;
 }

 // Calculate the total price based on woodType
 public void calculatePrice() {
     if (woodType.equals("Ply Wood")) {
         price = 15000;
     } else if (woodType.equals("Teak Wood")) {
         price = 12000;
     } else if (woodType.equals("Engineered Wood")) {
         price = 10000;
     }
 }
}