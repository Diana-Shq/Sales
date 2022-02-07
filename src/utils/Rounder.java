package utils;

public class Rounder {

    public static double round(double netIncome){
        double scale = Math.pow(10, 2);
        double result = Math.ceil(netIncome * scale) / scale;
        return result;
    }
    //создать статический метод округления значений
}
