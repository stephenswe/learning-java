public class arrays {
    public static void main(String a[])
    {
        // int num[] = {1,4,7,8};

        // System.out.println(num[1]);

        // num[1] = 9;

        //  System.out.println(num[1]);

        // //int num[] = new int[4]; //declaring an empty arrays without values just size/number

        // //lets run a loop to print out each item on the array


        // for(int i=0; i<= 4; i++){
        //     System.out.println(num[i]);
        // }


        //multidimensional array

        int arr[][] = new int[3][4];

        for(int c=0; c<3; c++)
            {

            for(int b=0; b<4; b++)
                {
                System.out.print(arr[c][b] + " " );

            }
        System.out.println();
        }

    }
}
