package org.sweatshop.test;

import lombok.Data;
import org.checkerframework.checker.nullness.qual.*;

@Data
public class Test {
    int foo = 5;
    String bar="BAR";

    public static void main(String[] args) {
	Test test = new Test();

	//this should work
	@NonNull Object ref1 = new Object();

	//this should fail to build
	@NonNull Object ref2 = null;

	System.out.println(String.format("test has foo = %d, bar = %s",test.getFoo(),test.getBar()));
    }

}
