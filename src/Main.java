import java.util.Scanner;

public class Main {
    static void main() {
        ConfigurationManager instance = ConfigurationManager.getInstance();
        BrightnessSystem brightness = new BrightnessSystem();
        DisplaySystem disp = new DisplaySystem();
        AudioSystem audio = new AudioSystem();
        boolean loop = true;
        Scanner scan = new Scanner(System.in);
        while(loop == true){
            System.out.println("Welcome to the console.");
            System.out.println("Choose from the following.");
            System.out.println("1. Get Display Manager Status \n 2. Get Brightness System Status \n 3. Get Audio System Status \n 4.Increase Volume \n 5.Decrease Volume \n 6. To Exit" );
            String input = scan.nextLine();
            switch(input){
                case "1":
                    disp.getDisplay();
                    break;
                case "2":
                    brightness.BrightnessCal();
                    break;
                case "3":
                    audio.playAudio();
                    break;
                case "4":
                    audio.volumeUp(5);
                    System.out.println("The Audio Raised!");
                    audio.playAudio();
                    break;
                case "5":
                    audio.volumeDown(5);
                    System.out.println("The Audio Lowered!");
                    audio.playAudio();
                    break;
                case "6":
                    loop = false;
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }
}
