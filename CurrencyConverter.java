import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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

public class CurrencyConverter extends Application
{
   // Fields
   private TextField TextField1, TextField2, TextField3, TextField4, TextField5, TextField6, TextField7, TextField8, TextField9, 
   TextField10, TextField11, TextField12, TextField13, TextField14, TextField15;
   
   private Label resultLabel1, resultLabel2, resultLabel3, resultLabel4, resultLabel5, resultLabel6, resultLabel7, resultLabel8, 
   resultLabel9, resultLabel10, resultLabel11, resultLabel12, resultLabel13, resultLabel14, resultLabel15, resultLabel16, 
   resultLabel17, resultLabel18, resultLabel19, resultLabel20, resultLabel21, resultLabel22, resultLabel23, resultLabel24, 
   resultLabel25, resultLabel26, resultLabel27, resultLabel28, resultLabel29, resultLabel30;
   
      
   private Label catchLabel1, catchLabel2, catchLabel3, catchLabel4, catchLabel5, catchLabel6, catchLabel7, catchLabel8, 
   catchLabel9, catchLabel10, catchLabel11, catchLabel12, catchLabel13, catchLabel14, catchLabel15, catchLabel16, 
   catchLabel17, catchLabel18, catchLabel19, catchLabel20, catchLabel21, catchLabel22, catchLabel23, catchLabel24, 
   catchLabel25, catchLabel26, catchLabel27, catchLabel28, catchLabel29, catchLabel30;;
   
   
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
	   
	  Label Title = new Label("CURRENCY CONVERTER");
      Title.setStyle("-fx-font-weight: bold");
      Title.setStyle("-fx-font: 40 arial;");
      Title.setTextFill(Color.BLACK);
	      
	  Label Title1 = new Label("CHOOSE THE CURRENCIES TO CONVERT:");
      Title1.setStyle("-fx-font-weight: bold");
      Title1.setStyle("-fx-font: 20 arial;");
      Title1.setTextFill(Color.BLACK);
	      
      Label name = new Label("Harrison Holsinger");
      name.setStyle("-fx-font-weight: bold");
      name.setStyle("-fx-font: 16 arial;");
      name.setTextFill(Color.BLACK);
      
      // SCENE 2
      
      Label header1 = new Label("United States Dollar <--> Canadian Dollar");
      header1.setStyle("-fx-font-weight: bold");
      header1.setStyle("-fx-font: 16 arial;");
      header1.setTextFill(Color.BLACK);
      
      Label instruc1 = new Label("Enter the amount you want converted:");
      instruc1.setStyle("-fx-font-weight: bold");
      instruc1.setStyle("-fx-font: 16 arial;");
      instruc1.setTextFill(Color.BLACK);
      
      // SCENE 3
      
      Label header2 = new Label("United States Dollar <--> Euro");
      header2.setStyle("-fx-font-weight: bold");
      header2.setStyle("-fx-font: 16 arial;");
      header2.setTextFill(Color.BLACK);
      
      Label instruc2 = new Label("Enter the amount you want converted:");
      instruc2.setStyle("-fx-font-weight: bold");
      instruc2.setStyle("-fx-font: 16 arial;");
      instruc2.setTextFill(Color.BLACK);
      
      // SCENE 4
      
      Label header3 = new Label("United States Dollar <--> Pound");
      header3.setStyle("-fx-font-weight: bold");
      header3.setStyle("-fx-font: 16 arial;");
      header3.setTextFill(Color.BLACK);
      
      Label instruc3 = new Label("Enter the amount you want converted:");
      instruc3.setStyle("-fx-font-weight: bold");
      instruc3.setStyle("-fx-font: 16 arial;");
      instruc3.setTextFill(Color.BLACK);
	      
	 // SCENE 5
      
      Label header4 = new Label("United States Dollar <--> Australian Dollar");
      header4.setStyle("-fx-font-weight: bold");
      header4.setStyle("-fx-font: 16 arial;");
      header4.setTextFill(Color.BLACK);
      
      Label instruc4 = new Label("Enter the amount you want converted:");
      instruc4.setStyle("-fx-font-weight: bold");
      instruc4.setStyle("-fx-font: 16 arial;");
      instruc4.setTextFill(Color.BLACK);
      
      // SCENE 6
      
      Label header5 = new Label("United States Dollar <--> Peso");
      header5.setStyle("-fx-font-weight: bold");
      header5.setStyle("-fx-font: 16 arial;");
      header5.setTextFill(Color.BLACK);
      
      Label instruc5 = new Label("Enter the amount you want converted:");
      instruc5.setStyle("-fx-font-weight: bold");
      instruc5.setStyle("-fx-font: 16 arial;");
      instruc5.setTextFill(Color.BLACK);
      
      // SCENE 7
      
      Label header6 = new Label("Canadian Dollar <--> Euro");
      header6.setStyle("-fx-font-weight: bold");
      header6.setStyle("-fx-font: 16 arial;");
      header6.setTextFill(Color.BLACK);
      
      Label instruc6 = new Label("Enter the amount you want converted:");
      instruc6.setStyle("-fx-font-weight: bold");
      instruc6.setStyle("-fx-font: 16 arial;");
      instruc6.setTextFill(Color.BLACK);
      
      // SCENE 8
      
      Label header7 = new Label("Canadian Dollar <--> Pound");
      header7.setStyle("-fx-font-weight: bold");
      header7.setStyle("-fx-font: 16 arial;");
      header7.setTextFill(Color.BLACK);
      
      Label instruc7 = new Label("Enter the amount you want converted:");
      instruc7.setStyle("-fx-font-weight: bold");
      instruc7.setStyle("-fx-font: 16 arial;");
      instruc7.setTextFill(Color.BLACK);
      
      // SCENE 9
      
      Label header8 = new Label("Canadian Dollar <--> Austrailian Dollar");
      header8.setStyle("-fx-font-weight: bold");
      header8.setStyle("-fx-font: 16 arial;");
      header8.setTextFill(Color.BLACK);
      
      Label instruc8 = new Label("Enter the amount you want converted:");
      instruc8.setStyle("-fx-font-weight: bold");
      instruc8.setStyle("-fx-font: 16 arial;");
      instruc8.setTextFill(Color.BLACK);
      
      // SCENE 10
      
      Label header9 = new Label("Canadian Dollar <--> Peso");
      header9.setStyle("-fx-font-weight: bold");
      header9.setStyle("-fx-font: 16 arial;");
      header9.setTextFill(Color.BLACK);
      
      Label instruc9 = new Label("Enter the amount you want converted:");
      instruc9.setStyle("-fx-font-weight: bold");
      instruc9.setStyle("-fx-font: 16 arial;");
      instruc9.setTextFill(Color.BLACK);
      
      // SCENE 11
      
      Label header10 = new Label("Euro <--> Pound");
      header10.setStyle("-fx-font-weight: bold");
      header10.setStyle("-fx-font: 16 arial;");
      header10.setTextFill(Color.BLACK);
      
      Label instruc10 = new Label("Enter the amount you want converted:");
      instruc10.setStyle("-fx-font-weight: bold");
      instruc10.setStyle("-fx-font: 16 arial;");
      instruc10.setTextFill(Color.BLACK);
      
      // SCENE 12
      
      Label header11 = new Label("Euro <--> Australian Dollar");
      header11.setStyle("-fx-font-weight: bold");
      header11.setStyle("-fx-font: 16 arial;");
      header11.setTextFill(Color.BLACK);
      
      Label instruc11 = new Label("Enter the amount you want converted:");
      instruc11.setStyle("-fx-font-weight: bold");
      instruc11.setStyle("-fx-font: 16 arial;");
      instruc11.setTextFill(Color.BLACK);
      
      // SCENE 13
      
      Label header12 = new Label("Euro <--> Peso");
      header12.setStyle("-fx-font-weight: bold");
      header12.setStyle("-fx-font: 16 arial;");
      header12.setTextFill(Color.BLACK);
      
      Label instruc12 = new Label("Enter the amount you want converted:");
      instruc12.setStyle("-fx-font-weight: bold");
      instruc12.setStyle("-fx-font: 16 arial;");
      instruc12.setTextFill(Color.BLACK);
      
      // SCENE 14
      
      Label header13 = new Label("Pound <--> Australian Dollar");
      header13.setStyle("-fx-font-weight: bold");
      header13.setStyle("-fx-font: 16 arial;");
      header13.setTextFill(Color.BLACK);
      
      Label instruc13 = new Label("Enter the amount you want converted:");
      instruc13.setStyle("-fx-font-weight: bold");
      instruc13.setStyle("-fx-font: 16 arial;");
      instruc13.setTextFill(Color.BLACK);
      
      // SCENE 15
      
      Label header14 = new Label("Pound <--> Peso");
      header14.setStyle("-fx-font-weight: bold");
      header14.setStyle("-fx-font: 16 arial;");
      header14.setTextFill(Color.BLACK);
      
      Label instruc14 = new Label("Enter the amount you want converted:");
      instruc14.setStyle("-fx-font-weight: bold");
      instruc14.setStyle("-fx-font: 16 arial;");
      instruc14.setTextFill(Color.BLACK);
      
      // SCENE 16
      
      Label header15 = new Label("Australian Dollar <--> Peso");
      header15.setStyle("-fx-font-weight: bold");
      header15.setStyle("-fx-font: 16 arial;");
      header15.setTextFill(Color.BLACK);
      
      Label instruc15 = new Label("Enter the amount you want converted:");
      instruc15.setStyle("-fx-font-weight: bold");
      instruc15.setStyle("-fx-font: 16 arial;");
      instruc15.setTextFill(Color.BLACK);
      
      // Buttons
      
      // SCENE 1
      RadioButton USDtoCAD = new RadioButton("USD <--> CAD");
      USDtoCAD.setStyle("-fx-font-weight: bold");
      USDtoCAD.setStyle("-fx-font: 16 arial;");
      USDtoCAD.setTextFill(Color.BLACK);
      
      RadioButton USDtoEUR = new RadioButton("USD <--> EURO");
      USDtoEUR.setStyle("-fx-font-weight: bold");
      USDtoEUR.setStyle("-fx-font: 16 arial;");
      USDtoEUR.setTextFill(Color.BLACK);
      
      RadioButton USDtoGBP = new RadioButton("USD <--> POUND");
      USDtoGBP.setStyle("-fx-font-weight: bold");
      USDtoGBP.setStyle("-fx-font: 16 arial;");
      USDtoGBP.setTextFill(Color.BLACK);
      
      RadioButton USDtoAUD = new RadioButton("USD <--> AUD");
      USDtoAUD.setStyle("-fx-font-weight: bold");
      USDtoAUD.setStyle("-fx-font: 16 arial;");
      USDtoAUD.setTextFill(Color.BLACK);
      
      RadioButton USDtoPESO = new RadioButton("USD <--> PESO");
      USDtoPESO.setStyle("-fx-font-weight: bold");
      USDtoPESO.setStyle("-fx-font: 16 arial;");
      USDtoPESO.setTextFill(Color.BLACK);
      
      RadioButton CADtoEUR = new RadioButton("CAD <--> EURO");
      CADtoEUR.setStyle("-fx-font-weight: bold");
      CADtoEUR.setStyle("-fx-font: 16 arial;");
      CADtoEUR.setTextFill(Color.BLACK);
      
