package calculator;

import employee.EmployeeInterface;

public class CalculatorSenior implements CalculatorInterface{
    @Override
    public Float salarioFinal(EmployeeInterface func) {
        Float salarioLiquido = func.getWorkedHours() * (func.getSalario() / func.getTotalHours());
        return salarioLiquido;
    }
}
