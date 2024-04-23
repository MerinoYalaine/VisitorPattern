package VisitorPattern;

public class Telco implements TelcoSubscription {

    public String telcoName;
    double promoPrice;
    int dataAllowance;
    boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {

        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;

    }

    public String accept(UsagePromo promo, double price) {

        return promo.showAllowance(telcoName, promoPrice);

    }

    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {

        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);

    }

    public int getDataAllowance() {

        return dataAllowance;

    }

    public boolean getUnliCallText() {

        return unliCallText;

    }

    public String getTelcoName() {

        return telcoName;

    }

    public double getPromoPrice() {

        return promoPrice;

    }

}


