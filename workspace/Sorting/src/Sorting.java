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

public class Sorting extends Application {
	String outl = "";
	int[] numinput = new int[5];
	int[] numoutput = new int[numinput.length];
	private static int[] SortArray(int[] numinput) {
		// TODO Auto-generated method stub
		int length = numinput.length;
		int counter = 0;
		int i = 1;
		int holder = 0;
		while (numinput[0]>numinput[1] || numinput[1]>numinput[2] || numinput[2]>numinput[3] || numinput[3]>numinput[4]) {
			if (numinput[counter] > numinput[counter + i]) {
				holder = numinput[counter]; //if numinput[counter] is 4 and numinput[counter+1] is 6, holder is now 4, then numinput[counter] becomes 6, then numinput[counter+1] becomes 4, so now holder is 4, numinput[counter] is 6, and numinput[counter+1] is 4
				numinput[counter] = numinput[counter + i];
				numinput[counter + i] = holder; // ^TLDR everything is OK
			} else if (numinput[counter] < numinput[counter + i]) {
				counter++; //if theyre already in the right spots dont move them
			} else if (numinput[counter] == numinput[counter + i]) {
				counter++; //if they are equal dont move them
			}
			if ((counter + i) >= length){
				counter = 0; //to try the whole thing over again to check the moved numbers
			}else{
				i = 1;
			}
		}
		return numinput;
	}

	@Override
	public void start(Stage primarystage) throws Exception {
		primarystage.setTitle("Javafx  Window");
		primarystage.show();
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Scene scene = new Scene(grid,300,300);
		primarystage.setScene(scene);
		
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
		grid.add(scenetitle,0,0,2,1);
		
		Label num1 = new Label("Input 1:");
		grid.add(num1,0,1);
		TextField num1TF = new TextField();
		grid.add(num1TF,1,1);
		Label num2 = new Label("Input 2:");
		grid.add(num2,0,2);
		TextField num2TF = new TextField();
		grid.add(num2TF,1,2);
		Label num3 = new Label("Input 3:");
		grid.add(num3,0,3);
		TextField num3TF = new TextField();
		grid.add(num3TF,1,3);
		Label num4 = new Label("Input 4:");
		grid.add(num4,0,4);
		TextField num4TF = new TextField();
		grid.add(num4TF,1,4);
		Label num5 = new Label("Input 5:");
		grid.add(num5,0,5);
		TextField num5TF = new TextField();
		grid.add(num5TF,1,5);

		Label out = new Label(outl);
		grid.add(out,0,6);
		
		Button confirm = new Button();
		confirm.setText("Sort");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(confirm);
		grid.add(hbBtn,1,6);

		confirm.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent arg0) {
				numinput[0] = Integer.parseInt(num1TF.getText());
				numinput[1] = Integer.parseInt(num2TF.getText());
				numinput[2] = Integer.parseInt(num3TF.getText());
				numinput[3] = Integer.parseInt(num4TF.getText());
				numinput[4] = Integer.parseInt(num5TF.getText());
				numoutput = SortArray(numinput);
				outl = String.valueOf(numoutput[0])+String.valueOf(numoutput[1])+String.valueOf(numoutput[2])+String.valueOf(numoutput[3])+String.valueOf(numoutput[4]);
				out.setText(outl);
			}
		});
	}
}
