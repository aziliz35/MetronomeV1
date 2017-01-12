import Controleur.*;
import Command.*;
import IHM.Ihm;
import IHM.IhmImpl;
import Moteur.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Ines on 04/01/2017.
 */
public class Metronome extends Application {

    private static Moteur moteur;
    private static Controleur controleur;
    private static Ihm ihm;
    private static Command marquerMesure;
    private static Command marquerTemps;
    private static Command startCommand;
    private static Command stopCommand;


    public static void main( String[] args ) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("resources/ihm.fxml"));
            AnchorPane rootLayout = loader.load();
            ihm = loader.<Ihm>getController();
            ihm.init();
            moteur = new MoteurImpl();
            startCommand = new DemarrerMoteur(moteur);
            controleur = new ControleurImpl(moteur, ihm);
            marquerTemps = new MarquerTemps(controleur);
            marquerMesure = new MarquerMesure(controleur);
            moteur.setMarquerMesure(marquerMesure);
            moteur.setMarquerTemps(marquerTemps);
            controleur.setDemarrerMoteur(startCommand);
            stopCommand = new ArretMoteur(moteur);
            controleur.setArretMoteur(stopCommand);
            controleur.startMoteur();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
