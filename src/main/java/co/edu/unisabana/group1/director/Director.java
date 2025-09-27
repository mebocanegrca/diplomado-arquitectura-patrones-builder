package co.edu.unisabana.group1.director;

import co.edu.unisabana.group1.builder.ICreator;

public class Director {

    private ICreator creator;

    public Director() {
    }

    public void constructSportsCar(ICreator creator) {
        creator.reset();
        creator.buildEngine("V8");
        creator.buildColor("Rojo");
        creator.buildTire("Avanzadas");
        creator.buildSoundSystem("Basico");
        creator.buildAccessory("Led");
        creator.buildInteriorMaterial("Cuero");
        creator.buildHasNavigationSystem(true);
        creator.buildHasSunroof(true);
        creator.buildDescription("Ford Mustang");
    }

    public void constructBasicCar(ICreator creator) {
        creator.reset();
        creator.buildEngine("I4");
        creator.buildColor("Blanco");
        creator.buildTire("Estandar");
        creator.buildSoundSystem("Estandar");
        creator.buildAccessory("Ninguno");
        creator.buildInteriorMaterial("Tela");
        creator.buildHasNavigationSystem(false);
        creator.buildHasSunroof(false);
        creator.buildDescription("Hyundai Accent");
    }

    public void constructFamilyCar(ICreator creator) {
        creator.reset();
        creator.buildEngine("V6");
        creator.buildColor("Azul");
        creator.buildTire("Todo Terreno");
        creator.buildSoundSystem("Avanzado");
        creator.buildAccessory("Porta Equipaje");
        creator.buildInteriorMaterial("Cuero y Tela");
        creator.buildHasNavigationSystem(true);
        creator.buildHasSunroof(false);
        creator.buildDescription("Toyota Highlander");
    }
}
