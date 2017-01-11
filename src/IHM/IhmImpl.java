package IHM;

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

    public IhmImpl() {
        this.playerTemps = new MediaPlayer(new Media(sonTemps));
        this.playerMesure = new MediaPlayer(new Media(sonMesure));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void allumerLed(int led) {
        switch (led) {
            case 1:
                this.led1.setImage(new Image("/resources/led_rouge.png"));
                break;
            case 2:
                this.led2.setImage(new Image("/resources/led_verte.png"));
                break;
        }
    }

    public void eteindreLed(int led) {
        switch (led) {
            case 1:
                this.led1.setImage(new Image("/resources/led_grise.png"));
                break;
            case 2:
                this.led2.setImage(new Image("/resources/led_grise.png"));
                break;
        }
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