import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Ex4dot1 extends Application {
public void start(Stage primaryStage){
primaryStage.setTitle("JavaFX Welcome");
primaryStage.show();

GridPane grid = new GridPane();
grid.setAlignment(Pos.CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(25,25,25,25));

final Text actiontarget = new Text();
grid.add(actiontarget,1,6);

Scene scene = new Scene(grid,300,275);
primaryStage.setScene(scene);

Text scenetitle = new Text("Welcome");
scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
grid.add(scenetitle,0,0,2,1);

Label userName = new Label("User Name:");
grid.add(userName,0,1);

Label pw = new Label("Password:");
grid.add(px,0,2);

PasswordField pxBox = new PasswordField();
grid.add(pwBox,1,2);

Button btn = new Button("Sign in");
HBox hbBtn = new HBox(10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
hbBtn.getChildren().add(btn);
grid.add(hbBtn,1,4);

btn.setOnAction(new EventHandler<ActionEvent>(){
public void handle(ActionEvent e){
actiontarget.setFill(Color.FIREBRICK);
actiontarget.setText("Sign in button pressed.");
}
});
}
public static void main(String[]args){
launch(args);
}
}
