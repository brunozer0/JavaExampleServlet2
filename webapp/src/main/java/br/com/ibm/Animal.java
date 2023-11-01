package br.com.ibm;

public class Animal {

    protected String nome;
    protected String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;

    }

    public void Comer() {
        System.out.println("O " + especie + " " + nome + " está comendo");
    }

    public void Brincar() {
        System.out.println("O " + especie + " " + nome + " está brincando");
    }

    public void Fugir() {
        System.out.println("O " + especie + " " + nome + " está fugindo");

    }
    public String getNome() {
        return this.nome;
    }
    public String getEspecie() {
        return this.especie;
    }
}
