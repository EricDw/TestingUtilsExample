# TestingUtilsExample
[![](https://jitpack.io/v/EricDw/TestingUtilsExample.svg)](https://jitpack.io/#EricDw/TestingUtilsExample)

Provides some basic utility functions for JUnits tests written in kotlin.

Make the best use of these utils by adding the following [Live Template](https://www.jetbrains.com/help/idea/2016.2/live-templates.html) to Android Studio:

```Kotlin

@Test
 fun `given $CONDITION$ return $OUTPUT$`() {
        // Arrange
        val input = $INPUT$
        val expectedOutput = $EXPECTED$

        // Act
        val actualOutput = $ACTUAL$

        // Assert
        assertTrueWithMessage(input = input,
                expectedOutput = expectedOutput,
                actualOutput = actualOutput)
 }
 
 ```
 
If you want to install the template the easy way just import the settings.jar found [here](https://github.com/EricDw/LiveTemplates)
into Android Studio.
