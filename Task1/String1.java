package Task1;

public class String1 {

	public static void main(String[] args) {
            String	s="rajasree";
            String  s1="Rajasree";
            String  s2="raj10";  
	        String s3="r10*";
	
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2); 
	System.out.println(s3);
	System.out.println(s.length()); 
	System.out.println(s1.toUpperCase());
	System.out.println();
	System.out.println(s.compareTo(s1));
	System.out.println(s.equals(s2));
System.out.println(s1.indent(5));
	System.out.println(s.charAt(5));
	System.out.println(s.lastIndexOf('r'));
	System.out.println(s.codePointAt(6));
	System.out.println(s1.indexOf("a"));
	System.out.println(s1.concat(s3));
	System.out.println(s1.contains(s));
	System.out.println(s3.compareToIgnoreCase(s2));
	System.out.println(s2.startsWith(s1));
	System.out.println(s3.isEmpty());
}
}
