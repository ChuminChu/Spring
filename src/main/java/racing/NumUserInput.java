package racing;

import java.util.Scanner;

public class NumUserInput {
    private int userInput;

    public NumUserInput(int userInput) {
        if (userInput > 10) {
            throw new IllegalArgumentException("[ERROR] 너무 많으면 곤란쓰~ 10회까지만 해주세요~");
        }
        if (userInput < 3) {
            throw new IllegalArgumentException("[ERROR] 너무 적으면 노잼쓰~ 3회이상은 입력해주세요~");
        }
        this.userInput = userInput;
    }

    public static int getInputUser() {
        System.out.println("몇 회 시행할까요?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
