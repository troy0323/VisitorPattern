interface TelcoSubscription {
    String accept(UsagePromo usagePromo, UnliCallOffer unliCallOffer);
}


interface UsagePromo {
    String showAllowance(String telcoName, double money);
}


interface UnliCallOffer {
    String showUnliCallsTextOffer(String telcoName, boolean unliCallText);
}


class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo usagePromo, UnliCallOffer unliCallOffer) {
        return usagePromo.showAllowance(telcoName, promoPrice) + "\n" +
                unliCallOffer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    // Getters
    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public boolean isUnliCallText() {
        return unliCallText;
    }
}
