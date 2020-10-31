public class StringClass {
    public static void main(String[] args){
        String s1 = "Hi World";
        String s2 = "Hi World";
        System.out.println(s1.hashCode() + " " +  s2.hashCode());
        System.out.println(s1 == s2);

        String s3 = new String("Hi World");
        System.out.println("Comparing 2 equal strings but different references using  == " + (s1 == s3) );
        System.out.println("Comparing 2 equal strings but different references using  equals " + s1.equals(s3) );

        // Constructors 

        char arr[] = {'G', 'e', 'e', 'k', 's'};
        String s4 = new String(arr);
        System.out.println(s4);

        String s5 = "geeks";
        String s6 = " Geeks ";
        String s7 = "feeksforfeeks";
        // methods 

        System.out.println("length of s1 = " + s1.length());
        System.out.println("charAt 3 index --returns character itself not string " + s2.charAt(3));
        System.out.println("Substring(int i) " + s3.substring(2));
        System.out.println("Subsring(int i, int j) " + s2.substring(2,5));
        System.out.println("concat " + s1.concat(s3));
        System.out.println("indexOf(char ch) " + s1.indexOf('r'));
        System.out.println("indexOf(String s) " + s1.indexOf("Wor"));
        System.out.println("lastIndexof(char ch) " + s4.lastIndexOf('e'));
        System.out.println("equalsIgnoreCase(String s) " + s4.equalsIgnoreCase(s5));
        System.out.println("CompareTo(String s) " + s1.compareTo(s4));
        System.out.println("CompareToIgnoreCase(String s) " + s1.compareToIgnoreCase(s4));
        System.out.println("toUpperCase() " + s1.toUpperCase());
        System.out.println("toLowerCase() " + s4.toLowerCase());
        System.out.println("trim - removes the whitespaces at beginning and end " + s6.trim());
        System.out.println("replace(char oldChar, char newChar) " + s7.replace('f', 'g'));
        System.out.println("replace(str target. str replacement) " + s2.replace("Hi","Hello"));
    }
}