package DataStructure.String.CamelCase;

public class Main {

    public static void main(String[] args) {

        String s = "thisIsMyString";
        String[] r = s.split("(?=\\p{Upper})");
        System.out.println(r.length);
    }
}
