public class Program {
    public static void main(String[] args) {
        ArrayListClass<Integer> intList = new ArrayListClass<>();
        intList.add(11); // добавление элемента
        intList.add(12);
        intList.add(13);
        intList.add(14);
        intList.add(15);
        intList.add(16);
        intList.add(61);
        intList.add(51);
        intList.add(41);
        intList.add(31);
        intList.add(21);
        intList.add(11);
        intList.printArray();
        intList.remForIdx(7); // удаление элемента по индексу
        intList.remForIdx(3); // удаление элемента по индексу
        intList.printArray();
        intList.removeData(11); // удаление элемента по значению
        intList.removeData(61); // удаление элемента по значению
        intList.printArray();
        System.out.println(intList.minData()); // Поиск минимального значения
        System.out.println(intList.maxData()); // Поиск максимального значения
        System.out.println(intList.sumData()); // Сумма элементов массива
        System.out.println(intList.multData()); // Произведение элементов массива
        System.out.println(intList.findIDX(33)); // Поиск элемента по индексу (если его нет то возвращает -1)
        System.out.println(intList.findData(333)); // Проверка наличия элемента в массиве.
                                                           // Возвращает true, если элемент - есть, false – нет.
        try {
            intList.BubbleSort();
            System.out.print("Результат:"); // Пузырьковая сортировка
            intList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayListClass<String> stringList = new ArrayListClass<>();
        stringList.add("Стол"); // добавление элемента
        stringList.add("Стул");
        stringList.add("Табуретка");
        stringList.add("Кресло");
        stringList.add("Полка");
        stringList.add("Телевизор");
        stringList.add("Пульт");
        stringList.add("Телефон");
        stringList.add("Кувшин");
        stringList.printArray();
        stringList.remForIdx(4); // удаление элемента по индексу
        stringList.printArray();
    }
}
