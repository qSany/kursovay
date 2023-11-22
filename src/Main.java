public class Main {
    private Employee[] employees = new Employee[10];
    private int employeeCount = 0;

    // Добавление нового сотрудника в массив
    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = employee;
            System.out.println("Сотрудник " + employee.getFullName() + " успешно добавлен.");
        } else {
            System.out.println("Массив сотрудников уже заполнен. Невозможно добавить нового сотрудника.");
        }
    }

    // Поиск сотрудника с минимальной зарплатой
    public Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    // Поиск сотрудника с максимальной зарплатой
    public Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    // Расчет средней зарплаты всех сотрудников
    public double calculateAverageSalary() {
        double totalSalary = calculateTotalSalaryExpenses();
        return totalSalary / employeeCount;
    }

    // Расчет общей зарплаты всех сотрудников
    private double calculateTotalSalaryExpenses() {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Main main = new Main();

        Employee employee1 = new Employee("Иван Иванов", 50000);
        Employee employee2 = new Employee("Петр Петров", 60000);
        Employee employee3 = new Employee("Алексей Алексеев", 55000);

        main.addEmployee(employee1);
        main.addEmployee(employee2);
        main.addEmployee(employee3);

        Employee employeeWithMinSalary = main.findEmployeeWithMinSalary();
        if (employeeWithMinSalary != null) {
            System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary.getFullName());
        } else {
            System.out.println("Нет сотрудников в массиве.");
        }

        Employee employeeWithMaxSalary = main.findEmployeeWithMaxSalary();
        if (employeeWithMaxSalary != null) {
            System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary.getFullName());
        } else {
            System.out.println("Нет сотрудников в массиве.");
        }

        double averageSalary = main.calculateAverageSalary();
        System.out.println("Средняя зарплата: " + averageSalary);
    }
}
