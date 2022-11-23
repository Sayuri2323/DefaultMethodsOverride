package it.develop.DefaultMetodhsOverride;

import java.util.Objects;

public class SmarphonePrice implements Cloneable{
    public String priceType;
    public double priceInEuros;

    public SmarphonePrice(String type, int price){
        this.priceType=type;
        this.priceInEuros=price;
    }


    @Override
    public String toString() {
        return "SmarphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmarphonePrice that = (SmarphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    @Override
    public SmarphonePrice clone() throws CloneNotSupportedException {
        SmarphonePrice clonedSmartphonePrice=(SmarphonePrice)super.clone();

        return clonedSmartphonePrice;
    }



}
