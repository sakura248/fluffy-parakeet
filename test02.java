// - Create an ArrayList of Integers
// - Fill the ArrayList with ten random numbers (1-50)
// - Copy each value from the ArrayList into another ArrayList of the same capacity
// - Change the last value in the first (original) ArrayList to a -5
// - Display the contents of both ArrayLists



import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNumber = new ArrayList<Integer>(); {
        for (int i=1; i<11; i++) {
                int randomValue = random.nextInt(51);
                randomNumber.add(randomValue);
            }
        }
        List<Integer> coppiedList = new ArrayList<Integer>(randomNumber);
        System.out.println("Coppied list is " + coppiedList);

        int last;
        last = randomNumber.get(9);
        last -= 5;
        randomNumber.set(9,last);
        System.out.println("original list is " + randomNumber);
    }
}