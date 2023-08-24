package examples.lambda;

import examples.funinterface.FunctionalInterface;

public class LambdaByFuncInterface {
    public static void main(String[] args) {

        //Классическое определение лямбды на основе функц. интерфейса
        //В данном месте мы описываем что лямбда будет делать
        FunctionalInterface functionalInterface;
        functionalInterface = obj -> obj.toString();

        //Пример использования лямбды
        //Здесь мы вызываем метод func которые согласно лямбде вызовет метод toString() объекта
        DevApple devApple = new DevApple();
        System.out.println(functionalInterface.func(devApple));


        //Лямбда на основе фунц. интерфейса с обобщенным типом
//        GenericFuncInterface<Apple> genericFuncInterface;
//        genericFuncInterface = a -> a.toString();
 //
    }
}
