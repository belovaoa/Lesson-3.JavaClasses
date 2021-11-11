package gmail.salokin1991;

public class WorkSpace {

    public static void main(String[] args) {

        String batmanName = "Batman";
        String jamesName = "James Bond";
        String gothamName = "Gotham";
        String londonName = "London";
        String batMobileName = "Batmobile";
        String astonMartinName = "Aston Martin DB5";
        char gothamFlag = '&';
        char londonFlag = '#';

        Character batMan = new Character(batmanName, gothamName, batMobileName, gothamFlag, 40, 185, 85,
                "Batgun");
        Character jamesBond = new Character(jamesName, londonName, astonMartinName, londonFlag, 35, 189,
                79, "Walther PPK");

        Vehicle batMobile = new Vehicle(batMobileName, batmanName, gothamFlag, 100500, 1989,
                "Black", 69, false);
        Vehicle astonMartin = new Vehicle(astonMartinName, jamesName, londonFlag, 241, 1964,
                "Silver", 0, true);

        City gotham = new City(gothamName, batmanName, gothamFlag, "DC universe", 8405837,
                5924, 1215, false, false);
        City london = new City(londonName, jamesName, londonFlag, "England", 8961989,
                0, 1572, true, true);

        System.out.println("About " + batMan.name + ":");
        batMan.sayCharacterName();
        batMan.sayCharacterCity();
        batMan.sayCharacterVehicle();
        batMan.sayCharacterTattoo();
        batMan.sayCharacterAge();
        batMan.sayCharacterHeight();
        batMan.sayCharacterWeight();
        batMan.sayCaracterWeapon();

        System.out.println("About " + london.cityName + ":");
        london.sayCityName();
        london.sayCityResidentName();
        london.sayCityFlag();
        london.sayCityPopulation();
        london.sayCityNumberOfSkyscrapers();
        london.sayCityArea();
        london.sayCityCapital();
        london.sayCityReality();
        london.sayCityPopulationDensity();
        london.changeCityPopulationIfOneIsBorn();
        london.changeCityPopulationIfOneIsBurn();

        System.out.println("About " + astonMartin.brand + ":");
        astonMartin.sayVehicleBrand();
        astonMartin.sayVehicleOwner();
        astonMartin.sayVehicleEmblem();
        astonMartin.sayVexicleMaxSpeed();
        astonMartin.sayVehicleProductionYear();
        astonMartin.sayVehicleColor();
        astonMartin.sayVehicleFuelConsumption();
        astonMartin.sayVehicleInsurance();

        System.out.println("Too lazy to talk about " + batMobile.brand + ", " + gotham.cityName + " and " +
                jamesBond.name + "...");
    }
}