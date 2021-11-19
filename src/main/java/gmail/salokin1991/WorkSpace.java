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

        Character batMan = new Character(batmanName, gothamName, batMobileName, gothamFlag, "Batgun");
        Character jamesBond = new Character(jamesName, londonName, astonMartinName, londonFlag, "Walther PPK");

        Character.NumericalInformation batManNum = new Character.NumericalInformation(40, 185, 85);
        Character.NumericalInformation jamesBondNum = new Character.NumericalInformation(35, 189, 79);

        Vehicle batMobile = new Vehicle(batMobileName, batmanName, gothamFlag, 100500, 1989,
                "Black", 69, false);
        Vehicle astonMartin = new Vehicle(astonMartinName, jamesName, londonFlag, 241, 1964,
                "Silver", 0, true);

        City gotham = new City(gothamName, batmanName, gothamFlag, "DC universe", false, false);
        City london = new City(londonName, jamesName, londonFlag, "England", true, true);

        City.Statistic londonStatistic = new City.Statistic(8961989, 0,
                1572);
        City.Statistic gothamStatistic = new City.Statistic(8961989,
                0, 1572);

        System.out.println(" ");
        System.out.println("About " + batMan.name + ":");
        batMan.sayCharacterName();
        batMan.sayCharacterCity();
        batMan.sayCharacterVehicle();
        batMan.sayCharacterTattoo();
        batManNum.sayCharacterAge();
        batManNum.sayCharacterHeight();
        batManNum.sayCharacterWeight();
        batMan.sayCaracterWeapon();

        System.out.println(" ");
        System.out.println("About " + london.cityName + ":");
        london.sayCityName();
        london.sayCityResidentName();
        london.sayCityFlag();
        londonStatistic.sayCityPopulation();
        londonStatistic.sayCityNumberOfSkyscrapers();
        londonStatistic.sayCityArea();
        london.sayCityCapital();
        london.sayCityReality();
        londonStatistic.sayCityPopulationDensity();
        londonStatistic.changeCityPopulationIfOneIsBorn();
        londonStatistic.changeCityPopulationIfOneIsBurn();
        gothamStatistic.changeCityPopulationIfOneIsBurn();

        System.out.println(" ");
        System.out.println("About " + astonMartin.brand + ":");
        astonMartin.sayVehicleBrand();
        astonMartin.sayVehicleOwner();
        astonMartin.sayVehicleEmblem();
        astonMartin.sayVexicleMaxSpeed();
        astonMartin.sayVehicleProductionYear();
        astonMartin.sayVehicleColor();
        astonMartin.sayVehicleFuelConsumption();
        astonMartin.sayVehicleInsurance();

        System.out.println(" ");
        System.out.println("Too lazy to talk about " + batMobile.brand + ", " + gotham.cityName + " and " +
                jamesBond.name + "..." + "I can only say that he is " + jamesBondNum.age + " years old");

        GetterSetterClass someGetSet = new GetterSetterClass();

        someGetSet.someChar = '%';
        someGetSet.someInt = 4;
        someGetSet.someString = "someText";

        System.out.println(" ");
        System.out.println("Assigned values in GetterSetterClass:");
        System.out.println("someChar: " + someGetSet.getSomeChar());
        System.out.println("someInt: " + someGetSet.getSomeInt());
        System.out.println("someString: " + someGetSet.getSomeString());

        someGetSet.setSomeChar('*');
        someGetSet.setSomeInt(69);
        someGetSet.setSomeString("anotherSomeText");

        System.out.println(" ");
        System.out.println("Assigned new values in GetterSetterClass:");
        System.out.println("someChar: " + someGetSet.getSomeChar());
        System.out.println("someInt: " + someGetSet.getSomeInt());
        System.out.println("someString: " + someGetSet.getSomeString());
    }
}