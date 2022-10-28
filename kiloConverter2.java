import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *  Kilometer Converter version 2 application
 *  Harrison Holsinger 
 *  3/15/2021
 */

public class kiloConverter2 extends Application
{
   // Fields
   private TextField kiloTextField;
   private TextField kiloTextField1;
   private TextField kiloTextField2;
  
   private Label resultLabel;
   private Label resultLabel1;
   private Label resultLabel2;
   
   private Label catchLabel1;
   private Label catchLabel2;
   private Label catchLabel3;
   
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
      Title1.setStyle("-fx-font-weight: bold");
      Title1.setStyle("-fx-font: 40 arial;");
      Title1.setTextFill(Color.WHITE);
      
      Label promptLabel4 = new Label("Three Types of Conversions!");
      promptLabel4.setStyle("-fx-font: 24 arial;");
      promptLabel4.setTextFill(Color.WHITE);
      
      Label ExitLabel = new Label("Exit the program:");
      ExitLabel.setStyle("-fx-font-weight: bold");
      ExitLabel.setStyle("-fx-font: 16 arial;");
      ExitLabel.setTextFill(Color.WHITE);
      
      Label name = new Label("Harrison Holsinger");
      name.setStyle("-fx-font-weight: bold");
      name.setStyle("-fx-font: 16 arial;");
      name.setTextFill(Color.WHITE);
      
      // SCENE 2
      Label promptLabel = new Label("Enter a distance in kilometers:");
      promptLabel.setStyle("-fx-font-weight: bold");
      promptLabel.setStyle("-fx-font: 16 arial;");
      promptLabel.setTextFill(Color.WHITE);
      
      Label promptLabel2 = new Label("(Kiolmeters to miles)");
      promptLabel2.setStyle("-fx-font-weight: bold");
      promptLabel2.setStyle("-fx-font: 16 arial;");
      promptLabel2.setTextFill(Color.WHITE);
      
      Label ExitL = new Label("Done with the Program:");
      ExitL.setStyle("-fx-font-weight: bold");
      ExitL.setStyle("-fx-font: 16 arial;");
      ExitL.setTextFill(Color.WHITE);
      
      Label BackLabel = new Label("Go back to your options:"); 
      BackLabel.setStyle("-fx-font-weight: bold");
      BackLabel.setStyle("-fx-font: 16 arial;");
      BackLabel.setTextFill(Color.WHITE);
      
      // SCENE 3
      Label promptLabel1 = new Label("Enter a distance in meters:");
      promptLabel1.setStyle("-fx-font-weight: bold");
      promptLabel1.setStyle("-fx-font: 16 arial;");
      promptLabel1.setTextFill(Color.WHITE);
      
      Label promptLabel3 = new Label("(Meters to yards)");
      promptLabel3.setStyle("-fx-font-weight: bold");
      promptLabel3.setStyle("-fx-font: 16 arial;");
      promptLabel3.setTextFill(Color.WHITE);
      
      Label GoBackLabel = new Label("Go back to your options:");   
      GoBackLabel.setStyle("-fx-font-weight: bold");
      GoBackLabel.setStyle("-fx-font: 16 arial;");
      GoBackLabel.setTextFill(Color.WHITE);
 
      Label Exit = new Label("Done with the Program:"); 
      Exit.setStyle("-fx-font-weight: bold");
      Exit.setStyle("-fx-font: 16 arial;");
      Exit.setTextFill(Color.WHITE);
      
      // SCENE 4
      Label promptLabel6 = new Label("Enter a distance in inches:");
      promptLabel6.setStyle("-fx-font-weight: bold");
      promptLabel6.setStyle("-fx-font: 16 arial;");
      promptLabel6.setTextFill(Color.WHITE);
      
      Label promptLabel5 = new Label("(Inches to Centimeters)");
      promptLabel5.setStyle("-fx-font-weight: bold");
      promptLabel5.setStyle("-fx-font: 16 arial;");
      promptLabel5.setTextFill(Color.WHITE);
      
      Label GoBackLabel1 = new Label("Go back to your options:");   
      GoBackLabel1.setStyle("-fx-font-weight: bold");
      GoBackLabel1.setStyle("-fx-font: 16 arial;");
      GoBackLabel1.setTextFill(Color.WHITE);
      
