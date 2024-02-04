//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Bryan";
        employee.salary = 3652.45;
        System.out.println("O sálario líquido do funcionário " + employee.name + " é R$" + employee.netSalary());
    }
}