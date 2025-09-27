package co.edu.unisabana.group1;

import co.edu.unisabana.group1.builder.CarCreator;
import co.edu.unisabana.group1.director.Director;
import co.edu.unisabana.group1.model.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        CarCreator carCreator = new CarCreator();

        director.constructBasicCar(carCreator);
        Car basicCar = carCreator.getResultCar();
        System.out.println("Se creo el siguiente carro basico: " + basicCar);

        director.constructSportsCar(carCreator);
        Car sportsCar = carCreator.getResultCar();
        System.out.println("Se creo el siguiente carro deportivo: " + sportsCar);

        director.constructFamilyCar(carCreator);
        Car familyCar = carCreator.getResultCar();
        System.out.println("Se creo el siguiente carro familiar: " + familyCar);
    }
}
