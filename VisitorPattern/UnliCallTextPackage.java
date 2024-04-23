package VisitorPattern;

import java.util.*;
public class UnliCallTextPackage implements UnliCallsTextOffer {

    private static Map<String, Boolean> packageMap = new HashMap<>();

    static {

        packageMap.put("Smart", false);
        packageMap.put("Globe", true);
        packageMap.put("Ditto", true);

    }

    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (unliCallText) {

            return "They do not offer any free calls or texts, and you will be charged per use.";

        } else {

            return "This plan comes with unlimited calls and texts to subscribers within their network.";

        }

    }

}