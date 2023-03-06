import java.util.Scanner;

public class Main {


  //создаем сканер для чтения ввода
  static Scanner scanner = new Scanner(System.in);  

  public static void main(String[] args) throws Exception {

    System.out.println("\nТестовое задание КАЛЬКУЛЯТОР\n\nКалькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя целыми числами от 1 до 10 (a + b, a - b, a * b, a / b)\n");
    System.out.println("Input:");
    
   // передаем введенную строку в метод Calc (прописан далее) и печатаем результат
    System.out.println(calc(scanner.nextLine())); 
  
  }

  // метод Calc
  public static String calc(String input) throws Exception {

    System.out.println("Output:");
     //создаем переменные
    int a, b;

    // разделяем введенную строку по символу пробела
    String[] parse = input.split(" ");
    // проверяем количество введенных значений (по условию три значения - два числа  и символ операции)
    if (parse.length != 3) {
      throw new Exception("invalid input");
    }
    // присваиваем числовые значения ранее созданным переменным
    a = Integer.parseInt(parse[0]);
    b = Integer.parseInt(parse[2]);
    // проверяем на включение чисел в диапазон от 1 до 10, иначе выводим ошибку
    if (a < 1 || a > 10 || b < 1 || b > 10){
    throw new Exception("incorrect number range");
    }

    // присваиваем переменной значение введенного символа операции
    char symbol = parse[1].charAt(0);
    // выполняем математическую операцию и возвращаем результат, конвертируя число в строку(по условию задания). Если введенный символ не равен +-/*, выводим ошибку
    switch (symbol){
      case '+':
         return String.valueOf(a + b);
      case '-':
        return  String.valueOf(a - b);
      case '/':
          return String.valueOf(a / b);
      case '*':
          return String.valueOf(a * b);
      default:
          throw new Exception("invalid operator");
    }
  }
}
