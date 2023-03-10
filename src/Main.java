public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Объявление переменных типа int, byte, short, long, float, double
        int name_1 = 33000;
        byte name_2 = 7;
        short name_3 = 200;
        long name_4 = 2200;
        float name_5 = 2.75f;
        double name_6 = 33.1515d;
        System.out.println("Значение переменной name_1 с типом int равно " + name_1 );
        System.out.println("Значение переменной name_2 с типом byte равно " + name_2 );
        System.out.println("Значение переменной name_3 с типом short равно " + name_3 );
        System.out.println("Значение переменной name_4 с типом long равно " + name_4 );
        System.out.println("Значение переменной name_5 с типом float равно " + name_5 );
        System.out.println("Значение переменной name_6 с типом double равно " + name_6 );
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Инициализируйте переменные, используйте изученные ранее типы переменных
        byte b = 67;
        short c = -159;
        short a = 27897;
        long d = 987678965549L;
        float e = 27.12f;
        float f = 2.786f;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Cколько достанется листов каждому ученику
        byte ludmilaPav = 23;
        byte annaSer = 27;
        byte ekaterinaAnd = 30;
        int allStudent = ludmilaPav + annaSer + ekaterinaAnd;
        short totalSheets = 480;
        int eachStudent = totalSheets / allStudent;
        System.out.println("На каждого ученика рассчитано " + eachStudent + " листов бумаги" );
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Какая производительность машины
        byte twoMinute = 16;
        int oneMin = twoMinute / 2;
        int twentyMin = oneMin * 20;
        int day = oneMin * 1440;
        int threeDays = day * 3;
        int oneMonth = day * 30; // из расчета 1 месяц = 30 дней
        System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок" );
        System.out.println("За сутки машина произвела " + day + " штук бутылок" );
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок" );
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок" );
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Сколько банок каждой краски было куплено
        byte totalCans = 120;
        byte whiteClass1 = 2;
        byte brownClass1 = 4;
        int oneClass = whiteClass1 + brownClass1;
        int allClass = totalCans / oneClass;
        int allWhite = allClass * whiteClass1;
        int allBrown = allClass * brownClass1;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски" );
}
    public static void task6 () {
        System.out.println("Задача 6");
        // Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы
        byte oneBanana = 80;
        int fiveBanana = oneBanana * 5;
        byte milk100 = 105;
        int milk200 = milk100 * 2;
        byte iceCream1 = 100;
        int iceCream2 = iceCream1 * 2;
        byte egg1 = 70;
        int egg4 = egg1 * 4;
        int totalWeight = fiveBanana + milk200 + iceCream2 + egg4;
        float totalWeight2 = totalWeight / 1000f;
        System.out.println("Вес спортзавтрака составляет " + totalWeight + " грамм или " + totalWeight2 + " кг"  );
    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Сколько может потребоваться дней в среднем, чтобы добиться результата похудения
        byte totalWeight = 7;
        int totalWeight2 = totalWeight * 1000;
        short weight250 = 250;
        short weight500 = 500;
        int allDay250 = totalWeight2 /weight250;
        int allDay500 = totalWeight2 /weight500;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то уйдет " + allDay250 + " дней"  );
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то уйдет " + allDay500 + " дней"  );
    }
    public static void task8 () {
        System.out.println("Задача 8");
        // сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int kristinaYear = kristina * 12;
        int mashaNew = masha + masha / 10;
        int kristinaNew = kristina + kristina / 10;
        int denisNew = denis + denis / 10;
        int mashaYear2 = mashaNew * 12;
        int kristinaYear2 = kristinaNew * 12;
        int denisYear2 = denisNew * 12;
        int mashaDiff = mashaYear2 - mashaYear;
        int kristinaDiff = kristinaYear2 - kristinaYear;
        int denisDiff = denisYear2 - denisYear;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDiff + " рублей" );
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей" );
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDiff + " рублей" );

    }
}