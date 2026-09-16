public class BrightnessSystem {
    private ConfigurationManager config = ConfigurationManager.getInstance();
    BrightnessSystem(){

    }
	public void BrightnessCal(){
	    int brightLevel = (int)(config.getBrightness() * 100);
		System.out.println("Brightness Calibration is set to " + brightLevel + "%");
	}
}
