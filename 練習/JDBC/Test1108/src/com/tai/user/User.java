package com.tai.user;

public class User {
   private int eid;
   private String ename;
   private int eage;

   public User(){
      super();
   }
   @Override
   public String toString()
   {
      return "User{" +
              "eid=" + eid +
              ", ename='" + ename + '\'' +
              ", eage=" + eage +
              '}';
   }

   public int getEid()
   {
      return eid;
   }

   public void setEid(int eid)
   {
      this.eid = eid;
   }

   public String getEname()
   {
      return ename;
   }

   public void setEname(String ename)
   {
      this.ename = ename;
   }

   public int getEage()
   {
      return eage;
   }

   public void setEage(int eage)
   {
      this.eage = eage;
   }

   public User(int eid, String ename, int eage)
   {
      this.eid = eid;
      this.ename = ename;
      this.eage = eage;
   }
}
