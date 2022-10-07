class Throwsdemo{
    static void throwOne(){
       System.out.println("inside throwone");
       throw new Illegalaccessexcveption("demo");
    }
    public static void main(String args[]){
         throwOne;
    }

}