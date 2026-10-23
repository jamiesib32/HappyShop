package ci553.happyshop.client.customer;
import javax.sound.sampled.*;
import java.io.File;





import java.io.File;
import java.io.IOException;

public class Music {

    Clip clip;
    AudioInputStream audioInputStream;
    static String filePath;
    public Music()
            throws UnsupportedAudioFileException,
            IOException, LineUnavailableException
    {
        // create AudioInputStream object
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

        // create clip reference
        clip = AudioSystem.getClip();

        // open audioInputStream to the clip
        clip.open(audioInputStream);

        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }


    public void play()
    {
        //start the clip
        clip.start();


    }








    public static void main(String[] args) {
        try {
            filePath = "ikoliks_aj-hotel-elevator-music-332339.mp3";
            Music audioPlayer =
                    new Music();

            audioPlayer.play();


        }
        catch (Exception ex)
        {
            System.out.println("Error");


        }
    }
}
