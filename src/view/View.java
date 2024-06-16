package view;

import java.util.Scanner;

public class View {
    public static int menu (){
        System.out.println(
                "\n" +
                "     ██╗██████╗ ██████╗  ██████╗\n" +
                "     ██║██╔══██╗██╔══██╗██╔════╝\n" +
                "     ██║██║  ██║██████╔╝██║     \n" +
                "██   ██║██║  ██║██╔══██╗██║     \n" +
                "╚█████╔╝██████╔╝██████╔╝╚██████╗\n" +
                " ╚════╝ ╚═════╝ ╚═════╝  ╚═════╝\n" +
                "                                \n\n"
        );
        System.out.println(
                        "[1] Add new product            [6] Add new customer           [11] Add new order"+"\n"+
                        "[2] List All product           [7] List All customer          [12] List All order"+"\n"+
                        "[3] Find product by ID         [8] Find customer by ID        [13] Find order by ID"+"\n"+
                        "[4] Delete product by ID       [9] Delete customer by ID      [14] Delete order by ID"+"\n"+
                        "[5] Update product by ID       [10] Update customer byID      [15] Update order by ID"+"\n"
        );
        System.out.print("Inert option : ");
        return (new Scanner(System.in).nextInt());
    }
}
