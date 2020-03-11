package javaapplication7;

/**
 *This is subclass
 *
 * @author Vahid Ghaedsharaf
 */
public class Manager extends Employee{
    float bonus;
    float vacPay;
    Manager(String name, float wage, float numHours, float bonus, float vacPay){
        super(name, wage, numHours);
        this.bonus = bonus;
        this.vacPay = vacPay;
    }
    public void calculatePay(){
        float salary;
        salary = numHours * wage + bonus + vacPay;
        System.out.println(name + " pay cheque: "  +salary);
 }
}
