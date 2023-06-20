import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class App extends Application{
   Stage window;
   Button button;
   Button closeBtn;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("JavaFX - kova");
        window.setOnCloseRequest(e->{
            e.consume();
            closeProgram();
        });

        button = new Button("Click me");
        closeBtn = new Button("close");
        button.setOnAction(e-> {
            boolean res = ConfirmBox.display("AlertBox", "Are you sure you want to do this?");
            System.out.println(res);
        });
        closeBtn.setOnAction(e->closeProgram());

        // create layout 
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(button,closeBtn); // add btn to layout
       
       


        //Create scene
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram(){
        boolean res = ConfirmBox.display("AlertBox", "Are you sure you want to do this?");
        if(res){
            System.out.println("File is saved");
            window.close();
        }
    }
}
