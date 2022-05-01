package com.company.chain_of_responsility;

import java.util.stream.Collectors;

public class PositiveFilter extends BaseFilter {

    @Override
    public void execute(Request request) {
        request.setIntegers(request.getIntegers()
                .stream()
                .filter(integer -> integer > 0)
                .collect(Collectors.toList()));
        this.filter.execute(request);
    }
}
