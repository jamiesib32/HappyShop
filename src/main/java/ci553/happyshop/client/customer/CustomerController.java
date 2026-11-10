package ci553.happyshop.client.customer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class CustomerController {
    public CustomerModel cusModel;



    public void doAction(String action) {

        switch (action) {
            case "Search":
                cusModel.search();
                playSound();
                break;
            case "Add to Trolley":
                cusModel.addToTrolley();
                playSound();
                break;
            case "Cancel":
                cusModel.cancel();
                playSound();
                break;
            case "Check Out":
                cusModel.checkOut();
                playSound();

                break;


            case "OK & Close":
                cusModel.closeReceipt();

                break;

        }


    }
    public void playSound()
    {
        try {
            File file = new File("soundreality-bell-sound-effect-613873.wav");
            //file path for sound
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            //opens audio system and finds filepath
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            //opens clip and finds audio system
            clip.start();
            //plays sound
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("error");
            //catches exceptions
        }
    }
    public void playMusic()
    {
        try {
            File file = new File("alex-morgan-elevator-music-on-hold-583285.wav");
            //file path for sound
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            //opens audio system and finds filepath
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            //opens clip and finds audio system
            clip.start();
            //plays sound
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("error");
            //catches exceptions
        }

    }




}


