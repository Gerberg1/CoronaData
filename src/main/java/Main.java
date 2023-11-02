public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        fh.indlæsFil();
        System.out.println(fh.visData());
    }
}
