package pkg01_javafx_adder;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class Main extends Application{
	TextField t1, t2;
	Button b;
	Label l;

	@Override
	public void start(Stage stage) throws Exception
	{
		t1 = new TextField();
		t2 = new TextField();
		b = new Button("Add");
		l = new Label("Result");

		b.setOnAction((event) -> {
			int num1 = Integer.parseInt(t1.getText());
			int num2 = Integer.parseInt(t2.getText());

			int result = num1 + num2;
			l.setText("Sum is: " + result);
		});

		VBox box = new VBox(10);
		box.getChildren().addAll(t1, t2, b, l);

		Scene scene = new Scene(box, 300, 300);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}