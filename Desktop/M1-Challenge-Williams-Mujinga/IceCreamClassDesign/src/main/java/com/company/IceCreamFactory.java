package com.company;

public class IceCreamFactory {
   private  String factoryName;
    private String factoryAddress;
   private double pricePerGallon;
   private  int gallonsOfIceCreamProduced;
    private int gallonsOfIceCreamSold;

    public  void factoryMailingInfo(String Jenny, String mainStreet){
        factoryName = Jenny;
        factoryAddress = mainStreet;

        System.out.println(factoryName + factoryAddress);

    }
    public  void factoryProduction(int num, int num1){
        gallonsOfIceCreamSold = num;
        gallonsOfIceCreamProduced = num1;


        System.out.println (gallonsOfIceCreamProduced - gallonsOfIceCreamSold);
    }

    public  void income(int num, double num2){

          pricePerGallon = num2;
        gallonsOfIceCreamSold =num;
        System.out.println (gallonsOfIceCreamSold * pricePerGallon);

    }
}
