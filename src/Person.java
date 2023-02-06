public class Person {
    private  String firstName;
    private String lastName;
    private Country [] country;
    private int age;
    private String profession;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Country[] getCountry() {
        return country;
    }

    public void setCountry(Country[] country) {
        this.country = country;
    }

    public void setAge(int age){
        this.age = age;
    }public int getAge(){
        return age;
    }
    public void setProfession(String profession){
        this.profession= profession;
    }public String getProfession(){
        return profession;
    }


}
