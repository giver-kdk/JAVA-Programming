package javafxproject;

// Import JavaFX libraries
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;                          // For 'Scene'
import javafx.scene.control.*;                  // For 'TextField' and Others
import javafx.scene.layout.*;                   // For 'GridPane' and Others
import javafx.event.*;

/**
 *
 * @author Nagarjuna 14
 */
public class JavaFXProject extends Application{
    TextField t1, t2;
    Button b;
    Label l;
    /**
     * Override the 'start()' method for custom functionality
     */
    @Override
    public void start(Stage stage) throws Exception
    {
        t1 = new TextField();
        t2 = new TextField();
        b = new Button("Add");
        l = new Label("Result");    
        // Add Event Handler for Button from JavaFX (Not AWT)
        b.setOnAction((event) -> {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            
            l.setText("Sum is: " + (n1 + n2));
        });
        
        // Add components on Verticle Box Layout
        VBox box = new VBox(10); // 10px spacing
        box.getChildren().addAll(t1, t2, b, l);
        
        // Add the box layout and dimension in Scene
        Scene scene = new Scene(box, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
//        Launch the JavaFX Application (Entry point for JavaFX Application)
        launch(args);
    }
    
}
