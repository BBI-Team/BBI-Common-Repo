class SingletonDatabase {
   private static SingletonDatabase sdbObject;

   private SingletonDatabase () {      
   }

   public static SingletonDatabase getInstance() {

      
      if(sdbObject == null) {
         sdbObject = new SingletonDatabase ();
      }

      
       return sdbObject;
   }

   public void getConnection() {
       System.out.println(" Connected.....to the Database");
   }
}

class Main 
{
   public static void main(String[] args)
 {
      SingletonDatabase sdb1;

      
      sdb1= SingletonDatabase.getInstance();
      
     sdb1.getConnection();
   }
}
