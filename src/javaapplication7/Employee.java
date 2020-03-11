package javaapplication7;

/**
 *This is superclass
 * @author Vahid Ghaedsharaf
 */
public  class Employee{
    String name;
    float wage;
    float numHours;

    Employee(String name, float wage, float numHours){
        this.name = name;
        this.wage = wage;
        this.numHours = numHours;
    }
 public void calculatePay(){
    float salary;
    salary =numHours * wage;
    System.out.println(name + " pay cheque: "  +salary);
 }
}
