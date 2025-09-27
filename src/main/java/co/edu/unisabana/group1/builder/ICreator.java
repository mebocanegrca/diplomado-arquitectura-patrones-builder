package co.edu.unisabana.group1.builder;

import co.edu.unisabana.group1.model.Car;

public interface ICreator {

    void reset();
    void buildEngine(String engine);
    void buildColor(String color);
    void buildTire(String tire);
    void buildSoundSystem(String soundSystem);
    void buildAccessory(String accessory);
    void buildInteriorMaterial(String interiorMaterial);
    void buildHasNavigationSystem(boolean hasNavigationSystem);
    void buildHasSunroof(boolean hasSunroof);
    void buildDescription(String description);

}
