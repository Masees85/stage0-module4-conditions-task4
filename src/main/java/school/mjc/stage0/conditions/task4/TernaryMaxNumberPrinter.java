package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter 

{
    public void printGreatest(int n1, int n2, int n3) 
    
    {
        max = (n1 > n2) ?
          (n1 > n3 ? n1 : n3) :
          (n2 > n3 ? n2 : n3);
     
    
         System.out.println(max);
        
    }
}
