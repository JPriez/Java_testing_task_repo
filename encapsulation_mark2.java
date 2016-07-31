/* File name: Journal.java */
public class RecordJournal{

   private String name;
   private String idNum;
   private int mark;

   public int getMark(){
      return mark;
   }

   public String getName(){
      return name;
   }

   public String getIdNum(){
      return idNum;
   }

   public void setMark( int newMark){
      mark = newMark;
   }

   public void setName(String newName){
      name = newName;
   }

   public void setIdNum( String newId){
      idNum = newId;
   }
}

/* File name: Class Teacher */
public class Teacher{
   
   public static void main(String args[]){
      RecordJournal record = new RecordJournal();
      record.setName("James");
      record.setMark(20);
      record.setIdNum("12343ms");
      
      record.getName();
      record.getIdNum();
      record.getMark();
      
      System.out.print("Name : " + record.getName() + " Mark : " + record.getMark());
    }
}

/* File name: Student */
public class Student{
   public static void main(String args[]){
      record.getName();
      record.getIdNum();
      record.getMark();
   } 
}
