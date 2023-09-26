package org.tnsif.questiontwo;

//SteelBero class
class SteelBero extends Bero {
 private int beroHeight;

 public SteelBero(String beroType, String beroColour, int beroHeight) {
     super(beroType, beroColour);
     this.beroHeight = beroHeight;
 }

 // Getter and Setter method for beroHeight
 public int getBeroHeight() {
     return beroHeight;
 }

 public void setBeroHeight(int beroHeight) {
     this.beroHeight = beroHeight;
 }

 // Calculate the total price based on beroHeight
 public void calculatePrice() {
     if (beroHeight == 3) {
         price = 5000;
     } else if (beroHeight == 5) {
         price = 8000;
     } else if (beroHeight == 7) {
         price = 10000;
     }
 }
}

