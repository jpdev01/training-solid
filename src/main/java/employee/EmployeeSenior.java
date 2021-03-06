package employee;

import calculator.Calculator;
import calculator.CalculatorInterface;
import calculator.CalculatorSenior;

public class EmployeeSenior implements EmployeeInterface{

    private String name;
    private String account;
    private Float salario;
    private Float workedHours;
    private Float totalHours;
    private CalculatorInterface calc;

    public EmployeeSenior() {}

    public EmployeeSenior(String name, String account, Float salario, Float workedHours, Float totalHours)
    {
        this.setName(name);
        this.setAccount(account);
        this.setSalario(salario);
        this.setWorkedHours(workedHours);
        this.setTotalHours(totalHours);
        this.setCalculator(new CalculatorSenior());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Float getSalario() {
        return salario;
    }

    @Override
    public void setSalario(Float salario) {
        this.salario = salario;
    }

    @Override
    public String getAccount() {
        return account;
    }

    @Override
    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public Float getWorkedHours() {
        return this.workedHours;
    }

    @Override
    public void setWorkedHours(Float workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public Float getTotalHours() {
        return totalHours;
    }

    @Override
    public void setTotalHours(Float totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public CalculatorInterface getCalculator() {
        return calc;
    }

    @Override
    public void setCalculator(CalculatorInterface calc) {
        this.calc = calc;
    }

    @Override
    public String getType()
    {
        return "Sênior";
    }
}
