/* Asks user for input on the specifics of their account, checking and verifying that the inputs are valid.
 * 
 * @param Username
 * @param Password made up of 8 or more characters
 * @param Email from gmail.com
 * @param First Name
 * @param Last Name
 * @param Account Type
 * @return A toString method describing the user.
 * 
 */

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
	Boolean cont2 = false;
	Boolean cont3 = false;
	public void start(Stage primarystage){
		primarystage.setTitle("Javafx  Window");
		primarystage.show();
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Scene scene = new Scene(grid,1100,400);
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
		ComboBox<AuthLevel> combobox = new ComboBox<AuthLevel>(options);
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
				hiddenerror.setVisible(false);
				userTextField.setStyle("-fx-text-box-border: black");
				if (combobox.getValue().toString().equals(null)){
					user1.setAuth("Guest");
				}else{
					user1.setAuth(combobox.getValue().toString());
				}
//				String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}";

					if (user1.getUserName().equals("") || user1.getFirstName().equals("") || user1.getEmail().equals("") || user1.getLastName().equals("") || user1.getAuth().equals("") || user1.getPword().equals("")){
						cont = false;
						hiddenerror.setText("One or more of the inputs are empty, or your email is not verified.");
						hiddenerror.setVisible(true);
					}else{
						cont = true;
					}

						if (user1.getUserName().equals("")){
							userTextField.setStyle("-fx-text-box-border: red");
						}else{
							userTextField.setStyle("-fx-text-box-border: black");
						}
						if (user1.getPword().equals("")){
							pwBox.setStyle("-fx-text-box-border: red");
						}else{
							pwBox.setStyle("-fx-text-box-border: black");
						}
						if (user1.getFirstName().equals("")){
							firstTextField.setStyle("-fx-text-box-border: red");
						}else{
							firstTextField.setStyle("-fx-text-box-border: black");
						}
						if (user1.getEmail().equals("") || !user1.getEmail().contains("@gmail.com")){
							emailTextField.setStyle("-fx-text-box-border: red");
							hiddenerror.setVisible(true);
							cont3 = false;
						}else{
							emailTextField.setStyle("-fx-text-box-border: black");
							hiddenerror.setVisible(false);
							cont3 = true;
						}
						if (user1.getLastName().equals("")){
							lastTextField.setStyle("-fx-text-box-border: red");
						}else{
							lastTextField.setStyle("-fx-text-box-border: black");
						}
						if (pwConfirmbox.getText().equals("")){
							pwConfirmbox.setStyle("-fx-text-box-border: red");
						}else{
							pwConfirmbox.setStyle("-fx-text-box-border: black");
						}
						
					if (user1.getPword().equals(pwConfirmbox.getText()) && user1.getPword().length() >= 8){
						cont2 = true;
						hiddenerror.setVisible(false);
					}else{
						cont2 = false;
						hiddenerror.setText("Your passwords do not match or your password needs to include at least 8 characters, one or more of which must be a number, letter, or nonalphanumeric.");
						hiddenerror.setVisible(true);
					}
				
					if (cont == true && cont2 == true && cont3 == true){
						JOptionPane.showMessageDialog(null, user1.toString());
						System.out.print("EVERYTHING IS OK");
					}else{
						System.out.println("SOMETHING IS WRONG");
					}
			}
		});
	}
	public static void main(String[]args){
		launch(args);
	}
}
