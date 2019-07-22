package com.shevlik.topic7;

import java.util.Scanner;
public class Menu{
    private int numberOfMenu=-1;
    private int menuItemCount;
    private String[] menuDescription;

    Menu(String... menuDescription){
        menuItemCount=menuDescription.length+1;
        this.menuDescription=new String[menuItemCount];
        for(int i=0;i<menuItemCount;i++){
            if(i<menuItemCount-1){
                this.menuDescription[i]=menuDescription[i];
            } else {
                this.menuDescription[i]="0. QUIT";
            }
        }
    }

    public void showMenu(){
        for (int i=0;i<menuItemCount;i++){
            System.out.println(menuDescription[i]);
        }
    }

    public int chooseMenuItem(){
        do {
            Scanner in=new Scanner(System.in);
            System.out.print("Choose menu item (0-" + (menuItemCount - 1) + "):");
            numberOfMenu=in.nextInt();
            System.out.println();
            /*in.close();*/
        }while(numberOfMenu<0||numberOfMenu>menuItemCount-1);
        return numberOfMenu;
    }

    public int getMenu() {
        return numberOfMenu;
    }

    public int getMenuItemCount() {
        return menuItemCount;
    }

}
/*numberOfMenu=Integer.parseInt(System.console().readLine());*/
