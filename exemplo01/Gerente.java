package exemplo01;

public class Gerente extends Funcionario {
    private int nfuncionario;

    public Gerente(String nome, double salario, int nfuncionario) {
        super(nome, salario); //chama o construtor da Superclasse (Funcionario)
        this.nfuncionario = nfuncionario;
    }

    public int getNfuncionario(){
        return nfuncionario;
    }

    public void setNfuncionario(int nfuncionario){
        if (nfuncionario >= 0) {
            this.nfuncionario = nfuncionario;
        }
    }
}