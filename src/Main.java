public class Main {
    public static void main(String[] args) {
        System.out.println("Country : Nation : Valute : PopulationSize");
        Country country1 = new Country();
        country1.setCountry("Germany");
        country1.setNation("German");
        country1.setValute("EUR");
        country1.setPopulationSize(84100000);


        Country country2 = new Country();
        country2.setCountry("Kyrgyzstan");
        country2.setNation("Kyrgyz");
        country2.setValute("SOM");
        country2.setPopulationSize(7000000);


        Country country3 = new Country();
        country3.setCountry("Turkey");
        country3.setNation("Turk");
        country3.setValute("LIRA");
        country3.setPopulationSize(84680273);




        Country[] countries = {country1, country2, country3};
        for (Country c : countries) {
            System.out.println(c.getCountry() +":"+ c.getNation()+" : "+c.getValute()+" : "+c.getPopulationSize());
        }
        System.out.println("-------------------------------");

        System.out.println("City  : street");
        City city1 = new City();
        city1.setCity("Berlin");
        city1.setStreet("Karl-Marks");


        City city2 = new City();
        city2.setCity("Bishkek");
        city2.setStreet("Isa-Ahunbaev");


        City city3 = new City();
        city3.setCity("Antalya");
        city3.setStreet("Sharampol");
        City[] cities = {city1,city2,city3};
        for (City a:cities) {
            System.out.println(a.getCity() +":"+a.getStreet());

        }
        System.out.println("-------------------------------");
        System.out.println("Addreess");

        Address address1 = new Address();
        address1.setAddress("Karl-Marks-124");

        Address address2 = new Address();
        address2.setAddress("Kara-Shoro-5");

        Address address3 = new Address();
        address3.setAddress("Sharampol-52");
        Address[] addresses = {address1,address2,address3};
        for (Address d:addresses) {
            System.out.println(d.getAddress());
        }
        System.out.println("-------------------------------");
        System.out.println("FirstName : LastName : Age : Professin");

        Person person1 = new Person();
        person1.setFirstName("Akjyldyz");
        person1.setLastName("Ismailova");
        person1.setAge(37);
        person1.setProfession("Financier");


        Person person2 = new Person();
        person2.setFirstName("Aizat");
        person2.setLastName("Duisheeva");
        person2.setAge(20);
        person2.setProfession("programmer");


        Person person3 = new Person();
        person3.setFirstName("Altynbek");
        person3.setLastName("Ernisov");
        person3.setAge(19);
        person3.setProfession("cook");

        Person[] perssons = {person1,person2,person3};
        for (Person k: perssons) {
            System.out.println(k.getFirstName()+"   "+k.getLastName()+" :  "+k.getAge()+"  :  "+k.getProfession());

        }


    }
}