package co.edu.unisabana.group1.builder;

import co.edu.unisabana.group1.model.Car;

public class CarCreator implements ICreator{

    private Car car;

    public CarCreator() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void buildEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void buildColor(String color) {
        this.car.setColor(color);
    }

    @Override
    public void buildTire(String tire) {
        this.car.setTire(tire);
    }

    @Override
    public void buildSoundSystem(String soundSystem) {
        this.car.setSoundSystem(soundSystem);
    }

    @Override
    public void buildAccessory(String accessory) {
        this.car.setAccessory(accessory);
    }

    @Override
    public void buildInteriorMaterial(String interiorMaterial) {
        this.car.setInteriorMaterial(interiorMaterial);
    }

    @Override
    public void buildHasNavigationSystem(boolean hasNavigationSystem) {
        this.car.setHasNavigationSystem(hasNavigationSystem);
    }

    @Override
    public void buildHasSunroof(boolean hasSunroof) {
        this.car.setHasSunroof(hasSunroof);
    }

    @Override
    public void buildDescription(String description) {
        this.car.setDescription(description);
    }

    public Car getResultCar() {
        Car result = this.car;
        this.reset();
        return result;
    }
}