      RadioButton CADtoGBP = new RadioButton("CAD <--> GBP");
      CADtoGBP.setStyle("-fx-font-weight: bold");
      CADtoGBP.setStyle("-fx-font: 16 arial;");
      CADtoGBP.setTextFill(Color.BLACK);
      
      RadioButton CADtoAUD = new RadioButton("CAD <--> AUD");
      CADtoAUD.setStyle("-fx-font-weight: bold");
      CADtoAUD.setStyle("-fx-font: 16 arial;");
      CADtoAUD.setTextFill(Color.BLACK);
      
      RadioButton CADtoPESO = new RadioButton("CAD <--> PESO");
      CADtoPESO.setStyle("-fx-font-weight: bold");
      CADtoPESO.setStyle("-fx-font: 16 arial;");
      CADtoPESO.setTextFill(Color.BLACK);
      
      RadioButton EURtoGBP = new RadioButton("EUR <--> GBP");
      EURtoGBP.setStyle("-fx-font-weight: bold");
      EURtoGBP.setStyle("-fx-font: 16 arial;");
      EURtoGBP.setTextFill(Color.BLACK);
      
      RadioButton EURtoAUD = new RadioButton("EUR <--> AUD");
      EURtoAUD.setStyle("-fx-font-weight: bold");
      EURtoAUD.setStyle("-fx-font: 16 arial;");
      EURtoAUD.setTextFill(Color.BLACK);
      
      RadioButton EURtoPESO = new RadioButton("EUR <--> PESO");
      EURtoPESO.setStyle("-fx-font-weight: bold");
      EURtoPESO.setStyle("-fx-font: 16 arial;");
      EURtoPESO.setTextFill(Color.BLACK);
      
      RadioButton GBPtoAUD = new RadioButton("GBP <--> AUD");
      GBPtoAUD.setStyle("-fx-font-weight: bold");
      GBPtoAUD.setStyle("-fx-font: 16 arial;");
      GBPtoAUD.setTextFill(Color.BLACK);
      
      RadioButton GBPtoPESO = new RadioButton("GBP <--> PESO");
      GBPtoPESO.setStyle("-fx-font-weight: bold");
      GBPtoPESO.setStyle("-fx-font: 16 arial;");
      GBPtoPESO.setTextFill(Color.BLACK);
      
      RadioButton AUDtoPESO = new RadioButton("AUD <--> PESO");
      AUDtoPESO.setStyle("-fx-font-weight: bold");
      AUDtoPESO.setStyle("-fx-font: 16 arial;");
      AUDtoPESO.setTextFill(Color.BLACK);
      
      // SCENE 2
      
      Button GoBackButton = new Button("GO BACK");
      GoBackButton.setStyle("-fx-font-weight: bold");
      GoBackButton.setStyle("-fx-font: 16 arial;");
      GoBackButton.setTextFill(Color.BLACK);
      
      Button calcButton = new Button("CONVERT USD to CAD");
      calcButton.setStyle("-fx-font-weight: bold");
      calcButton.setStyle("-fx-font: 16 arial;");
      calcButton.setTextFill(Color.BLACK);
      
      Button calcButton1 = new Button("CONVERT CAD to USD");
      calcButton1.setStyle("-fx-font-weight: bold");
      calcButton1.setStyle("-fx-font: 16 arial;");
      calcButton1.setTextFill(Color.BLACK);
      
      Button reset1 = new Button("RESET");
      reset1.setStyle("-fx-font-weight: bold");
      reset1.setStyle("-fx-font: 16 arial;");
      reset1.setTextFill(Color.BLACK);
      
      Button bye = new Button("EXIT");
      bye.setStyle("-fx-font-weight: bold");
      bye.setStyle("-fx-font: 16 arial;");
      bye.setTextFill(Color.BLACK);
      
      // SCENE 3
      
      Button GoBackButton2 = new Button("GO BACK");
      GoBackButton2.setStyle("-fx-font-weight: bold");
      GoBackButton2.setStyle("-fx-font: 16 arial;");
      GoBackButton2.setTextFill(Color.BLACK);
      
      Button calcButton3 = new Button("CONVERT USD to EUR");
      calcButton3.setStyle("-fx-font-weight: bold");
      calcButton3.setStyle("-fx-font: 16 arial;");
      calcButton3.setTextFill(Color.BLACK);
      
      Button calcButton4 = new Button("CONVERT EUR to USD");
      calcButton4.setStyle("-fx-font-weight: bold");
      calcButton4.setStyle("-fx-font: 16 arial;");
      calcButton4.setTextFill(Color.BLACK);
      
      Button reset2 = new Button("RESET");
      reset2.setStyle("-fx-font-weight: bold");
      reset2.setStyle("-fx-font: 16 arial;");
      reset2.setTextFill(Color.BLACK);
      
      Button bye2 = new Button("EXIT");
      bye2.setStyle("-fx-font-weight: bold");
      bye2.setStyle("-fx-font: 16 arial;");
      bye2.setTextFill(Color.BLACK);
      
      // SCENE 4
      
      Button GoBackButton3 = new Button("GO BACK");
      GoBackButton3.setStyle("-fx-font-weight: bold");
      GoBackButton3.setStyle("-fx-font: 16 arial;");
      GoBackButton3.setTextFill(Color.BLACK);
      
      Button calcButton5 = new Button("CONVERT USD to GBP");
      calcButton5.setStyle("-fx-font-weight: bold");
      calcButton5.setStyle("-fx-font: 16 arial;");
      calcButton5.setTextFill(Color.BLACK);
      
      Button calcButton6 = new Button("CONVERT GBP to USD");
      calcButton6.setStyle("-fx-font-weight: bold");
      calcButton6.setStyle("-fx-font: 16 arial;");
      calcButton6.setTextFill(Color.BLACK);
      
      Button reset3 = new Button("RESET");
      reset3.setStyle("-fx-font-weight: bold");
      reset3.setStyle("-fx-font: 16 arial;");
      reset3.setTextFill(Color.BLACK);
      
      Button bye3 = new Button("EXIT");
      bye3.setStyle("-fx-font-weight: bold");
      bye3.setStyle("-fx-font: 16 arial;");
      bye3.setTextFill(Color.BLACK);
      
      // SCENE 5
      
      Button GoBackButton4 = new Button("GO BACK");
      GoBackButton4.setStyle("-fx-font-weight: bold");
      GoBackButton4.setStyle("-fx-font: 16 arial;");
      GoBackButton4.setTextFill(Color.BLACK);
      
      Button calcButton7 = new Button("CONVERT USD to AUD");
      calcButton7.setStyle("-fx-font-weight: bold");
      calcButton7.setStyle("-fx-font: 16 arial;");
      calcButton7.setTextFill(Color.BLACK);
      
      Button calcButton8 = new Button("CONVERT AUD to USD");
      calcButton8.setStyle("-fx-font-weight: bold");
      calcButton8.setStyle("-fx-font: 16 arial;");
      calcButton8.setTextFill(Color.BLACK);
      
      Button reset4 = new Button("RESET");
      reset1.setStyle("-fx-font-weight: bold");
      reset1.setStyle("-fx-font: 16 arial;");
      reset1.setTextFill(Color.BLACK);
      
      Button bye4 = new Button("EXIT");
      bye4.setStyle("-fx-font-weight: bold");
      bye4.setStyle("-fx-font: 16 arial;");
      bye4.setTextFill(Color.BLACK);
      
      // SCENE 6
      
      Button GoBackButton5 = new Button("GO BACK");
      GoBackButton5.setStyle("-fx-font-weight: bold");
      GoBackButton5.setStyle("-fx-font: 16 arial;");
      GoBackButton5.setTextFill(Color.BLACK);
      
      Button calcButton9 = new Button("CONVERT USD to PESO");
      calcButton9.setStyle("-fx-font-weight: bold");
      calcButton9.setStyle("-fx-font: 16 arial;");
      calcButton9.setTextFill(Color.BLACK);
      
      Button calcButton10 = new Button("CONVERT PESO to USD");
      calcButton10.setStyle("-fx-font-weight: bold");
      calcButton10.setStyle("-fx-font: 16 arial;");
      calcButton10.setTextFill(Color.BLACK);
      
      Button reset5 = new Button("RESET");
      reset5.setStyle("-fx-font-weight: bold");
      reset5.setStyle("-fx-font: 16 arial;");
      reset5.setTextFill(Color.BLACK);
      
      Button bye5 = new Button("EXIT");
      bye5.setStyle("-fx-font-weight: bold");
      bye5.setStyle("-fx-font: 16 arial;");
      bye5.setTextFill(Color.BLACK);
      
      // SCENE 7
      
      Button GoBackButton6 = new Button("GO BACK");
      GoBackButton6.setStyle("-fx-font-weight: bold");
      GoBackButton6.setStyle("-fx-font: 16 arial;");
      GoBackButton6.setTextFill(Color.BLACK);
      
      Button calcButton11 = new Button("CONVERT CAD to EUR");
      calcButton11.setStyle("-fx-font-weight: bold");
      calcButton11.setStyle("-fx-font: 16 arial;");
      calcButton11.setTextFill(Color.BLACK);
      
      Button calcButton12 = new Button("CONVERT EUR to CAD");
      calcButton12.setStyle("-fx-font-weight: bold");
      calcButton12.setStyle("-fx-font: 16 arial;");
      calcButton12.setTextFill(Color.BLACK);
      
      Button reset6 = new Button("RESET");
      reset6.setStyle("-fx-font-weight: bold");
      reset6.setStyle("-fx-font: 16 arial;");
      reset6.setTextFill(Color.BLACK);
      
      Button bye6 = new Button("EXIT");
      bye6.setStyle("-fx-font-weight: bold");
      bye6.setStyle("-fx-font: 16 arial;");
      bye6.setTextFill(Color.BLACK);
      
      // SCENE 8
      
      Button GoBackButton7 = new Button("GO BACK");
      GoBackButton7.setStyle("-fx-font-weight: bold");
      GoBackButton7.setStyle("-fx-font: 16 arial;");
      GoBackButton7.setTextFill(Color.BLACK);
      
      Button calcButton13 = new Button("CONVERT CAD to GBP");
      calcButton13.setStyle("-fx-font-weight: bold");
      calcButton13.setStyle("-fx-font: 16 arial;");
      calcButton13.setTextFill(Color.BLACK);
      
      Button calcButton14 = new Button("CONVERT GBP to CAD");
      calcButton14.setStyle("-fx-font-weight: bold");
      calcButton14.setStyle("-fx-font: 16 arial;");
      calcButton14.setTextFill(Color.BLACK);
      
      Button reset7 = new Button("RESET");
      reset7.setStyle("-fx-font-weight: bold");
      reset7.setStyle("-fx-font: 16 arial;");
      reset7.setTextFill(Color.BLACK);
      
      Button bye7 = new Button("EXIT");
      bye7.setStyle("-fx-font-weight: bold");
      bye7.setStyle("-fx-font: 16 arial;");
      bye7.setTextFill(Color.BLACK);
      
      // SCENE 9
      
      Button GoBackButton8 = new Button("GO BACK");
      GoBackButton8.setStyle("-fx-font-weight: bold");
      GoBackButton8.setStyle("-fx-font: 16 arial;");
      GoBackButton8.setTextFill(Color.BLACK);
      
