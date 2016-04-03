package es.javiergarciaescobedo.javafxmaterialdesigntemplate;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Javier García Escobedo <javiergarciaescobedo.es>
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent screen0 = FXMLLoader.load(getClass().getResource("/fxml/Screen0.fxml"));
            Scene scene = new Scene(screen0, 600, 400);
            primaryStage.setTitle("JavaFX Material Design Template");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            Platform.exit();
        }        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
