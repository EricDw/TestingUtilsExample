package com.publicmethod.kotlintestingutils

import junit.framework.Assert.assertTrue

/**
 * Internally performs an == comparison of [expectedOutput] and [actualOutput],
 * calls [createMessage] and then passes it's output to [assertTrue].
 *
 * @param input The input to the function under test
 * @param expectedOutput The expected return value of the function under test
 * @param actualOutput The actual output of the function under test
 */
fun assertTrueWithMessage(input: Any, expectedOutput: Any, actualOutput: Any) {
    assertTrue(
            createMessage(input, expectedOutput, actualOutput),
            actualOutput == expectedOutput)
}

/**
 * Internally calls [createMessage] then passes it's output and [condition] to [assertTrue].
 *
 * @param input The input to the function under test
 * @param expectedOutput The expected return value of the function under test
 * @param condition The actual output of the function under test
 */
fun assertTrueWithMessage(input: Any, expectedOutput: Any, condition: Boolean) {
    assertTrue(
            createMessage(input, expectedOutput, condition),
            condition)
}

/**
 * Creates the follwing message to be used by assertions:
 *
"input was\n $[input]\n " +
"expected output was\n $[expectedOutput]\n " +
"actual output was\n $[actualOutput]"

 * @param input The input to the function under test
 * @param expectedOutput The expected return value of the function under test
 * @param actualOutput The actual output of the function under test
 */
fun createMessage(input: Any, expectedOutput: Any, actualOutput: Any): String {
    return "input was\n $input\n " +
            "expected output was\n $expectedOutput\n " +
            "actual output was\n $actualOutput"
}

