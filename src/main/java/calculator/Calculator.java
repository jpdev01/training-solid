package calculator;

import employee.Employee;
import employee.EmployeeInterface;

public class Calculator implements CalculatorInterface{
    @Override
    public Float salarioFinal(EmployeeInterface func) {
        Float salarioCalculado = func.getWorkedHours() * (func.getSalario() / func.getTotalHours());
        return salarioCalculado;
    }
}
