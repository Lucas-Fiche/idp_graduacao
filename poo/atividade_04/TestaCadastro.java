package atividade_04;

public class TestaCadastro {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas(3);

        String nome = "Lucas";
        Data nascimento = new Data(4, 6, 2001);

        Gerente gerente = new Gerente(nome, nascimento, 2.5f, "TI");

        cadastro.cadastraPessoa(gerente);

        cadastro.imprimeCadastro();
    }
}
