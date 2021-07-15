package string;

public class StringFunctions {

    public static void main(String[] args) {
        String string =" priya tilavi";

        System.out.println(string.substring(2));
        System.out.println("="+string.trim());
        System.out.println(string.substring(2,string.length()-1));
        System.out.println(string.contains("riya"));
        System.out.println(string.concat(" is a software engineer"));
        System.out.println(string.codePointAt(2));
        System.out.println(string.replace("tilavi","Nimbargi"));
        System.out.println(string.lastIndexOf('i')+" "+ string.length());
        String[] s = string.trim().split(" ");
        System.out.println(s[0]);
        System.out.println(s[1]);
    }

}
