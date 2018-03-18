package ru.ncedu.java.tasks;

public class EmployeeImpl implements Employee {
    private String name = "";
    private String lastName = "";
    private int salary = 1000;
    private Employee manager = null;

    /**
     * @return Зарплата сотрудника на настоящий момент.
     */
    @java.lang.Override
    public int getSalary() {
        return this.salary;
    }

    /**
     * Увеличивает зарплату сотрудника на заданное значение
     *
     * @param value Значение, на которое нужно увеличить
     */
    @java.lang.Override
    public void increaseSalary(int value) {
        this.salary += value;
    }

    /**
     * @return Имя сотрудника
     */
    @java.lang.Override
    public String getFirstName() {
        return this.name;
    }

    /**
     * Устанавливает имя сотрудника
     *
     * @param firstName Новое имя
     */
    @java.lang.Override
    public void setFirstName(String firstName) {
        this.name = firstName;
    }

    /**
     * @return Фамилия сотрудника
     */
    @java.lang.Override
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Устанавливает фамилию сотрудника
     *
     * @param lastName Новая фамилия
     */
    @java.lang.Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return Имя и затем фамилия сотрудника, разделенные символом " " (пробел)
     */
    @java.lang.Override
    public String getFullName() {
        return this.name + " " + this.lastName;
    }

    /**
     * Устанавливает Менеджера сотрудника.
     *
     * @param manager Сотрудник, являющийся менеджером данного сотрудника.
     *                НЕ следует предполагать, что менеджер является экземпляром класса EmployeeImpl.
     */
    @java.lang.Override
    public void setManager(Employee manager) {
        this.manager = manager;
    }

    /**
     * @return Имя и фамилия Менеджера, разделенные символом " " (пробел).
     * Если Менеджер не задан, возвращает строку "No manager".
     */
    @java.lang.Override
    public String getManagerName() {
        return (this.manager != null) ? this.manager.getFullName() : "No manager";
    }

    /**
     * Возвращает Менеджера верхнего уровня, т.е. вершину иерархии сотрудников,
     * в которую входит данный сотрудник.
     * Если над данным сотрудником нет ни одного менеджера, возвращает данного сотрудника.
     * Замечание: поскольку менеджер, установленный методом {@link #setManager(Employee)},
     * может быть экзепляром другого класса, при поиске топ-менеджера нельзя обращаться
     * к полям класса EmployeeImpl. Более того, поскольку в интерфейсе Employee не объявлено
     * метода getManager(), поиск топ-менеджера невозможно организовать в виде цикла.
     * Вместо этого нужно использовать рекурсию (и это "более объектно-ориентированно").
     */
    @java.lang.Override
    public Employee getTopManager() {
       // Employee topManager = new EmployeeImpl();

        if (this.manager == null) {
            return this;
        }

        return this.manager.getTopManager();
    }

    public static void main(String[] args) {
        EmployeeImpl testEmployee = new EmployeeImpl();
        EmployeeImpl testEmployee2 = new EmployeeImpl();


        System.out.println(testEmployee.getFirstName());
        System.out.println(testEmployee.getLastName());
        System.out.println(testEmployee.getFullName());

        System.out.println();

        testEmployee.setFirstName("Andrey");
        testEmployee.setLastName("Shagov");
        System.out.println(testEmployee.getFullName());

        System.out.println();

        testEmployee2.setFirstName("Mikhail");
        testEmployee2.setLastName("mitrikas");

        System.out.println("getManagerName(): " + testEmployee.getManagerName());
        System.out.println("geTopManager.getfullname(): " + testEmployee.getTopManager().getFullName());

        testEmployee.setManager(testEmployee2);
        System.out.println("getManagerName(): " + testEmployee.getManagerName());
        System.out.println("geTopManager.getfullname(): " + testEmployee.getTopManager().getFullName());

        Employee emp = new EmployeeImpl();

    }
}
