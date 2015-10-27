import javafx.application.Application;

import javax.swing.JOptionPane;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
public class Ex4dot1 extends Application {
	int tries = 0;
	boolean access = false;
	public int determineAuth(TextField userTextField, PasswordField pxBox){
		String[] Users = {"User1","User2","User3"};
		String[] Passes = {"Pass1","Pass2","Pass3"};
		if (userTextField.getText().equals(Users[0]) && pxBox.getText().equals(Passes[0])){
			return 3;
		}else if (userTextField.getText().equals(Users[1]) && pxBox.getText().equals(Passes[1])){
			return 2;
		}else if (userTextField.getText().equals(Users[2]) && pxBox.getText().equals(Passes[2])){
			return 1;
		}else{
			return 0;
		}
	}
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
		
		TextField userTextField = new TextField();
		grid.add(userTextField,1,1);

		Label pw = new Label("Password:");
		grid.add(pw,0,2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox,1,2);

		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn,1,4);

		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				if (tries < 3){
					int level = determineAuth(userTextField, pwBox);
					access = false;
					switch (level){
					case 3: access = true;
					break;
					case 2: access = true;
					break;
					case 1: access = true;
					break;
					case 0: access = false;
					tries++;
					break;
					default: access = false;
					tries++;
					break;
					}
					if (access == false){
						JOptionPane.showMessageDialog(null,"Incorrect","Title", tries);
					}else{
						String i1 = "";
						String[] AccountTypes = {"","Student","Staff","Admin"};
						System.out.print("TEST");
						while (!i1.equals(AccountTypes[level])){
							i1 = (String) JOptionPane.showInputDialog(null, "Choose your account type.","String",0, null, AccountTypes, AccountTypes);
						}
						switch (AccountTypes[level]){
							case "Admin": JOptionPane.showMessageDialog(null, "Welcome Admin.");
							System.exit(0);
							break;
							case "Staff": JOptionPane.showMessageDialog(null, "Welcome Staff.");
							System.exit(0);
							break;
							case "Student": JOptionPane.showMessageDialog(null, "Welcome Student.");
							System.exit(0);
							break;
							default:
							break;
						}
					}
				}else{
					JOptionPane.showMessageDialog(null, "Contact your Admin.");
					System.exit(0);
				}
		}});
	}
	public static void main(String[]args){
		launch(args);
	}
}