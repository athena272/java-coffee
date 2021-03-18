/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author guilh
 */
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    public boolean status;
    
    //Visualizar o estado atual
    public void estadoAtual() {
        System.out.println("-------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Status: " + isStatus());
    }

    //Metodo Construtor
    public ContaBanco() {
        this.saldo = 0;
        //setSaldo(0);
        this.status = false;
        //setStatus(false);
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //MetodosPersonalizados
    public void abrirConta(String tipoConta) {
        setTipo(tipoConta);
        setStatus(true);
        if("CC".equals(tipoConta)) {
           setSaldo(50);
        } else if("CP".equals(tipoConta)) {
           setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
        
    }
    
    public void fecharConta() {
        if(saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
        }
    }
    
    public void depositar(float valorD) {
        if(isStatus() == true) {
            setSaldo(getSaldo() + valorD);
            //this.saldo = saldo + valor;
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("[ERRO], impossível depositar");
        }
    }
    
    public void sacar(float valorS) {
        if(isStatus() == true) {
            if(getSaldo() >= 0) {
                setSaldo(getSaldo() - valorS);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }
    
    public void pagarMensal() {
        float valorM = 0;
        if("CC".equals(getTipo())) {
            valorM = 12;
        } else if ("CP".equals(getTipo())) {
            valorM = 20;
        }
        //Verificar se está aberta
        if(isStatus() == true) {
            setSaldo(getSaldo() - valorM);
        } else {
            System.out.println("Impossível pagar mensalidade");
        }
    }
}