      Label Exit2 = new Label("Done with the Program:");  
      Exit2.setStyle("-fx-font-weight: bold");
      Exit2.setStyle("-fx-font: 16 arial;");
      Exit2.setTextFill(Color.WHITE);
      
      // Buttons
      
      // SCENE 1
      RadioButton kiloToMiles = new RadioButton("Kilometers to miles");
      kiloToMiles.setStyle("-fx-font-weight: bold");
      kiloToMiles.setStyle("-fx-font: 16 arial;");
      kiloToMiles.setTextFill(Color.WHITE);
      
      RadioButton metersToYards = new RadioButton("Meters to yards");
      metersToYards.setStyle("-fx-font-weight: bold");
      metersToYards.setStyle("-fx-font: 16 arial;");
      metersToYards.setTextFill(Color.WHITE);
      
      RadioButton inchToCM = new RadioButton("Inches to Centimeters");
      inchToCM.setStyle("-fx-font-weight: bold");
      inchToCM.setStyle("-fx-font: 16 arial;");
      inchToCM.setTextFill(Color.WHITE);
      
      RadioButton ExitButton = new RadioButton("Exit");
      ExitButton.setStyle("-fx-font-weight: bold");
      ExitButton.setStyle("-fx-font: 16 arial;");
      ExitButton.setTextFill(Color.WHITE);
      
      // Create a toggleGroup
      ToggleGroup radioGroup = new ToggleGroup();
      
      // Add buttons to toggleGroup
      kiloToMiles.setToggleGroup(radioGroup);
      metersToYards.setToggleGroup(radioGroup);
      inchToCM.setToggleGroup(radioGroup);


      
      // SCENE 2
      Button GoBackButton = new Button("GO BACK");
      GoBackButton.setStyle("-fx-font-weight: bold");
      GoBackButton.setStyle("-fx-font: 16 arial;");
      GoBackButton.setTextFill(Color.CORNFLOWERBLUE);
      
      Button QuitButton = new Button("EXIT");
      QuitButton.setStyle("-fx-font-weight: bold");
      QuitButton.setStyle("-fx-font: 16 arial;");
      QuitButton.setTextFill(Color.CORNFLOWERBLUE);
      
      Button calcButton = new Button("Convert");
      calcButton.setStyle("-fx-font-weight: bold");
      calcButton.setStyle("-fx-font: 16 arial;");
      calcButton.setTextFill(Color.CORNFLOWERBLUE);
      
      Button reset1 = new Button("RESET");
      reset1.setStyle("-fx-font-weight: bold");
      reset1.setStyle("-fx-font: 16 arial;");
      reset1.setTextFill(Color.CORNFLOWERBLUE);
      
      // SCENE 3
      Button BackButton = new Button("GO BACK");    
      BackButton.setStyle("-fx-font-weight: bold");
      BackButton.setStyle("-fx-font: 16 arial;");
      BackButton.setTextFill(Color.CORNFLOWERBLUE);
      
      Button LeaveButton  = new Button("EXIT");
      LeaveButton.setStyle("-fx-font-weight: bold");
      LeaveButton.setStyle("-fx-font: 16 arial;");
      LeaveButton.setTextFill(Color.CORNFLOWERBLUE);
      
      Button calcButton1 = new Button("Convert");
      calcButton1.setStyle("-fx-font-weight: bold");
      calcButton1.setStyle("-fx-font: 16 arial;");
      calcButton1.setTextFill(Color.CORNFLOWERBLUE);
      
      Button reset2 = new Button("RESET");
      reset2.setStyle("-fx-font-weight: bold");
      reset2.setStyle("-fx-font: 16 arial;");
      reset2.setTextFill(Color.CORNFLOWERBLUE);
      
      // Scene 4
      Button BackwardsButton = new Button("GO BACK");
      BackwardsButton.setStyle("-fx-font-weight: bold");
      BackwardsButton.setStyle("-fx-font: 16 arial;");
      BackwardsButton.setTextFill(Color.CORNFLOWERBLUE);
      
      Button SeeYaButton = new Button("EXIT");
      SeeYaButton.setStyle("-fx-font-weight: bold");
      SeeYaButton.setStyle("-fx-font: 16 arial;");
      SeeYaButton.setTextFill(Color.CORNFLOWERBLUE);
      
