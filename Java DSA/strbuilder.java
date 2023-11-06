public class strbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Srushti");
        System.out.println("String Builder String is "+sb);
        System.out.println("Appending --> "+sb.append(" Jalgaonkar"));
        System.out.println("Inserting operation --> "+sb.insert(0, "Ms."));
        System.out.println("Deleting From String -->" +sb.delete(0, 3));
    }
}
