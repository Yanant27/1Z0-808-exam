package mockexam;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Test3 {
     public static void main(String[] args) {
         double price = 90000;
         String model = null;
         if(price > 100000) {
             model = "Tesla Model X";
         } else if(price <= 100000) {
             model = "Tesla Model S";
         }
           System.out.println(model);
           
//           String s = "aa";
//           StringBuilder sb = new StringBuilder("aa");
//           StringBuilder sb2 = new StringBuilder("aa");
//           System.out.println(sb.toString().equals(sb2.toString().equals(s)));

           String str = "java";
           StringBuilder sb = new StringBuilder("java");
           System.out.println(str.equals(sb) + ":" + sb.equals(str)); // false:false
           
           Period period = Period.of(0, 0, 10);
           System.out.println(period);


           int a = 5;
           int x = 30;
           switch(x) {
               case 10:
                   a *= 2;
               case 20:
                   a *= 3;
               case 30:
                   a *= 4;
           }
           System.out.println(a);
           
           ArrayList<Object> list = new ArrayList<>();
           list.add("aa");
           list.add(true);
           list.add(11);
           System.out.println(list);
     }
}