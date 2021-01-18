import main.java.ListManager;

import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        //System.out.println("Hello from\n" + logo);

        Scanner scanner = new Scanner(System.in);
        ListManager listManager = new ListManager();

        System.out.println(listManager.welcomeLine());
        String userinput = scanner.nextLine();

        while ( !userinput.equals("bye")){
            if (userinput.equals("list")){
                System.out.println(listManager.returnTaskList());
            }else if(userinput.contains("done ")){

                int taskInt = Integer.parseInt(userinput.split(" ")[1]);
                String outputString = listManager.checkTaskAsDone(taskInt);

                System.out.println(outputString);
            }else{
                String outputString = listManager.addTask(userinput);
                System.out.println(outputString);
            }
            userinput = scanner.nextLine();
        }

        System.out.println(listManager.goodbyeLine());
    }
}
