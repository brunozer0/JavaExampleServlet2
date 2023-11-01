package br.com.ibm;

class Gato extends Animal {
    public Gato(String nome, String especie) {
        super(nome, especie);

    }

    @Override
    public void Comer() {
        System.out.println("O " + especie + " " + nome + " está comendo whiskas de salmão");
    }

    public void Brincar() {
        System.out.println("O " + nome + " está destruindo o forro da cama");
    }

    public void Fugir() {
        System.out.println("o " + nome + " fugiu para o telhado do vizinho");
    }

    public String getNome() {
        return this.nome;
    }

}