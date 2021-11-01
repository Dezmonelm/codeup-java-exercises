import java.util.Arrays;

public class ArrayLecture {


    public static void main(String[] args) {
        double[] prices = new double[4];
        final int numberOfSides = 6;

        int[] diceSides = new int[numberOfSides];

        System.out.println("prices.length = " + prices.length);
        System.out.println("diceSides.length = " + diceSides.length);

        System.out.println("diceSides[0] = " + diceSides[5]);


//        System.out.println("myBag[1] = " + myBag[1]);

        String[] myBag = {"Snickers", "Reese's", "Brussel"};
//        for (int i = 0; i < myBag.length; i++) {
//        System.out.println(myBag[i]);
//    }
        for (String candy : myBag) {
            System.out.printf("%s is the piece of candy you just pulled out of the bag%n", candy);
            System.out.println();
        }
            String[] anotherbag = new String[12];

            System.out.println(anotherbag[0]);
            System.out.println(anotherbag[5]);

            Arrays.fill(anotherbag, "Snickers");

            for (String candies : anotherbag) {
                System.out.println(candies);
            }
        System.out.println();

        System.out.println("Arrays.equals(anotherbag, anotherbag) = " + Arrays.equals(anotherbag, anotherbag));

        String[] mybagplusone = Arrays.copyOf(myBag, myBag.length + 1);
        System.out.println("myBag.length = " + myBag.length);
        System.out.println("mybagplusone.length = " + mybagplusone.length);

        mybagplusone[mybagplusone.length-1] = "skittles";
        for (String candy : mybagplusone){
            System.out.println(candy);
        }
        System.out.println();

        //Stringify array
        System.out.println(Arrays.toString(mybagplusone));

        //Sort array
        Arrays.sort(mybagplusone);
        for (String candy : mybagplusone){
            System.out.println(candy);
        }

        //Searching inside of array
        int skittlesindex = Arrays.binarySearch(mybagplusone, "skittles");
        int snickersindex = Arrays.binarySearch(mybagplusone, "Snickers");

        System.out.println("This should be some skittles for Jackie: " + mybagplusone[skittlesindex]);
        System.out.println("This should be some snickers for myself : " + mybagplusone[snickersindex]);



        int[][] matrix = {
                {1, 2, 3}, //arr1
                {4, 5, 6}, //arr2
                {7, 8, 9}  //arr3 . . these three arrays are ELEMENTS of the outer array
        };

        int[] arrExample = new int[]{1, 2, 3};
        System.out.println("arrExample[1] = " + arrExample[1]);
        System.out.println("arrExample = " + Arrays.toString(arrExample));

        System.out.println("matrix[0] = " + Arrays.toString(matrix[0]));
        System.out.println("matrix[1] = " + Arrays.toString(matrix[1]));
        System.out.println("matrix[2] = " + Arrays.toString(matrix[2]));

        System.out.println("matrix[1][1] = " + matrix[1][1]); //matrix[1] = [4,5,6]; [4,5,6][1] == 5


//        for (int[] row : matrix) {
//            System.out.println("+---+---+---+");
//            System.out.print("| ");
//            for (int n : row) {
//                System.out.print(n + " | ");
//            }
//            System.out.println();
//        }
//        System.out.println("+---+---+---+");

    }
}
