package it.develop.DefaultMetodhsOverride;

public class Main {
    public static void main(String[] args) {

        SmarphonePrice producerPriceA=new SmarphonePrice("typeA",250);

        SmarphonePrice producerPriceB=new SmarphonePrice("typeB",800);

        SmarphonePrice retailPriceA=new SmarphonePrice("retailA",500);

        SmarphonePrice retailPriceB=new SmarphonePrice("retailB",1200);


        Smartphone smarphoneA=new Smartphone("Samsung","s21",4000,producerPriceA,retailPriceA);
        System.out.println(smarphoneA);
        System.out.println("-------------------------------------------------------");
        Smartphone smartPhoneB=new Smartphone("Apple","iPhone 12",2500,producerPriceB,retailPriceB);
        System.out.println(smartPhoneB);
        System.out.println("--------------------------------------------------");

        boolean compare=smarphoneA.equals(smartPhoneB);
        System.out.println("smartphone A e smartphone B sono uguali? "+compare);
        System.out.println("--------------------------------------------------");

        try {
            Smartphone clonedSmartphoneB=smartPhoneB.clone();
            System.out.println("cloned smartphone: "+clonedSmartphoneB);

            boolean compare2=smartPhoneB.equals(clonedSmartphoneB);
            System.out.println("smartphone B è uguale a smartphone B clone? "+ compare2);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }


    }
}