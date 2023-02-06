package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax;

        if (this.salary <= 1000) {
            tax = 0;
            //  this.salary = salary;
        } else {
            tax = (this.salary * 0.03);
            // this.salary = salary - (salary * 0.03);
        }
        return tax;
    }


    double bonus() {
        double bonus;
        if (this.workHours > 40) {
            bonus = ((workHours - 40) * 30);
            //  salary = salary + ((workHours - 40) * 30);
        } else {
            bonus = 0;
        }
        return bonus;
    }

    double raiseSalary() {
        double raise = 0;
        if (2021 - hireYear < 10) {
            raise = (salary * 0.05);
            // this.salary = salary + (salary * 0.05);
        } else if ((2021 - hireYear) < 20 && (2021 - hireYear) >= 10) {
            raise = (salary * 0.10);
            //   this.salary = salary + (salary * 0.10);
        } else if (2021 - hireYear >= 20) {
            raise = (salary * 0.15);
            //  this.salary = salary + (salary * 0.15);
        }

        return raise;
    }

    public String toString() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş artışı : " + this.raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş : " + (this.salary + this.bonus() - this.tax()));
        System.out.println("Toplam maaş = " + (this.salary + this.raiseSalary()));

        return null;
    }
}

