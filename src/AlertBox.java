import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class AlertBox {
    // creating a method to display alertbox

    public static void display(String title, String message){

        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); // block user interaction with other windows until this one is taken care of
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label(message);
        Button btn = new Button("Close Window");
        btn.setOnAction(e-> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, btn);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
         

    }
}
