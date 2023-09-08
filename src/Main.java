public class Main {
    public static void main(String[] args) {
        {
            System.out.println("task 1");
            int contribution = 15000; // переменная для значения вклада
            int total = 0; // имеем рублей первоначально
            int monthsNumber = 0; // количество месяцев
            while (total < 2_459_000) { // объявление цикла с условием его выполнения
                total = total + total/100; // с учетом % по вкладу
                total = total + contribution; // процесс ежемесячного накопления
                monthsNumber++; // увеличение количества месяцев
                System.out.println("Месяц " + monthsNumber + ", сумма накоплений равна " + total + " рублей."); // вывод по порядку сумм накоплений за каждый месяц с учетом % по вкладу
            }
        }
        System.out.println(" ");
        {
            System.out.println("task 2");
            int i = 1; //объявление переменной
            while (i <= 10) { // объявление цикла while с условием
                System.out.print(i + " "); // вывод в консоль результатов
                i++; // увеличение переменной
            }
            System.out.println(" ");
            for (i--; i >= 1; i--){ //объявление цикла for с условием (при запуске цикла уменьшили переменную i на 1, т.к. после цикла while значение 11 (можно было это сделать до цикла)
                System.out.print(i + " "); // вывод в консоль результатов
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        {
            System.out.println("task 3");
            int populationOfYContry = 12_000_000; // население на момент начала отсчета
            int birthRateOfYContry = 17; // переменная - рождаемость на 1000 человек
            int mortalityOfYContry = 8; // переменная - смертность на 1000 человек
            for (int year = 1; year <= 10; year++) { //объявление цикла for с объявлением переменной year, условием и счетчиком
                populationOfYContry = populationOfYContry + (birthRateOfYContry - mortalityOfYContry) * 1000; // рассчет ежегодного прироста населения
                System.out.println("Год " + year + ", численность населения составляет " + populationOfYContry); // вывод результатов в консоль
            }
        }
        System.out.println(" ");
        {
            System.out.println("task 4");
            double contribution = 15000; //первоначальный вклад, объявляем переменную типа double, т.к. ежемесячное увеличение вклада на 7 % приведет к появлению копеек
            int monthNumber = 1; // переменная для подсчета количества месяцев
            while (contribution <= 12_000_000) { // цикл с условием
                contribution = contribution + contribution / 100 * 7; // расчет ежемесячного увеличения вклада
                System.out.printf("Месяц %s, сумма накоплений равна %.2f\n", monthNumber, contribution); // вывод ежемесячнорго результата в консоль
                monthNumber++; // счетчик количества месяцев
            }
        }
        System.out.println(" ");
        {
            System.out.println("task 5");
            double contribution = 15000; //первоначальный вклад, объявляем переменную типа double, т.к. ежемесячное увеличение вклада на 7 % приведет к появлению копеек
            int monthNumber = 1; // переменная для подсчета количества месяцев
            while (contribution <= 12_000_000) { // цикл с условием
                contribution = contribution + contribution / 100 * 7; // расчет ежемесячного увеличения вклада
                if (monthNumber % 6 == 0){ //условный оператор вывода только каждого 6-го месяца
                    System.out.printf("Месяц %s, сумма накоплений равна %.2f\n", monthNumber, contribution); // вывод результата в консоль за каждые 6 месяцев
                }
                monthNumber++; // счетчик количества месяцев
            }
        }
        System.out.println(" ");
        {
            System.out.println("task 6");
            double contribution = 15000; //первоначальный вклад, объявляем переменную типа double, т.к. ежемесячное увеличение вклада на 7 % приведет к появлению копеек
            int year = 9;
            //int monthNumber = 1; // переменная для подсчета количества месяцев
            for (int monthNumber = 1; monthNumber <= year * 12; monthNumber++) { //цикл с условием
                contribution = contribution + contribution / 100 * 7; // расчет ежемесячного увеличения вклада
                if (monthNumber % 6 == 0) //условный оператор вывода только каждого 6-го месяца)
                {
                    System.out.printf("Месяц %s, сумма накоплений равна %.2f\n", monthNumber, contribution); // вывод результата в консоль за каждые 6 месяцев
                }
            }
        }
        System.out.println(" ");
        {
            System.out.println("task 7");
            int friday = 3; //объявляем переменную - день недели для пятницы
            int day = 1; // переменная для дней месяца
            while (day <= 31) { // оператор цикла для перебора дней
                if (day == friday || day == friday + 7) { // условный оператор для проверки принадлежности дня месяца к пятнице
                    friday = day; // в случае выполнения условий оператора присвоение значения одной переменной другой
                    System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет."); // вывод в консоль
                }
                day++; //счетчик дней месяца (+1 за итерацию)
            }
        }
        System.out.println(" ");
        {
            System.out.println("task 8");
            int comet = 79; // переменная для присвоения года пролета комметы
            int year = 0; // переменная для начальной точки оператора цикла перебора лет
            int yearToday = 2023; // переменная для фиксации текущего года
            int yearBefore = yearToday - 200; // переменная для опредения года за 200 лет до текущего
            int yearAfter = yearToday + 100; // переменная для опредения года после 100 лет от текущего
            for (; year <= yearAfter; year++) { // оператор цикла перебора лет
                if (year == comet || year == comet + 79) { // условный оператор для определения лет, в которые пролетает комета
                    comet = year; // присвоение значения текущего года цикла в случае соблюдения условий цикла
                    if (year >= yearBefore && year <= yearAfter) {// условие для вывода информации в консоль за период по заданию
                        System.out.println(comet); // вывод в консоль
                    }
                }
            }
        }
    }
}