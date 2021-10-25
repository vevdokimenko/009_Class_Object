package homework.task3;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: " +
                "manufacturer= " + super.getManufacturer() +
                ", price= " + super.getPrice() +
                ", serialNumber= " + super.getSerialNumber() +
                ", speed=" + speed +
                ", mac=" + mac
                ;
    }
}
