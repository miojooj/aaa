
package empresa;
    
public class Funcionario {
    int códcargo;
    String sexo;
    double qhtb;
    double sf;
    Cargo Cargo;
    double sln;
    int value;

   public void setSln (double valht, double qhtb) {
        this.sln = valht*qhtb;
    }

    public int getCódcargo() {
        return códcargo;
    }

    public void setCódcargo(int códcargo) {
        this.códcargo = códcargo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getQhtb() {
        return qhtb;
    }

    public void setQhtb(double qhtb) {
        this.qhtb = qhtb;
    }

    public double getSf() {
        return sf;
    }

    public void setSf(double sln, int value) {
       try { 
           switch(sexo){
            case "f":
                this.sf =+ sln+(sln*20)/100;
                break;
            case "m":
                this.sf = sln;
                break;
            default:
                System.out.println("ERRO: Insira um sexo válido");
                break;
        }
       }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
            

    }
    
    
}

