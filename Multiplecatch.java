class MultipleCatches{
    public static void main(String args[]){
         try{
           int a= args.length;
           System.out.println("a: "+a);
           int b=42/a;
           int c[]={1};
           c[42]=99;
         }
         catch(ArithematicException e){
           System.out.println("divide by zero: "+e);
         }
         catch(ArrayIndexOPutOfBoundsException e){
           System.out.println("AIO:"+ e);
         }
         System.out.println("after try/catch block");
         } 
}
         