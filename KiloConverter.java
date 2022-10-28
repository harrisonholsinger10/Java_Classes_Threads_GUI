import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *  Kilometer Converter application
 *  Harrison Holsinger 
 *  3/15/2021
 */

public class KiloConverter extends Application
{
   // Fields
   private TextField kiloTextField;
   private TextField kiloTextField1;
   private Label resultLabel;
   private Label resultLabel1;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
	  // Labels
	   
	  // SCENE 1
      Label Title1 = new Label("CHOOSE A TYPE OF CONVERSION");
      Label promptLabel4 = new Label("Two Types of Conversions!");
      Label KilotoMilesLabel = new Label("Click for Kilometer to miles conversion:"); 
      Label MetertoYardsLabel = new Label("Click for Meters to yards conversion:");
      Label ExitLabel = new Label("Exit the program:");
      
      // SCENE 2
      Label promptLabel = new Label("Enter a distance in kilometers:");
      Label promptLabel2 = new Label("(Kiolmeters to miles)");
      Label ExitL = new Label("Done with the Program:");
      Label BackLabel = new Label("Go back to your options:"); 
      
      // SCENE 3
      Label promptLabel1 = new Label("Enter a distance in meters:");
      Label promptLabel3 = new Label("(Meters to yards)");
      Label GoBackLabel = new Label("Go back to your options:");    
      Label Exit = new Label("Done with the Program:");     
      
      // Buttons
      
      // SCENE 1
      Button kiloToMiles = new Button("Click for kilometers to miles");
      Button metersToYards = new Button("Click for meters to yards");
      Button ExitButton = new Button("Exit");
      
      // SCENE 2
      Button GoBackButton = new Button("GO BACK");
      Button QuitButton = new Button("EXIT");
      Button calcButton = new Button("Convert");
      
      // SCENE 3
      Button BackButton = new Button("GO BACK");      
      Button LeaveButton  = new Button("EXIT");
      Button calcButton1 = new Button("Convert");
      
      // TextField
      kiloTextField = new TextField();  
      kiloTextField1 = new TextField();     

      // ResultLabel
      resultLabel1 = new Label();
      resultLabel = new Label();
      
      
      // SCENE 1
      
      // Hbox and Vbox
      HBox title = new HBox(15, Title1);
      HBox Option = new HBox(15, promptLabel4);
      HBox Button = new HBox(20, KilotoMilesLabel, kiloToMiles, MetertoYardsLabel, metersToYards);
      VBox vBox1 = new VBox(20, title, Option, Button, ExitLabel, ExitButton);
      
      // Adjustments
      title.setAlignment(Pos.CENTER);
      vBox1.setAlignment(Pos.CENTER);
      Button.setAlignment(Pos.CENTER);
      Option.setAlignment(Pos.CENTER);
      vBox1.setPadding(new Insets(15));
      Button.setPadding(new Insets(10));
      Option.setPadding(new Insets(10));
      title.setPadding(new Insets(10));

      // SCENE 2
     
      // Gridpane
      GridPane gridpane1 = new GridPane();
      
      gridpane1.setHgap(10);
      gridpane1.setVgap(10);
      
      gridpane1.add(promptLabel, 0, 1);
      gridpane1.add(kiloTextField, 0, 2);
      gridpane1.add(calcButton, 0, 3);
      gridpane1.add(resultLabel, 0, 4);
      gridpane1.add(promptLabel2, 0, 0);
      
      gridpane1.setAlignment(Pos.CENTER);
      gridpane1.setPadding(new Insets(10));
      
      // Vbox
      VBox result = new VBox(15, gridpane1, calcButton, resultLabel, BackLabel, GoBackButton, ExitL, QuitButton);     
      
      // Set the result VBox's alignment to center.   
      result.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result.setPadding(new Insets(10));


      // SCENE 3
      
      // Gridpane
      
      GridPane gridpane2 = new GridPane();
      
      gridpane2.setHgap(10);
      gridpane2.setVgap(10);
        
      gridpane2.add(promptLabel1, 1, 1);
      gridpane2.add(kiloTextField1, 1, 2);
      gridpane2.add(calcButton1, 1, 3);
      gridpane2.add(resultLabel1, 1, 4);
      gridpane2.add(promptLabel3, 1, 0);

      gridpane2.setAlignment(Pos.CENTER);
      gridpane2.setPadding(new Insets(10));
     
      // Vbox
      VBox result2 = new VBox(15, gridpane2, calcButton1, resultLabel1, GoBackLabel, BackButton, Exit, LeaveButton);   
      
      result2.setAlignment(Pos.CENTER);   
     
      result2.setPadding(new Insets(10));
      
      // Scene
      Scene scene1 = new Scene(vBox1, 1000, 600);
      Scene scene2 = new Scene(result, 1000, 600);
      Scene scene3 = new Scene(result2, 1000, 600);
      
      
      // Event Handlers
      // Scene 1
      kiloToMiles.setOnAction(e -> primaryStage.setScene(scene2));
      metersToYards.setOnAction(e -> primaryStage.setScene(scene3));
      ExitButton.setOnAction(new ButtonClickHandlerExit());
      
      // Scene 2
      calcButton.setOnAction(new CalcButtonHandler());
      GoBackButton.setOnAction(e -> primaryStage.setScene(scene1));
      QuitButton.setOnAction(new QuitButtonHandler());
      
      // Scene 3
      calcButton1.setOnAction(new CalcButtonHandler1());
      BackButton.setOnAction(e -> primaryStage.setScene(scene1));  
      LeaveButton.setOnAction(new LeaveButtonHandler());
 
      // Add the Scene to the Stage.
      primaryStage.setScene(scene1);
      
      // Set the stage title.
      primaryStage.setTitle("Converter");
      
      // Show the window.
      primaryStage.show();   
   }
   
   /*
    * Event handler class for calcButton
    */
    
   class CalcButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
         Double kilometers = Double.parseDouble(kiloTextField.getText());
         
         // Convert the kilometers to miles.
         Double miles = kilometers * 0.6214;
         
         // Display the results.
         resultLabel.setText(String.format("%,.2f miles", miles));
      }
   }
   class CalcButtonHandler1 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
         Double meters = Double.parseDouble(kiloTextField1.getText());
         
         // Convert the kilometers to miles.
         Double yards = meters * 1.094;
        
         // Display the results.
         resultLabel1.setText(String.format("%,.2f yards", yards));
      }
    }
   class ButtonClickHandlerExit implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Exit the Program.
		   Platform.exit();
		   
	   
	   }
   }
   class QuitButtonHandler implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Exit the Program.
		   Platform.exit();
	   }
   }
   class LeaveButtonHandler implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Exit the Program.
		   Platform.exit();
	   }
   }
}