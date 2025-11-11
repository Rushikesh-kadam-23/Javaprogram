package String;

public class StringMethods {

    public static void main(String[] args) {

        // Stringlength
        String name = "RUSHI";
        int length = name.length();
        System.out.println(length);

        // to lower case

        String lString = name.toLowerCase();
        System.out.println(lString);

        // to upper case

        String Ustring = name.toUpperCase();
        System.out.println(Ustring);

        // trim method

        String nontrimmedString = "     RUSHI    ";
        System.out.println(nontrimmedString);

        String trimmedString = nontrimmedString.trim();
        System.out.println(trimmedString);

        // Substring(int start)

        String Sstring = name.substring(1);
        System.out.println(Sstring);

        //Substring(int start, int End)

        String Substring = name.substring(0,4);
        System.out.println(Substring);

        //Replace

        String Rstring = name.replace('u','i');
        System.out.println(Rstring);

        String Rstring2 = name.replace('r','k');
        System.out.println(Rstring2);

        //charAt

        String charname = "Rushi";
        System.out.println(name.charAt(4));

        //indexof

        String modifiedname = "Rushishi";
        System.out.println(modifiedname.indexOf("shi"));
        System.out.println(modifiedname.indexOf("shi,4"));

        //equals

        System.out.println(name.equals("RUSHI"));

        //equals ignore case

        System.out.println(name.equalsIgnoreCase("ruShi"));

    }

}
