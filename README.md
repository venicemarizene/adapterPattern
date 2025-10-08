# Programming Challenge - Adapter Pattern

<b>Plugging Devices into Power Outlets</b>

You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

<b> 1. Adaptee Objects: </b>
   <ul> 
     <li> Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.</li>
     <li> Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method. </li>
     <li> SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method. </li>
   </ul>
<b> 2. Target Object: </b>
   <ul> 
     <li> PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method. </li>
   </ul>
<b>3. Adapter Objects: </b>
   <ul> 
     <li> LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge(). </li>
     <li> RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling(). </li>
     <li> SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone(). </li>
   </ul>

# UML Class Diagram
![UML Class Diagram](adapterPattern.png)
