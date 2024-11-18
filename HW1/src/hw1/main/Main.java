package hw1.main;

import hw1.logics.*;
import hw1.views.Conole;
import java.util.ArrayList;
import hw1.decorators.Decorator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> data = Conole.userData();
        double result = Logic.indexCount(data.get(0), data.get(1));
        Decorator.decorate(result);
     }     
}
