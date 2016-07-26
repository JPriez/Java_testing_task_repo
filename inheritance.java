public class User {
    int age;//field
    String firstName;//field
    String lastName;//field

    public User(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}


public class Student extends User{
    int group;

    public Student(int age, String firstName, String lastName, int group) {
        super(age, firstName, lastName);
        this.group = group;
    }

    boolean isMyGroup(int g){
        return g==group;
    }
}

public class Teacher extends User{
    int salary;
    
    public Teacher(int age, String firstName, String lastName, int group) {
        super(age, firstName, lastName);
        this.salary = salary;
    }
    boolean GetSalary(int s){
        return s==salary;
    }
}
