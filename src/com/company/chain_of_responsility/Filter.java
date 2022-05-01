package com.company.chain_of_responsility;

public interface Filter {

    void setNext(Filter filter);

    void execute(Request request);

}
