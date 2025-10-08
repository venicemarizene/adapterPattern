class LaptopAdapter implements PowerOutlet {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void plugIn() {
        System.out.println("Plugging laptop into power outlet...");
        laptop.charge();
    }
}