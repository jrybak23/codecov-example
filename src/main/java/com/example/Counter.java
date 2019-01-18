package com.example;

import java.util.stream.IntStream;

/**
 * @author Igor Rybak
 * @since 18-Jan-2019
 */
public class Counter {
    public int sum(int i) {
        return IntStream.range(1, i).sum();
    }
}
