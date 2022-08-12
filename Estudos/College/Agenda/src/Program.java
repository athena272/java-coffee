public class Program {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Guilherme", "999999999");
        Contato contato2 = new Contato("Caun", "8888888888");
        Contato contato3 = new Contato("Ryller", "777777777");
        Contato contato4 = new Contato("Adriel", "666666666666");
        Contato contato5 = new Contato("Adriel", "666666666666");


        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);
        agenda.adicionarContato(contato4);


        agenda.getContatos();

        agenda.removeContato("Ryller");
        agenda.getContatos();
    }
}

