package br.com.caelum.ed;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];

    public void adicionar(Aluno aluno) {

    }

    //sobrecarga de metodo
    public void adicionar(int posicao, Aluno aluno) {

    }

    public Aluno pegar(int posicao) {
        return null;
    }

    public void remover(int posicao) {
    }

    public boolean contem(Aluno aluno) {
        return false;
    }

    public int tamanho() {
        return 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
