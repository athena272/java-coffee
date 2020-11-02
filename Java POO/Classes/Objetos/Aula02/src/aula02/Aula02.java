package aula02;
 //@author athena272 
public class Aula02 {

    public static void main(String[] args) {
        
            Caneta c1 = new Caneta();
    
            c1.cor = "Azul";
            c1.ponta = (float) 0.5;
            c1.tampar();
            c1.status();
            c1.rabiscar();
            System.out.println("-------------------------------------------------------");
            //Criando um seguindo objeto
            Caneta c2 = new Caneta();
            c2.modelo = "HostNet";
            c2.cor = "Vermelho";
            c2.destampar();
            c2.status();
            c2.rabiscar();
    }
    
}
