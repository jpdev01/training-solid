import calculator.Calculator;
import employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class simulation {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Carlos", "12323", 1000f, 50f, 100f));

        for (Employee e : list)
        {
            Float salarioLiquido = new Calculator().salarioFinal(e);
            System.out.println(salarioLiquido);
        }

    }
}
