public class ApplianceApp {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Refrigerator fridge = new Refrigerator();
        SmartphoneCharger phoneCharger = new SmartphoneCharger();

        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet fridgeAdapter = new RefrigeratorAdapter(fridge);
        PowerOutlet phoneAdapter = new SmartphoneAdapter(phoneCharger);

        System.out.println("=== Plugging Devices into Power Outlets ===");
        laptopAdapter.plugIn();
        fridgeAdapter.plugIn();
        phoneAdapter.plugIn();
    }
}