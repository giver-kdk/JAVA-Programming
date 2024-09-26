package javafxproject;

// Import JavaFX libraries
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.*;                          // For 'Scene'
import javafx.scene.control.*;                  // For 'TextField' and Others
import javafx.scene.layout.*;                   // For 'GridPane' and Others
import javafx.stage.Stage;
/**
 *
 * @author Nagarjuna 14
 */
public class JavaFXProject extends Application{
    TextField t1, t2;
    Label l;
    Button b;
    /**
     * Override the 'start()' method for custom functionality
     */
    @Override
    public void start(Stage stage) throws Exception
    {
        GridPane grid = new GridPane();
        t1 = new TextField();
        t2 = new TextField();
        b = new Button("Add");
        l = new Label("Button");
        
        // Add components on 1st row
        grid.addRow(0, t1);
        // Add components on 2nd row
        grid.addRow(1, t2);
        // Add components on 3rd row
        grid.addRow(2, b);
        // Add components on 4th row
        grid.addRow(3, l);
        
        // Add the grid and dimension in Scene
        Scene scene = new Scene(grid, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
    
    class Handler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent t){
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            
            l.setText("Sum is: " + (n1 + n2));
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
