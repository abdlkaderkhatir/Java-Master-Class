package com.abdelkader.M7_CLI_PROJECT.service;


import com.abdelkader.M7_CLI_PROJECT.dao.CustomerDao;
import com.abdelkader.M7_CLI_PROJECT.model.Customer;

public class CustomerService {

    // إضافة مستخدم جديد
    public static void addCustomer(int id, String name) {
        Customer customer = new Customer(id, name);
        CustomerDao.addCustomer(customer);
    }

    // عرض كل المستخدمين
    public static void viewAllCustomers() {
        Customer[] customers = CustomerDao.getAllCustomers();
        System.out.println("\n=== All Customers ===");
        for (Customer c : customers) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    // البحث عن مستخدم
    public static Customer getCustomerById(int id) {
        return CustomerDao.findById(id);
    }
}
