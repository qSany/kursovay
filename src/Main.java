public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("John Smith", 1, 5000);
        employees[1] = new Employee("Emily Johnson", 2, 6000);
        employees[2] = new Employee("Michael Williams", 3, 5500);
        // добавьте остальных сотрудников в массив

        // 1. Получить список всех сотрудников со всеми имеющимися по ним данными
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }



        // 2. Посчитать сумму затрат на зарплаты в месяц
        double totalSalaryExpenses = calculateTotalSalaryExpenses(employees);
        System.out.println("Total salary expenses per month: " + totalSalaryExpenses);


        // 3. Найти сотрудника с минимальной зарплатой
        Employee minSalaryEmployee = findEmployeeWithMinSalary(employees);
        System.out.println("Employee with minimum salary: " + minSalaryEmployee.getFullName());

        // 4. Найти сотрудника с максимальной зарплатой
        Employee maxSalaryEmployee = findEmployeeWithMaxSalary(employees);
        System.out.println("Employee with maximum salary: " + maxSalaryEmployee.getFullName());

        // 5. Подсчитать среднее значение зарплат
        double averageSalary = calculateAverageSalary(employees);
        System.out.println("Average salary: " + averageSalary);

        // 6. Получить Ф. И. О. всех сотрудников
        System.out.println("Full names of all employees:");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static double calculateTotalSalaryExpenses(Employee[] employees) {
        double totalSalaryExpenses = 0.0;
        for (Employee employee : employees) {
            totalSalaryExpenses += employee.getSalary();
        }
        return totalSalaryExpenses;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.length;
    }
}