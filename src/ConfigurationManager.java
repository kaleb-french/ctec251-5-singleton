public class ConfigurationManager {

    private static ConfigurationManager instance = new ConfigurationManager();

    private String screenRes = "1920,1080";

    private int volume = 5;

    private double brightness = .5;

    private ConfigurationManager(){

    }
    public static ConfigurationManager getInstance(){
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
