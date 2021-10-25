package homework.task4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Monitor monitor1 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Samsung", 125, "KJHFKJDFH", 1024, "HGHJGJHG");
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Samsung", 125, "KJHFKJDFH", 1024, "HGHJGJHG");

        System.out.println(device);
        System.out.println(device.hashCode());
        System.out.println(device1);
        System.out.println(device1.hashCode());
        System.out.println(device.equals(device1));
        System.out.println("------------------------");

        System.out.println(monitor);
        System.out.println(monitor.hashCode());
        System.out.println(monitor1);
        System.out.println(monitor1.hashCode());
        System.out.println(monitor.equals(monitor1));
        System.out.println("------------------------");

        System.out.println(ethernetAdapter);
        System.out.println(ethernetAdapter.hashCode());
        System.out.println(ethernetAdapter1);
        System.out.println(ethernetAdapter1.hashCode());
        System.out.println(ethernetAdapter.equals(ethernetAdapter1));
        System.out.println("------------------------");
    }
}
