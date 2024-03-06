package sio.demo;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField txtX2;
    @FXML
    private TextField txtY1;
    @FXML
    private TextField txtX1;
    @FXML
    private TextField txtY2;
    @FXML
    private TextField txtDistance;
    Point p1;
    Point p2;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nouvelAlea(null);
    }

    @FXML
    public void maj(Event event) {
        p1.setX(Double.parseDouble(txtX1.getText()));
        p1.setY(Double.parseDouble(txtY1.getText()));
        p2.setX(Double.parseDouble(txtX2.getText()));
        p2.setY(Double.parseDouble(txtY2.getText()));
    }

    @FXML
    public void afficher(Event event) {
        writeRapideInt(txtX1, p1.getX());
        writeRapideInt(txtX2, p2.getX());
        writeRapideInt(txtY1, p1.getY());
        writeRapideInt(txtY2, p2.getY());
    }

    @FXML
    public void calculDistance(Event event) {
        writeRapideInt(txtDistance, Math.round((p2.affiche(p1))*100.0)/100.0);
    }
    public void writeRapideInt(Label lblTexte, int intTexte)
    {
        lblTexte.setText(Integer.toString(intTexte));
        return;
    }
    public void writeRapideInt(TextField txtTexte, double doubleTexte)
    {
        txtTexte.setText(Double.toString(doubleTexte));
        return;
    }

    @FXML
    public void nouvelAlea(Event event) {
        p1 = new Point(Point.alea(5,10), Point.alea(5,10));
        p2 = new Point(Point.alea(5,10), Point.alea(5,10));
        afficher(null);
    }
}