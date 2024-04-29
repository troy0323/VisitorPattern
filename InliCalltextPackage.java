public class UnliCallTextPackage implements UnliCallOffer{
    private static Map<String, String> uOfferMap = new HashMap<>();

    static {
        uOfferMap.put("Smart", "Does not offer any free calls or texts, and you will be charged per use.");
        uOfferMap.put("Globe", "This plan comes with unlimited calls and texts to subscribers within their network");
        uOfferMap.put("Ditto", "This plan includes unlimited calls and texts to all networks within the country");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return uOfferMap.get(telcoName);
    }
}
