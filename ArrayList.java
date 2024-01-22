import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
 
class ArrayLists {
   public static void main(String args[]) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<String> list2 = new ArrayList<String>();
       ArrayList<Boolean> list3 = new ArrayList<Boolean>();
      
       //add elements
       list.add(1);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println("\nTHE LSIT IS \t"+list);
 
       //to get an element
       int element = list.get(0); // 0 is the index
       System.out.println("\nTHE 0TH INDEX ELEMNET IS \t"+element);
 
       //add element in between
       list.add(1,2); // 1 is the index and 2 is the element to be added
       System.out.println("\nTHE MODIFIED LIST AFTER ADDING ELEMNET IS\t"+list);
 
       //set element
list.set(0,0);
System.out.println("\nTHE LIST AFTER SETTING ELEMNET AT ZEROTH INDEX AS 0 IS\t"+list);

//delete elements
list.remove(0); // 0 is the index
System.out.println("\nTHE MODIFED LIST AFTER DELETING ELEMNT AT THE 0TH INDEX IS\t"+list);

//size of list
int size = list.size();
System.out.println("\nTHE SIZE O THE LIST IS \t"+size);

//Loops on lists
for(int i=0; i<list.size(); i++) {
    System.out.print(list.get(i) + " ");
}
System.out.println();

//Sorting the list
list.add(0);
Collections.sort(list);
System.out.println("\nTHE SORTED FINAL LIST IS \t"+list);
}
}
