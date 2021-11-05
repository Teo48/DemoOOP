package static_example;

class Device {
    public static void charge() {
        System.out.print("Charging device; ");
    }
}

class Phone extends Device {
    public static void charge() {
        System.out.print("Charging phone; ");
    }
}

public class Test {
    public static void main(String[] args) {
        Device phone = new Phone();
        Device device = new Device();

        phone.charge();
        device.charge();
        Device.charge();
    }
}
