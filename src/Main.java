public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <owner/repo>");
            return;
        }
        System.out.println("Analyzing repository: " + args[0]);
    }
}