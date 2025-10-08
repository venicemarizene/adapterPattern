class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public void plugIn() {
        System.out.println("Plugging refrigerator into power outlet...");
        refrigerator.startCooling();
    }
}