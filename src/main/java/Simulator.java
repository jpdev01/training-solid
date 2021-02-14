import calculator.Calculator;
import employee.Employee;
import employee.EmployeeInterface;
import employee.EmployeePleno;
import employee.EmployeeSenior;
import printer.Printer;
import printer.SuperPrinter;

import java.util.ArrayList;
import java.util.List;

public class Simulator {

    public static void main(String[] args) {
        simulatorEmployee();
        simulatorPrinter();
    }

    public static void simulatorEmployee()
    {
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

    public static void simulatorPrinter()
    {
        Printer hp = new Printer();
        hp.print("Novo código penal 2021");

        SuperPrinter epson = new SuperPrinter();
        epson.print("Imprimindo todas as matérias para o curso de dev 2021");
        epson.printDuplex("Conteúdos de todos os semestres");
        epson.scan("Conteúdos antigos");
        epson.sendFax("Comunicado aos professores");

    }
}
