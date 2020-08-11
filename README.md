# Galaxy
OOP_Engine_FullDetach_JedyGalaxy

His galaxy is represented as a two-dimensional array. Every cell in the matrix is a star that has a value. Ivo starts at the given col and row. He can move only on the diagonal from the lowest left to the upper right, and adds to his score all the stars (values) from the cells he passes through. Unfortunately, there is always an Evil power that tries to prevent his success. 
Evil power starts at the given row and col and instantly destroys all stars on the opposite diagonal – From lowest right to the upper left. 
Ivo adds the values only of the stars that are not destroyed by the evil power.
You will receive two integers, separated by space, which represent the two dimensional array - the first being the rows and the second being the columns. Then, you must fill the two dimensional array with increasing integers starting from 0, and continuing on every row, like this: 
first row: 0, 1, 2… m
second row: n+1, n+2, n+3… n + n.

Input
•	On the first line, you will receive the number N, M -> the dimensions of the matrix. You must then fill the matrix according to these dimensions.
•	On the next several lines you will begin receiving 2 integers separated by a single space, which represent Ivo’s row and col. On the next line you will receive the Evil Power’s coordinates.
•	There will always be at least 2 lines of input to represent at least 1 path of Ivo and the Evil force.
•	When you receive the command, "Let the Force be with you" the input ends.
Output
•	The output is simple. Print the sum of the values from all stars that Ivo has collected.
Constraints
•	The dimensions of the matrix will be integers in the range [5, 2000].
•	The given rows will be valid integers in the range [0, 2000].
•	The given columns will be valid integers in the range [-231 + 1, 231 - 1]. 

<a href="https://ibb.co/Hty8sdC"><img src="https://i.ibb.co/v3WnGYh/jedy.png" alt="jedy" border="0"></a>
