package UI;

import org.testng.annotations.Test;

public class JavaMethods {

    @Test
    public  void methods(){
        NotAcceptingParameterAndNotReturningValue();


        AcceptingParameterAndNotReturningAnyValue(1,2);


        int result=AcceptingParameterAndReturningValue(5,9);
        System.out.println(result);

        int result1=NotAcceptingAnyParameterAndReturningValue();
        System.out.println(result1);


    }

    // Not accepting any parameter and not returning any value
    public void NotAcceptingParameterAndNotReturningValue(){
        int a=4;
        int b=5;
        int c=a+b;
        System.out.println(c);
    }

    // Accepting parameter and not returning any value
    public void AcceptingParameterAndNotReturningAnyValue(int a, int b){
        int c=a+b;
        System.out.println(c);
    }

    // Accepting parameter and returning value
    public int AcceptingParameterAndReturningValue(int a, int b){
        return a+b;
    }

    // Not accepting any parameter and returning value
    public int NotAcceptingAnyParameterAndReturningValue(){
        int a=4;
        int b=7;
        return a+b;
    }


}
