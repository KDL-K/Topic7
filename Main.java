package com.shevlik.topic7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Menu menu=new Menu("1.Task A5 p.87","2.Task B5 p.90","3.Task A4 p.124","4.Task B4 p.126");
        int numberOfMenu=-1;
        do {
            menu.showMenu();
            numberOfMenu = menu.chooseMenuItem();
            switch (numberOfMenu) {
                case 0:
                    break;
                case 1:
                    Book[] books = new Book[4];
                    books[0] = new Book("C++ базовый курс", "Вильямс", 2015, 624, 45f, "твердый", "Шилдт Г.");
                    books[1] = new Book("Java. Полное руководство 10-е изд.", "Диалектика", 2019, 1488, 89f, "твердый", "Шилдт Г.");
                    books[2] = new Book("Java. Методы программирования.", "Четыре четверти", 2013, 896, 35f, "твердый", "Блинов И.Н.", "Романчик В.С.");
                    books[3] = new Book("Теория организации и организационное поведение.", "Питер", 2015, 288, 38f, "твердый", "Блинов А.О.", "Угрюмова Н.В.");
                    Menu menuBook = new Menu("1.Поиск книги по автору", "2.Поиск книги по издательству", "3.Поиск книги после указанного года");
                    int numberOfMenuBook=-1;
                    do {
                        menuBook.showMenu();
                        numberOfMenuBook = menuBook.chooseMenuItem();
                        switch (numberOfMenuBook) {
                            case 0:
                                break;
                            case 1:
                                System.out.print("Author: ");
                                String author=in.nextLine();
                                for(int i=0;i<books.length;i++){
                                    books[i].searchAuthor(author);
                                }
                                break;
                            case 2:
                                System.out.print("Publisher: ");
                                String publisher=in.nextLine();
                                for(int i=0;i<books.length;i++){
                                    books[i].searchPublisher(publisher);
                                }
                                break;
                            case 3:
                                System.out.print("Year: ");
                                int year=in.nextInt();
                                for(int i=0;i<books.length;i++){
                                    books[i].searchAfterYear(year);
                                }
                                break;
                        }
                    }while (numberOfMenuBook!=0);
                    break;
                case 2:
                    Interval interval1=new Interval(true);
                    System.out.println(interval1.toString());
                    Interval interval2=new Interval(2,11,false);
                    System.out.println(interval2.toString());
                    Interval interval3=new Interval(true);
                    System.out.println(interval3.toString());
                    Interval interval4=new Interval(false);
                    System.out.println(interval4.toString());
                    Interval.showCross(interval1,interval2,interval3,interval4);
                    System.out.println(Interval.distanceMax(interval1,interval2,interval3,interval4));
                    Interval intervalMore=Interval.intervalMinus(interval1,interval2);
                    System.out.println(intervalMore.toString());
                    Interval intervalMore2=Interval.intervalPlus(interval1,interval2);
                    System.out.println(intervalMore2.toString());
                    break;
                case 3:
                    City minsk=new City("Минск",349,1922,true);
                    City borisov=new City("Борисов",46,145,false);
                    City grodno=new City("Гродно",142,361,true);
                    City lida=new City("Лида",45,101,false);
                    City vitebsk=new City("Витебск",135,378,true);
                    City orsha=new City("Орша",43,117,false);
                    City mogilev=new City("Могилев",119,373,true);
                    City bobruisk=new City("Бобруйск",96,218,false);
                    City gomel=new City("Гомель",140,535,true);
                    City mozur=new City("Мозырь",44,112,false);
                    City brest=new City("Брест",146,335,true);
                    City pinsk=new City("Пинск",47,138,false);
                    Region minskR=new Region("Минский",1902,215,minsk);
                    Region borisovR=new Region("Борисовский",2987,180,borisov);
                    Region grodnoR=new Region("Гродненский",2594,50,grodno);
                    Region lidaR=new Region("Лидский",1566,132,lida);
                    Region vitebskR=new Region("Витебский",2738,37,vitebsk);
                    Region orshaR=new Region("Оршанский",1708,156,orsha);
                    Region mogilevR=new Region("Могилевский",1895,40,mogilev);
                    Region bobruiskR=new Region("Бобруйский",1599,17,bobruisk);
                    Region gomelR=new Region("Гомельский",1951,68,gomel);
                    Region mozurR=new Region("Мозырский",1603,133,mozur);
                    Region brestR=new Region("Брестский",146,335,brest);
                    Region pinskR=new Region("Пинский",47,138,pinsk);
                    Field minskF=new Field("Минская",39854,1428,minskR,borisovR);
                    Field grodnoF=new Field("Гродненская",25127,1039,grodnoR,lidaR);
                    Field vitebskF=new Field("Витебская",40051,1172,vitebskR,orshaR);
                    Field mogilevF=new Field("Могилевская",29068,1052,mogilevR,bobruiskR);
                    Field gomelF=new Field("Гомельская",40372,1410,gomelR,mozurR);
                    Field brestF=new Field("Брестская",32787,1380,brestR,pinskR);
                    State Belarus=new State("Беларусь",207600,9475,minsk,minskF,grodnoF,vitebskF,mogilevF,gomelF,brestF);
                    System.out.println(Belarus.toString());
                    break;
                case 4:
                    Onion onion=new Onion("Лук репчатый",47,"красный",LifeTime.two);
                    Onion garlic=new Onion("Чеснок",143,"белый",LifeTime.many);
                    Tomato tomato=new Tomato("Помидор",20,"красный",LifeTime.one,true);
                    Tomato pepper=new Tomato("Перец сладкий",33,"зеленый",LifeTime.one,false);
                    Pumpkin cucumber=new Pumpkin("Огурец",15,"зеленый",LifeTime.one);
                    Salad saladGreek=new Salad("Греческий","Сыр фета, лимонный сок, соль, маслины, " +
                            "орегано, оливковое масло",onion,garlic,tomato,pepper,cucumber);
                    System.out.println(saladGreek.toString());
                    System.out.print("Input calories to search: ");
                    int result=in.nextInt();
                    saladGreek.searchByCalories(result);
                    System.out.println(saladGreek.toString());
                    System.out.print("Sort by calories: ");
                    saladGreek.sortByCalories();
                    System.out.println(saladGreek.toString());
                    break;

            }
        }while (numberOfMenu!=0);
        in.close();
    }

}
