import Controleur.*;
import Command.*;
import IHM.Ihm;
import IHM.IhmImpl;
import Moteur.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
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
        moteur = new MoteurImpl();
        ihm = new IhmImpl();
        controleur = new ControleurImpl(moteur, ihm);
        marquerMesure = new MarquerMesure(controleur);
        moteur.setMarquerMesure(marquerMesure);
        marquerTemps = new MarquerTemps(controleur);
        moteur.setMarquerTemps(marquerTemps);
        startCommand = new DemarrerMoteur(moteur);
        controleur.setDemarrerMoteur(startCommand);
        stopCommand = new ArretMoteur(moteur);
        controleur.setArretMoteur(stopCommand);
        controleur.startMoteur();

        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("resources/ihm.fxml"));

        IhmImpl ihm = loader.<IhmImpl>getController();
        // Show the scene containing the root layout.

        try {
            AnchorPane rootLayout = loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