      Button calcButton15 = new Button("CONVERT CAD to AUD");
      calcButton15.setStyle("-fx-font-weight: bold");
      calcButton15.setStyle("-fx-font: 16 arial;");
      calcButton15.setTextFill(Color.BLACK);
      
      Button calcButton16 = new Button("CONVERT AUD to CAD");
      calcButton16.setStyle("-fx-font-weight: bold");
      calcButton16.setStyle("-fx-font: 16 arial;");
      calcButton16.setTextFill(Color.BLACK);
      
      Button reset8 = new Button("RESET");
      reset8.setStyle("-fx-font-weight: bold");
      reset8.setStyle("-fx-font: 16 arial;");
      reset8.setTextFill(Color.BLACK);
      
      Button bye8 = new Button("EXIT");
      bye8.setStyle("-fx-font-weight: bold");
      bye8.setStyle("-fx-font: 16 arial;");
      bye8.setTextFill(Color.BLACK);
      
      // SCENE 10
      
      Button GoBackButton9 = new Button("GO BACK");
      GoBackButton9.setStyle("-fx-font-weight: bold");
      GoBackButton9.setStyle("-fx-font: 16 arial;");
      GoBackButton9.setTextFill(Color.BLACK);
      
      Button calcButton17 = new Button("CONVERT CAD to PESO");
      calcButton17.setStyle("-fx-font-weight: bold");
      calcButton17.setStyle("-fx-font: 16 arial;");
      calcButton17.setTextFill(Color.BLACK);
      
      Button calcButton18 = new Button("CONVERT PESO to CAD");
      calcButton18.setStyle("-fx-font-weight: bold");
      calcButton18.setStyle("-fx-font: 16 arial;");
      calcButton18.setTextFill(Color.BLACK);
      
      Button reset9 = new Button("RESET");
      reset9.setStyle("-fx-font-weight: bold");
      reset9.setStyle("-fx-font: 16 arial;");
      reset9.setTextFill(Color.BLACK);
      
      Button bye9 = new Button("EXIT");
      bye9.setStyle("-fx-font-weight: bold");
      bye9.setStyle("-fx-font: 16 arial;");
      bye9.setTextFill(Color.BLACK);
      
      // SCENE 11
      
      Button GoBackButton10 = new Button("GO BACK");
      GoBackButton10.setStyle("-fx-font-weight: bold");
      GoBackButton10.setStyle("-fx-font: 16 arial;");
      GoBackButton10.setTextFill(Color.BLACK);
      
      Button calcButton19 = new Button("CONVERT EUR to GBP");
      calcButton19.setStyle("-fx-font-weight: bold");
      calcButton19.setStyle("-fx-font: 16 arial;");
      calcButton19.setTextFill(Color.BLACK);
      
      Button calcButton20 = new Button("CONVERT GBP to EUR");
      calcButton20.setStyle("-fx-font-weight: bold");
      calcButton20.setStyle("-fx-font: 16 arial;");
      calcButton20.setTextFill(Color.BLACK);
      
      Button reset10 = new Button("RESET");
      reset10.setStyle("-fx-font-weight: bold");
      reset10.setStyle("-fx-font: 16 arial;");
      reset10.setTextFill(Color.BLACK);
      
      Button bye10 = new Button("EXIT");
      bye10.setStyle("-fx-font-weight: bold");
      bye10.setStyle("-fx-font: 16 arial;");
      bye10.setTextFill(Color.BLACK);
      
      // SCENE 12
      
      Button GoBackButton11 = new Button("GO BACK");
      GoBackButton11.setStyle("-fx-font-weight: bold");
      GoBackButton11.setStyle("-fx-font: 16 arial;");
      GoBackButton11.setTextFill(Color.BLACK);
      
      Button calcButton21 = new Button("CONVERT EUR to AUD");
      calcButton21.setStyle("-fx-font-weight: bold");
      calcButton21.setStyle("-fx-font: 16 arial;");
      calcButton21.setTextFill(Color.BLACK);
      
      Button calcButton22 = new Button("CONVERT AUD to EUR");
      calcButton22.setStyle("-fx-font-weight: bold");
      calcButton22.setStyle("-fx-font: 16 arial;");
      calcButton22.setTextFill(Color.BLACK);
      
      Button reset11 = new Button("RESET");
      reset11.setStyle("-fx-font-weight: bold");
      reset11.setStyle("-fx-font: 16 arial;");
      reset11.setTextFill(Color.BLACK);
      
      Button bye11 = new Button("EXIT");
      bye11.setStyle("-fx-font-weight: bold");
      bye11.setStyle("-fx-font: 16 arial;");
      bye11.setTextFill(Color.BLACK);
      
      // SCENE 13
      
      Button GoBackButton12 = new Button("GO BACK");
      GoBackButton12.setStyle("-fx-font-weight: bold");
      GoBackButton12.setStyle("-fx-font: 16 arial;");
      GoBackButton12.setTextFill(Color.BLACK);
      
      Button calcButton23 = new Button("CONVERT EUR to PESO");
      calcButton23.setStyle("-fx-font-weight: bold");
      calcButton23.setStyle("-fx-font: 16 arial;");
      calcButton23.setTextFill(Color.BLACK);
      
      Button calcButton24 = new Button("CONVERT PESO to EUR");
      calcButton24.setStyle("-fx-font-weight: bold");
      calcButton24.setStyle("-fx-font: 16 arial;");
      calcButton24.setTextFill(Color.BLACK);
      
      Button reset12 = new Button("RESET");
      reset12.setStyle("-fx-font-weight: bold");
      reset12.setStyle("-fx-font: 16 arial;");
      reset12.setTextFill(Color.BLACK);
      
      Button bye12 = new Button("EXIT");
      bye12.setStyle("-fx-font-weight: bold");
      bye12.setStyle("-fx-font: 16 arial;");
      bye12.setTextFill(Color.BLACK);
      
      // SCENE 14
      
      Button GoBackButton13 = new Button("GO BACK");
      GoBackButton13.setStyle("-fx-font-weight: bold");
      GoBackButton13.setStyle("-fx-font: 16 arial;");
      GoBackButton13.setTextFill(Color.BLACK);
      
      Button calcButton25 = new Button("CONVERT GBP to AUD");
      calcButton25.setStyle("-fx-font-weight: bold");
      calcButton25.setStyle("-fx-font: 16 arial;");
      calcButton25.setTextFill(Color.BLACK);
      
      Button calcButton26 = new Button("CONVERT AUD to GBP");
      calcButton26.setStyle("-fx-font-weight: bold");
      calcButton26.setStyle("-fx-font: 16 arial;");
      calcButton26.setTextFill(Color.BLACK);
      
      Button reset13 = new Button("RESET");
      reset13.setStyle("-fx-font-weight: bold");
      reset13.setStyle("-fx-font: 16 arial;");
      reset13.setTextFill(Color.BLACK);
      
      Button bye13 = new Button("EXIT");
      bye13.setStyle("-fx-font-weight: bold");
      bye13.setStyle("-fx-font: 16 arial;");
      bye13.setTextFill(Color.BLACK);
      
      // SCENE 15
      
      Button GoBackButton14 = new Button("GO BACK");
      GoBackButton14.setStyle("-fx-font-weight: bold");
      GoBackButton14.setStyle("-fx-font: 16 arial;");
      GoBackButton14.setTextFill(Color.BLACK);
      
      Button calcButton27 = new Button("CONVERT GBP to PESO");
      calcButton27.setStyle("-fx-font-weight: bold");
      calcButton27.setStyle("-fx-font: 16 arial;");
      calcButton27.setTextFill(Color.BLACK);
      
      Button calcButton28 = new Button("CONVERT PESO to GBP");
      calcButton28.setStyle("-fx-font-weight: bold");
      calcButton28.setStyle("-fx-font: 16 arial;");
      calcButton28.setTextFill(Color.BLACK);
      
      Button reset14 = new Button("RESET");
      reset14.setStyle("-fx-font-weight: bold");
      reset14.setStyle("-fx-font: 16 arial;");
      reset14.setTextFill(Color.BLACK);
      
      Button bye14 = new Button("EXIT");
      bye14.setStyle("-fx-font-weight: bold");
      bye14.setStyle("-fx-font: 16 arial;");
      bye14.setTextFill(Color.BLACK);
      
      // SCENE 16
      
      Button GoBackButton15 = new Button("GO BACK");
      GoBackButton15.setStyle("-fx-font-weight: bold");
      GoBackButton15.setStyle("-fx-font: 16 arial;");
      GoBackButton15.setTextFill(Color.BLACK);
      
      Button calcButton29 = new Button("CONVERT AUD to PESO");
      calcButton29.setStyle("-fx-font-weight: bold");
      calcButton29.setStyle("-fx-font: 16 arial;");
      calcButton29.setTextFill(Color.BLACK);
      
      Button calcButton30 = new Button("CONVERT PESO to AUD");
      calcButton30.setStyle("-fx-font-weight: bold");
      calcButton30.setStyle("-fx-font: 16 arial;");
      calcButton30.setTextFill(Color.BLACK);
      
      Button reset15 = new Button("RESET");
      reset15.setStyle("-fx-font-weight: bold");
      reset15.setStyle("-fx-font: 16 arial;");
      reset15.setTextFill(Color.BLACK);
      
      Button bye15 = new Button("EXIT");
      bye15.setStyle("-fx-font-weight: bold");
      bye15.setStyle("-fx-font: 16 arial;");
      bye15.setTextFill(Color.BLACK);
      
      // SCENE 1
      
      // Hbox and Vbox
      HBox title = new HBox(15, Title1);
      GridPane Button = new GridPane();
      Button.setVgap(10);
      Button.add(USDtoCAD, 0, 0);
      Button.add(USDtoEUR, 0, 1);
      Button.add(USDtoGBP, 0, 2);
      Button.add(USDtoAUD, 0, 3);
      Button.add(USDtoPESO, 0, 4);
      Button.add(CADtoEUR, 0, 5);
      Button.add(CADtoGBP, 0, 6);
      Button.add(CADtoAUD, 0, 7);
      Button.add(CADtoPESO, 1, 0);
      Button.add(EURtoGBP, 1, 1);
      Button.add(EURtoAUD, 1, 2);
      Button.add(EURtoPESO, 1, 3);
      Button.add(GBPtoAUD, 1, 4);
      Button.add(GBPtoPESO, 1, 5);
      Button.add(AUDtoPESO, 1, 6);
        
      Label menuLabel = new Label("");
      menuLabel.setTextFill(Color.BLACK);
      
      // Create the menu bar.    
      MenuBar menuBar = new MenuBar();  
      
      // Create the File menu.      
      Menu fileMenu = new Menu("File");    
     fileMenu.setGraphic(menuLabel);
      
      MenuItem exitItem = new MenuItem("Exit");  
      fileMenu.getItems().add(exitItem);     
      
      // Register an event handler for the exit item.     
      exitItem.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      // Add the File menu to the menu bar.     
      menuBar.getMenus().addAll(fileMenu);   
      
      menuBar.setTranslateX(0);
      menuBar.setTranslateY(0);
      
