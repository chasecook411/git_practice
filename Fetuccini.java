public class Fetuccini {
    private int numNoodles;
    private String amountSauce;

    public Fetuccini() {
        this.numNoodles = 150;
        this.amountSauce = "two tons";
    }

    public int getNumNoodles() {
        return this.numNoodles;
    }

    public void printNoodles() {
        System.out.println("NOODLES!");
        System.out.println("Need more noodles.");
    }
}
