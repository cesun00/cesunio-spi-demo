package com.foo;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Factory {
    public static List<IProduct> listProducts() {
        ServiceLoader<IProduct> loader = ServiceLoader.load(IProduct.class);
        List<IProduct> ret = new ArrayList<>();
        loader.iterator().forEachRemaining(ret::add);
        return ret;
    }
}
