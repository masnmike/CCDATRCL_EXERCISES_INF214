public class Weapon {
    // Weapon attributes
    String name;
    int damage;
    double weight;
    String rarity;
    String description;

    // Weapon method
    public void weaponDescription() {
        System.out.println("This is the " + name + ", it hurts as much as " + damage + 
        " damage, it's as heavy as " + weight + " kilos and its rarity is " + rarity + "!");
    }
}
