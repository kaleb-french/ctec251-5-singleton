# Journal
Write your Journal questions and notes here.

Phase 1-
using an equality check confirms they are the exact same object in memory, meaning they are two references to the same object. By using a static access method and a private constuctor you are enforcing the object as a singleton, because the only thing you can do with this eager pattern version is pull the same reference.

Phase 2-
The eagar is great if it is used often otherwise it's hanging out in memory for no real reason. But you could optimise resources with the lazy, maybe even add a method to kill it if needed like kill(){ instance = null} to kill the object if needed. 

Phase 3-
Whith the dependencies not shown by the constructor, they are hidden in such a way that anyone using the class would have to dig through the code to find out what they rely on. Hidden dependencies are things that the class or subsystem relies on but may not be clear or upfront, might be tucked deep in the code.

Phase 4-
It seems useful gave quick access to data that was needed and shared between subsystems. It has issues with being able to be accessed basically everywhere, which can lead to some unkowns as things scale. I am curious with using something like this to bootstrap and larger engine from a config file then being nixed when things get going.
