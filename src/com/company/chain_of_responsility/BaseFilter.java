package com.company.chain_of_responsility;

import java.util.stream.Collectors;

public class BaseFilter implements Filter {

    protected Filter filter;

    @Override
    public void setNext(Filter filter) {
        this.filter = filter;
    }

    @Override
    public void execute(Request request) {
        request.setIntegers(request.getIntegers()
                .stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList()));
        this.filter.execute(request);
    }
}
