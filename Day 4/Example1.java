
class Thermostat {

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int newTemp) {
        if (newTemp >= 10 && newTemp <= 35) {
            this.temperature = newTemp;
            System.out.println("Temperature set to: " + newTemp + "°C");
        } else {
            System.out.println("Error: Temperature out of safe range!");
        }
    }
}

public class Example1 {

    public static void main(String[] args) {
        Thermostat myNest = new Thermostat();

        myNest.setTemperature(22);
        myNest.setTemperature(100);
        System.out.println("Current reading: " + myNest.getTemperature() + "°C");
    }
}
