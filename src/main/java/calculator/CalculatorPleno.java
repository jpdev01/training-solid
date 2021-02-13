package calculator;

import employee.EmployeeInterface;

public class CalculatorPleno implements CalculatorInterface{
    @Override
    public Float salarioFinal(EmployeeInterface func) {
        Float salarioLiquido = func.getWorkedHours() * (func.getSalario() / func.getTotalHours());

        // logica de pleno (acrescimo de 10%)
        salarioLiquido *= 1.1f;
        return salarioLiquido;
    }
}
