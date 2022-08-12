public class Email {
    private String de;
    private String para;
    private String mensagem;

    public Email( String de, String para, String mensagem ) {
        this.de = de;
        this.para = para;
        this.mensagem = mensagem;
    }

    public String getDe(){
        return de;
    }

    public String getPara(){
        return para;
    }

    public String Mensagem(){
        return mensagem;
    }

    public void imprimir(){
        System.out.println( "--------------");
        System.out.println( "De:" + de);
        System.out.println( "Para:" + para);
        System.out.println( "Mensagem:" + mensagem);
        System.out.println( "--------------");
    }
    
}