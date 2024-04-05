package encapsulamento;

public class principal {
    public static void main(String[] args) {
// get e set
Visibilidade visibilidade;
visibilidade = new Visibilidade();
//visibilidade.idade=10;
visibilidade.setIdade(19);
        System.out.println("o valor da idade é = " + visibilidade.getIdade());
    }
}