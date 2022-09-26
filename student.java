class prog {
   // declared static variable
   static String FirstName="Amitabh";
   static String LastName="Bachhan";
   static int age=69;
   
   
   //print using static block
   class static_block{
   static String FirstName1;
   static String LastName1;
   static int age1;

   static {
   FirstName1="Rekha";
   LastName1="Bachhan";
   age1 = 45;
   System.out.println(FirstName+" "+LastName+" "+age);
   }
   
   }
   
   
   
   public static void main(String[] args) {

   //static_block t1=new static_block();
   System.out.println(static_block.FirstName1);
   
   // print using static method
   printUsingStaticMethod();
   
   //print using static variable
   printUsingStaticVariable();
   }
   
   
   //print using static method
   public static void printUsingStaticMethod(){
   String FirstName2="Jaya";
   String LastName2="bachhan";
   int age2=54;
   System.out.println(FirstName2+" "+LastName2+" "+age2);
   
   }
   
   
   //print using static variable
   public static void printUsingStaticVariable() {
   System.out.println(FirstName+" "+LastName+" "+age);
   }
   }