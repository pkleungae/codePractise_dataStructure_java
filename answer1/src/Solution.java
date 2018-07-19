import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args){
        String[] Set1 = {"A","D","E"};
        String[] Set2= {"A","A","D","E"};
        boolean isSubset;
        
        
        isSubset = checkSubset(Set1,Set2);
        System.out.println(Set2 );
        System.out.print("Is Set 2 " + Arrays.toString(Set2) + " subset of Set1 " +  Arrays.toString(Set1) + "? :" + isSubset);

    }

    public static boolean checkSubset(String[] set1, String[] set2) {


        HashSet Set1 = convertArrayIntoHashSet(set1);

        HashSet Set2= convertArrayIntoHashSet(set2);

        boolean isContain;
        if(Set1.size() > Set2.size()){
            return false;
        }
        for(Object s: Set1){
            isContain = Set1.contains(s);
            if (isContain == true){
                continue;
            }else {
                return false;
            }

        }
        return true;

    }

    public static HashSet convertArrayIntoHashSet(String[] set1) {

        HashSet Set = new HashSet<>();
        for (Object element1 : set1) {
            Set.add(element1);
        }
        return Set;
    }
}
