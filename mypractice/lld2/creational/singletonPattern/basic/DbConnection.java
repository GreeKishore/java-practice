package mypractice.lld2.creational.singletonPattern.basic;

import java.util.List;

public class DbConnection {
    String url;
    String password;
    String userName;
    List<TcpConnectionPool> pool;
    static DbConnection dbConnectionInstance = null;

    //Step1: making constructor private to prevent creating many objects of this class
    private DbConnection(){

    }
    /*
    Step2: Since after making constructor private we will not be able to create even a single object. we are creating a public
    method to get the object of this class
    */
    public static DbConnection getDbConnectionInstance(){
        if(dbConnectionInstance==null){
            dbConnectionInstance = new DbConnection();
        }
        //return new DbConnection();// ->changed to  return dbConnectionInstance;
        return dbConnectionInstance;
    }
    /*
    Step3: Even to use this method we need a single object rt. So to avoid it we are making this method as static, So that
    we do not need object to call this particular method
     */
    /*
    Step 4: After changing the method to static now, again we will be able to create multiple objects using the classname.methodname
    So, we are doing some condition checks like
        1. Created a DbConnection variable named dbConnectionInstance and i've initialised it to null.
        2. the created variable is static as we are gong to use inside static method
        3. check if instance is null. if null we are creating the new instance else returning the old instance
     */

}