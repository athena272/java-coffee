public class Ebook extends Livro implements Promocional{
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }
    //My methods
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem > 0.15) {
            return false;
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        System.out.println("Aplicando desconto no LivroFisico");
        return true;
    }
    //Getters and Setters
    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
