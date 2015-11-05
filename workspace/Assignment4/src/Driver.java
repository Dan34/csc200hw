import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Driver extends Application {
	Boolean cont = false;
	public void start(Stage primarystage){
		primarystage.setTitle("Javafx  Window");
		primarystage.show();
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Scene scene = new Scene(grid,400,375);
		primarystage.setScene(scene);
		
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
		Label pwconfirm = new Label("Confirm Password:");
		grid.add(pwconfirm, 0, 3);
		PasswordField pwConfirmbox = new PasswordField();
		grid.add(pwConfirmbox,1,3);
		Label firstName = new Label("First Name:");
		grid.add(firstName, 0, 4);
		TextField firstTextField = new TextField();
		grid.add(firstTextField, 1, 4);
		Label lastName = new Label("Last Name:");
		grid.add(lastName, 0, 5);
		TextField lastTextField = new TextField();
		grid.add(lastTextField, 1, 5);
		Label email = new Label("Email:");
		grid.add(email, 0, 6);
		TextField emailTextField = new TextField();
		grid.add(emailTextField, 1, 6);
		Label accounttype = new Label("Account Type:");
		grid.add(accounttype, 0, 7);
		ObservableList<AuthLevel> options = FXCollections.observableArrayList(AuthLevel.Administrator, AuthLevel.Staff, AuthLevel.Faculty, AuthLevel.Student, AuthLevel.Guest);
		ComboBox combobox = new ComboBox(options);
		grid.add(combobox, 1, 7);
		Label hiddenerror = new Label("One or more of the inputs are empty.");
		grid.add(hiddenerror, 1, 9);
		hiddenerror.setAlignment(Pos.BOTTOM_RIGHT);
		hiddenerror.setVisible(false);
		hiddenerror.setTextFill(Color.BLUE);
		
		Button confirm = new Button();
		confirm.setText("Sign up");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(confirm);
		grid.add(hbBtn,1,8);
		
		confirm.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				User user1 = new User(userTextField.getText(),firstTextField.getText(),lastTextField.getText(),pwBox.getText(),emailTextField.getText());
				user1.setAuth(combobox.getValue().toString());
				if (user1.getPword().equals(pwConfirmbox.getText())){
					cont = true;
				}else{
					cont = false;
					hiddenerror.setText("Your passwords do not match.");
					hiddenerror.setVisible(true);
				}
				if (user1.getUserName().equals(null) || user1.getFirstName().equals(null) || user1.getEmail().equals(null) || user1.getLastName().equals(null) || user1.getAuth().equals(null) || user1.getPword().equals(null)){
					cont = false;
					hiddenerror.setText("One or more of the inputs are empty.");
					hiddenerror.setVisible(true);
				}else{
					cont = true;
				}
				if (cont = true){
					JOptionPane.showMessageDialog(null, user1.toString());
				}
			}
		});
	}
	public static void main(String[]args){
		launch(args);
	}
}
