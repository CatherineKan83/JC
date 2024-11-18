package main.java.ru.shum;

/**
 * Класс, представляющий сотрудника.
 */
public class Employee {

  private String name;
  private double salary;
  private int age;

  /**
   * Конструктор сотрудника.
   *
   * @param name   Имя сотрудника
   * @param salary Зарплата сотрудника
   */
  public Employee(String name, double salary, int age) {
    this.name = name;
    this.salary = salary;
    this.age = age;
  }

  /**
   * Получить имя сотрудника.
   *
   * @return Имя сотрудника
   */
  public String getName() {
    return name;
  }

  /**
   * Получить зарплату сотрудника.
   *
   * @return Зарплата сотрудника
   */
  public double getSalary() {
    return salary;
  }
  /**
   * Получить возраст сотрудника.
   *
   * @return возраст сотрудника
   */
  public double getAge() {
    return age;
  }

  /**
   * Повысить зарплату сотрудника.
   *
   * @param amount Сумма повышения
   */
  public void increaseSalary(double amount) {
    salary += amount;
  }

  /**
   * Переопределение метода toString().
   *
   * @return Строковое представление сотрудника
   */
  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", salary=" + salary +
        "age =" + age +'}';
  }
}
