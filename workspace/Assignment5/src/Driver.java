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
	String grade = "";
	public double weight(String worth, String score){
		double w = Double.parseDouble(worth);
		double s = Double.parseDouble(score);
		double g = w*s;
		return g;
	}
	public String letterg(double a){
		String letter = "F";
		double e = a;
		if (e<64){
			letter = "F";
		}else if(e>=64 && e<70){
			letter = "D";
		}else if(e>=70 && e<79){
			letter = "C";
		}else if(e>=79 && e<89){
			letter = "B";
		}else if(e>=89){
			letter = "A";
		}
		return letter;
	}
	
	public void start(Stage primarystage){
		Student stu = new Student(0,0,0,0);
		primarystage.setTitle("Javafx  Window");
		primarystage.show();
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Scene scene = new Scene(grid,600,400);
		primarystage.setScene(scene);
		
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
		grid.add(scenetitle,0,0,2,1);
		
		Label nam = new Label("Student Name");
		grid.add(nam,0,5);
		TextField namTF = new TextField();
		grid.add(namTF,1,5);
		
		Label score1 = new Label("Test Score 1");
		grid.add(score1,0,1);
		TextField score1TF = new TextField();
		grid.add(score1TF,1,1);
		
		Label score2 = new Label("Test Score 2");
		grid.add(score2,0,2);
		TextField score2TF = new TextField();
		grid.add(score2TF,1,2);
		
		Label score3 = new Label("Test Score 3");
		grid.add(score3,0,3);
		TextField score3TF = new TextField();
		grid.add(score3TF,1,3);
		
		Label score4 = new Label("Test Score 4");
		grid.add(score4,0,4);
		TextField score4TF = new TextField();
		grid.add(score4TF,1,4);
		
		Label w1 = new Label("Test Weight 1");
		grid.add(w1,2,1);
		TextField w1TF = new TextField();
		grid.add(w1TF,3,1);
		
		Label w2 = new Label("Test Weight 2");
		grid.add(w2,2,2);
		TextField w2TF = new TextField();
		grid.add(w2TF,3,2);
		
		Label w3 = new Label("Test Weight 3");
		grid.add(w3,2,3);
		TextField w3TF = new TextField();
		grid.add(w3TF,3,3);
		
		Label w4 = new Label("Test Weight 4");
		grid.add(w4,2,4);
		TextField w4TF = new TextField();
		grid.add(w4TF,3,4);
		
		Label finG = new Label(grade);
		grid.add(finG, 0, 6);
		
		Button confirm = new Button();
		confirm.setText("Grade");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(confirm);
		grid.add(hbBtn,3,5);
		
		confirm.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				stu.setScores(weight(w1TF.getText(),score1TF.getText()),weight(w2TF.getText(),score2TF.getText()),weight(w3TF.getText(),score3TF.getText()),weight(w4TF.getText(),score4TF.getText()));
				stu.setGPA(stu.getScore1()+stu.getScore2()+stu.getScore3()+stu.getScore4());
				stu.setName(namTF.getText());
				grade = letterg(stu.getGPA());
				finG.setText(stu.getName() + " has a(n) "+grade+".");
			}
		});
	}
	public static void main(String[]args){
		launch(args);
	}
}
