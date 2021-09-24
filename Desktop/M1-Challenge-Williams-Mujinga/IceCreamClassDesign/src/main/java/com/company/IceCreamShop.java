package com.company;

public class IceCreamShop {
  private  String address;
  private  String name;
   private String flavorSold;
   private  double pricePerScoop;
   private int iceCreamDippingCabinet;



    public  void findMyStore(String lulu, String TallahasseeMall) {
        address = TallahasseeMall;
        name = lulu;
        System.out.println("find my store " + name + " at " + address);

    }
    public void myStoreDescription(int m, String manyflavors){
        m = 2* iceCreamDippingCabinet;
        manyflavors =  flavorSold;
        System.out.println("our store has " + iceCreamDippingCabinet + " that contains many " + flavorSold);

    }

    public void price(double num3){
        pricePerScoop = num3;
        double cone = pricePerScoop * 2;

    }
}