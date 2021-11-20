package gmail.salokin1991;

public class Character {

    String name;
    String city;
    String vehicle;
    char tattoo;
    int age;
    int height;
    int weight;
    String weapon;


    public Character(String name, String city, String vehicle, char tattoo, int age, int height, int weight,
                     String weapon) {
        this.name = name;
        this.city = city;
        this.vehicle = vehicle;
        this.tattoo = tattoo;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.weapon = weapon;
    }


    public void sayCharacterName() {
        System.out.println(name);
    }

    public void sayCharacterCity() {
        System.out.println(city);
    }

    public void sayCharacterVehicle() {
        System.out.println(vehicle);
    }

    public void sayCharacterTattoo() {
        System.out.println(tattoo);
    }

    public void sayCharacterAge() {
        System.out.println(age);
    }

    public void sayCharacterHeight() {
        System.out.println(height);
    }

    public void sayCharacterWeight() {
        System.out.println(weight);
    }

    public void sayCaracterWeapon() {
        System.out.println(weapon);
    }
}