package co.edu.unisabana.group1.model;

public class Car {

    private String engine;
    private String color;
    private String tire;
    private String soundSystem;
    private String accessory;
    private String interiorMaterial;
    private boolean hasNavigationSystem;
    private boolean hasSunroof;
    private String description;

    public void setEngine(String engine) {this.engine = engine;}
    public void setColor(String color) {this.color = color;}
    public void setTire(String tire) {this.tire = tire;}
    public void setSoundSystem(String soundSystem) {this.soundSystem = soundSystem;}
    public void setAccessory(String accessory) {this.accessory = accessory;}
    public void setInteriorMaterial(String interiorMaterial) {this.interiorMaterial = interiorMaterial;}
    public void setHasNavigationSystem(boolean hasNavigationSystem) {this.hasNavigationSystem = hasNavigationSystem;}
    public void setHasSunroof(boolean hasSunroof) {this.hasSunroof = hasSunroof;}
    public void setDescription(String description) {this.description = description;}

    @Override
    public String toString() {
        return "Car{" +
                "Descripcion='" + description + '\'' +
                ", Motor='" + engine + '\'' +
                ", Color='" + color + '\'' +
                ", Llantas='" + tire + '\'' +
                ", SistemaSonido='" + soundSystem + '\'' +
                ", Accesorio='" + accessory + '\'' +
                ", MaterialInterior='" + interiorMaterial + '\'' +
                ", SistemaNavegacion=" + hasNavigationSystem +
                ", TechoSolar?=" + hasSunroof +
                '}';
    }

}