      // create a background fill 
      BackgroundFill background_fill = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY); 

      // create Background 
      Background background = new Background(background_fill); 
      
      VBox vBox1 = new VBox(20, menuBar, Title, Title1, Button, name);
      // set background 
      vBox1.setBackground(background); 

      // Adjustments
      title.setAlignment(Pos.CENTER);
      vBox1.setAlignment(Pos.CENTER);
      Button.setAlignment(Pos.CENTER);
      vBox1.setPadding(new Insets(15));
      Button.setPadding(new Insets(10));
      title.setPadding(new Insets(10));
      
      // SCENE 2
      
      TextField1 = new TextField(); 
      
      resultLabel1 = new Label();
      resultLabel1.setStyle("-fx-font-weight: bold");
      resultLabel1.setStyle("-fx-font: 16 arial;");
      resultLabel1.setTextFill(Color.BLACK);
     
      resultLabel2 = new Label();
      resultLabel2.setStyle("-fx-font-weight: bold");
      resultLabel2.setStyle("-fx-font: 16 arial;");
      resultLabel2.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel1 = new Label();
      catchLabel1.setStyle("-fx-font-weight: bold");
      catchLabel1.setStyle("-fx-font: 16 arial;");
      catchLabel1.setTextFill(Color.BLACK);
      
      catchLabel2 = new Label();
      catchLabel2.setStyle("-fx-font-weight: bold");
      catchLabel2.setStyle("-fx-font: 16 arial;");
      catchLabel2.setTextFill(Color.BLACK);
      
      
      GridPane gridpane1 = new GridPane();
      
      gridpane1.setHgap(10);
      gridpane1.setVgap(10);
      
      gridpane1.add(instruc1, 1, 1);
      gridpane1.add(header1, 1, 0);
      gridpane1.add(TextField1, 1, 2);
      gridpane1.add(reset1, 2, 2);
      gridpane1.add(catchLabel1, 1, 3);
      gridpane1.add(catchLabel2, 1, 3);
      gridpane1.add(resultLabel1, 1, 6);
      gridpane1.add(resultLabel2, 1, 6);
      
      gridpane1.setAlignment(Pos.CENTER);
      gridpane1.setPadding(new Insets(10));
      
      // Vbox
      VBox result = new VBox(15, gridpane1, calcButton, calcButton1, GoBackButton, bye);    
      result.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result.setPadding(new Insets(10));
      
      // SCENE 3
      
      TextField2 = new TextField(); 
      
      resultLabel3 = new Label();
      resultLabel3.setStyle("-fx-font-weight: bold");
      resultLabel3.setStyle("-fx-font: 16 arial;");
      resultLabel3.setTextFill(Color.BLACK);
     
      resultLabel4 = new Label();
      resultLabel4.setStyle("-fx-font-weight: bold");
      resultLabel4.setStyle("-fx-font: 16 arial;");
      resultLabel4.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel3 = new Label();
      catchLabel3.setStyle("-fx-font-weight: bold");
      catchLabel3.setStyle("-fx-font: 16 arial;");
      catchLabel3.setTextFill(Color.BLACK);
      
      catchLabel4 = new Label();
      catchLabel4.setStyle("-fx-font-weight: bold");
      catchLabel4.setStyle("-fx-font: 16 arial;");
      catchLabel4.setTextFill(Color.BLACK);
      
      
      GridPane gridpane2 = new GridPane();
      
      gridpane2.setHgap(10);
      gridpane2.setVgap(10);
     
      gridpane2.add(instruc2, 1, 1);
      gridpane2.add(header2, 1, 0);
      gridpane2.add(TextField2, 1, 2);
      gridpane2.add(reset2, 2, 2);
      gridpane2.add(catchLabel3, 1, 3);
      gridpane2.add(catchLabel4, 1, 3);
      gridpane2.add(resultLabel3, 1, 6);
      gridpane2.add(resultLabel4, 1, 6);
      
      gridpane2.setAlignment(Pos.CENTER);
      gridpane2.setPadding(new Insets(10));
      
      // Vbox
      VBox result1 = new VBox(15, gridpane2, calcButton3, calcButton4, GoBackButton2, bye2);    
      result1.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result1.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result1.setPadding(new Insets(10));
      
      // SCENE 4
      
      TextField3 = new TextField(); 
      
      resultLabel5 = new Label();
      resultLabel5.setStyle("-fx-font-weight: bold");
      resultLabel5.setStyle("-fx-font: 16 arial;");
      resultLabel5.setTextFill(Color.BLACK);
     
      resultLabel6 = new Label();
      resultLabel6.setStyle("-fx-font-weight: bold");
      resultLabel6.setStyle("-fx-font: 16 arial;");
      resultLabel6.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel5 = new Label();
      catchLabel5.setStyle("-fx-font-weight: bold");
      catchLabel5.setStyle("-fx-font: 16 arial;");
      catchLabel5.setTextFill(Color.BLACK);
      
      catchLabel6 = new Label();
      catchLabel6.setStyle("-fx-font-weight: bold");
      catchLabel6.setStyle("-fx-font: 16 arial;");
      catchLabel6.setTextFill(Color.BLACK);
      
      
      GridPane gridpane3 = new GridPane();
      
      gridpane3.setHgap(10);
      gridpane3.setVgap(10);
     
      gridpane3.add(instruc3, 1, 1);
      gridpane3.add(header3, 1, 0);
      gridpane3.add(TextField3, 1, 2);
      gridpane3.add(reset3, 2, 2);
      gridpane3.add(catchLabel5, 1, 3);
      gridpane3.add(catchLabel6, 1, 3);
      gridpane3.add(resultLabel5, 1, 6);
      gridpane3.add(resultLabel6, 1, 6);
      
      gridpane3.setAlignment(Pos.CENTER);
      gridpane3.setPadding(new Insets(10));
      
      // Vbox
      VBox result2 = new VBox(15, gridpane3, calcButton5, calcButton6, GoBackButton3, bye3);    
      result2.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result2.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result2.setPadding(new Insets(10));
      
      // SCENE 5
      
      TextField4 = new TextField(); 
      
      resultLabel7 = new Label();
      resultLabel7.setStyle("-fx-font-weight: bold");
      resultLabel7.setStyle("-fx-font: 16 arial;");
      resultLabel7.setTextFill(Color.BLACK);
     
      resultLabel8 = new Label();
      resultLabel8.setStyle("-fx-font-weight: bold");
      resultLabel8.setStyle("-fx-font: 16 arial;");
      resultLabel8.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel7 = new Label();
      catchLabel7.setStyle("-fx-font-weight: bold");
      catchLabel7.setStyle("-fx-font: 16 arial;");
      catchLabel7.setTextFill(Color.BLACK);
      
      catchLabel8 = new Label();
      catchLabel8.setStyle("-fx-font-weight: bold");
      catchLabel8.setStyle("-fx-font: 16 arial;");
      catchLabel8.setTextFill(Color.BLACK);
      
      
      GridPane gridpane4 = new GridPane();
      
      gridpane4.setHgap(10);
      gridpane4.setVgap(10);
     
      gridpane4.add(instruc4, 1, 1);
      gridpane4.add(header4, 1, 0);
      gridpane4.add(TextField4, 1, 2);
      gridpane4.add(reset4, 2, 2);
      gridpane4.add(catchLabel7, 1, 3);
      gridpane4.add(catchLabel8, 1, 3);
      gridpane4.add(resultLabel7, 1, 6);
      gridpane4.add(resultLabel8, 1, 6);

      gridpane4.setAlignment(Pos.CENTER);
      gridpane4.setPadding(new Insets(10));
      
      // Vbox
      VBox result3 = new VBox(15, gridpane4, calcButton7, calcButton8, GoBackButton4, bye4);    
      result3.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result3.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result3.setPadding(new Insets(10));
      
      // SCENE 6
      
      TextField5 = new TextField(); 
      
      resultLabel9 = new Label();
      resultLabel9.setStyle("-fx-font-weight: bold");
      resultLabel9.setStyle("-fx-font: 16 arial;");
      resultLabel9.setTextFill(Color.BLACK);
     
      resultLabel10 = new Label();
      resultLabel10.setStyle("-fx-font-weight: bold");
      resultLabel10.setStyle("-fx-font: 16 arial;");
      resultLabel10.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel9 = new Label();
      catchLabel9.setStyle("-fx-font-weight: bold");
      catchLabel9.setStyle("-fx-font: 16 arial;");
      catchLabel9.setTextFill(Color.BLACK);
      
      catchLabel10 = new Label();
      catchLabel10.setStyle("-fx-font-weight: bold");
      catchLabel10.setStyle("-fx-font: 16 arial;");
      catchLabel10.setTextFill(Color.BLACK);
      
      
      GridPane gridpane5 = new GridPane();
      
      gridpane5.setHgap(10);
      gridpane5.setVgap(10);
     
      gridpane5.add(instruc5, 1, 1);
      gridpane5.add(header5, 1, 0);
      gridpane5.add(TextField5, 1, 2);
      gridpane5.add(reset5, 2, 2);
      gridpane5.add(catchLabel9, 1, 3);
      gridpane5.add(catchLabel10, 1, 3);
      gridpane5.add(resultLabel9, 1, 6);
      gridpane5.add(resultLabel10, 1, 6);

      gridpane5.setAlignment(Pos.CENTER);
      gridpane5.setPadding(new Insets(10));
      
      // Vbox
      VBox result4 = new VBox(15, gridpane5, calcButton9, calcButton10, GoBackButton5, bye5);    
      result4.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result4.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result4.setPadding(new Insets(10));
      
      // SCENE 7
      
      TextField6 = new TextField(); 
      
      resultLabel11 = new Label();
      resultLabel11.setStyle("-fx-font-weight: bold");
      resultLabel11.setStyle("-fx-font: 16 arial;");
      resultLabel11.setTextFill(Color.BLACK);
     
      resultLabel12 = new Label();
      resultLabel12.setStyle("-fx-font-weight: bold");
      resultLabel12.setStyle("-fx-font: 16 arial;");
      resultLabel12.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel11 = new Label();
      catchLabel11.setStyle("-fx-font-weight: bold");
      catchLabel11.setStyle("-fx-font: 16 arial;");
      catchLabel11.setTextFill(Color.BLACK);
      
      catchLabel12 = new Label();
      catchLabel12.setStyle("-fx-font-weight: bold");
      catchLabel12.setStyle("-fx-font: 16 arial;");
      catchLabel12.setTextFill(Color.BLACK);
      
      
      GridPane gridpane6 = new GridPane();
      
      gridpane6.setHgap(10);
      gridpane6.setVgap(10);
     
      gridpane6.add(instruc6, 1, 1);
      gridpane6.add(header6, 1, 0);
      gridpane6.add(TextField6, 1, 2);
      gridpane6.add(reset6, 2, 2);
      gridpane6.add(catchLabel11, 1, 3);
      gridpane6.add(catchLabel12, 1, 3);
      gridpane6.add(resultLabel11, 1, 6);
      gridpane6.add(resultLabel12, 1, 6);

      gridpane6.setAlignment(Pos.CENTER);
      gridpane6.setPadding(new Insets(10));
      
      // Vbox
      VBox result5 = new VBox(15, gridpane6, calcButton11, calcButton12, GoBackButton6, bye6);    
      result5.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result5.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result5.setPadding(new Insets(10));
      
      // SCENE 8
      
      TextField7 = new TextField(); 
      
      resultLabel13 = new Label();
      resultLabel13.setStyle("-fx-font-weight: bold");
      resultLabel13.setStyle("-fx-font: 16 arial;");
      resultLabel13.setTextFill(Color.BLACK);
     
      resultLabel14 = new Label();
      resultLabel14.setStyle("-fx-font-weight: bold");
      resultLabel14.setStyle("-fx-font: 16 arial;");
      resultLabel14.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel13 = new Label();
      catchLabel13.setStyle("-fx-font-weight: bold");
      catchLabel13.setStyle("-fx-font: 16 arial;");
      catchLabel13.setTextFill(Color.BLACK);
      
      catchLabel14 = new Label();
      catchLabel14.setStyle("-fx-font-weight: bold");
      catchLabel14.setStyle("-fx-font: 16 arial;");
      catchLabel14.setTextFill(Color.BLACK);
      
      
      GridPane gridpane7 = new GridPane();
      
      gridpane7.setHgap(10);
      gridpane7.setVgap(10);
     
      gridpane7.add(instruc7, 1, 1);
      gridpane7.add(header7, 1, 0);
      gridpane7.add(TextField7, 1, 2);
      gridpane7.add(reset7, 2, 2);
      gridpane7.add(catchLabel13, 1, 3);
      gridpane7.add(catchLabel14, 1, 3);
      gridpane7.add(resultLabel13, 1, 6);
      gridpane7.add(resultLabel14, 1, 6);

      gridpane7.setAlignment(Pos.CENTER);
      gridpane7.setPadding(new Insets(10));
      
      // Vbox
      VBox result6 = new VBox(15, gridpane7, calcButton13, calcButton14, GoBackButton7, bye7);    
      result6.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result6.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result6.setPadding(new Insets(10));
      
      // SCENE 9
      
      TextField8 = new TextField(); 
      
      resultLabel15 = new Label();
      resultLabel15.setStyle("-fx-font-weight: bold");
      resultLabel15.setStyle("-fx-font: 16 arial;");
      resultLabel15.setTextFill(Color.BLACK);
     
      resultLabel16 = new Label();
      resultLabel16.setStyle("-fx-font-weight: bold");
      resultLabel16.setStyle("-fx-font: 16 arial;");
      resultLabel16.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel15 = new Label();
      catchLabel15.setStyle("-fx-font-weight: bold");
      catchLabel15.setStyle("-fx-font: 16 arial;");
      catchLabel15.setTextFill(Color.BLACK);
      
      catchLabel16 = new Label();
      catchLabel16.setStyle("-fx-font-weight: bold");
      catchLabel16.setStyle("-fx-font: 16 arial;");
      catchLabel16.setTextFill(Color.BLACK);
      
      
      GridPane gridpane8 = new GridPane();
      
      gridpane8.setHgap(10);
      gridpane8.setVgap(10);
     
      gridpane8.add(instruc8, 1, 1);
      gridpane8.add(header8, 1, 0);
      gridpane8.add(TextField8, 1, 2);
      gridpane8.add(reset8, 2, 2);
      gridpane8.add(catchLabel15, 1, 3);
      gridpane8.add(catchLabel16, 1, 3);
      gridpane8.add(resultLabel15, 1, 6);
      gridpane8.add(resultLabel16, 1, 6);

      gridpane8.setAlignment(Pos.CENTER);
      gridpane8.setPadding(new Insets(10));
      
      // Vbox
      VBox result7 = new VBox(15, gridpane8, calcButton15, calcButton16, GoBackButton8, bye8);    
      result7.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result7.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result7.setPadding(new Insets(10));
      
      // SCENE 10
      
      TextField9 = new TextField(); 
      
      resultLabel17 = new Label();
      resultLabel17.setStyle("-fx-font-weight: bold");
      resultLabel17.setStyle("-fx-font: 18 arial;");
      resultLabel17.setTextFill(Color.BLACK);
     
      resultLabel18 = new Label();
      resultLabel18.setStyle("-fx-font-weight: bold");
      resultLabel18.setStyle("-fx-font: 18 arial;");
      resultLabel18.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel17 = new Label();
      catchLabel17.setStyle("-fx-font-weight: bold");
      catchLabel17.setStyle("-fx-font: 18 arial;");
      catchLabel17.setTextFill(Color.BLACK);
      
      catchLabel18 = new Label();
      catchLabel18.setStyle("-fx-font-weight: bold");
      catchLabel18.setStyle("-fx-font: 18 arial;");
      catchLabel18.setTextFill(Color.BLACK);
      
      
      GridPane gridpane9 = new GridPane();
      
      gridpane9.setHgap(10);
      gridpane9.setVgap(10);
     
      gridpane9.add(instruc9, 1, 1);
      gridpane9.add(header9, 1, 0);
      gridpane9.add(TextField9, 1, 2);
      gridpane9.add(reset9, 2, 2);
      gridpane9.add(catchLabel17, 1, 3);
      gridpane9.add(catchLabel18, 1, 3);
      gridpane9.add(resultLabel17, 1, 6);
      gridpane9.add(resultLabel18, 1, 6);

      gridpane9.setAlignment(Pos.CENTER);
      gridpane9.setPadding(new Insets(10));
      
      // Vbox
      VBox result8 = new VBox(17, gridpane9, calcButton17, calcButton18, GoBackButton9, bye9);    
      result8.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result8.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result8.setPadding(new Insets(10));
      
      // SCENE 11
      
      TextField10 = new TextField(); 
      
      resultLabel19 = new Label();
      resultLabel19.setStyle("-fx-font-weight: bold");
      resultLabel19.setStyle("-fx-font: 20 arial;");
      resultLabel19.setTextFill(Color.BLACK);
     
      resultLabel20 = new Label();
      resultLabel20.setStyle("-fx-font-weight: bold");
      resultLabel20.setStyle("-fx-font: 20 arial;");
      resultLabel20.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel19 = new Label();
      catchLabel19.setStyle("-fx-font-weight: bold");
      catchLabel19.setStyle("-fx-font: 20 arial;");
      catchLabel19.setTextFill(Color.BLACK);
      
      catchLabel20 = new Label();
      catchLabel20.setStyle("-fx-font-weight: bold");
      catchLabel20.setStyle("-fx-font: 20 arial;");
      catchLabel20.setTextFill(Color.BLACK);
      
      
      GridPane gridpane10 = new GridPane();
      
      gridpane10.setHgap(10);
      gridpane10.setVgap(10);
     
      gridpane10.add(instruc10, 1, 1);
      gridpane10.add(header10, 1, 0);
      gridpane10.add(TextField10, 1, 2);
      gridpane10.add(reset10, 2, 2);
      gridpane10.add(catchLabel19, 1, 3);
      gridpane10.add(catchLabel20, 1, 3);
      gridpane10.add(resultLabel19, 1, 6);
      gridpane10.add(resultLabel20, 1, 6);

      gridpane10.setAlignment(Pos.CENTER);
      gridpane10.setPadding(new Insets(10));
      
      // Vbox
      VBox result9 = new VBox(19, gridpane10, calcButton19, calcButton20, GoBackButton10, bye10);    
      result9.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result9.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result9.setPadding(new Insets(10));
  
      // SCENE 12
      
      TextField11 = new TextField(); 
      
      resultLabel21 = new Label();
      resultLabel21.setStyle("-fx-font-weight: bold");
      resultLabel21.setStyle("-fx-font: 20 arial;");
      resultLabel21.setTextFill(Color.BLACK);
     
      resultLabel22 = new Label();
      resultLabel22.setStyle("-fx-font-weight: bold");
      resultLabel22.setStyle("-fx-font: 20 arial;");
      resultLabel22.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel21 = new Label();
      catchLabel21.setStyle("-fx-font-weight: bold");
      catchLabel21.setStyle("-fx-font: 20 arial;");
      catchLabel21.setTextFill(Color.BLACK);
      
      catchLabel22 = new Label();
      catchLabel22.setStyle("-fx-font-weight: bold");
      catchLabel22.setStyle("-fx-font: 20 arial;");
      catchLabel22.setTextFill(Color.BLACK);
      
      
      GridPane gridpane11 = new GridPane();
      
      gridpane11.setHgap(10);
      gridpane11.setVgap(10);
     
      gridpane11.add(instruc11, 1, 1);
      gridpane11.add(header11, 1, 0);
      gridpane11.add(TextField11, 1, 2);
      gridpane11.add(reset11, 2, 2);
      gridpane11.add(catchLabel21, 1, 3);
      gridpane11.add(catchLabel22, 1, 3);
      gridpane11.add(resultLabel21, 1, 6);
      gridpane11.add(resultLabel22, 1, 6);

      gridpane11.setAlignment(Pos.CENTER);
      gridpane11.setPadding(new Insets(10));
      
      // Vbox
      VBox result10 = new VBox(21, gridpane11, calcButton21, calcButton22, GoBackButton11, bye11);    
      result10.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result10.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result10.setPadding(new Insets(10));
      
      // SCENE 13
      
      TextField12 = new TextField(); 
      
      resultLabel23 = new Label();
      resultLabel23.setStyle("-fx-font-weight: bold");
      resultLabel23.setStyle("-fx-font: 20 arial;");
      resultLabel23.setTextFill(Color.BLACK);
     
      resultLabel24 = new Label();
      resultLabel24.setStyle("-fx-font-weight: bold");
      resultLabel24.setStyle("-fx-font: 20 arial;");
      resultLabel24.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel23 = new Label();
      catchLabel23.setStyle("-fx-font-weight: bold");
      catchLabel23.setStyle("-fx-font: 20 arial;");
      catchLabel23.setTextFill(Color.BLACK);
      
      catchLabel24 = new Label();
      catchLabel24.setStyle("-fx-font-weight: bold");
      catchLabel24.setStyle("-fx-font: 20 arial;");
      catchLabel24.setTextFill(Color.BLACK);
      
      
      GridPane gridpane12 = new GridPane();
      
      gridpane12.setHgap(10);
      gridpane12.setVgap(10);
     
      gridpane12.add(instruc12, 1, 1);
      gridpane12.add(header12, 1, 0);
      gridpane12.add(TextField12, 1, 2);
      gridpane12.add(reset12, 2, 2);
      gridpane12.add(catchLabel23, 1, 3);
      gridpane12.add(catchLabel24, 1, 3);
      gridpane12.add(resultLabel23, 1, 6);
      gridpane12.add(resultLabel24, 1, 6);

      gridpane12.setAlignment(Pos.CENTER);
      gridpane12.setPadding(new Insets(10));
      
      // Vbox
      VBox result11 = new VBox(23, gridpane12, calcButton23, calcButton24, GoBackButton12, bye12);    
      result11.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result11.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result11.setPadding(new Insets(10));
      
      // SCENE 14
      
      TextField13 = new TextField(); 
      
      resultLabel25 = new Label();
      resultLabel25.setStyle("-fx-font-weight: bold");
      resultLabel25.setStyle("-fx-font: 20 arial;");
      resultLabel25.setTextFill(Color.BLACK);
     
      resultLabel26 = new Label();
      resultLabel26.setStyle("-fx-font-weight: bold");
      resultLabel26.setStyle("-fx-font: 20 arial;");
      resultLabel26.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel25 = new Label();
      catchLabel25.setStyle("-fx-font-weight: bold");
      catchLabel25.setStyle("-fx-font: 20 arial;");
      catchLabel25.setTextFill(Color.BLACK);
      
      catchLabel26 = new Label();
      catchLabel26.setStyle("-fx-font-weight: bold");
      catchLabel26.setStyle("-fx-font: 20 arial;");
      catchLabel26.setTextFill(Color.BLACK);
      
      
      GridPane gridpane13 = new GridPane();
      
      gridpane13.setHgap(10);
      gridpane13.setVgap(10);
     
      gridpane13.add(instruc13, 1, 1);
      gridpane13.add(header13, 1, 0);
      gridpane13.add(TextField13, 1, 2);
      gridpane13.add(reset13, 2, 2);
      gridpane13.add(catchLabel25, 1, 3);
      gridpane13.add(catchLabel26, 1, 3);
      gridpane13.add(resultLabel25, 1, 6);
      gridpane13.add(resultLabel26, 1, 6);

      gridpane13.setAlignment(Pos.CENTER);
      gridpane13.setPadding(new Insets(10));
      
      // Vbox
      VBox result12 = new VBox(25, gridpane13, calcButton25, calcButton26, GoBackButton13, bye13);    
      result12.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result12.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result12.setPadding(new Insets(10));
      

      // SCENE 15
      
      TextField14 = new TextField(); 
      
      resultLabel27 = new Label();
      resultLabel27.setStyle("-fx-font-weight: bold");
      resultLabel27.setStyle("-fx-font: 20 arial;");
      resultLabel27.setTextFill(Color.BLACK);
     
      resultLabel28 = new Label();
      resultLabel28.setStyle("-fx-font-weight: bold");
      resultLabel28.setStyle("-fx-font: 20 arial;");
      resultLabel28.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel27 = new Label();
      catchLabel27.setStyle("-fx-font-weight: bold");
      catchLabel27.setStyle("-fx-font: 20 arial;");
      catchLabel27.setTextFill(Color.BLACK);
      
      catchLabel28 = new Label();
      catchLabel28.setStyle("-fx-font-weight: bold");
      catchLabel28.setStyle("-fx-font: 20 arial;");
      catchLabel28.setTextFill(Color.BLACK);
      
      
      GridPane gridpane14 = new GridPane();
      
      gridpane14.setHgap(10);
      gridpane14.setVgap(10);
     
      gridpane14.add(instruc14, 1, 1);
      gridpane14.add(header14, 1, 0);
      gridpane14.add(TextField14, 1, 2);
      gridpane14.add(reset14, 2, 2);
      gridpane14.add(catchLabel27, 1, 3);
      gridpane14.add(catchLabel28, 1, 3);
      gridpane14.add(resultLabel27, 1, 6);
      gridpane14.add(resultLabel28, 1, 6);

      gridpane14.setAlignment(Pos.CENTER);
      gridpane14.setPadding(new Insets(10));
      
      // Vbox
      VBox result13 = new VBox(27, gridpane14, calcButton27, calcButton28, GoBackButton14, bye14);    
      result13.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result13.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result13.setPadding(new Insets(10));
      
      // SCENE 16
      
      TextField15 = new TextField(); 
      
      resultLabel29 = new Label();
      resultLabel29.setStyle("-fx-font-weight: bold");
      resultLabel29.setStyle("-fx-font: 20 arial;");
      resultLabel29.setTextFill(Color.BLACK);
     
      resultLabel30 = new Label();
      resultLabel30.setStyle("-fx-font-weight: bold");
      resultLabel30.setStyle("-fx-font: 20 arial;");
      resultLabel30.setTextFill(Color.BLACK);
      
      // Catch Labels
      catchLabel29 = new Label();
      catchLabel29.setStyle("-fx-font-weight: bold");
      catchLabel29.setStyle("-fx-font: 20 arial;");
      catchLabel29.setTextFill(Color.BLACK);
      
      catchLabel30 = new Label();
      catchLabel30.setStyle("-fx-font-weight: bold");
      catchLabel30.setStyle("-fx-font: 20 arial;");
      catchLabel30.setTextFill(Color.BLACK);
      
      
      GridPane gridpane15 = new GridPane();
      
      gridpane15.setHgap(10);
      gridpane15.setVgap(10);
     
      gridpane15.add(instruc15, 1, 1);
      gridpane15.add(header15, 1, 0);
      gridpane15.add(TextField15, 1, 2);
      gridpane15.add(reset15, 2, 2);
      gridpane15.add(catchLabel29, 1, 3);
      gridpane15.add(catchLabel30, 1, 3);
      gridpane15.add(resultLabel29, 1, 6);
      gridpane15.add(resultLabel30, 1, 6);

      gridpane15.setAlignment(Pos.CENTER);
      gridpane15.setPadding(new Insets(10));
      
      // Vbox
      VBox result14 = new VBox(29, gridpane15, calcButton29, calcButton30, GoBackButton15, bye15);    
      result14.setBackground(background); 
      
      // Set the result VBox's alignment to center.   
      result14.setAlignment(Pos.CENTER);    
      
      // Set the result VBox's padding to 10 pixels.     
      result14.setPadding(new Insets(10));
  
      // SCENE CREATION
      
      Scene scene1 = new Scene(vBox1, 800, 450);
      Scene scene2 = new Scene(result, 800, 450);
      Scene scene3 = new Scene(result1, 800, 450);
      Scene scene4 = new Scene(result2, 800, 450);
      Scene scene5 = new Scene(result3, 800, 450);
      Scene scene6 = new Scene(result4, 800, 450);
      Scene scene7 = new Scene(result5, 800, 450);
      Scene scene8 = new Scene(result6, 800, 450);
      Scene scene9 = new Scene(result7, 800, 450);
      Scene scene10 = new Scene(result8, 800, 450);
      Scene scene11 = new Scene(result9, 800, 450);
      Scene scene12 = new Scene(result10, 800, 450);
      Scene scene13 = new Scene(result11, 800, 450);
      Scene scene14 = new Scene(result12, 800, 450);
      Scene scene15 = new Scene(result13, 800, 450);
      Scene scene16 = new Scene(result14, 800, 450);
      
      // Event Handlers
      // SCENE 1
      USDtoCAD.setOnAction(e -> primaryStage.setScene(scene2));
      USDtoEUR.setOnAction(e -> primaryStage.setScene(scene3));
      USDtoGBP.setOnAction(e -> primaryStage.setScene(scene4));
      USDtoAUD.setOnAction(e -> primaryStage.setScene(scene5));
      USDtoPESO.setOnAction(e -> primaryStage.setScene(scene6));
      CADtoEUR.setOnAction(e -> primaryStage.setScene(scene7));
      CADtoGBP.setOnAction(e -> primaryStage.setScene(scene8));
      CADtoAUD.setOnAction(e -> primaryStage.setScene(scene9));
      CADtoPESO.setOnAction(e -> primaryStage.setScene(scene10));
      EURtoGBP.setOnAction(e -> primaryStage.setScene(scene11));
      EURtoAUD.setOnAction(e -> primaryStage.setScene(scene12));
      EURtoPESO.setOnAction(e -> primaryStage.setScene(scene13));
      GBPtoAUD.setOnAction(e -> primaryStage.setScene(scene14));
      GBPtoPESO.setOnAction(e -> primaryStage.setScene(scene15));
      AUDtoPESO.setOnAction(e -> primaryStage.setScene(scene16));

      // SCENE 2
      calcButton.setOnAction(new CalcButtonHandler());
      calcButton1.setOnAction(new CalcButtonHandler1());
      GoBackButton.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  USDtoCAD.setSelected(false);
    	  TextField1.clear();
		  resultLabel1.setText("");
		  resultLabel2.setText("");
		  catchLabel1.setText("");
		  catchLabel2.setText("");
      });
      reset1.setOnAction(new resetButtonHandler1());
      bye.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      
      // SCENE 3
      calcButton3.setOnAction(new CalcButtonHandler3());
      calcButton4.setOnAction(new CalcButtonHandler4());
      GoBackButton2.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  USDtoEUR.setSelected(false);
    	  TextField2.clear();
		  resultLabel3.setText("");
		  resultLabel4.setText("");
		  catchLabel3.setText("");
		  catchLabel4.setText("");
      });
      reset2.setOnAction(new resetButtonHandler2());
      bye2.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      
      // SCENE 4
      calcButton5.setOnAction(new CalcButtonHandler5());
      calcButton6.setOnAction(new CalcButtonHandler6());
      GoBackButton3.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  USDtoGBP.setSelected(false);
    	  TextField3.clear();
		  resultLabel5.setText("");
		  resultLabel6.setText("");
		  catchLabel5.setText("");
		  catchLabel6.setText("");
      });
      reset3.setOnAction(new resetButtonHandler3());
      bye3.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      
      
      // SCENE 5
      calcButton7.setOnAction(new CalcButtonHandler7());
      calcButton8.setOnAction(new CalcButtonHandler8());
      GoBackButton4.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  USDtoAUD.setSelected(false);
    	  TextField4.clear();
		  resultLabel7.setText("");
		  resultLabel8.setText("");
		  catchLabel7.setText("");
		  catchLabel8.setText("");
      });
      reset4.setOnAction(new resetButtonHandler4());
      bye4.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      
      // SCENE 6
      calcButton9.setOnAction(new CalcButtonHandler9());
      calcButton10.setOnAction(new CalcButtonHandler10());
      GoBackButton5.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  USDtoPESO.setSelected(false);
    	  TextField5.clear();
		  resultLabel9.setText("");
		  resultLabel10.setText("");
		  catchLabel9.setText("");
		  catchLabel10.setText("");
      });
      reset5.setOnAction(new resetButtonHandler5());
      bye5.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      
      // SCENE 7
      calcButton11.setOnAction(new CalcButtonHandler11());
      calcButton12.setOnAction(new CalcButtonHandler12());
      GoBackButton6.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  CADtoEUR.setSelected(false);
    	  TextField6.clear();
		  resultLabel11.setText("");
		  resultLabel12.setText("");
		  catchLabel11.setText("");
		  catchLabel12.setText("");
      });
      reset6.setOnAction(new resetButtonHandler6());
      bye6.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      
      // SCENE 8
      calcButton13.setOnAction(new CalcButtonHandler13());
      calcButton14.setOnAction(new CalcButtonHandler14());
      GoBackButton7.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  CADtoGBP.setSelected(false);
    	  TextField7.clear();
		  resultLabel13.setText("");
		  resultLabel14.setText("");
		  catchLabel13.setText("");
		  catchLabel14.setText("");
      });
      reset7.setOnAction(new resetButtonHandler7());
      bye7.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      
      // SCENE 9
      calcButton15.setOnAction(new CalcButtonHandler15());
      calcButton16.setOnAction(new CalcButtonHandler16());
      GoBackButton8.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  CADtoAUD.setSelected(false);
    	  TextField8.clear();
		  resultLabel15.setText("");
		  resultLabel16.setText("");
		  catchLabel15.setText("");
		  catchLabel16.setText("");
      });
      reset8.setOnAction(new resetButtonHandler8());
      bye8.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      
      // SCENE 10
      calcButton17.setOnAction(new CalcButtonHandler17());
      calcButton18.setOnAction(new CalcButtonHandler18());
      GoBackButton9.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  CADtoPESO.setSelected(false);
    	  TextField9.clear();
		  resultLabel17.setText("");
		  resultLabel18.setText("");
		  catchLabel17.setText("");
		  catchLabel18.setText("");
      });
      reset9.setOnAction(new resetButtonHandler9());
      bye9.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      
      // SCENE 11
      
      calcButton19.setOnAction(new CalcButtonHandler19());
      calcButton20.setOnAction(new CalcButtonHandler20());
      GoBackButton10.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  EURtoGBP.setSelected(false);
    	  TextField10.clear();
		  resultLabel19.setText("");
		  resultLabel20.setText("");
		  catchLabel19.setText("");
		  catchLabel20.setText("");
      });
      reset10.setOnAction(new resetButtonHandler10());
      bye10.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });   
      
      // SCENE 12
      
      calcButton21.setOnAction(new CalcButtonHandler21());
      calcButton22.setOnAction(new CalcButtonHandler22());
      GoBackButton11.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  EURtoAUD.setSelected(false);
    	  TextField11.clear();
		  resultLabel21.setText("");
		  resultLabel22.setText("");
		  catchLabel21.setText("");
		  catchLabel22.setText("");
      });
      reset11.setOnAction(new resetButtonHandler11());
      bye11.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });
      
      // SCENE 13
      
      calcButton23.setOnAction(new CalcButtonHandler23());
      calcButton24.setOnAction(new CalcButtonHandler24());
      GoBackButton12.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  EURtoPESO.setSelected(false);
    	  TextField12.clear();
		  resultLabel23.setText("");
		  resultLabel24.setText("");
		  catchLabel23.setText("");
		  catchLabel24.setText("");
      });
      reset12.setOnAction(new resetButtonHandler12());
      bye12.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });
      
      // SCENE 14
      
      calcButton25.setOnAction(new CalcButtonHandler25());
      calcButton26.setOnAction(new CalcButtonHandler26());
      GoBackButton13.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  GBPtoAUD.setSelected(false);
    	  TextField13.clear();
		  resultLabel25.setText("");
		  resultLabel26.setText("");
		  catchLabel25.setText("");
		  catchLabel26.setText("");
      });
      reset13.setOnAction(new resetButtonHandler13());
      bye13.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });
      
      // SCENE 15
      
      calcButton27.setOnAction(new CalcButtonHandler27());
      calcButton28.setOnAction(new CalcButtonHandler28());
      GoBackButton14.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  GBPtoPESO.setSelected(false);
    	  TextField14.clear();
		  resultLabel27.setText("");
		  resultLabel28.setText("");
		  catchLabel27.setText("");
		  catchLabel28.setText("");
      });
      reset14.setOnAction(new resetButtonHandler14());
      bye14.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });

      // SCENE 16
      
      calcButton29.setOnAction(new CalcButtonHandler29());
      calcButton30.setOnAction(new CalcButtonHandler30());
      GoBackButton15.setOnAction(e -> 
      {
    	  primaryStage.setScene(scene1);
    	  AUDtoPESO.setSelected(false);
    	  TextField15.clear();
		  resultLabel29.setText("");
		  resultLabel30.setText("");
		  catchLabel29.setText("");
		  catchLabel30.setText("");
      });
      reset15.setOnAction(new resetButtonHandler15());
      bye15.setOnAction(event ->     
      {
    	  primaryStage.close();     
      });
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene1);
      
      // Set the stage title.
      primaryStage.setTitle("Currency Converter");
      
      // Show the window.
      primaryStage.show(); 
           
   }
   /*
    * Event handler classes
    */
   class CalcButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double USD = Double.parseDouble(TextField1.getText());
        	// Convert the kilometers to miles.
    		  Double CAD = USD * 1.26;
    	  
	         // Display the results.
	         resultLabel1.setText(String.format("%,.2f CAD", CAD));
	         resultLabel1.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel1.setText("");
	         catchLabel2.setText("");
	         resultLabel2.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField1.clear();
    		  resultLabel1.setText(" ");
    		  resultLabel2.setText(" ");
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
         // Get the kilometers.
    	  try
    	  {
    		  Double CAD = Double.parseDouble(TextField1.getText());
        	// Convert the kilometers to miles.
    		  Double USD = CAD * 0.79;
    	  
	         // Display the results.
	         resultLabel2.setText(String.format("%,.2f USD", USD));
	         resultLabel2.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel2.setText("");
	         catchLabel1.setText("");
	         resultLabel1.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField1.clear();
    		  resultLabel2.setText(" ");
    		  resultLabel1.setText(" ");
    		  catchLabel2.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel2.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler3 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double USD = Double.parseDouble(TextField2.getText());
        	// Convert the kilometers to miles.
    		  Double EUR = USD * 0.85;
    	  
	         // Display the results.
	         resultLabel3.setText(String.format("%,.2f EUR", EUR));
	         resultLabel3.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel3.setText("");
	         catchLabel4.setText("");
	         resultLabel4.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField2.clear();
    		  resultLabel3.setText(" ");
    		  resultLabel4.setText(" ");
    		  catchLabel3.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel3.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler4 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double EUR = Double.parseDouble(TextField2.getText());
        	// Convert the kilometers to miles.
    		  Double USD = EUR * 1.18;
    	  
	         // Display the results.
	         resultLabel4.setText(String.format("%,.2f USD", USD));
	         resultLabel4.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel4.setText("");
	         catchLabel3.setText("");
	         resultLabel3.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField2.clear();
    		  resultLabel4.setText(" ");
    		  resultLabel3.setText(" ");
    		  catchLabel4.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel4.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler5 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double USD = Double.parseDouble(TextField3.getText());
        	// Convert the kilometers to miles.
    		  Double GBP = USD * 0.73;
    	  
	         // Display the results.
	         resultLabel5.setText(String.format("%,.2f GBP", GBP));
	         resultLabel5.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel5.setText("");
	         catchLabel6.setText("");
	         resultLabel6.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField3.clear();
    		  resultLabel5.setText(" ");
    		  resultLabel6.setText(" ");
    		  catchLabel5.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel5.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler6 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double GBP = Double.parseDouble(TextField3.getText());
        	// Convert the kilometers to miles.
    		  Double USD = GBP * 1.38;
    	  
	         // Display the results.
	         resultLabel6.setText(String.format("%,.2f USD", USD));
	         resultLabel6.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel6.setText("");
	         catchLabel5.setText("");
	         resultLabel5.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField3.clear();
    		  resultLabel6.setText(" ");
    		  resultLabel5.setText(" ");
    		  catchLabel6.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel6.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler7 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double USD = Double.parseDouble(TextField4.getText());
        	// Convert the kilometers to miles.
    		  Double AUD = USD * 1.31;
    	  
	         // Display the results.
	         resultLabel7.setText(String.format("%,.2f AUD", AUD));
	         resultLabel7.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel7.setText("");
	         catchLabel8.setText("");
	         resultLabel8.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField4.clear();
    		  resultLabel7.setText(" ");
    		  resultLabel8.setText(" ");
    		  catchLabel7.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel7.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler8 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double AUD = Double.parseDouble(TextField4.getText());
        	// Convert the kilometers to miles.
    		  Double USD = AUD * 0.76;
    	  
	         // Display the results.
	         resultLabel8.setText(String.format("%,.2f USD", USD));
	         resultLabel8.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel8.setText("");
	         catchLabel7.setText("");
	         resultLabel7.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField4.clear();
    		  resultLabel8.setText(" ");
    		  resultLabel7.setText(" ");
    		  catchLabel8.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel8.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler9 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double USD = Double.parseDouble(TextField5.getText());
        	// Convert the kilometers to miles.
    		  Double PESO = USD * 20.59;
    	  
	         // Display the results.
	         resultLabel9.setText(String.format("%,.2f PESO", PESO));
	         resultLabel9.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel9.setText("");
	         catchLabel10.setText("");
	         resultLabel10.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField5.clear();
    		  resultLabel9.setText(" ");
    		  resultLabel10.setText(" ");
    		  catchLabel9.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel9.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler10 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double PESO = Double.parseDouble(TextField5.getText());
        	// Convert the kilometers to miles.
    		  Double USD = PESO * 0.049;
    	  
	         // Display the results.
	         resultLabel10.setText(String.format("%,.2f USD", USD));
	         resultLabel10.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel10.setText("");
	         catchLabel9.setText("");
	         resultLabel9.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField5.clear();
    		  resultLabel10.setText(" ");
    		  resultLabel9.setText(" ");
    		  catchLabel10.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel10.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler11 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double CAD = Double.parseDouble(TextField6.getText());
        	// Convert the kilometers to miles.
    		  Double EUR = CAD * 0.67;
    	  
	         // Display the results.
	         resultLabel11.setText(String.format("%,.2f EUR", EUR));
	         resultLabel11.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel11.setText("");
	         catchLabel12.setText("");
	         resultLabel12.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField6.clear();
    		  resultLabel11.setText(" ");
    		  resultLabel12.setText(" ");
    		  catchLabel11.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel11.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler12 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double EUR = Double.parseDouble(TextField6.getText());
        	// Convert the kilometers to miles.
    		  Double CAD = EUR * 1.49;
    	  
	         // Display the results.
	         resultLabel12.setText(String.format("%,.2f CAD", CAD));
	         resultLabel12.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel12.setText("");
	         catchLabel11.setText("");
	         resultLabel11.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField6.clear();
    		  resultLabel12.setText(" ");
    		  resultLabel11.setText(" ");
    		  catchLabel12.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel12.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler13 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double CAD = Double.parseDouble(TextField7.getText());
        	// Convert the kilometers to miles.
    		  Double GBP = CAD * 0.58;
    	  
	         // Display the results.
	         resultLabel13.setText(String.format("%,.2f GBP", GBP));
	         resultLabel13.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel13.setText("");
	         catchLabel14.setText("");
	         resultLabel14.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField7.clear();
    		  resultLabel13.setText(" ");
    		  resultLabel14.setText(" ");
    		  catchLabel13.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel13.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler14 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double GBP = Double.parseDouble(TextField7.getText());
        	// Convert the kilometers to miles.
    		  Double CAD = GBP * 1.74;
    	  
	         // Display the results.
	         resultLabel14.setText(String.format("%,.2f CAD", CAD));
	         resultLabel14.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel14.setText("");
	         catchLabel13.setText("");
	         resultLabel13.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField7.clear();
    		  resultLabel14.setText(" ");
    		  resultLabel13.setText(" ");
    		  catchLabel14.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel14.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler15 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double CAD = Double.parseDouble(TextField8.getText());
        	// Convert the kilometers to miles.
    		  Double AUD = CAD * 1.04;
    	  
	         // Display the results.
	         resultLabel15.setText(String.format("%,.2f AUD", AUD));
	         resultLabel15.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel15.setText("");
	         catchLabel16.setText("");
	         resultLabel16.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField8.clear();
    		  resultLabel15.setText(" ");
    		  resultLabel16.setText(" ");
    		  catchLabel15.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel15.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler16 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double AUD = Double.parseDouble(TextField8.getText());
        	// Convert the kilometers to miles.
    		  Double CAD = AUD * 0.96;
    	  
	         // Display the results.
	         resultLabel16.setText(String.format("%,.2f CAD", CAD));
	         resultLabel16.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel16.setText("");
	         catchLabel15.setText("");
	         resultLabel15.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField8.clear();
    		  resultLabel16.setText(" ");
    		  resultLabel15.setText(" ");
    		  catchLabel16.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel16.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler17 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double CAD = Double.parseDouble(TextField9.getText());
        	// Convert the kilometers to miles.
    		  Double PESO = CAD * 16.33;
    	  
	         // Display the results.
	         resultLabel17.setText(String.format("%,.2f PESO", PESO));
	         resultLabel17.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel17.setText("");
	         catchLabel18.setText("");
	         resultLabel18.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField9.clear();
    		  resultLabel17.setText(" ");
    		  resultLabel18.setText(" ");
    		  catchLabel17.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel17.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler18 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double PESO = Double.parseDouble(TextField9.getText());
        	// Convert the kilometers to miles.
    		  Double CAD = PESO * 0.061;
    	  
	         // Display the results.
	         resultLabel18.setText(String.format("%,.2f CAD", CAD));
	         resultLabel18.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel18.setText("");
	         catchLabel17.setText("");
	         resultLabel17.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField9.clear();
    		  resultLabel18.setText(" ");
    		  resultLabel17.setText(" ");
    		  catchLabel18.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel18.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler19 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double EUR = Double.parseDouble(TextField10.getText());
        	// Convert the kilometers to miles.
    		  Double GBP = EUR * 0.86;
    	  
	         // Display the results.
	         resultLabel19.setText(String.format("%,.2f GBP", GBP));
	         resultLabel19.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel19.setText("");
	         catchLabel20.setText("");
	         resultLabel20.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField10.clear();
    		  resultLabel19.setText(" ");
    		  resultLabel20.setText(" ");
    		  catchLabel19.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel19.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler20 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double GBP = Double.parseDouble(TextField10.getText());
        	// Convert the kilometers to miles.
    		  Double EUR = GBP * 1.17;
    	  
	         // Display the results.
	         resultLabel20.setText(String.format("%,.2f EUR", EUR));
	         resultLabel20.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel20.setText("");
	         catchLabel19.setText("");
	         resultLabel19.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField10.clear();
    		  resultLabel20.setText(" ");
    		  resultLabel19.setText(" ");
    		  catchLabel20.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel20.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler21 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double EUR = Double.parseDouble(TextField11.getText());
        	// Convert the kilometers to miles.
    		  Double AUD = EUR * 1.55;
    	  
	         // Display the results.
	         resultLabel21.setText(String.format("%,.2f AUD", AUD));
	         resultLabel21.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel21.setText("");
	         catchLabel22.setText("");
	         resultLabel22.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField11.clear();
    		  resultLabel21.setText(" ");
    		  resultLabel22.setText(" ");
    		  catchLabel21.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel21.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler22 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double AUD = Double.parseDouble(TextField11.getText());
        	// Convert the kilometers to miles.
    		  Double EUR = AUD * 0.65;
    	  
	         // Display the results.
	         resultLabel22.setText(String.format("%,.2f EUR", EUR));
	         resultLabel22.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel22.setText("");
	         catchLabel21.setText("");
	         resultLabel21.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField11.clear();
    		  resultLabel22.setText(" ");
    		  resultLabel21.setText(" ");
    		  catchLabel22.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel22.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler23 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double EUR = Double.parseDouble(TextField12.getText());
        	// Convert the kilometers to miles.
    		  Double PESO = EUR * 24.35;
    	  
	         // Display the results.
	         resultLabel23.setText(String.format("%,.2f PESO", PESO));
	         resultLabel23.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel23.setText("");
	         catchLabel24.setText("");
	         resultLabel24.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField12.clear();
    		  resultLabel23.setText(" ");
    		  resultLabel24.setText(" ");
    		  catchLabel23.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel23.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler24 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double PESO = Double.parseDouble(TextField12.getText());
        	// Convert the kilometers to miles.
    		  Double EUR = PESO * 0.041;
    	  
	         // Display the results.
	         resultLabel24.setText(String.format("%,.2f EUR", EUR));
	         resultLabel24.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel24.setText("");
	         catchLabel23.setText("");
	         resultLabel23.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField12.clear();
    		  resultLabel24.setText(" ");
    		  resultLabel23.setText(" ");
    		  catchLabel24.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel24.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler25 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double GBP = Double.parseDouble(TextField13.getText());
        	// Convert the kilometers to miles.
    		  Double AUD = GBP * 1.81;
    	  
	         // Display the results.
	         resultLabel25.setText(String.format("%,.2f AUD", AUD));
	         resultLabel25.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel25.setText("");
	         catchLabel26.setText("");
	         resultLabel26.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField13.clear();
    		  resultLabel25.setText(" ");
    		  resultLabel26.setText(" ");
    		  catchLabel25.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel25.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler26 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double AUD = Double.parseDouble(TextField13.getText());
        	// Convert the kilometers to miles.
    		  Double GBP = AUD * 0.55;
    	  
	         // Display the results.
	         resultLabel26.setText(String.format("%,.2f GBP", GBP));
	         resultLabel26.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel26.setText("");
	         catchLabel25.setText("");
	         resultLabel25.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField13.clear();
    		  resultLabel26.setText(" ");
    		  resultLabel25.setText(" ");
    		  catchLabel26.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel26.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler27 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double GBP = Double.parseDouble(TextField14.getText());
        	// Convert the kilometers to miles.
    		  Double PESO = GBP * 28.4;
    	  
	         // Display the results.
	         resultLabel27.setText(String.format("%,.2f PESO", PESO));
	         resultLabel27.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel27.setText("");
	         catchLabel28.setText("");
	         resultLabel28.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField14.clear();
    		  resultLabel27.setText(" ");
    		  resultLabel28.setText(" ");
    		  catchLabel27.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel27.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler28 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double PESO = Double.parseDouble(TextField14.getText());
        	// Convert the kilometers to miles.
    		  Double GBP = PESO * 0.035;
    	  
	         // Display the results.
	         resultLabel28.setText(String.format("%,.2f GBP", GBP));
	         resultLabel28.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel28.setText("");
	         catchLabel27.setText("");
	         resultLabel27.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField14.clear();
    		  resultLabel28.setText(" ");
    		  resultLabel27.setText(" ");
    		  catchLabel28.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel28.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler29 implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double AUD = Double.parseDouble(TextField15.getText());
        	// Convert the kilometers to miles.
    		  Double PESO = AUD * 15.73;
    	  
	         // Display the results.
	         resultLabel29.setText(String.format("%,.2f PESO", PESO));
	         resultLabel29.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel29.setText("");
	         catchLabel30.setText("");
	         resultLabel30.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField15.clear();
    		  resultLabel29.setText(" ");
    		  resultLabel30.setText(" ");
    		  catchLabel29.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel29.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   class CalcButtonHandler30 implements EventHandler<ActionEvent>

   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
    	  try
    	  {
    		  Double PESO = Double.parseDouble(TextField15.getText());
        	// Convert the kilometers to miles.
    		  Double AUD = PESO * 0.027;
    	  
	         // Display the results.
	         resultLabel30.setText(String.format("%,.2f AUD", AUD));
	         resultLabel30.setStyle("-fx-font: 24 arial;");
	         
	         catchLabel30.setText("");
	         catchLabel29.setText("");
	         resultLabel29.setText("");
    	  }
    	  catch(IllegalArgumentException e)
    	  {
    		  TextField15.clear();
    		  resultLabel30.setText(" ");
    		  resultLabel29.setText(" ");
    		  catchLabel30.setText("PLEASE ENTER NUMERIC VALUES");
    		  catchLabel30.setStyle("-fx-font-weight: bold");
    	  }
      }
   }
   
   
   class resetButtonHandler1 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField1.clear();
		   resultLabel1.setText("");
		   resultLabel2.setText("");
		   catchLabel1.setText("");
		   catchLabel2.setText("");
	   }
   }
   class resetButtonHandler2 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField2.clear();
		   resultLabel3.setText("");
		   resultLabel4.setText("");
		   catchLabel3.setText("");
		   catchLabel4.setText("");
	   }
   }
   class resetButtonHandler3 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField3.clear();
		   resultLabel5.setText("");
		   resultLabel6.setText("");
		   catchLabel5.setText("");
		   catchLabel6.setText("");
	   }
   }
   class resetButtonHandler4 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField4.clear();
		   resultLabel7.setText("");
		   resultLabel8.setText("");
		   catchLabel7.setText("");
		   catchLabel8.setText("");
	   }
   }
   class resetButtonHandler5 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField5.clear();
		   resultLabel9.setText("");
		   resultLabel10.setText("");
		   catchLabel9.setText("");
		   catchLabel10.setText("");
	   }
   }
   class resetButtonHandler6 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField6.clear();
		   resultLabel11.setText("");
		   resultLabel12.setText("");
		   catchLabel11.setText("");
		   catchLabel12.setText("");
	   }
   }
   class resetButtonHandler7 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField7.clear();
		   resultLabel13.setText("");
		   resultLabel14.setText("");
		   catchLabel13.setText("");
		   catchLabel14.setText("");
	   }
   }
   class resetButtonHandler8 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField8.clear();
		   resultLabel15.setText("");
		   resultLabel16.setText("");
		   catchLabel15.setText("");
		   catchLabel16.setText("");
	   }
   }
   class resetButtonHandler9 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField9.clear();
		   resultLabel17.setText("");
		   resultLabel18.setText("");
		   catchLabel17.setText("");
		   catchLabel18.setText("");
	   }
   }
   class resetButtonHandler10 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField10.clear();
		   resultLabel19.setText("");
		   resultLabel20.setText("");
		   catchLabel19.setText("");
		   catchLabel20.setText("");
	   }
   }
   class resetButtonHandler11 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField11.clear();
		   resultLabel21.setText("");
		   resultLabel22.setText("");
		   catchLabel21.setText("");
		   catchLabel22.setText("");
	   }
   }
   class resetButtonHandler12 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField12.clear();
		   resultLabel23.setText("");
		   resultLabel24.setText("");
		   catchLabel23.setText("");
		   catchLabel24.setText("");
	   }
   }
   class resetButtonHandler13 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField13.clear();
		   resultLabel25.setText("");
		   resultLabel26.setText("");
		   catchLabel25.setText("");
		   catchLabel26.setText("");
	   }
   }
   class resetButtonHandler14 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField14.clear();
		   resultLabel27.setText("");
		   resultLabel28.setText("");
		   catchLabel27.setText("");
		   catchLabel28.setText("");
	   }
   }
   class resetButtonHandler15 implements EventHandler<ActionEvent>
   {
	   @Override
	   public void handle(ActionEvent event)
	   {
		   // Reset the textbox
		   TextField15.clear();
		   resultLabel29.setText("");
		   resultLabel30.setText("");
		   catchLabel29.setText("");
		   catchLabel30.setText("");
	   }
   }
}