      Button calcButton2 = new Button("CONVERT");
      calcButton2.setStyle("-fx-font-weight: bold");
      calcButton2.setStyle("-fx-font: 16 arial;");
      calcButton2.setTextFill(Color.CORNFLOWERBLUE);
      
      Button reset3 = new Button("RESET");
      reset3.setStyle("-fx-font-weight: bold");
      reset3.setStyle("-fx-font: 16 arial;");
      reset3.setTextFill(Color.CORNFLOWERBLUE);
      
      // TextField
      kiloTextField = new TextField();  
      kiloTextField1 = new TextField(); 
      kiloTextField2 = new TextField();

      // ResultLabel
      resultLabel = new Label();
      resultLabel.setStyle("-fx-font-weight: bold");
      resultLabel.setStyle("-fx-font: 16 arial;");
      resultLabel.setTextFill(Color.WHITE);
      
      resultLabel1 = new Label();
      resultLabel1.setStyle("-fx-font-weight: bold");
      resultLabel1.setStyle("-fx-font: 16 arial;");
      resultLabel1.setTextFill(Color.WHITE);
      
      resultLabel2 = new Label();
      resultLabel2.setStyle("-fx-font-weight: bold");
      resultLabel2.setStyle("-fx-font: 16 arial;");
      resultLabel2.setTextFill(Color.WHITE);
      
      // Catch Labels
      catchLabel1 = new Label();
      catchLabel1.setStyle("-fx-font-weight: bold");
      catchLabel1.setStyle("-fx-font: 16 arial;");
      catchLabel1.setTextFill(Color.WHITE);
      
      catchLabel2 = new Label();
      catchLabel2.setStyle("-fx-font-weight: bold");
      catchLabel2.setStyle("-fx-font: 16 arial;");
      catchLabel2.setTextFill(Color.WHITE);
      
      catchLabel3 = new Label();
      catchLabel3.setStyle("-fx-font-weight: bold");
      catchLabel3.setStyle("-fx-font: 16 arial;");
      catchLabel3.setTextFill(Color.WHITE);
      
      
      // SCENE 1
      
      // Hbox and Vbox
      HBox title = new HBox(15, Title1);
      HBox Option = new HBox(15, promptLabel4);
      GridPane Button = new GridPane();
      Button.setVgap(10);
      Button.add(kiloToMiles, 0, 0);
      Button.add(metersToYards, 0, 1);
      Button.add(inchToCM, 0, 2);
      
