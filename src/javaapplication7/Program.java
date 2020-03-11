package javaapplication7;

/**
 * This is Main class to implement the program
 * @author Vahid Ghaedsharaf
 */
public class Program {
    public static void main(String[] args) {
        Employee employee = new Employee("Ali", 50.0f, 14.0f);
        Employee manager = new Manager("Todd", 50.0f, 14.0f, 20.0f, 20.0f);
        Employee sales = new SalesAssociate("Max", 50.0f, 14.0f, 20.0f);
        
        employee.calculatePay();
        manager.calculatePay();
        sales.calculatePay();
    }
}
