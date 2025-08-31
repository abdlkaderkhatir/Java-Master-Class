package com.abdelkader.M7_CLI_PROJECT.dao;


import com.abdelkader.M7_CLI_PROJECT.model.Customer;

public class CustomerDao {
    private static Customer[] customers = new Customer[10];
    private static int index = 0;

    // إضافة مستخدم جديد
    public static void addCustomer(Customer customer) {
        customers[index++] = customer;
    }

    // جلب كل المستخدمين
    public static Customer[] getAllCustomers() {
        return customers;
    }

    // البحث عن مستخدم بـ id
    public static Customer findById(int id) {
        for (Customer c : customers) {
            if (c != null && c.getId() == id) return c;
        }
        return null;
    }
}
