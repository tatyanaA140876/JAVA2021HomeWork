package lesson6;

public class Animal implements AnimalInterface {
    private double animalDistanceRun, animalDistanceJump, animalDistanceSwim;

    Animal(double animalDistanceRun, double animalDistanceJump, double animalDistanceSwim) {
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceJump = animalDistanceJump;
        this.animalDistanceSwim = animalDistanceSwim;
    }

    @Override
    public boolean run(double value) {
        return animalDistanceRun > value;
    }

    @Override
    public boolean jump(double value) {
        return animalDistanceJump > value;
    }

    @Override
    public boolean swim(double value) {
        return animalDistanceSwim > value;
    }

    double getAnimalDistanceRun() {
        return animalDistanceRun;
    }

    double getAnimalDistanceJump() {
        return animalDistanceJump;
    }

    double getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }
}