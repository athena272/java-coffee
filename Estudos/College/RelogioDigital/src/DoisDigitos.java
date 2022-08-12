public class DoisDigitos {
    private int limite;
    private int valorAtual;

    public DoisDigitos(int limite) {
        this.limite = limite;
        this.valorAtual = 0;
    }

    //My Methods
    public void incremento() {
        this.valorAtual = (this.valorAtual + 1) % this.limite;
    }

    public String showValor() {
        if(this.valorAtual < 10) {
            return "0" + this.valorAtual;
        }
        else{
            return "" + this.valorAtual;
        }
    }

    //Getters and Setters
    public int getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(int valorAtual) {
        if((valorAtual >= 0) && this.valorAtual < this.limite){
            this.valorAtual = valorAtual;
        }
    }

    public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
}

