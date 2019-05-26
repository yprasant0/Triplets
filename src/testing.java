import java.util.*;
import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class testing {
        // test 1, arr=[3,1,2,4,6,7,8,5] and sum=12
    @Test
    public void testing1(){

        List<List<Integer>> triplets = new ArrayList<List<Integer>>();

        // List of all possible triplets
        List<Integer> Triplet1 = new ArrayList<>();
        List<Integer> Triplet2 = new ArrayList<>();
        List<Integer> Triplet3 = new ArrayList<>();
        List<Integer> Triplet4 = new ArrayList<>();
        List<Integer> Triplet5 = new ArrayList<>();
        List<Integer> Triplet6 = new ArrayList<>();

        Triplet1.add(1);
        Triplet1.add(3);
        Triplet1.add(8);
        triplets.add(Triplet1);

        Triplet2.add(1);
        Triplet2.add(4);
        Triplet2.add(7);
        triplets.add(Triplet2);

        Triplet3.add(1);
        Triplet3.add(5);
        Triplet3.add(6);
        triplets.add(Triplet3);

        Triplet4.add(2);
        Triplet4.add(3);
        Triplet4.add(7);
        triplets.add(Triplet4);

        Triplet5.add(3);
        Triplet5.add(4);
        Triplet5.add(5);
        triplets.add(Triplet5);

        Triplet6.add(2);
        Triplet6.add(4);
        Triplet6.add(6);
        triplets.add(Triplet6);



        int arr[] = {3,1,2,4,6,7,8,5};

        assertEquals("Error in find3numbers",triplets,find3Numbers.findTriplets(arr,12));

    }
    @Test
    public void testing2() {
        // arr=[-9,-3,-2,-5,-1]     sum = -6
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();

        List<Integer> Triplet1 = new ArrayList<>();
        //  triplets of the arrayList triplet
        Triplet1.add(-3);
        Triplet1.add(-2);
        Triplet1.add(-1);

        triplets.add(Triplet1);

        int arr[] = {-9,-3,-2,-5,-1};

        assertEquals("error in find3numbers",triplets,find3Numbers.findTriplets(arr,-6));
    }

   @Test
    public void testing3(){

       List<List<Integer>> triplets = new ArrayList<List<Integer>>();
       // Test 3   arr={3,4}   sum=10
       int arr[]={3,4};
       assertEquals("error in find3numbers",triplets,find3Numbers.findTriplets(arr,10));
   }

   public void testing4(){
        // Test 4     arr=[0,0,0,0,0]    sum=0
       List<List<Integer>> triplets = new ArrayList<List<Integer>>();

       List<Integer> Triplet1 = new ArrayList<>();
       //  triplets of the arrayList triplet
       Triplet1.add(0);
       Triplet1.add(0);
       Triplet1.add(0);

       triplets.add(Triplet1);

       int arr[] = {0,0,0,0,0};

       assertEquals("error in find3numbers",triplets,find3Numbers.findTriplets(arr,0));

   }
   @Test
   public void testing5(){
        // testing 5  arr=[1,5,-2,8,1,-8]       sum=1
       List<List<Integer>> triplets = new ArrayList<List<Integer>>();

       List<Integer> Triplet1 = new ArrayList<>();
       //  triplets of the arrayList triplet
       Triplet1.add(1);
       Triplet1.add(-8);
       Triplet1.add(8);

       triplets.add(Triplet1);

       int arr[] = {1,5,-2,8,1,-8};

       assertEquals("error in find3numbers",triplets,find3Numbers.findTriplets(arr,1));

   }

   @Test
    public void testing6(){
        // Test6   arr=[]    sum=0
       List<List<Integer>> triplets = new ArrayList<List<Integer>>();

       List<Integer> Triplet1 = new ArrayList<>();

       int arr[] = {};

       assertEquals("error in find3numbers",triplets,find3Numbers.findTriplets(arr,0));


   }
    @Test
    public void testing7(){
        // Test 7  arr=[1,5,2,3,4]   sum=8
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        
        List<Integer> Triplet1 = new ArrayList<>();
        List<Integer> Triplet2 = new ArrayList<>();
        //  triplets of the arrayList triplet
        Triplet1.add(1);
        Triplet1.add(2);
        Triplet1.add(5);
        triplets.add(Triplet1);

        Triplet2.add(4);
        Triplet2.add(3);
        Triplet2.add(1);
        triplets.add(Triplet2);

        int arr[] = {1,5,2,3,4};

        assertEquals("error in find3numbers",triplets,find3Numbers.findTriplets(arr,8));
   }

}
