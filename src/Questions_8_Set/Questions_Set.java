package Questions_8_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Questions_Set {
    public static void main(String[] args) {


    //Question 1 : Create a method named **totalCount**. Parameter is **Integer Hashset**. This method should return number of elements in the set. Print the number of elements in the set.

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        System.out.println("Number of elements in the set1 : "+totalCount(set1));

    //Question 2 : Create a method named **changeSet**. Parameters are **String Hashset, String1, String2**. This method should return Hashset. If HashSet has String 1, replace String 1 with String 2.

        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("banana","pineapple","orange","kiwi","watermelon","strawberry"));
        System.out.println("set2 = " + set2);
        String str2_1 = "pineapple";
        String str2_2 = "avacado";
        System.out.println("New set2 : "+changeSet(set2, str2_1, str2_2));

    //Question 3 : Create a method named **commonValues**. Parameters are **String Hashset, String Hashset**. This method should return ArrayList. Add the common values in the 2 sets to the arraylist.

        HashSet<String> set3_1 = new HashSet<>(Arrays.asList("England","Nederland","Germany","USA","Turkey","Belgium"));
        HashSet<String> set3_2 = new HashSet<>(Arrays.asList("Portugal","Nederland","Poland","USA","Turkey","France"));
        System.out.println("Common values in the 2 sets : " + commonValues(set3_1, set3_2));

    //Question 4 : Create a method named **removing**. Parameters are **String LinkedHashset, String1, String2**. This method should return LinkedHashset. If Strings exist in LinkedHashset , delete those elements.

        LinkedHashSet<String> set4 = new LinkedHashSet<String>(Arrays.asList("Keyboard","Mouse","Fan","Mousepad","Monitor"));
        String str4_1 = "Mouse";
        String str4_2 = "Mousepad";

        System.out.println("New set4 : "+removing(set4, str4_1, str4_2));

    }

    public static int totalCount(HashSet<Integer> set1){

        return set1.size();
    }

    public static LinkedHashSet<String> changeSet(LinkedHashSet<String> set2, String str2_1, String str2_2){

        if (set2.contains(str2_1)){
            set2.remove(str2_1);
            set2.add(str2_2);
        }

        return set2;
    }

    public static ArrayList<String> commonValues(HashSet<String> set3_1, HashSet<String> set3_2){

        ArrayList<String> cmmnVls = new ArrayList<>(set3_1);
        cmmnVls.retainAll(set3_2);

        return cmmnVls;
    }

    public static LinkedHashSet<String> removing(LinkedHashSet<String> set4, String str4_1, String str4_2){

        if (set4.contains(str4_1))
            set4.remove(str4_1);


        if (set4.contains(str4_2))
            set4.remove(str4_2);

        return set4;
    }
}
