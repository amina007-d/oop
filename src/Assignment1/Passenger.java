package Assignment1;

public class Passenger {

    private String name;
    private int age;
    private String number;

    public Passenger(String name, int age, String number) {
        setValues(name, age, number);
        System.out.println(getValues());
    }

    public void setValues(String name, int age, String number){
        this.name = name;
        this.age = age;
        this.number = number;

    }
    public String getValues(){
        String values = "Name: " + name + ", Age: " + age + ", Number: " + number +"\n";
        return values;
    }
}
