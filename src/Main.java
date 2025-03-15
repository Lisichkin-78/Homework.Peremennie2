public class Main {
    public static void main(String[] args) {
        System.out.println("переменные2");
        System.out.println("Задание 1.");
        int a = 100000;
        System.out.println("Значение переменной a с типом int равно " +a);
        byte b = 8;
        System.out.println("Значение переменной b с типом byte равно " +b);
        short s = 23_142;
        System.out.println("Значение переменной s с типом short равно " +s);
        long l = 12_239_254_213L;
        System.out.println("Значение переменной l с типом long равно " +l);
        float f = 123.345f;
        System.out.println("Значение переменной f с типом flat равно " +f);
        double d = 34765.459865747;
        System.out.println("Значение переменной d с типом double равно " +d);

        System.out.println("Задание 2.");
        float fSecond = 27.12f;
        long lSecond = 1_876_789_655;
        double dSecond = 2.786;
        short sSecond = 569;
        short sThird = -159;
        short sFourth = 27897;
        byte bSecond = 67;

        System.out.println("Задание 3.");
        int studentsFirstClass = 23;
        int studentsSecondClass =  27;
        int studentsThirdClass =30;
        int  totalStudents = studentsFirstClass + studentsSecondClass + studentsThirdClass;
        short totalSheetsPapeer = 480;
        int sheetPaperPerStudent = totalSheetsPapeer / totalStudents;
        System.out.println("На каждого ученика рассчитано " +sheetPaperPerStudent+ " листов бумаги");

        System.out.println("Задание 4.");
        int bottlesPerTwoMin = 16;
        int bottlesPerMin = bottlesPerTwoMin/2;
        System.out.println("За минуту машина произвела " + bottlesPerMin + " штук бутылок");
        int bottlesPerTwentyMin = bottlesPerMin * 20;
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMin + " штук бутылок");
        int bottlesPerDay = (bottlesPerMin * 60)* 24;
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        int bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За три дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        int bottlesPerMonth = bottlesPerDay * 31;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        System.out.println("Задание 5.");
        byte totalCansOfPaint = 120;
        byte brownPaintPerClass = 4;
        byte whitePaintPerClass = 2;
        int paintPerOneClass = brownPaintPerClass + whitePaintPerClass;
        int totalClasses = totalCansOfPaint / paintPerOneClass;
        int totalWhitePaint = totalClasses * whitePaintPerClass;
        int totalBrownPaint = totalClasses * brownPaintPerClass;
        System.out.println("В школе, где " + totalClasses+ " классов, нужно " +totalWhitePaint+ " банок белой краски и " +totalBrownPaint+ " банок коричневой краски");

        System.out.println("Задание 6.");
        byte banana = 5;
        byte bananaWeight = 80;
        int totalBananaWeight = bananaWeight * banana;
        short milkWeightOneHundredMl = 105;
        float milkWeightPerOneMl = 100f / milkWeightOneHundredMl;
        float totalMilkWeight = milkWeightPerOneMl * 200f;
        byte iceСream = 2;
        byte weightIceСream = 100;
        int totalWeightIceCream = iceСream * weightIceСream;
        byte eggs = 4;
        byte weightEggs = 80;
        int totalWeightEggs = eggs * weightEggs;
        float burdaWeightInGramm = totalBananaWeight + totalMilkWeight + totalWeightIceCream + totalWeightEggs;
        float burdaWeightInKg = burdaWeightInGramm / 1000f;
        System.out.println("завтрак чемпиона в граммах " + burdaWeightInGramm + ", что в переводе на килограммы составляет " + burdaWeightInKg);

        System.out.println("Задание 7");
        byte owerWeightKg = 7;
        int owerWeightGr = owerWeightKg *1000;
        short lightCorrectWeight = 250;
        short hardCorrectWeight = 500;
        int bestResult = owerWeightGr / hardCorrectWeight;
        int longResult = owerWeightGr / lightCorrectWeight;
        System.out.println("теряя по 250 мг ежедневно (на чиле, на расслабоне) спортсмен придет в форму через " +longResult+ " дней, а по 500 - через " + bestResult);
        int middleResult =  ( longResult - bestResult ) / 2;
        System.out.println(" чрезмерно не напрягаясь и, тайком, кушая пончики, спортсмену понадобиться " + middleResult + " дней, чтобы прийти в форму");

        System.out.println("задание 8");
        int mariaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float increasePercent = 0.1f;
        float increasePercentMariaSalary = mariaSalary * increasePercent;
        float increasePercentDenisSalary = denisSalary * increasePercent;
        float increasePercentKristinaSalary = kristinaSalary * increasePercent;
        int mariaYearSalary = mariaSalary * 12;
        float newMariaSalary = mariaSalary + increasePercentMariaSalary;
        int denisYearSalary = denisSalary * 12;
        float newDenisSalary = denisSalary + increasePercentDenisSalary;
        int kristinaYearSalary = kristinaSalary * 12;
        float newKristinaSalary = kristinaSalary + increasePercentKristinaSalary;
        float mariaYearNewSalary = newMariaSalary * 12;
        float denisYearNewSalary = newDenisSalary * 12;
        float kristinaYearNewSalary = newKristinaSalary * 12;
        float difYearMariaSalary = mariaYearNewSalary - mariaYearSalary;
        float difYearDenisSalary = denisYearNewSalary - denisYearSalary;
        float difKristinaSalary = kristinaYearNewSalary - kristinaYearSalary;
        System.out.println("Маша теперь получает " + newMariaSalary+ " рублей. Годовой доход вырос на " + difYearMariaSalary + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary+ " рублей. Годовой доход вырос на " + difYearDenisSalary + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary+ " рублей. Годовой доход вырос на " + difKristinaSalary + " рублей");
    }
}