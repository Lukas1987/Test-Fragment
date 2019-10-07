package sk.itsovy.mati;

import javax.swing.*;
import java.awt.geom.Area;

public class Calculator {
    private String name;
    private boolean power;

    private Calculator(String name) {
        this.name = name;
        power=false;
    }
    public boolean isPower() {
        return power;
    }
    public void turnOn() {
        power = true;
    }
    public void turnOff() {
        power = false;
    }
    public String getName() {
        return name;

    }
    public int add(int a, int b) {
        if (isPower()) {
            return a + b;
        }
        else
            return 0;
    }
    public int calculateSquareArea(int a) {
        if (isPower())
            return a * a;
        else
            return 0;
    }
    public double convertCmToInch(double value) {
        if (isPower())
            return value / 0.393;
        else
            return 0;
    }
    public double convertInchToCm(double value) {
        if (isPower())
            return value * 0.393;
        else
            return 0;
    }
    public void toggle() {
        power=!power;
    }
    public String convertDecimalToBinary(int value) {
        if (isPower())
            return Integer.toBinaryString(value);
        else
            return 0;
    }
    public double calcRectDiagonal(int a, int b){
      if (isPower())
            return Math.sqrt(Math.pow(a, 2) + b * b);
        else
            return 0;

    }

    public double calcCirecleArea(double radius) {
        if (isPower())
            return Math.PI * radius * radius;
        else
            return 0;
    }

}
