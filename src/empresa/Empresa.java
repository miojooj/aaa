package empresa;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    Cargo c = new Cargo ();
    Funcionario f = new Funcionario();
        System.out.println("insira 3 cargos para depois adcionar a um funcionario");
        System.out.println("insira o primeiro cargo");
        c.setCargo1(in.nextInt());
        System.out.println("insira o segundo cargo");
        c.setCargo1(in.nextInt());
        System.out.println("insira o terceiro cargo");
        c.setCargo1(in.nextInt());
        System.out.println("\nInforme os dados do funcionario");
        System.out.println("\ninsira o cargo, de acordo com os cargos criados");
        c.setNumcargo(in.nextInt());          
        System.out.println("Insira o valor da hora trabalhada");
        c.setValht(in.nextDouble());
        System.out.println("insira a quantidade de horas trabalhadas");
        f.setQhtb(in.nextDouble());
        System.out.println("seu sexo");
        f.setSexo(in.next());
        f.setSln(c.getValht(), f.getQhtb());
        f.setSf(f.sln,f.value);
        System.out.println("salario final do funcionario " + f.getSf());
    }
}