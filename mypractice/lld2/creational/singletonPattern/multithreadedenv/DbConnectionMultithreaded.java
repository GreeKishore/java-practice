package mypractice.lld2.creational.singletonPattern.multithreadedenv;




import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConnectionMultithreaded {
    String url;
    String password;
    String userName;
    List<TcpConnectionPool> pool;
    static Lock lock = new ReentrantLock();
    /*Step 5: we are just eager loading the object. so that this will be executed only during the class load time
     */
    //static DbConnectionMultithreaded dbConnectionInstance = null; -> changed to below line
    static DbConnectionMultithreaded dbConnectionInstance = new DbConnectionMultithreaded();
    //Step1: making constructor private to prevent creating many objects of this class
    private DbConnectionMultithreaded(){

    }
    /*
    Step2: Since after making constructor private we will not be able to create even a single object. we are creating a public
    method to get the object of this class
    */
//    public static DbConnectionMultithreaded getDbConnectionInstance(){
//        /*if(dbConnectionInstance==null){
//            dbConnectionInstance = new DbConnectionMultithreaded();
//        }*/ /*-> Step 6: this is not needed as we have eager loaded. and post eager loading whenever needed we are just
//        providing using below return statement    */
//
//        //return new DbConnection();// ->changed to  return dbConnectionInstance;
//        return dbConnectionInstance;
//    }
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
    /*
    eager loading also has problem when we have many singletons during class load time it will make our application slower
    another big problem is we will not be able to ass parameters to contructors during run time. eg password for db connecton
    will not be able to pass duing the runtime. so here comes the locks to rescue
     */
//    public static synchronized DbConnectionMultithreaded getDbConnectionInstance(){
//        if(dbConnectionInstance==null){
//            dbConnectionInstance = new DbConnectionMultithreaded();
//        }
//        return dbConnectionInstance;
//    }-> this part will solve our problem but only once we need a lock after that we just need to return the instanec
    //so we need to think if need locks on entire method

    //final version
    public static DbConnectionMultithreaded getDbConnectionInstance(){
        if(dbConnectionInstance==null){
            lock.lock();
            dbConnectionInstance = new DbConnectionMultithreaded();
        }
        lock.unlock();
        return dbConnectionInstance;
    }
}