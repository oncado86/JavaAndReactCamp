package Homeworks.Homework_3.oppGameSaleCompany.core.ui;

import java.util.Scanner;

public class Ui {
    private int menuItmesCount;

    public void showMenus(String... menus) {
        menuItmesCount = menus.length;
        for (String menu : menus) {
            System.out.println(menu);
        }
    }

    public String getResult() {
        String result;
        Scanner readConsole = new Scanner(System.in);

        do {
            System.out.println("--> ");
            result = readConsole.nextLine();
        } while (result.isEmpty());

        return result;
    }

    public int getMenuAnswer() {
        try {
            int answer;
            answer = Integer.parseInt(getResult());
            if (answer > 0 && answer <= menuItmesCount)
                return answer;
            else {
                System.out.println("ERROR: Wrong choice!");
                return getMenuAnswer();
            }
        } catch (Exception e) {
            System.out.println("ERROR: Please entere just number!");
            return getMenuAnswer();
        }
    }

}
