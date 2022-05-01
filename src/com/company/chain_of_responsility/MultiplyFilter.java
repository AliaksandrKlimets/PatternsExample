package com.company.chain_of_responsility;

import java.util.stream.Collectors;

public class MultiplyFilter extends BaseFilter {

    @Override
    public void execute(Request request) {
        request.setIntegers(request.getIntegers().stream().map(integer -> integer * 10).collect(Collectors.toList()));
    }
}
