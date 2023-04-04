/*
* File: ButtonPanel.java
* Author: Kovács Attila
* Copyright: 2023.04.04,Kovács Attila
* Group: Szoft 1
* Date: 2021-09-03
* Github: https://github.com/janos/
* Licenc: GNU GPL
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class App extends Application{
    TextField asideField;
    TextField areaField;
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        VBox vbox1 = new VBox();
        HBox titlehbox = new HBox();
        HBox asidehbox = new HBox();
        HBox buttonbox = new HBox();
        HBox areabox = new HBox();
        HBox abouthbox = new HBox();
        //fejléc
        Label titlelabel=new Label("Kocka térfogata");
        titlehbox.getChildren().add(titlelabel);
        titlehbox.setPadding(new Insets(10,10,10,10));
        titlehbox.setAlignment(Pos.CENTER);

        //a oldal bekérés
        Label asideLabel=new Label("Adja meg a lapátlót:");
        asideField = new TextField();
        asidehbox.getChildren().addAll(asideLabel, asideField);
        asidehbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(asideLabel, new Insets(0,10,0,10));
        HBox.setMargin(asideField, new Insets(0,10,0,10));
        asideLabel.setMinWidth(100);
        asideLabel.setAlignment(Pos.CENTER_RIGHT);

    

        //kalkulátor
        Button calcButton = new Button("számít");
        buttonbox.getChildren().add(calcButton);
        buttonbox.setAlignment(Pos.CENTER);
        buttonbox.setPadding(new Insets(10,10,10,10));
        calcButton.setOnAction(e -> {
            startCalcarea();
        });

        
        Label areLabel=new Label("Térfogat");
        areaField=new TextField();
        areabox.getChildren().addAll(areLabel,areaField);
        areabox.setPadding(new Insets(10,10,10,10));
       
        

        //névjegy
        Label aboutLabel=new Label("Kovács Attila , szoft 1-n, 2023-04-04");
        abouthbox.getChildren().add(aboutLabel);
       
       
        
        
        vbox1.getChildren().add(titlehbox);
        vbox1.getChildren().add(asidehbox);
        vbox1.getChildren().add(buttonbox);
        vbox1.getChildren().add(areabox);
        vbox1.getChildren().add(abouthbox);

      
        
        
     


        Scene scene = new Scene(vbox1, 400,300);
        stage.setScene(scene);
        stage.show();

       
        
        
    }
    private void startCalcarea(){
            
            String asideString=asideField.getText();
            double aside=Double.parseDouble(asideString);
            Double area=calcArea(aside);
            areaField.setText(area.toString());
    }
    private double calcArea(double aside){
        double area= Math.pow(aside, 3)/ Math.sqrt(8);
        return area;
    }
}

