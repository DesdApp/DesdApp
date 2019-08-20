
package main;

import java.io.IOException;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader cargador = new FXMLLoader();
            AnchorPane root = cargador.load(getClass().getResourceAsStream("/vista/login/Login.fxml"));
            
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("Inicio de Sesion DesdApp");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            Logger.getLogger(main.class.getName());
            System.out.println("Error *-* " + e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
