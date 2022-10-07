package com.donner;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMICalculatorController {

    @FXML
    TextField weightText;

    @FXML
    TextField heightText;

    @FXML
    TextField ageText;

    @FXML
    TextField resultText;



    @FXML
    protected void onCalculateButtonClicked(){
        int weight = Integer.parseInt(weightText.getText());
        int height = Integer.parseInt(heightText.getText());
        //int age = Integer.parseInt(ageText.getText());

        double bmi = weight / Math.pow((double)height/100,2);

        resultText.setText(Double.toString((double)Math.round(bmi*100)/100));
    }



}
