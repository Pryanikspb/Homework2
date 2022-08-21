public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        byte a = 5;
        short b = 30_000;
        int c = 100_000;
        long d = 100_000L;
        System.out.println(a + b + c + d);
        float e = 1.001f;
        double f = 2.000000003;
        System.out.println("это float " + e + " а это double " + f );
        char g = 35;
        System.out.println(g);
        boolean aIstGross = a > 100;
        System.out.println(aIstGross);
        //Задание 2
        System.out.println("Задание 2");
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float totalWeight = firstBoxer + secondBoxer;
        float differenceWeight = (secondBoxer - firstBoxer);
        System.out.println("Общий вес " + totalWeight);
        System.out.println("Разница в весе " + differenceWeight);
        //Задание 3
        System.out.println("Задание 3");
        short bananasWeight = 80;
        short bananasNumber = 5;
        int bananasSummary = bananasNumber * bananasWeight ;
        short milkMlSummary = 200;
        short milkGramsPer100Ml = 105;
        short milkOneServing = 100;
        int milkSummary = milkMlSummary / milkOneServing * milkGramsPer100Ml;
        short icecreamBriquettes = 2;
        short icecreamBriquettesWeight = 100;
        int icecreamSummery = icecreamBriquettes * icecreamBriquettesWeight ;
        short eggs = 4;
        short eggsWeight = 70;
        int eggsSummary = eggs * eggsWeight;
        int weightG = bananasSummary + milkSummary + icecreamSummery + eggsSummary;
        System.out.println("Общий вес завтрака в граммах " + weightG);
        float weightKg = weightG / 1000.f;
        System.out.println("Общий вес завтрака в килограммах " + weightKg);
        //Задание 4
        System.out.println("Задание 4");
        short purposeKg = 7;
        int purposeG = purposeKg * 1000;
        short weightLossMin = 250;
        short weightLossMax = 500;
        int weightLoss250GPerDay = purposeG / weightLossMin;
        int weightLoss500GPerDay = purposeG / weightLossMax;
        int middleWeightLoss = (weightLoss250GPerDay + weightLoss500GPerDay) / 2;
        System.out.println("Дней для похудения по 250 грамм в день " + weightLoss250GPerDay);
        System.out.println("Дней для похудения по 500 грамм в день " + weightLoss500GPerDay);
        System.out.println("Среднее количество дней для похудения " + middleWeightLoss);
        //Задание 5
        System.out.println("Задание 5");
        int marySalary = 67760;
        int denSalary = 83690;
        int christinaSalary = 76230;
        int awardMary = marySalary * 10 / 100;
        int awardDen = denSalary * 10 / 100;
        int awardChristina = christinaSalary * 10 / 100;
        int changedMarySalary = marySalary + awardMary;
        int changedDenSalary = denSalary + awardDen;
        int changedChristinaSalary = christinaSalary + awardChristina;
        int yearMarySalaryChange = awardMary * 12;
        int yearDenSalaryChange = awardDen * 12;
        int yearChristinaSalaryChange = awardChristina * 12;
        System.out.println(awardMary);
        System.out.println("Маша теперь получает " + changedMarySalary + " рублей. Годовой доход вырос на " + yearMarySalaryChange +" рублей.");
        System.out.println("Денис теперь получает " + changedDenSalary + " рублей. Годовой доход вырос на " + yearDenSalaryChange +" рублей.");
        System.out.println("Кристина теперь получает " + changedChristinaSalary + " рублей. Годовой доход вырос на " + yearChristinaSalaryChange +" рублей.");


    }
}

