package com.normal.finallogic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2020 by CJENM|MezzoMedia. All right reserved.
 * @since 2020-12-21
 */
public class FinalLogic {

    public void collectionFinalLoginTest () {
        final List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        System.out.printf("final collection data = %s", strings);
    }

    public static void main(String[] args) {
        FinalLogic finalLogic = new FinalLogic();
        finalLogic.collectionFinalLoginTest();

        AtomicInteger integer = new AtomicInteger(0);
        IntStream.range(0,10).forEach(value -> {
            integer.getAndIncrement();
        });
        System.out.print(integer.get());
    }

}
