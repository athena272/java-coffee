public class Contato {
    private String name;
    private String phoneNumber;

    //constructor
    public Contato(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //my methods
    public void showContato() {
        System.out.println("Nome: " + this.getName());
        System.out.println("Telf: " + this.getPhoneNumber());
    }
    //Getters and Setters
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
