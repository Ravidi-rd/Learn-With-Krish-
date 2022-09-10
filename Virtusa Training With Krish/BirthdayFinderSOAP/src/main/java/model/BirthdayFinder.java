package model;

import javax.jws.WebMethod;
import javax.jws.WebService;

import service.ServiceImpl;

@WebService
public class BirthdayFinder {

    ServiceImpl serviceImpl=new ServiceImpl();

    @WebMethod
    public int calculate(int year,int month,int day){

        return serviceImpl.calculate(year, month, day);

    }




}

