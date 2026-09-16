public class AudioSystem {
    ConfigurationManager config = ConfigurationManager.getInstance();

    AudioSystem(){

    }
    public void playAudio(){
        System.out.println("Playing audio at level " + config.getVolume());
    }
    public void volumeUp(int volume){
        int newVolume = config.getVolume() + volume;
        if(newVolume > 160){
            newVolume = 160;
        }
        config.setVolume(newVolume);
    }
    public void volumeDown(int volume){
        int newVolume = config.getVolume() - volume;
        if(newVolume < 0){
            newVolume = 0;
        }
        config.setVolume(newVolume);
    }
}
