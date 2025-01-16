# Java Uncommon Error: Resource Closed After Use

This repository demonstrates an example of an uncommon error in Java: attempting to use a resource after it has been closed. This often leads to an `IllegalStateException`. 

The `UncommonErrorExample.java` file contains the buggy code.  The `UncommonErrorExampleSolution.java` file provides a corrected version. 

The error is particularly subtle because it doesn't always manifest immediately, depending on resource management and timing. This makes it harder to debug than more typical exceptions.