      // create a background fill 
      BackgroundFill background_fill = new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY); 

      // create Background 
      Background background = new Background(background_fill); 
      
      VBox vBox1 = new VBox(20, title, Option, Button, ExitLabel, ExitButton, name);
      // set background 
      vBox1.setBackground(background); 

      
      
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
      
      gridpane1.add(promptLabel, 1, 1);
      gridpane1.add(kiloTextField, 1, 2);
      gridpane1.add(reset1, 2, 2);
      gridpane1.add(catchLabel1, 1, 3);
      gridpane1.add(calcButton, 1, 4);
      gridpane1.add(resultLabel, 1, 5);
      gridpane1.add(promptLabel2, 1, 0);
      
      gridpane1.setAlignment(Pos.CENTER);
      gridpane1.setPadding(new Insets(10));
      
      // Vbox
      VBox result = new VBox(15, gridpane1, calcButton, resultLabel, BackLabel, GoBackButton, ExitL, QuitButton);    
      result.setBackground(background); 
      
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
      gridpane2.add(reset2, 2, 2);
      gridpane2.add(catchLabel2, 1, 3);
      gridpane2.add(calcButton1, 1, 4);
      gridpane2.add(resultLabel1, 1, 5);
      gridpane2.add(promptLabel3, 1, 0);

      gridpane2.setAlignment(Pos.CENTER);
      gridpane2.setPadding(new Insets(10));
     
      // Vbox
      VBox result2 = new VBox(15, gridpane2, calcButton1, resultLabel1, GoBackLabel, BackButton, Exit, LeaveButton);   
      result2.setBackground(background); 
      
      result2.setAlignment(Pos.CENTER);   
     
      result2.setPadding(new Insets(10));
      
      // Scene 4
      GridPane gridpane3 = new GridPane();
      
      gridpane3.setHgap(10);
      gridpane3.setVgap(10);
      
      gridpane3.add(promptLabel6, 1, 1);
      gridpane3.add(kiloTextField2, 1, 2);
      gridpane3.add(reset3, 2, 2);
      gridpane3.add(catchLabel3, 1, 3);
      gridpane3.add(calcButton2, 1, 4);
      gridpane3.add(resultLabel2, 1, 5);
      gridpane3.add(promptLabel5, 1, 0);
      
      gridpane3.setAlignment(Pos.CENTER);
      gridpane3.setPadding(new Insets(10));
      
      // Vbox
      VBox result3 = new VBox(15, gridpane3, calcButton2, resultLabel2, GoBackLabel1, BackwardsButton, Exit2, SeeYaButton);     
      result3.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result3.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result3.setPadding(new Insets(10));
     
      // Scene
      Scene scene1 = new Scene(vBox1, 1000, 600);
      Scene scene2 = new Scene(result, 1000, 600);
      Scene scene3 = new Scene(result2, 1000, 600);
      Scene scene4 = new Scene(result3, 1000, 600);
      
      
      // Event Handlers
      // Scene 1
      kiloToMiles.setOnAction(e -> primaryStage.setScene(scene2));
      metersToYards.setOnAction(e -> primaryStage.setScene(scene3));
      inchToCM.setOnAction(e -> primaryStage.setScene(scene4));
      ExitButton.setOnAction(new ButtonClickHandlerExit());
      
      // Scene 2
      calcButton.setOnAction(new CalcButtonHandler());
      GoBackButton.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  kiloToMiles.setSelected(false);
      });
      QuitButton.setOnAction(new QuitButtonHandler());
      reset1.setOnAction(new resetButtonHandler1());
      
      // Scene 3
      calcButton1.setOnAction(new CalcButtonHandler1());
      BackButton.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  metersToYards.setSelected(false);
      });
      LeaveButton.setOnAction(new LeaveButtonHandler());
      reset2.setOnAction(new resetButtonHandler2());
 
      // Scene 4
      calcButton2.setOnAction(new CalcButtonHandler2());
      BackwardsButton.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  inchToCM.setSelected(false);
      });
      SeeYaButton.setOnAction(new QuitButtonHandler2());
      reset3.setOnAction(new resetButtonHandler3());
      
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
    	  try
    	  {
    		  Double kilometers = Double.parseDouble(kiloTextField.getText());
        	// Convert the kilometers to miles.
    		  Double miles = kilometers * 0.6214;
    	  
	         // Display the results.
	         resultLabel.setText(String.format("%,.2f miles", miles));
	         resultLabel.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel1.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  kiloTextField.clear();
    		  resultLabel.setText(" ");
    		  catchLabel1.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel1.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler1 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
    	  try
    	  {
    		// Get the meters.
    	    Double meters = Double.parseDouble(kiloTextField1.getText());
    	      
    	    // Convert the meters to yards.
    	    Double yards = meters * 1.094;
    	        
	        // Display the results.
	        resultLabel1.setText(String.format("%,.2f yards", yards));
	        resultLabel1.setStyle("-fx-font: 24 arial;");
	        catchLabel2.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  kiloTextField1.clear();
    		  resultLabel1.setText(" ");
    		  catchLabel2.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel2.setStyle("-fx-font-weight: bold");
    	  }
         
      }
    }
   class CalcButtonHandler2 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
    	  try
    	  {
	         // Get the inches.
	         Double inches = Double.parseDouble(kiloTextField2.getText());
	         
	         // Convert the inches to cm.
	         Double cm = inches * 2.54;
	        
	         // Display the results.
	         resultLabel2.setText(String.format("%,.2f centimeters", cm));
	         resultLabel2.setStyle("-fx-font: 24 arial;");
	         catchLabel3.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  kiloTextField2.clear();
    		  resultLabel2.setText(" ");
    		  catchLabel3.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel3.setStyle("-fx-font-weight: bold");
    	  }
    	  
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
   class QuitButtonHandler2 implements EventHandler<ActionEvent>
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
   class resetButtonHandler1 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   kiloTextField.clear();
		   resultLabel.setText("");
		   catchLabel1.setText("");
	   }
   }
   class resetButtonHandler2 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   kiloTextField1.clear();
		   resultLabel1.setText("");
		   catchLabel2.setText("");
	   }
   } class resetButtonHandler3 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   kiloTextField2.clear();
		   resultLabel2.setText("");
		   catchLabel3.setText("");
	   }
   }
}