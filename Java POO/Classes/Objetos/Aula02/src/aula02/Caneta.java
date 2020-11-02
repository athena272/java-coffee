package aula02;

public class Caneta {
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    //Métodos
    void status() {
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);
    }
    
    void rabiscar() { 
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar, caneta tampada ");
        }
        else {
            System.out.println("Estou Rabiscando!");
        }
    }
    
    void tampar() {
        this.tampada = true; //This faz referência ao próprio objeto, neste caso ao "c1"
    }
    
    void destampar() {
        this.tampada = false;
    }
}
