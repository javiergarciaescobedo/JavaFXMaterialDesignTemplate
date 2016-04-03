package es.javiergarciaescobedo.javafxmaterialdesigntemplate;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Javier García Escobedo <javiergarciaescobedo.es>
 */
public class Controller implements Initializable {

    @FXML
    private AnchorPane paneMenuNavigationDrawer;
    @FXML
    private AnchorPane paneMenuToolbar;
    @FXML
    private VBox paneMainContainer;
    @FXML
    private GridPane paneToolBar;
    @FXML
    private GridPane paneBottomBar;
    @FXML
    private Pane paneContentArea;
    @FXML
    private Pane paneEffectDisable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        paneEffectDisable.setVisible(false);
        try {
            VBox menuNavigationDrawer = FXMLLoader.load(getClass().getResource("/fxml/MenuNavigationDrawer.fxml"));
            paneMenuNavigationDrawer.getChildren().add(menuNavigationDrawer);
            VBox menuToolbar = FXMLLoader.load(getClass().getResource("/fxml/MenuToolbar.fxml"));
            paneMenuToolbar.getChildren().add(menuToolbar);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        paneMenuNavigationDrawer.setVisible(false);
        paneMenuToolbar.setVisible(false);
    }    

    @FXML
    private void onMouseExitedPaneNavigationDrawer(MouseEvent event) {
        paneMenuNavigationDrawer.setVisible(false);
        paneEffectDisable.setVisible(false);
    }

    @FXML
    private void onMouseExitedPaneToolbarMenu(MouseEvent event) {
        paneMenuToolbar.setVisible(false);
        paneEffectDisable.setVisible(false);
    }

    @FXML
    private void onMouseClickedMenuNavigationDrawer(MouseEvent event) {
        paneMenuNavigationDrawer.setVisible(!paneMenuNavigationDrawer.isVisible());
        paneMenuToolbar.setVisible(false);
        paneEffectDisable.setVisible(true);
    }

    @FXML
    private void onMouseClickedMenuToolbar(MouseEvent event) {
        paneMenuToolbar.setVisible(!paneMenuToolbar.isVisible());
        paneMenuNavigationDrawer.setVisible(false);
        paneEffectDisable.setVisible(true);
    }

    
}
