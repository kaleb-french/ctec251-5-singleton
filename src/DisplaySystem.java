public class DisplaySystem {
    ConfigurationManager config = ConfigurationManager.getInstance();

    DisplaySystem(){

    }
    public void getDisplay(){
        String[] res = config.getScreenRes().split(",");
        System.out.println("The screen is displaying in " + res[0] + " x " + res[1] + " resolution.");
    }
}
