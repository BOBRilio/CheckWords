import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String string = "java is great java is fun";
        String[] words = string.split(" "); // Разделил строку на массив слов
        HashMap<String, Integer> map = new HashMap();
        for (String word : words) {              // Через фор-ейч прошелся по массиву и положил слова с ключами с мапу
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1); // Если слово уже есть прибавил к его ключу +1
            }
            else{
                map.put(word,1);         // Если слова нет, положил его и присвоил ключ 1
            }
            System.out.println(word); // Вевел каждое слово массива
        }
        System.out.println(map); // Вывел всю мапу







    }







    //            : Задание "Подсчет слов"
//    Это задание чуть сложнее, но очень полезное для понимания силы HashMap.
//    Задача:
//    Возьми строку с текстом: "java is great java is fun"
//    Разбей её на отдельные слова (подсказка: метод split(" ")).
//    Создай HashMap<String, Integer>.
//    Посчитай, сколько раз каждое слово встречается в тексте.
//    Если слово еще не в карте — добавь его со значением 1.
//    Если слово уже есть — увеличь его значение на +1.
//    Выведи результат: слово: количество.
}
