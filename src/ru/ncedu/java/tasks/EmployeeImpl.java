package ru.ncedu.java.tasks;

public class EmployeeImpl implements Employee {
    /**
     * @return Зарплата сотрудника на настоящий момент.
     */
    @java.lang.Override
    public int getSalary() {
        return 0;
    }

    /**
     * Увеличивает зарплату сотрудника на заданное значение
     *
     * @param value Значение, на которое нужно увеличить
     */
    @java.lang.Override
    public void increaseSalary(int value) {

    }

    /**
     * @return Имя сотрудника
     */
    @java.lang.Override
    public String getFirstName() {
        return null;
    }

    /**
     * Устанавливает имя сотрудника
     *
     * @param firstName Новое имя
     */
    @java.lang.Override
    public void setFirstName(String firstName) {

    }

    /**
     * @return Фамилия сотрудника
     */
    @java.lang.Override
    public String getLastName() {
        return null;
    }

    /**
     * Устанавливает фамилию сотрудника
     *
     * @param lastName Новая фамилия
     */
    @java.lang.Override
    public void setLastName(String lastName) {

    }

    /**
     * @return Имя и затем фамилия сотрудника, разделенные символом " " (пробел)
     */
    @java.lang.Override
    public String getFullName() {
        return null;
    }

    /**
     * Устанавливает Менеджера сотрудника.
     *
     * @param manager Сотрудник, являющийся менеджером данного сотрудника.
     *                НЕ следует предполагать, что менеджер является экземпляром класса EmployeeImpl.
     */
    @java.lang.Override
    public void setManager(Employee manager) {

    }

    /**
     * @return Имя и фамилия Менеджера, разделенные символом " " (пробел).
     * Если Менеджер не задан, возвращает строку "No manager".
     */
    @java.lang.Override
    public String getManagerName() {
        return null;
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
        return null;
    }
}
