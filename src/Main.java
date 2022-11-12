import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        String a = Arrays.toString(arr);
        System.out.println(a);
        System.out.println();
        // Задание 1
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Сумма трат за месяц составила … рублей».
        System.out.println("Task 1");
        int costAmountPerMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            costAmountPerMonth += arr[i];
            if (i == arr.length - 1) {
                System.out.println(" Сумма трат за месяц составила "+costAmountPerMonth+" рублей.");
            }
        }
        // Задание 2
        //Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей.
        // Максимальная сумма трат за день составила … рублей».
        System.out.println("Task 2");
        int maximumSpendingPerMonth =arr[0];
        int minimumSpendingPerMonth = arr[0];
        for (int allExpensesForTheMonth : arr) {
            if (maximumSpendingPerMonth < allExpensesForTheMonth) {
                maximumSpendingPerMonth = allExpensesForTheMonth;
            }
            if (minimumSpendingPerMonth > allExpensesForTheMonth) {
                minimumSpendingPerMonth = allExpensesForTheMonth;
            }
        }
        System.out.println("«Минимальная сумма трат за день составила "+minimumSpendingPerMonth +" рублей.");
        System.out.println("Максимальная сумма трат за день составила "+maximumSpendingPerMonth+" рублей.");
        // Задание 3
        //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных
        // 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц
        // (то есть сумму всех трат за месяц поделить на количество дней),
        // и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        // **Важно помнить:** подсчет среднего значения может иметь остаток
        // (то есть быть не целым, а дробным числом).
        System.out.println("Task 3");
        float averageAmountSpent = 0f;
       float lengthArray=arr.length;
        for (int sumOfNumbers : arr) {
            averageAmountSpent += sumOfNumbers /  lengthArray;
        }
        System.out.println(" Средняя сумма трат за месяц составила "+averageAmountSpent+" рублей.");
        // Задание 4
        //Отойдем от подсчетов.
        //В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О.
        // сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович»
        // мы имеем «чивонавИ навИ вонавИ».
        //Данные с именами сотрудников хранятся в виде массива символов (char[]).
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        // В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено "Ivanov Ivan".
        //Важно: не используйте дополнительные массивы для решения этой задачи.
        // Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном
        // порядке.
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(char i =0; i<reverseFullName.length/2;i++){
        char name =(reverseFullName[reverseFullName.length -i -1]);
            reverseFullName[reverseFullName.length-i-1]=reverseFullName[i];
            reverseFullName[i] = name;
        }
        for (char fullName : reverseFullName) {
            System.out.print(fullName);
        }
    }
}