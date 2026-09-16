public class Main {
    static void main() {
        ConfigurationManager instance1 = ConfigurationManager.getInstance();
        ConfigurationManager instance2 = ConfigurationManager.getInstance();

        if (instance1 == instance2) {
            System.out.println("They are equal!");
        }
        System.out.println(instance1.getBrightness());

        instance2.setBrightness(.25);

        System.out.println(instance1.getBrightness());
    }
}
