/*
package exercicio1;
/*
* 1-  Crie uma classe que contenha atributos encapsulados,
*  os mesmos devem ser chamados na classe main, para isso você deve criar os gets e sets.
* */
public class Principal1 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Maria");
        pessoa1.setIdade(25);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        Pessoa pessoa2 = new Pessoa("Carlos", 22);

        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
    }
}

