package HW7;

public class Person {
    private String Name;
    private String Male;
    private int age;

    public String getName(){
        if(Male == "Male"){
            return "Mr." + Name;
        } else {
            return "Mrs." + Name;
        }
    }

    public Person(String name, String male, int age) {
        this.Name = name;
        this.Male = male;
        this.age = age;
    }
}


