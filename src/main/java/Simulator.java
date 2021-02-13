import calculator.Calculator;
import employee.Employee;
import employee.EmployeeInterface;
import employee.EmployeePleno;
import employee.EmployeeSenior;

import java.util.ArrayList;
import java.util.List;

public class Simulator {

    public static void main(String[] args) {
        List<EmployeeInterface> list = new ArrayList<>();
        list.add(new Employee("Carlos", "12323", 1000f, 50f, 100f));
        list.add(new EmployeeSenior("Pedro ", "12323", 1000f, 50f, 100f));
        list.add(new EmployeePleno("Paulo", "12323", 1000f, 50f, 100f));
        for (EmployeeInterface e : list)
        {
            Float salarioLiquido = e.getCalculator().salarioFinal(e);
            System.out.println("\nFuncionário: " + e.getName() + "\nCargo: " + e.getType() + "\nSalário Líquido atual: R$" + salarioLiquido + ".");
        }

    }
}
