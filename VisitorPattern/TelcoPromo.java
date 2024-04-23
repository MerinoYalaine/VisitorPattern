package VisitorPattern;

public class TelcoPromo {

    public static void main(String[] args) {

        TelcoSubscription smart = new Telco(15, 500, "Smart", false);
        TelcoSubscription globe = new Telco(10, 450, "Globe", true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto", true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Total Cost: ₱" + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe Total Cost: ₱" + promo.showAllowance(globe.getTelcoName(),globe.getPromoPrice()));
        System.out.println("Telco C Total Cost: ₱" + promo.showAllowance(ditto.getTelcoName(),ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe.getTelcoName(),globe.getUnliCallText()) + " Calls and texts to other networks are charged extra.");
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto.getTelcoName(),ditto.getUnliCallText()) + " This plan only works within the country.");

    }

}