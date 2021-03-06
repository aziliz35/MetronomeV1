package IHM;

import Moteur.MoteurImpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URL;
import java.util.ResourceBundle;

public class IhmImpl implements Initializable, Ihm {

    @FXML
    private Label txt;
    @FXML
    private Slider slide;
    @FXML
    private Button demarrer;
    @FXML
    private Button arreter;
    @FXML
    private Button incremente;
    @FXML
    private Button decremente;
    @FXML
    private ImageView led1;
    @FXML
    private ImageView led2;

    private MediaPlayer playerTemps;
    private MediaPlayer playerMesure;
    private String sonTemps = this.getClass().getResource("/resources/beep-07.mp3").toString();
    private String sonMesure = this.getClass().getResource("/resources/beep-08.mp3").toString();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void init() {
        this.playerTemps = new MediaPlayer(new Media(sonTemps));
        this.playerMesure = new MediaPlayer(new Media(sonMesure));

        this.txt.setText(String.valueOf(MoteurImpl.minTempo));
        this.playerTemps.setOnPlaying(new Runnable() {
            @Override
            public void run() {
                led1.setImage(new Image("/resources/led_rouge.png"));
            }
        });

        this.playerTemps.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                led1.setImage(new Image("/resources/led_grise.png"));
            }
        });

        this.playerMesure.setOnPlaying(new Runnable() {
            @Override
            public void run() {
                led2.setImage(new Image("/resources/led_verte.png"));
            }
        });
        this.playerMesure.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                led2.setImage(new Image("/resources/led_grise.png"));
            }
        });
    }

    public void emettreSonTemps() {
        this.playerTemps.stop();
        this.playerTemps.play();
    }

    public void emettreSonMesure() {
        this.playerMesure.stop();
        this.playerMesure.play();
    }
}