Task:
List all anagrams of words contained within a file

Two words are defined as anagrams if they do share the same letters, but are in a different order (i.e. the english words race and care are anagrams).
Given an input file which contains one word per line, as an output construct a list of all anagrams from that input file. Print those words to the console, where all words that are an anagram should each other should be on the same line.
As an example, given the input file:

act
cat
tree
race
care
acre
bee

the output should be:
act cat
acre care race

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