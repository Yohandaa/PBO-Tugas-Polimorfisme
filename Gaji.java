package com.pbo2;

public class Gaji extends Pegawai {/*extend merupakan salah satu syarat dalam
    melakukan polymorphisme dari superclass ke subclass*/
    public double salary;

    public Gaji(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("memeriksa kelas gaji dalam surat");
        System.out.println("surat tertuju untuk " + getName() + " dengan gaji " + salary);
    }

    public void infoPegawai() {
        System.out.println("Informasi Gaji: " + getName() + " " + getAddress() + " " + getNumber() + " " + getSalary());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("menghitung pembayaran gaji untuk " + getName());
        return salary / 52;
    }
}
