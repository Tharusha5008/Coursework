/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service;

import edu.ijse.service.custom.impl.CategoryServiceImpl;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    public static ServiceFactory getInstance(){
    if(serviceFactory==null){
    serviceFactory =new ServiceFactory();
    }
    return serviceFactory;
    }
    public SuperService getService(ServiceType serviceType){
    switch (serviceType){
        case CATEGORY:
            return new CategoryServiceImpl();
        case BOOK:
            return null;
        default:
            return null;
    }
    }
    public enum ServiceType{
    CATEGORY, BOOK
    }
}
