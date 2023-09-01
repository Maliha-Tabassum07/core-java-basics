public class StringTests {
    public static void main(String[] args) {
        String test= "This String is being Used for testing purpose";

        char ch= test.charAt(6);
        System.out.println(ch);

        String testTrim= "   This String is being Used for testing purpose       ";
        System.out.println(testTrim+"Without Trim");
        System.out.println(testTrim.trim()+"With Trim");
        String p = testTrim.trim();
        System.out.println(p);

        String[] splitTest= test.split("s");
        for(String printingWords:splitTest){
            System.out.println(printingWords);
        }

        String checkReplace="Will use this string to replace";
        System.out.println(checkReplace.replace('i','o'));

        System.out.println(test.concat(" of different String operations"));
        String s= "pie";
        test.concat(s);
        System.out.println(test);

        System.out.println(test.contains("testing"));
        System.out.println(test.contains("Testing"));
        System.out.println(test.contains("why now"));

        System.out.println(test.toLowerCase());
        System.out.println(test.toUpperCase());
        System.out.println(test);
        String q= test.toUpperCase();
        System.out.println(q);
        System.out.println(q.toLowerCase());
        System.out.println(q);
        q=q.toLowerCase();
        System.out.println(q);


    }
}
