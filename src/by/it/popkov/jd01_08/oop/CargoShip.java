package by.it.popkov.jd01_08.oop;

abstract class CargoShip implements Ship {
    private String name;

    CargoShip(String name) {
        this.name = name;
    }

    @Override
    public void sail() {
        System.out.println("Sail");
    }

    @Override
    public void moor() {
        System.out.println("Moor");
    }

    @Override
    public void dropAnchor() {
        System.out.println("Drop Anchor");
    }

    @Override
    public void sos() {
        System.out.println("SOS");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void load() {
        System.out.println("Load");
    }

    @Override
    public void unload() {
        System.out.println("Unload");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
