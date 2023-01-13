public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int one = 70000;
        System.out.println(one);

        byte two = 115;
        System.out.println(two);

        short three = 21000;
        System.out.println(three);

        long four = 3000000000L;
        System.out.println(four);

        float five = 17.4E+15F;
        System.out.println(five);

        double six = 9.4E+200;
        System.out.println(six);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12F;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786F;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }

    public static void task3 () {
        System.out.println("Задача 3");

        byte lpd = 23;
        byte asd = 27;
        byte ead = 30;
        short okl = 480;
        int oku = lpd + asd + ead;
        int lno = okl / oku;

        System.out.println("На каждого ученика рассчитано " + lno + " листов бумаги.");
    }

    public static void task4 () {
        System.out.println("Задача 4");

        byte perfomance = 16;
        byte time20Min = 20;
        short timeDay = 1440;
        short time3Day = 1440 * 3;
        int time30Day = 1440 * 30;
        int perfomanceInMin = perfomance / 2;
        int okruglenie1 = timeDay / 1440;
        int okruglenie2 = time3Day / 1440;
        int okruglenie3 = time30Day / 1440;

        int perfomanceIn20Min = perfomanceInMin * time20Min;
        System.out.println("За " + time20Min + " минут машина произвела " + perfomanceIn20Min + " штук бутылок");
        int perfomanceInDay = perfomanceInMin * timeDay;
        System.out.println("За " + okruglenie1 + " день машина произвела " + perfomanceInDay + " штук бутылок");
        int perfomanceIn3Day = perfomanceInMin * time3Day;
        System.out.println("За " + okruglenie2 + " дня машина произвела " + perfomanceIn3Day + " штук бутылок");
        int perfomanceIn30Day = perfomanceInMin * time30Day;
        System.out.println("За " + okruglenie3 + " дней машина произвела " + perfomanceIn30Day + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");

        byte allJar = 120;
        byte needWhiteOneClass = 2;
        byte needBrownOneClass = 4;
        int needJarOneClass = needWhiteOneClass + needBrownOneClass;
        int classNumber = allJar / needJarOneClass;
        int whiteJar = allJar / needJarOneClass * needWhiteOneClass;
        int brownJar = allJar / needJarOneClass * needBrownOneClass;
        System.out.println("В школе, где " + classNumber + " классов, нужно " + whiteJar + " банок белой краски и " + brownJar + " банок коричневой краски");

    }

    public static void task6 () {
        System.out.println("Задача 5");

        float mass1Banana = 0.08F;
        byte countBanana = 5;
        float mass100Milk = 0.105F;
        byte countMilk = 2;
        float massIseCreamBrick = 0.1F;
        byte countIseCreamBrick = 2;
        float mass1Eggs = 0.07F;
        byte countEggs = 4;
        float massBreakfast = mass1Banana * countBanana + mass100Milk * countMilk + massIseCreamBrick * countIseCreamBrick + mass1Eggs * countEggs;
        float massBreakfastGramm = massBreakfast * 1000.0F;
        System.out.println("Вес одного завтрака " + massBreakfastGramm + " грамм, или " + massBreakfast + " килограмм");
    }
}
