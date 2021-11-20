package gmail.salokin1991;

public class City {

    static String message1 = "This is classified information, maybe someone knows. Or not. Or I'm just bad at";

    String cityName;
    String citizenName;
    char flag;
    String country;
//    int population;
//    int numberOfHighRiseBuildings;
//    int areaOfCity;
    boolean capitalOfCountry;
    boolean reality;
    Statistic statistic;

    static class Statistic {

        int population;
        int numberOfHighRiseBuildings;
        int areaOfCity;

        public Statistic(int population, int numberOfHighRiseBuildings, int areaOfCity) {

            this.population = population;
            this.numberOfHighRiseBuildings = numberOfHighRiseBuildings;
            this.areaOfCity = areaOfCity;

        }

        public void sayCityPopulation() {
            System.out.println(population);
        }

        public void sayCityNumberOfSkyscrapers() {
            if (numberOfHighRiseBuildings == 0) {
                System.out.println(message1 +
                        " Googling...");
            } else {
                System.out.println(numberOfHighRiseBuildings);
            }
        }

        public void sayCityArea() {
            System.out.println(areaOfCity + " sq.km.");
        }

        public void sayCityPopulationDensity() {
            System.out.println(population / areaOfCity + " people/sq.km");
        }

        public void changeCityPopulationIfOneIsBorn() {
            population = population + 1;
        }

        public void changeCityPopulationIfOneIsBurn() {
            population = population - 1;
        }

    }

    public City(String cityName, String citizenName, char flag, String country,/* int population,
                int numberOfHighRiseBuildings, int areaOfCity,*/ boolean capitalOfCountry, boolean reality) {
        this.cityName = cityName;
        this.citizenName = citizenName;
        this.flag = flag;
        this.country = country;
//        this.population = population;
//        this.numberOfHighRiseBuildings = numberOfHighRiseBuildings;
//        this.areaOfCity = areaOfCity;
        this.capitalOfCountry = capitalOfCountry;
        this.reality = reality;

    }


    public void sayCityName() {
        System.out.println(cityName);
    }

    public void sayCityResidentName() {
        System.out.println(citizenName);
    }

    public void sayCityFlag() {
        System.out.println("[_" + flag + "_]");
    }

//    public void sayCityPopulation() {
//        System.out.println(population);
//    }

//    public void sayCityNumberOfSkyscrapers() {
//        if (numberOfHighRiseBuildings == 0) {
//            System.out.println(message1 +
//                    " Googling...");
//        } else {
//            System.out.println(numberOfHighRiseBuildings);
//        }
//    }

//    public void sayCityArea() {
//        System.out.println(areaOfCity + " sq.km.");
//    }

    public void sayCityCapital() {
        if (capitalOfCountry = true) {
            System.out.println("Yes, it is the capital of the country");
        } else {
            System.out.println("No, this is a completely ordinary city");
        }
    }

    public void sayCityReality() {
        System.out.println("It's " + reality);
    }

//    public void sayCityPopulationDensity() {
//        System.out.println(population / areaOfCity + " people/sq.km");
//    }
//
//    public void changeCityPopulationIfOneIsBorn() {
//        population = population + 1;
//    }
//
//    public void changeCityPopulationIfOneIsBurn() {
//        population = population - 1;
//    }
}