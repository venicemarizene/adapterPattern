class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger charger;

    public SmartphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }

    @Override
    public void plugIn() {
        System.out.println("Plugging smartphone charger into power outlet...");
        charger.chargePhone();
    }
}