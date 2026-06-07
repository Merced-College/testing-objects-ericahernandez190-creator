[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24089879)
# testingObjectsWithJava
//Erica Hernandez
//6/6/2026

1. What does printing an object with no toString show, and why?
    It shows the class name plus the @ symbol and its hexa hash code, it happens because there is no toString which gets the number of where it is stored and uses the default method of java. 

2. Record what your three fields printed as defaults. Which are primitives vs. reference types?
    name = null
    age = 0
    breed = null
    Primitives types are when they directly assign a value and reference types point towards a "storage" where they are stored. 

3. How do constuctors change the initialization story compared to Part B?
    Once you make them you are resposible for initizilizing the default constructor since java will no longer make it for you. 

4. What changed between Part A's printout and Part D's printout? why is override useful?
    Override is useful becuase it overrides javas default method and it calls our toString method. Its useful becuase it you choose how you want it to print out.
5. Why prefer private fields with getters/setters over public fields? Give one example of a rule you could enforce in a setter. 
    its standerdized and it keeps it secure.

REFLECTION:
2. The three fields were Name, Color, and Playful the values were null, null, false. 

4. Adding an @Override to toString makes sure  your compiler is replacing the default method. 


Make sure to push your code to your repo!