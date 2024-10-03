package atividade_04;

public class Gerente extends Funcionario{
    
    private String area;

    public Gerente(String nome, Data nascimento) {
        super(nome, nascimento);
    }

    
    @Override
    public float calculaImposto(float salario){
        return salario * 5/100;
    }

    @Override
    public void imprimeDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nascimento: " + this.getNascimento());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Área: " + this.getArea());
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
