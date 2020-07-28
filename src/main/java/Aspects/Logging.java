package Aspects;

public class Logging {
    public void beforeAdvice() {
        System.out.println("Before Advice");
    }

    public void afterAdvice() {
        System.out.println("after Advice");
    }

    public void afterReturningAdvice(Object retVal) {
        System.out.println("After Advice Executed Successfully... Returning " + retVal.toString());
    }

    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("After Throwing Exception... Returning " + ex.toString());
    }
}
