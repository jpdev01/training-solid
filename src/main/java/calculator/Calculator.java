package calculator;

import employee.Employee;

public class Calculator implements CalculatorInterface{
    @Override
    public Float salarioFinal(Employee func) {
        Float salarioCalculado = func.getWorkedHours() * (func.getSalario() / func.getTotalHours());
        return salarioCalculado;
    }
}
