package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter 

{
    public void printGreatest(int a, int b, int c) 
    
    {
        
               if(a>b){
           
           if(a>c)
           {
               System.out.println(a);
           }
           
           else
           {
               System.out.println(c);
           }
           
         
           
       }
       
       else if (b>c)
               {
       System.out.println(b);
        
               }
               
               else{
                       System.out.println(c);
                       }

        
    }
}
