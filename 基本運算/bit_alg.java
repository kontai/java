//兩數值交換

class bit_alg{
public  static void main(String[] args) {
    int a=3,b=5;
    //Method I
    /*
    int temp=a;
    a=b;
    b=temp;
    System.out.println("a= "+a+" b= "+b);
    */

    //Method II
    /*
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a= "+a+" b= "+b);
    */

    //Method III
    a=a^b; //a=(3^5)
    b=a^b; //b=(3^5)^5 =3
    a=a^b; //a=(3^5)^3 =5
    System.out.println("異或a= "+a+" b= "+b);


    

}
    
}