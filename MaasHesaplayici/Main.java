package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Emin", 2000, 45, 1985);

        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        e1.toString();

        Employee e2 = new Employee("Merve", 4000, 50, 2016);
        e2.tax();
        e2.bonus();
        e2.raiseSalary();
        e2.toString();

        Employee e3 = new Employee("Ahmet",800,20,2004);
        e3.tax();
        e3.bonus();
        e3.raiseSalary();
        e3.toString();
    }
}
