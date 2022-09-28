public class Main {

    public static void main(String[] args) {

        Human maxim = new Human(1987, "Максим", "Минск", "бренд-менеджером");
        Human anya = new Human(1993, "Аня", "Москва", "методистом образовательных программ");
        Human katya = new Human(1994, "Катя", "Калининград", "продакт-менеджером");
        Human artem = new Human(-8, "Артем", null, "директором по развитию бизнеса");
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        Human vladimir = new Human(2001, "Владимир", "Казань", null);
        System.out.println(vladimir);
    }

}
