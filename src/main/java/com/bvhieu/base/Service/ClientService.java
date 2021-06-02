package com.bvhieu.base.Service;

public class ClientService {


    public static void main(String[] args) {
        ExportService exportService = new ExportService();

        OrderService orderService = new OrderService();
        exportService.exportFile("orders.csv", orderService::writeContent);
        UserService userService = new UserService();
        exportService.exportFile("orders.csv", userService::writeContent);
    }
}
