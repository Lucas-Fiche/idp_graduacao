package atividade_04;

public class CadastroPessoas {
    private int qtdAtual;
    private Pessoa[] pessoas;
    
    public CadastroPessoas(int tamanho) {
        pessoas = new Pessoa[tamanho];
        qtdAtual = 0;
}

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void cadastraPessoa(Pessoa pess) {
        if (qtdAtual < pessoas.length) {
            pessoas[qtdAtual] = pess;
            qtdAtual++;
        } else {
            System.out.println("Cadastro de pessoas lotado!");
        }
    }
    
    public void imprimeCadastro() {
        for (int i = 0; i < qtdAtual; i++) {
            pessoas[i].imprimeDados();
        }
    }
}
