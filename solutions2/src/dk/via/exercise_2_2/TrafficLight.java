package dk.via.exercise_2_2;

public class TrafficLight {
    private State state;
    private final Lights lights;

    public TrafficLight() {
        this.lights = new Lights();
        this.state = new Red();
        lights.turnOn(Lights.RED);
    }

    void setState(State state) {
        this.state = state;
    }

    void printLights() {
        lights.printLights();
    }

    void turnOn(String... lights) {
        this.lights.turnOn(lights);
    }

    void turnOff(String... lights) {
        this.lights.turnOff(lights);
    }
}
