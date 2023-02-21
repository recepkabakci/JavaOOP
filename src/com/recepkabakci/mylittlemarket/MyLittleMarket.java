package com.recepkabakci.mylittlemarket;


import java.time.LocalDate;


import com.recepkabakci.mylittlemarket.model.person.Customer;
import com.recepkabakci.mylittlemarket.model.person.Employee;
import com.recepkabakci.mylittlemarket.model.person.EmployeePosition;

import com.recepkabakci.mylittlemarket.model.product.Asset;

import com.recepkabakci.mylittlemarket.model.product.MilkProduct;
import com.recepkabakci.mylittlemarket.model.product.MilkType;

public class MyLittleMarket {

	public static void main(String[] args) {
//		Person   p1 = new Person("Kişi 1", LocalDate.of(1979, 4, 20));  You cannot instantiate  an abstract class.
//		Person   p2 = new Person("Kişi 2", LocalDate.of(1980, 4, 20));  You cannot instantiate  an abstract class.
		Employee e1 = new Employee("Çalışan 1", LocalDate.now());
		Employee e2 = new Employee("Çalışan 2", LocalDate.now());
		e1.setPosition(EmployeePosition.MANAGER);
		e2.setPosition(EmployeePosition.CASHIER);
	
	Customer c1 = new Customer("Müşteri 1", LocalDate.of(1977, 4, 5));
	Customer c2 = new Customer("Müşteri 2", LocalDate.of(1987, 4, 5));

//		System.out.println(p1);
//		System.out.println(p2);
		System.out.println(c1);		System.out.println(c2);		System.out.println(e1);
		System.out.println(e2);
		
		
		MilkProduct mP1 = new MilkProduct("Süt", 10.0, LocalDate.now(), 100, 15.0, "Şişe");
		mP1.setSubProductName("Çukulatalı Süt");
		mP1.setType(MilkType.NON_FAT);
		
		MilkProduct mP2 = new MilkProduct("peynir", 45.0, LocalDate.now(), 20, 55.0, "Kilo");
		System.out.println(mP1);
		System.out.println(mP2);
		
	Asset a1 = new Asset("Tezgah", 1500, LocalDate.of(2020, 12, 5), 1, 1);
		System.out.println(a1);		
		mP1.sell(10);
		
	}

}
