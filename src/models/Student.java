
package models;

public class Student extends Person{
    String parentPhoneNumber;

    public Student(String parentPhoneNumber, String name, int age) {
        super(name, age);
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public Student(){}

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    @Override
    public String getData() {
        return this.getName()+" "+this.getAge() +" " + this.parentPhoneNumber;
    }
    
    
}
