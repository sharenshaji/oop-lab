import java.io.*;
class StringAndStringBuffer
{
public static void main(String[] args)	
{		
StringBuffer s = new StringBuffer("Helloprogramming");
int p = s.length();
int q = s.capacity();
		
System.out.println("Length of string Helloprogramming=" + p);
		
System.out.println("\nCapacity of string Helloprogramming=" + q);
                
s.append(1);
System.out.println("\nAfter appending:"+s); 	
              
s.insert(5, "to");
System.out.println("\nInsert at position 5:"+s);
                
char geeks_arr[] = { 'j', 'a', 'v', 'a'};                
s.insert(7, geeks_arr);
System.out.println("\nInserting at array at 7: "+s);                   

s.delete(11,24);
System.out.println("\nDelete at position 11 & 24 : "+s); 
        
s.deleteCharAt(5);
System.out.println("\nDelete at position 5 : "+s);
s.deleteCharAt(4);
System.out.println("\nDelete at position 4 : "+s);


s.replace(5,5, " ");
System.out.println("\nReplace at position 5 : "+s);

s.reverse();
System.out.println("\nAfter Reverse String : "+s);

String txt1 = "Hello";

System.out.println("\nString length is: "+txt1.length());

System.out.println("\nString at Uppercase : "+txt1.toUpperCase());  

System.out.println("\nString at Lowercase : "+txt1.toLowerCase());

String txt2 = "World";
String txt3="Hello";
System.out.println("\nAfter comparing txt1 & txt3 : "+txt1.compareTo(txt3));
System.out.println("\nAfter comparing txt1 & txt2 : "+txt1.compareTo(txt2));
System.out.println("\nAfter concating :"+txt1.concat(txt2));

}
}
