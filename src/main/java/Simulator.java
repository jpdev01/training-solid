import calculator.Calculator;
import employee.Employee;
import employee.EmployeeInterface;
import employee.EmployeeSenior;

import java.util.ArrayList;
import java.util.List;

public class Simulator {

    public static void main(String[] args) {
        List<EmployeeInterface> list = new ArrayList<>();
        list.add(new Employee("Carlos", "12323", 1000f, 50f, 100f));
        list.add(new EmployeeSenior("Pedro (Senior) ", "12323", 1000f, 50f, 100f));

        for (EmployeeInterface e : list)
        {
            Float salarioLiquido = e.getCalculator().salarioFinal(e);
            System.out.println("O funcionário " + e.getName() + " receberá R$" + salarioLiquido + ".");
        }

    }
}
