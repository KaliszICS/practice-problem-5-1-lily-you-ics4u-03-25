public class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}