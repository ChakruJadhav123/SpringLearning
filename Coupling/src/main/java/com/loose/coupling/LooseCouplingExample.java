package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {

        UserDataProvider dataProvider=new UserDatabaseProvider();
        UserManager userManagerWithDB=new UserManager(dataProvider);
        System.out.println(userManagerWithDB.getUserInfo());


        UserDataProvider webServiceProvider= new WebServiceDataProvider();
        UserManager userMangerWithWS= new UserManager(webServiceProvider);
        System.out.println(userMangerWithWS.getUserInfo());


        UserDataProvider newDataBaseProvider= new NewDataBaseProvider();
        UserManager userMangerWithNewDB= new UserManager(newDataBaseProvider);
        System.out.println(userMangerWithNewDB.getUserInfo());
    }
    }


