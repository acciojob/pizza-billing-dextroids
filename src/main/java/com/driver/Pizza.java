package com.driver;

public class Pizza {

    private int totalprice;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int cheesePrice;
    private int toppingPrice;
    private int paperbagPrice;
    private boolean ischeeseAdded;
    private boolean istoppingAdded;
    private boolean ispaperbagAdded;
    private boolean isbillgenerated;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes her
        if (isVeg == true) {
            basePrice = 300;
            toppingPrice = 70;
        } else {
            basePrice = 400;
            toppingPrice= 120;
        }
           cheesePrice=80;
           paperbagPrice=20;
           totalprice=basePrice;
           bill="Base Price Of The Pizza: "+basePrice+ "\n";
    }
    public int getPrice(){

        return this.totalprice;
    }

    public void addExtraCheese(){
          if(!ischeeseAdded){
              totalprice=totalprice+cheesePrice;
              bill =bill +"Extra Cheese Added: "+cheesePrice+"\n";
              ischeeseAdded=true;
          }
    }

    public void addExtraToppings(){
             if(!istoppingAdded)
             {
                 totalprice=totalprice+toppingPrice;
                 bill=bill+"Extra Toppings Added: "+toppingPrice+"\n";
                 istoppingAdded=true;
             }
           }

    public void addTakeaway(){
        // your code goes here
        if(!ispaperbagAdded)
        {
            totalprice=totalprice+paperbagPrice;
            bill=bill+"Extra Toppings Added: "+paperbagPrice+"\n";
            ispaperbagAdded=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(!isbillgenerated)
        {
            isbillgenerated=true;
            bill=bill+"Total Price: "+totalprice+"\n";
        }
        return this.bill;
    }
}
