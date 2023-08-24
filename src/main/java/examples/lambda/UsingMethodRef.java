package examples.lambda;

import examples.funinterface.GenericFuncInterface;

public class UsingMethodRef {
    public static DevApple setNewWeight(DevApple devApple) {
        devApple.setWeight(20);
        return devApple;
    }

    public static <T> T getObjectAfterFunction(GenericFuncInterface<T> genericFuncInterface, T t) {
        return genericFuncInterface.function(t);
    }

    public static void main(String[] args) {
        DevApple devApple = new DevApple();
        DevApple devAppleWithWeight = getObjectAfterFunction(UsingMethodRef::setNewWeight, devApple);
        System.out.println(devAppleWithWeight.getWeight());
    }
}
