package empresa;


public class Empresa {

    public static void main(String[] args) {
    Cargo c = new Cargo ();
    Funcionario f = new Funcionario();
        c.setCargo1(1);
        c.setNumcargo(15);          
        c.setValht(120);
        f.setQhtb(150);
        f.setSexo("f");
        f.setSln(c.getValht(), f.getQhtb());
        f.setSf(f.sln, f.getSexo());
        System.out.println("salario final do funcionario " + f.getSf() + " Para o sexo " + f.sexo);
    }
}