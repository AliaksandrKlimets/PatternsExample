package com.company.chain_of_responsility;


public class CofMain {

    public static void main(String[] args) {
        BaseFilter baseFilter = new BaseFilter();
        PositiveFilter positiveFilter = new PositiveFilter();
        MultiplyFilter multiplyFilter = new MultiplyFilter();
        baseFilter.setNext(positiveFilter);
        positiveFilter.setNext(multiplyFilter);
        Request request = new Request();
        baseFilter.execute(request);

        System.out.println(request.getIntegers());
    }
}
