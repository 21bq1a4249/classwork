class HandleError{
    public static void main(String args[]){
         int a=0,b=0,c=0;
         Random r=new Random();
         for(inti=0,i<32000;i++){
            try{
              b=r.nextInt();
              c=r.nextInt();
              a=12345/(b/c);
            }
            catch(ArithematicException e){
                 System.out.println("division by zero");
                 a=0;
            }
            System.out.println("a: "+a);
         
          }
    }
}