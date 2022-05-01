package com.company.chain_of_responsility;

import java.util.Arrays;
import java.util.List;

public class Request {

    private List<Integer> integers = Arrays.asList(1,2,3,4,5, -1, -2, -3, -4, -5);

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }
}
