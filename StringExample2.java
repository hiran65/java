public class StringExample2 {
    public static void main(String args[])
    {
    StringBuffer sb=new StringBuffer("Hello");  
    sb.append("Java");
    System.out.println(sb);
    sb.insert(0, "i");
    System.out.println(sb);
    sb.replace(0, 2, "hir");
    System.out.println(sb);
    sb.delete(0, 1);
    System.out.println(sb);
    char s=sb.charAt(2);
    
    sb.setCharAt(0, 'x');
    System.out.println(sb);

    int m=sb.length();
    System.out.println(sb.capacity());
    sb.ensureCapacity(40);
    System.out.println(sb.capacity());
    
    String sp = sb.toString();
    System.out.println(sp);

    String k=sb.substring(1);
    System.out.println(k);
    String l=sb.substring(1,3);
    System.out.println(l);
    System.out.println(m);
    System.out.println(s);
    System.out.println(sb);  

    }
}
