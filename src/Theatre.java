public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 187);
        Actor actor2 = new Actor("Пётр", "Петров", Gender.MALE, 179);
        Actor actor3 = new Actor("Ирина", "Волкова", Gender.FEMALE, 175);
        Director director1 = new Director("Дарья", "Гусева", Gender.FEMALE, 48);
        Director director2 = new Director("Виталий", "Борисов", Gender.MALE, 98);
        Person musicPerson = new Person("Евгений","Пригожин", Gender.MALE);
        Person choreographerPerson = new Person("Елена","Головач", Gender.FEMALE);

        Show defaultShow = new Show("Час разрушения", 100, director1);
        Ballet ballet = new Ballet("Чёрный лебедь", 90, director1, musicPerson, "Жанр: драмма. Действующие лица: лебедь белый, лебедь черный", choreographerPerson);
        Opera opera = new Opera("Гибель богов", 150, director2, musicPerson,"Действующие лица: Зигфрид, Брунгильда, Хеген, Гунтер, " +
                "Гудруна, Вальтраута, Три норны, Дверинги Рейна", 80);

        //      "Попробуйте заменить в другом спектакле несуществующего актёра"
        // Имеет ли смысл пробовать добавлять несуществующего актера в моем случаи?
        // Выполнение очень сырое, но ТЗ соответствует >_<

        System.out.println();
        System.out.println("Добро пожаловать на оперу!");
        opera.showDirector();
        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.showActors();
        opera.changeActor(actor1, actor3);
        opera.getLibrettoText();
        System.out.println("Представление закончилось");
        opera.getDirector().setNumberOfShows(opera.getDirector().getNumberOfShows()+1);
        System.out.println();
        System.out.println("Добро пожаловать на балет!");
        ballet.showDirector();
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        ballet.showActors();
        ballet.changeActor(actor2, actor1);
        ballet.getLibrettoText();
        System.out.println("Представление закончилось");
        ballet.getDirector().setNumberOfShows(ballet.getDirector().getNumberOfShows()+1);
        System.out.println();
        System.out.println("Добро пожаловать на шоу!");
        defaultShow.showDirector();
        defaultShow.addActor(actor1);
        defaultShow.addActor(actor3);
        defaultShow.showActors();
        defaultShow.changeActor(actor1, actor2);
        System.out.println("Представление закончилось");
        defaultShow.getDirector().setNumberOfShows(defaultShow.getDirector().getNumberOfShows()+1);
    }
}
