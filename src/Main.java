public class Main {
    public static void main (String[] args) {
        TheBoxer Rokki = new TheBoxer(166, 72);
        Rokki.display();
        TheBoxer Ramir = new TheBoxer(190,88, "Heavyweight class");
        Ramir.display();
        TheBoxer RamirCopy = new TheBoxer(Ramir);
        RamirCopy.display();


    }
}
