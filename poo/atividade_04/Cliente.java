package atividade_04;

public class Cliente extends Pessoa{

    public Cliente(String nome, Data nascimento) {
        super(nome, nascimento);
    }

    private int codigo;

    @Override 
    public void imprimeDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nascimento: " + this.getNascimento());
        System.out.println("Código: " + this.getCodigo());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
