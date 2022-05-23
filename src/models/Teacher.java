
package models;

public class Teacher extends Person{
    float salary;

    public Teacher(float salary, String name, int age) {
        super(name, age);
        this.salary = salary;
    }

    public Teacher() {}

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public String getData() {
        return this.getName()+" "+this.getAge() +" " + this.salary;
    }
   
    
    
}
