package employee;

import calculator.CalculatorInterface;

public interface EmployeeInterface {

    public String getName();

    public void setName(String name);

    public Float getSalario();

    public void setSalario(Float salario);

    public String getAccount();

    public void setAccount(String account);

    public Float getWorkedHours();

    public void setWorkedHours(Float workedHours);

    public Float getTotalHours();

    public void setTotalHours(Float totalHours);

    public CalculatorInterface getCalculator();

    public void setCalculator(CalculatorInterface calc);

    public String getType();


}
