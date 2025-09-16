package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {

//        UserDataProvider dataProvider=new UserDatabaseProvider();
//        UserManager userManagerWithDB=new UserManager(dataProvider);
//        System.out.println(userManagerWithDB.getUserInfo());
//
//
//        UserDataProvider webServiceProvider= new WebServiceDataProvider();
//        UserManager userMangerWithWS= new UserManager(webServiceProvider);
//        System.out.println(userMangerWithWS.getUserInfo());
//
//
//        UserDataProvider newDataBaseProvider= new NewDataBaseProvider();
//        UserManager userMangerWithNewDB= new UserManager(newDataBaseProvider);
//        System.out.println(userMangerWithNewDB.getUserInfo());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationCouplingCotext.xml");
        UserManager userManager= (UserManager) context.getBean("userManagerNewData");
        System.out.println(userManager.getUserInfo());

        UserManager userManager1=(UserManager) context.getBean("userManagerDataBase");
        System.out.println(userManager1.getUserInfo());

        UserManager userManager2=(UserManager)  context.getBean("userManagerWebService");
        System.out.println(userManager2.getUserInfo());
    }
    }


