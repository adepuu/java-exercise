package com.adepuu.exercises.session8;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Auth auth;

    public Menu(Scanner scanner, Auth auth) {
        this.scanner = scanner;
        this.auth = auth;
    }

    public void authPrompt() {
        while (true) {
            System.out.println("Enter username (or type exit/q/Q to exit): ");
            String username = scanner.nextLine();
            if (username.equalsIgnoreCase("q")) break;

            System.out.println("Enter password: ");
            String password = scanner.nextLine();

            if (auth.login(username, password)) {
                var currentUser = auth.getCurrentUserDetails();
                mainMenu(currentUser);
            }
        }
    }

    void mainMenu(User user) {
        while (!auth.getActiveUserID().isEmpty()) {
            System.out.println("===== To-do list App =====");
            System.out.println("1. Show to-do list");
            System.out.println("2. Create to-do list");
            System.out.println("3. Finish to-do");
            System.out.println("4. Delete to-do");
            System.out.println("5. Logout");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> user.getTodoList().printToDos();
                case 2 -> user.getTodoList().addItemPrompt(scanner);
                case 3 -> user.getTodoList().finishToDoItem(scanner);
                case 4 -> user.getTodoList().deleteToDoItem(scanner);
                case 5 -> auth.logout();
                default -> System.out.println("Unknown menu");
            }
        }
    }
}
