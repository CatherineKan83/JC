package main.java.ru.shum;

/**
 * Класс, представляющий руководителя.
 */
public class Manager extends Employee {

  /**
   * Конструктор руководителя.
   *
   * @param name   Имя руководителя
   * @param salary Зарплата руководителя
   * @param i
   */
  public Manager(String name, double salary, int age) {
    super(name, salary, age);
  }
  /**
   * Статический метод для повышения зарплаты сотрудников, кроме руководителей.
   *
   * @param employees Массив сотрудников
   * @param amount    Сумма повышения
   */
  public static void increaseSalary(Employee[] employees, double amount) {
    for (Employee employee : employees
    ) {
      if (!(employee instanceof Manager)) {
        employee.increaseSalary(amount);
      }
    }
  }

}
