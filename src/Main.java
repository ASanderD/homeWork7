public class Main {
    public static void main(String[] args) {

        {
            System.out.println("task 1");
            int contribution = 15000; // переменная для значения вклада
            double total = 0; // имеем рублей первоначально
            int bank = 2_459_000;
            int monthsNumber = 0; // количество месяцев
            double procent = 1D/100;
            while (total < bank) { // объявление цикла с условием его выполнения
                total = total + total * procent; // с учетом % по вкладу
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
            for (i--; i >= 1; i--) { //объявление цикла for с условием (при запуске цикла уменьшили переменную i на 1, т.к. после цикла while значение 11 (можно было это сделать до цикла)
                System.out.print(i + " "); // вывод в консоль результатов
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        {
            System.out.println("task 3");
            int populationOfYContry = 12_000_000; // население на момент начала отсчета
            int fertilityPerThousand = 17; // переменная - рождаемость на 1000 человек
            int mortalityPerThousand = 8; // переменная - смертность на 1000 человек
            for (int year = 1; year <= 10; year++) { //объявление цикла for с объявлением переменной year, условием и счетчиком
                populationOfYContry = populationOfYContry + populationOfYContry * (fertilityPerThousand - mortalityPerThousand) / 1000; // рассчет ежегодного прироста населения
                System.out.println("Год " + year + ", численность населения составляет " + populationOfYContry); // вывод результатов в консоль
            }
        }
        System.out.println(" ");
        {
            System.out.println("task 4");
            double contribution = 15_000D; //первоначальный вклад, объявляем переменную типа double, т.к. ежемесячное увеличение вклада на 7 % приведет к появлению копеек
            int monthNumber = 1; // переменная для подсчета количества месяцев
            int bank = 12_000_000;
            double procent  = 7D/100;
            while (contribution <= bank) { // цикл с условием
                contribution = contribution + contribution * procent; // расчет ежемесячного увеличения вклада
                System.out.printf("Месяц %s, сумма накоплений равна %.2f\n", monthNumber, contribution); // вывод ежемесячнорго результата в консоль
                monthNumber++; // счетчик количества месяцев
            }
        }
        System.out.println(" ");
        {
            System.out.println("task 5");
            double contribution = 15000; //первоначальный вклад, объявляем переменную типа double, т.к. ежемесячное увеличение вклада на 7 % приведет к появлению копеек
            int monthNumber = 1; // переменная для подсчета количества месяцев
            int bank = 12_000_000;
            double procent = 7D/100;
            while (contribution <= bank) { // цикл с условием
                contribution = contribution + contribution * procent; // расчет ежемесячного увеличения вклада
                if (monthNumber % 6 == 0) { //условный оператор вывода только каждого 6-го месяца
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
            double procent = 7D/100;
            for (int monthNumber = 1; monthNumber <= year * 12; monthNumber++) { //цикл с условием
                contribution = contribution + contribution * procent; // расчет ежемесячного увеличения вклада
                if (monthNumber % 6 == 0) //условный оператор вывода только каждого 6-го месяца)
                {
                    System.out.printf("Месяц %s, сумма накоплений равна %.2f\n", monthNumber, contribution); // вывод результата в консоль за каждые 6 месяцев
                }
            }
        }
        System.out.println(" ");
        {
            System.out.println("task 7");
            int friday = 4; //объявляем переменную - день недели для пятницы
            for (int day = 1; day <= 31; day++) {
                if ((day - 1) % 7 == (friday - 1)) {
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет."); // вывод в консоль
                }
            }
        }

        System.out.println(" ");
        {
            System.out.println("task 8");
            int comet = 79; // переменная для присвоения года пролета комметы
            int year; // переменная для начальной точки оператора цикла перебора лет
            int yearToday = 2023; // переменная для фиксации текущего года
            int yearBefore = yearToday - 200; // переменная для опредения года за 200 лет до текущего
            int yearAfter = yearToday + 100; // переменная для опредения года после 100 лет от текущего
            for (year = 0; year <= yearAfter; year += comet) { // оператор цикла перебора лет
                if (year % comet == 0 && year >= yearBefore) { // условный оператор для определения лет, в которые пролетает комета за заданный период
                    System.out.println(year); // вывод в консоль
                }
            }
        }
    }
}