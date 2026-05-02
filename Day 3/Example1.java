class Hero{
    public String name;
    private int health;
    protected String power;
    String secretIdentity;

    public Hero(String name, int health, String power, String secret) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.secretIdentity = secret;
    }

    public void displayStats() {
        System.out.println("Hero: " + name);
        System.out.println("Health: " + health); 
        System.out.println("Power: " + power);
    }
}

public class Example1{
    public static void main(String[] args) {
        Hero myHero = new Hero("Ironman", 100, "Suit", "Tony Stark");

        System.out.println("Accessing "+ myHero.name);
        myHero.displayStats();
    }
}
