public class TheBoxer {
    int height;
    int weight;
    String Class;

    public TheBoxer(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public TheBoxer(int height, int weight, String Class){
        this(height, weight);
        this.Class = Class;
    }
    public TheBoxer(TheBoxer CopyOfBoxer){
        this(CopyOfBoxer.height, CopyOfBoxer.weight, CopyOfBoxer.Class);
    }
    public void display(){
        System.out.println(this.weight + " " + this.height + " " + this.Class);
    }

    public void Kick(){
        System.out.println("Try to kick our enemy.");
    }

}
