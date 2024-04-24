class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        return telcoName + " Data Usage Offer and price: " + money;
    }
}

// Implement the UnliCallOffer interface
class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " unlimited calls and text package: " + (unliCallText ? "Included" : "Not Included");
    }
}
