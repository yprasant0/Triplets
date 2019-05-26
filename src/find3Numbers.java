import java.util.*;
import java.io.*;
public class find3Numbers {


    public static List<List<Integer> > findTriplets(int arr[], int sum)
    {

        // Sorting of the elements reduces the complexity to o(n^2)
        Arrays.sort(arr);

        // Contains the list of all the triplet list
        List<List<Integer> > list = new ArrayList<>();

        // To prevent that we don't count duplicate we use TreeSet
        TreeSet<String> set = new TreeSet<String>();

        // To store the triplet we seek
        List<Integer> triplets = new ArrayList<>();

        // index of the first element
        for (int i = 0; i < arr.length - 2; i++) {

            int j = i + 1;

            // index of the last element
            int k = arr.length - 1;

            while (j < k) {

                if (arr[i] + arr[j] + arr[k] == sum) {

                    String str = arr[i]+" "+arr[j]+" "+" "+arr[k];
                    // To check duplicates
                    if (!set.contains(str)) {


                        triplets.add(arr[i]);
                        triplets.add(arr[j]);
                        triplets.add(arr[k]);
                        list.add(triplets);
                        triplets = new ArrayList<>();
                        set.add(str);
                    }

                    j++;
                    k--;
                } else if (arr[i] + arr[j] + arr[k] < sum)
                    j++;

                else
                    k--;
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException
    {
        //BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        //array to store the values
        int[] arr = {1,2,5,4,3};

        //array to store the sum
        int sum = 8;

        //List to store all the tripets
        List<List<Integer> > triplets = findTriplets(arr, sum);

        //Print the result
        if (!triplets.isEmpty()) {
            System.out.println(triplets);
        } else {
            System.out.println("No such numbers found");
        }
    }
}