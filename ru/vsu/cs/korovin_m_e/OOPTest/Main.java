package ru.vsu.cs.korovin_m_e.OOPTest;
import java.util.Iterator;
import main.java.ru.vsu.korovin_m_e.*;

public class Main {
    public static void main(String[] args) {

        testHashSet();
        testHashMultiSet();
    }

    private static void testHashSet() {
        System.out.println("HashSet");

        Set<String> set = new HashSet<>();

        System.out.println("1. Добавление элементов:");
        System.out.println("Добавлен 'apple': " + set.add("apple"));
        System.out.println("Добавлен 'banana': " + set.add("banana"));
        System.out.println("Добавлен 'apple' (дубликат): " + set.add("apple"));
        System.out.println("Множество: " + set);

        System.out.println("\n2. Проверка содержания:");
        System.out.println("Содержит 'apple': " + set.contains("apple"));
        System.out.println("Содержит 'orange': " + set.contains("orange"));

        System.out.println("\n3. Размерность:");
        System.out.println("Размер: " + set.size());
        System.out.println("Пусто: " + set.isEmpty());

        System.out.println("\n4. Удаление");
        System.out.println("Удален 'banana': " + set.remove("banana"));
        System.out.println("Удален 'orange' (несуществующий): " + set.remove("orange"));
        System.out.println("Множество после удаления: " + set);

        System.out.println("\n5. Итерация:");
        set.add("cherry");
        set.add("date");
        set.add("elderberry");

        System.out.print("Элементы через итератор: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.print("Элементы через foreach: ");
        for (String element : set) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("\n6. Очистка:");
        set.clear();
        System.out.println("Размер после очистки: " + set.size());
        System.out.println("Проверка на пустоту после очистки: " + set.isEmpty());
    }

    private static void testHashMultiSet() {
        System.out.println("\nHashMultiSet");

        MultiSet<String> multiSet = new HashMultiSet<>();

        System.out.println("1. Добавлениe:");
        System.out.println("Добавлен 'apple': " + multiSet.add("apple"));
        System.out.println("Добавлен 'apple': " + multiSet.add("apple"));
        System.out.println("Добавлен 'banana' x3: " + multiSet.add("banana", 3));
        System.out.println("Добавлен 'cherry' x2: " + multiSet.add("cherry", 2));
        System.out.println("Мультимножество: " + multiSet);

        System.out.println("\n2. Подсчет:");
        System.out.println("Количество 'apple': " + multiSet.count("apple"));
        System.out.println("Количество 'banana': " + multiSet.count("banana"));
        System.out.println("Количество 'orange': " + multiSet.count("orange"));

        System.out.println("\n3. размерность:");
        System.out.println("Общий размер: " + multiSet.size());
        System.out.println("Уникальных элементов: " + multiSet.uniqueSize());

        System.out.println("\n4. Удаление:");
        System.out.println("Удален один 'banana': " + multiSet.remove("banana"));
        System.out.println("Количество 'banana' после удаления: " + multiSet.count("banana"));
        System.out.println("Удален 'apple' x2: " + multiSet.remove("apple", 2));
        System.out.println("Количество 'apple' после удаления: " + multiSet.count("apple"));
        System.out.println("Удален 'orange' (несуществующий): " + multiSet.remove("orange"));

        System.out.println("\n5. итерация:");
        multiSet.add("date", 2);
        multiSet.add("fig", 1);

        System.out.print("Все элементы: ");
        int count = 0;
        for (String element : multiSet) {
            System.out.print(element + " ");
            count++;
            if (count > 20) break;
        }
        System.out.println();

        System.out.println("\n6. Финальное состояние:");
        System.out.println("Мультимножество: " + multiSet);
        System.out.println("Общий размер: " + multiSet.size());
        System.out.println("Уникальных элементов: " + multiSet.uniqueSize());
    }
}
