Word annagram

Need to run application:
 - java 8

    Algorithm is pretty straight forward:
    - Read through the file
    - Sort every character in word and put to HashMap sortedStrings->list(originalValues)
    - loop through the map and print every list(originalValues) with size > 1

I didn't use any external library.

Nothing to maintain there, one simple HashMap.
Scalability - more memory as per bigger input we will need more space to store data.
Performance - as input grows HashMap will also grows. But HashMap has O(1) access to the elements(not guaranteed,
              but still it very efficient, or if input will be the same then hashcode will match and HashMap
              will produce O(n)), so memory is the only issue.


Things to think: probably there is some improvement to sort(String) method, but right now I can't find any good solution
 than straight forward and easy to understand solution.