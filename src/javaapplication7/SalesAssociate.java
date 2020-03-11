package javaapplication7;

/**
 *This class +++Insert Description Here+++
 *
 * @author Vahid Ghaedsharaf
 */
public class SalesAssociate extends Employee{
    float vacPay;
    SalesAssociate(String name, float wage, float numHours, float vacPay){
        super(name, wage, numHours);
//        this.bonus = bonus;
        this.vacPay = vacPay;
    }
    public void calculatePay(){
        float salary;
        salary = numHours * wage + vacPay;
        System.out.println(name + " pay cheque: "  +salary);
 }
}
