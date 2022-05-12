package org.teacher_todd;

import org.testng.Assert;
import org.testng.annotations.*;

public class Calculator {

    public int add(int i, int j) {
        return i + j;
    }

    public int subtract(int i, int j) {
        return i - j;
    }

    public int multiply(int i, int j) {
        return i * j;
    }

    public int divide(int i, int j) {
        // bug follows
        if(i == 3)
            return 0;
        // good code follows
        if (j != 0)
            return i / j;
        // can't divide by zero (better to throw exception)
        return 0;
    }
}
