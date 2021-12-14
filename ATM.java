import java.util.Arrays;
import java.util.Collections;

class ATM {

    public int countBanknotes(int sum) {
        int[] cash = {500, 200, 100, 50, 20, 10, 5, 2, 1};  //Создаем массив с банкнотами
        Arrays.sort(new int[][]{cash}, Collections.reverseOrder()); //Сортировка от большего к меньшему
        int count = 0; // Счётчик купюр
        int helperDigit; // Дополнительная переменная
        int i = 0; // Условие для цикла
        while (i < cash.length) {
            helperDigit = cash[i];   // Присваем первую купюру (500)...(1)
            count += sum / helperDigit;  // Считаем сколько раз входит купюра в сумму
            sum %= helperDigit; // присваиваем сумме остаток от деления на данную купюру
            i++; // Шагаем дальше по циклу
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
