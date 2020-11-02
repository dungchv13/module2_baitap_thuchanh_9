package program;

import manage.TaiLieuManage;

public class Program {

    public static void main(String[] args) {
        TaiLieuManage manage = new TaiLieuManage();
        Menus menu = new Menus();
        do{

            System.out.println("---------------MENU------------");
            System.out.println("1.add.");
            System.out.println("2.update.");
            System.out.println("3.delete.");
            System.out.println("4.display all.");
            System.out.println("5.search.");
            System.out.println("0.Exit.");
            System.out.print("Enter your choice: ");
            String choice = InputFunc.inputString("[0-5]");
            if(choice.equals("1")){
                manage.add(menu.menuAdd(manage));
                System.out.println("*****************");
            }else if(choice.equals("2")){
                menu.menuUpdate(manage);
                System.out.println("*****************");
            }else if(choice.equals("3")){
                menu.menuDelete(manage);
                System.out.println("*****************");
            }else if(choice.equals("4")){
                System.out.println("*****************");
                manage.displayAll();
                System.out.println("*****************");
            }else if(choice.equals("5")){
                menu.menuSearch(manage);
                System.out.println("*****************");
            }else if(choice.equals("0")){
                System.exit(0);
            }
        }while(true);
    }
}
