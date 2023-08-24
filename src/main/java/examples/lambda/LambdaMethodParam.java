package examples.lambda;

import examples.funinterface.GenericFuncInterface;

public class LambdaMethodParam<T> {

    public static <T> T getObjectAfterFunction(GenericFuncInterface<T> genericFuncInterface, T t) {
        return genericFuncInterface.function(t);
    }

    public static void main(String[] args) {
        DevApple devApple = new DevApple();
        DevApple devAppleWithWeight = getObjectAfterFunction(a -> {
            a.setWeight(10);
            return a;
        }, devApple);
        System.out.println(devAppleWithWeight.getWeight());
    }
}
