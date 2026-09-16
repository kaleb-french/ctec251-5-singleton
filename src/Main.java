public class Main {
    static void main() {
        ConfigurationManager instance1 = ConfigurationManager.getInstance();
        ConfigurationManager instance2 = ConfigurationManager.getInstance();
        if (instance1 == instance2) {
            System.out.println("They are equal!");
        }
        BrightnessSystem brightness = new BrightnessSystem();
        brightness.BrightnessCal();

        DisplaySystem disp = new DisplaySystem();
        disp.getDisplay();

        AudioSystem audio = new AudioSystem();
        audio.playAudio();

        audio.volumeUp(100);
        audio.playAudio();
        audio.volumeDown(250);
        audio.playAudio();
    }
}
