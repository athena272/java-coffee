public class RelogioDigital {
    private DoisDigitos horas;
    private DoisDigitos minutos;
    private String telaOutput;

    public RelogioDigital() {
        this.horas = new DoisDigitos(24);
        this.minutos = new DoisDigitos(60);
    }

    public RelogioDigital(int horas, int minutos) {
        this.horas = new DoisDigitos(24);
        this.minutos = new DoisDigitos(60);
        setTempo(horas, minutos);     
    }
    //My Methods
    public void setTempo(int hora, int minuto) {
        this.horas.setValorAtual(hora);
        this.minutos.setValorAtual(minuto);
        atualizaTela();
    }

    public void tempoTic() {
        this.minutos.incremento();
        if(this.minutos.getValorAtual() == 0) {
            this.horas.incremento();
        }
        atualizaTela();
    }

    public void atualizaTela() {
        this.telaOutput = horas.showValor() + ":" + minutos.showValor();
    }

    public String getTempo() {
        return telaOutput;
    }
 

}