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
    public static void task1() {
        System.out.println("Задача 1");
        byte apple = 50;
        System.out.println("Значение переменной apple с типом byte равно " + apple);
        short banana = 350;
        System.out.println("Значение переменной bananas с типом short равно " + banana);
        int tomato = 1050;
        System.out.println("Значение переменной tomatos с типом int равно " + tomato);
        long watermelon = 10500;
        System.out.println("Значение переменной watermelon с типом long равно " + watermelon);
        float price = 13.158f;
        System.out.println("Значение переменной price с типом float равно " + price);
        double money = 134.545675;
        System.out.println("Значение переменной money с типом double равно " + money);

    }
    public static void task2() {
        System.out.println("Задача 2");
        float mud = 27.12f;
        System.out.println("Значение переменной mud с типом float равно " + mud);
        long damage = 987678965549L;
        System.out.println("Значение переменной damage с типом long равно " + damage);
        double shadow = 2.786;
        System.out.println("Значение переменной shadow с типом double равно " + shadow);
        short bullets = 569;
        System.out.println("Значение переменной bullets с типом short равно " + bullets);
        short shield = -159;
        System.out.println("Значение переменной shield с типом shot равно " + shield);
        int health = 27897;
        System.out.println("Значение переменной health с типом int равно " + health);
        byte exp = 67;
        System.out.println("Значение переменной exp с типом byte равно " + exp);
    }
    public static void task3() {
        System.out.println("Задача 3");
        System.out.println("Класс Людмилы Павловны");
        int paper = 480;
        int classL = 23;
        int paperL = paper / classL;
        System.out.println("На каждого ученика рассчитано " + paperL + " листов бумаги");
        System.out.println("Класс Анны Сергеевны");
        int classA = 27;
        int paperA = paper / classA;
        System.out.println("На каждого ученика рассчитано " + paperA + " листов бумаги");
        System.out.println("Класс Екатерины Андреевны");
        int classE = 30;
        int paperE = paper / classE;
        System.out.println("На каждого ученика рассчитано " + paperE + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        System.out.println("Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты");
        int bottle = 16;
        int process1 = (bottle / 2) * 20;
        System.out.println("За 20 минут машина произвела " + process1 + " штук бутылок");
        int process2 = (bottle / 2) * 1440;
        System.out.println("За 1 день машина произвела " + process2 + " штук бутылок");
        int process3 = (bottle / 2) * 4320;
        System.out.println("За 3 дня машина произвела " + process3 + " штук бутылок");
        int process4 = (bottle / 2) * 44640;
        System.out.println("За 1 месяц машина произвела " + process4 + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int paintsCans = 120;
        System.out.println(paintsCans + " Банок краски");
        int whitePaintClass = 2;
        System.out.println(whitePaintClass + " Банки белой краски на класс");
        int browPaintClass = 4;
        System.out.println(browPaintClass + " Банки коричневой краски на класс");
        int schoolClass = paintsCans / (whitePaintClass + browPaintClass);
        int whitePaint = paintsCans / (whitePaintClass + browPaintClass) * whitePaintClass;
        int browPaint = paintsCans / (whitePaintClass + browPaintClass) * browPaintClass;
        System.out.println("В школе, где " + schoolClass + " классов, нужно " + whitePaint + " банок белой краски и " + browPaint + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short bananas = 400;
        System.out.println("Масса 5 бананов " + bananas + " грамм");
        short milk = 210;
        System.out.println("Масса 200 мл молока равно " + milk + " грамм");
        short iceCream = 200;
        System.out.println("Масса 2 брикетов мороженого " + iceCream + " грамм");
        short egg = 280;
        System.out.println("Масса 4 яиц " + egg + " грамм");
        int breakfastWeight = bananas + milk + iceCream + egg;
        System.out.println("Масса завтрака " + breakfastWeight + " грамм");
        int grPerKg = 1000;
        float breakfastWeightKg = (float) grPerKg / breakfastWeight;
        System.out.println("Масс завтрака " + breakfastWeightKg + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        short weight = 7000;
        System.out.println("Спортсмену нужно сбросить " + weight + " грамм");
        short loseMinWeight = 250;
        short loseMaxWeight = 500;
        int maxDays = weight / loseMinWeight;
        System.out.println("Если спортсмен каждый день будет терять по " + loseMinWeight + " грамм то он похудеет за " + maxDays + " дней");
        int minDays = weight / loseMaxWeight;
        System.out.println("Если спортсмен каждый день будет терять по " + loseMaxWeight + " грамм то он похудеет за " + minDays + " дней");
        int loseMidWeight = 300;
        int midDays = weight / loseMidWeight;
        System.out.println("В среднем если спортсмен каждый день будет терять по " + loseMidWeight + " грамм то он похудеет за " + midDays + " дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int monthsInYear = 12;
        int mashaSalary = 67760;
        int mashaSalaryYear = mashaSalary * monthsInYear;
        System.out.println("Зарплата Маши составляет " + mashaSalary + " рублей в месяц");
        int denisSalary = 83690;
        int denisSalaryYear = denisSalary * monthsInYear;
        System.out.println("Зарплата Дениса составляет " + denisSalary + " рублей в месяц");
        int christinaSalary = 76230;
        int christinaSalaryYear = christinaSalary * monthsInYear;
        System.out.println("Зарплата Кристины составляет " + christinaSalary + " рублей в месяц");
        int increaseYear = 10;
        System.out.println("Увеличение зарплаты в год составляет " + increaseYear + "% от текущей месячной");
        int mashaIncreaseSalary = (mashaSalary / increaseYear) + mashaSalary;
        int mashaIncreaseSalaryYear = (mashaIncreaseSalary * monthsInYear) - mashaSalaryYear;
        System.out.println("Маша теперь получает " + mashaIncreaseSalary + " рублей. Годовой доход вырос на " + mashaIncreaseSalaryYear + " рублей");
        int denisIncreaseSalary = (denisSalary / increaseYear) + denisSalary;
        int denisIncreaseSalaryYear = (denisIncreaseSalary * monthsInYear) - denisSalaryYear;
        System.out.println("Денис теперь получает " + denisIncreaseSalary + " рублей. Годовой доход вырос на " + denisIncreaseSalaryYear + " рублей");
        int christinaIncreaseSalary = (christinaSalary / increaseYear) + christinaSalary;
        int christinaIncreaseSalaryYear = (christinaIncreaseSalary * monthsInYear) - christinaSalaryYear;
        System.out.println("Кристина теперь получает " + christinaIncreaseSalary + " рублей. Годовой доход вырос на " + christinaIncreaseSalaryYear + " рублей");
    }
}