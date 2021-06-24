import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Main01 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNumber = new ArrayList<Integer>(); {
        for (int i=1; i<11; i++) {
                int randomValue = random.nextInt(51);
                randomNumber.add(randomValue);
            }
        }
        System.out.println(randomNumber);

        //数字が出るまで回し続けるwhileループ・・・trueである（=breakしない限り）回し続けることができる。ぜったいbreak入れるの忘れない！
        while(true) {
        System.out.println("please choose a number");
        Scanner scanner = new Scanner(System.in);
        int chosenNumber = scanner.nextInt();
        if (randomNumber.contains(chosenNumber)) {
                System.out.println("the number is in the list.");
                scanner.close();
                break;
            } else {
                System.out.println("the number is not in the list.");
        }
    }
}
}