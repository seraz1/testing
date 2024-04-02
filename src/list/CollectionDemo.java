package list;
import java.util.LinkedList;
public class CollectionDemo {

	public static void main(String[] args) {

     LinkedList ll = new LinkedList();
     ll.add(0,"rahul");
     ll.add("puja");        //1. linkedlist are index based data structure.
     ll.add("mohan");      //2. linked list can store different data type or hetrogeneous data type.
     ll.add(288);         //3. linkedlist can store dublicate values.
     ll.add(100);        //4. linkedlist can store any number of null value.
     ll.add(123.5);     //5. linkedlist follows the inserion order.
     ll.add('c');      //6. linkedlist does not follow the sorting order.
     ll.add(400);     //7. linkedlist are non-synchronized.
     ll.add("puja");
     ll.add(null);
     
     
     System.out.println(ll);
     
     ll.addFirst("aaa");
      System.out.println(ll);
     
     ll.addLast(44);
     System.out.println(ll);
     
     ll.removeFirst();
     System.out.println(ll);
     
     ll.addLast(34);
     System.out.println(ll);
     System.out.println(ll.getLast());
     System.out.println(ll.getFirst());
     System.out.println(ll.get(5));
     System.out.println(ll.get(6));
     
     
     
	}

}
