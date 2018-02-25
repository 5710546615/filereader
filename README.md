## Input-Output Tasks
by Visurt Anuttivong

I ran the tasks on a MSI GE60 2OE with 2.5Ghz i5-4200M, and got these results:

Task											| Time
------------------------------------------------|--------------:
Read file 1-char at a time to String			| 1.169103 sec
Read file 1-char at a time to StringBuilder		| 0.004976 sec
Read file line at a time using BufferedReader	| 0.038216 sec


## Explanation of Results

The factors which make some tasks to be faster or slower are..

- 	The Reader class 		: 	A FileReader is reading 1-char at a time while bufferedReader read 1 line at a time.

-	The object to append 	:	String manipulation in non-multi threaded environment. StringBuilder is thread safe and synchronized.

-	The import class		: 	More import class to the project also take more time as well