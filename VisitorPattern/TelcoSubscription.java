package VisitorPattern;

public interface TelcoSubscription {

    public String accept(UsagePromo usagepromo, double promoPrice);
    public String accept(UnliCallsTextOffer unlicallstextoffer, boolean unliCallText);
    public String getTelcoName();
    public int getDataAllowance();
    public boolean getUnliCallText();
    public double getPromoPrice();

}