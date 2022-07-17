public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax() {
        int tax;
        if (this.salary >= 1000) {
            tax = this.salary * 3 / 100;
            return tax;
        } else {
            return 0;
        }
    }

    int bonus() {
        int bonus;
        if (this.workHours > 40) {
            bonus = (this.workHours * 30) - 1200;
            return bonus;
        } else {
            return 0;
        }
    }

    int raiseSalary() {
        int raiseSalary;
        int currentYear = 2022;
        if (currentYear - this.hireYear < 10) {
            raiseSalary = this.salary * 5 / 100;
            return raiseSalary;
        } else if (currentYear - this.hireYear >= 10 && currentYear - this.hireYear < 20) {
            raiseSalary = this.salary * 10 / 100;
            return raiseSalary;
        } else {
            raiseSalary = this.salary * 15 / 100;
            return raiseSalary;
        }
    }

    void print() {
        System.out.println("Calisanin Adi : " + this.name);
        System.out.println("Calisanin Maasi : " + this.salary + " TL ");
        System.out.println("Calisanin Bu ayki Calisma Saati : " + this.workHours + " Saat ");
        System.out.println("Calisanin Ise Baslangic Yili : " + this.hireYear);
        System.out.println("Calisanin Maasina Gore Vergisi : " + tax() + " TL ");
        System.out.println("Calisanin Bonuslari : " + bonus() + " TL ");
        System.out.println("Calisana Yapilan Maas Artisi : " + raiseSalary() + " TL ");
        System.out.println("Calisanin Vergi ve Bonuslar Sonucu Maasi : " + (this.salary + bonus() - tax()) + " TL ");
        System.out.println("Calisanin Maas Artisi Sonucu Toplam Maasi : " + (this.salary + bonus() - tax() + raiseSalary()) + " TL ");
        System.out.println("=====================");
    }
}
