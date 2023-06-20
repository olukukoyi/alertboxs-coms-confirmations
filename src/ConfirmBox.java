import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class ConfirmBox {

    static boolean answer;


        public static boolean display(String title, String message){

            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL); // block user interaction with other windows until this one is taken care of
            window.setTitle(title);
            window.setMinWidth(250);
            Label label = new Label(message);

            // create two buttons
            Button yesButton = new Button("Yes");
            yesButton.setOnAction(e->{
                answer = true;
                window.close();
            });
            Button noButton = new Button("No");
            noButton.setOnAction(e->{
                answer = false;
                window.close();
            });
           
    
            VBox layout = new VBox(10);
            layout.getChildren().addAll(label, yesButton, noButton);
            layout.setAlignment(Pos.CENTER);
            Scene scene = new Scene(layout);
            window.setScene(scene);
            window.showAndWait();
             
            return answer;
        }
}
