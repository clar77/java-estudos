package construtor;

public class construtor {
    private  int numero;

    public construtor (){
        System.out.println("Essa é uma mensagem do construtor");
    }
    public construtor(int valor ) {
        this.numero = valor;
    }

    public construtor (int v1 , int v2){
        this.numero = v1+v2;
    }
    public  int getNumero() {
        return numero;
    }
}
