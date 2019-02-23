package Chapter5Section2;

import java.text.DecimalFormat;

public class Temperature {
    private float tempValue;
    private String scaleValue;
    DecimalFormat numberFormat = new DecimalFormat("##0.0");

    public Temperature(String value) {
        this.tempValue = 0;
        this.scaleValue = value;
    }

    public Temperature(float value) {
        this.tempValue = value;
        this.scaleValue = "C";
    }

    public Temperature(float fvalue, String svalue) {
        this.tempValue = fvalue;
        this.scaleValue = svalue;
    }

    public Temperature() {
        this.tempValue = 0;
        this.scaleValue = "C";
    }

    public double getFahrenheit(float temp) {

        return (9 * temp / 5 + 32);

    }

    public double getCelsius(float temp) {

        return (5 * (temp - 32) / 9);

    }

    public void setTempValue(float value) {
        this.tempValue = value;
    }

    public void setScaleValue(String value) {
        this.scaleValue = value;
    }

    public void setTempValue(float fvalue, String svalue) {
        this.tempValue = fvalue;
        this.scaleValue = svalue;
    }

    public void equal(float tempA, String tempAScale, float tempB, String tempBScale) {
        float newTempA;
        float newTempB;

        if(tempAScale.equals("F")) {
            newTempA = (float) getCelsius(tempA);
        } else {
            newTempA = tempA;
        }


        if(tempBScale.equals("F")) {
            newTempB = (float) getCelsius(tempB);
        } else {
            newTempB= tempB;
        }


        if (newTempA == newTempB){
            System.out.println("The temperatures are equal: " + numberFormat.format(newTempA )+ ", " + numberFormat.format(newTempB));
        }
        else {
            System.out.println("The temperatures are not equal: "+ numberFormat.format(newTempA )+ ", " + numberFormat.format(newTempB));
        }
    }

    public void greaterThan(float tempA, String tempAScale, float tempB, String tempBScale) {
        float newTempA;
        float newTempB;

        if(tempAScale.equals("C")) {
            newTempA = (float) getFahrenheit(tempA);
        } else{
            newTempA = tempA;
        }


        if(tempBScale.equals("C")) {
            newTempB = (float) getFahrenheit(tempB);
        } else{
            newTempB= tempB;
        }


        if (newTempA > newTempB){
            System.out.println("The value of temp A is greater than the value of temp B: " + numberFormat.format(newTempA )+ ", " + numberFormat.format(newTempB));
        }
        else{
            System.out.println("The value of temp A is not greater than the value of temp B: " + numberFormat.format(newTempA )+ ", " + numberFormat.format(newTempB));
        }
    }

    public void lessThan(float tempA, String tempAScale, float tempB, String tempBScale) {
        float newTempA;
        float newTempB;

        if(tempAScale.equals("C")) {
            newTempA = (float) getFahrenheit(tempA);
        } else{
            newTempA = tempA;
        }

        if(tempBScale.equals("C")) {
            newTempB = (float) getFahrenheit(tempB);
        } else{
            newTempB= tempB;
        }

        if (newTempA < newTempB){
            System.out.println("The value of temp A is less than the value of temp B: " +numberFormat.format(newTempA )+ ", " + numberFormat.format(newTempB));
        }
        else{
            System.out.println("The value of temp A is not less than the value of temp B: " +numberFormat.format(newTempA )+ ", " + numberFormat.format(newTempB));
        }
    }

    public String toString(){
        return ("Temperature A is " + numberFormat.format(tempValue) + "\nTemperature B is  " + numberFormat.format(tempValue));
    }




}
