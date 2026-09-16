public class ConfigurationManager {

    private static ConfigurationManager instance = null;

    private String screenRes = "1920,1080";

    private int volume = 5;

    private double brightness = .5;

    private ConfigurationManager(){
        System.out.println("I'm a real boy!");
    }
    public static  synchronized ConfigurationManager getInstance(){
        if(instance == null){
           instance = new ConfigurationManager();
        }
        return instance;
    }
    public String getScreenRes(){
        return screenRes;
    }
    public void setScreenRes(String res){
        this.screenRes = res;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public double getBrightness(){
        return  brightness;
    }
    public void setBrightness(double brightness){
        //set as a percent from .00 - 1.00
        if(brightness > 1){
            this.brightness = 1.00;
        }else{
            this.brightness = brightness;
        }
    }
}
