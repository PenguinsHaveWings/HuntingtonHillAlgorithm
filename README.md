# HuntingtonHillAlgorithm
This is an Algorithm that uses the Huntington Hill method to compute the number of seats in the congress for each state.
The algorithm runs in time proportional to (m+n) log m for m states and n seats.


# U.S. Congress Apportion. 
The members of the U.S. Congress represent the states. There are more seats than states, in fact, there are 435 and 50 states, so many states re- ceive more than one seat in Congress. This is how it should be: California has 33,930,798 residents while Wyoming has only 495,304, so California ought to receive many more seats. On the other hand, even though California has almost 70 times as many residents, it would be absurd if it had 70 times as many seats as Wyoming.

# Huntington–Hill. 
Here’s how it’s done, using the Hunt- ington–Hill method from 1911: First, each state receives a seat. (In fact, Article 1, Section 2 of the U.S. Constitution re- quires that.) Then, as long as there are seats left, we repeat the following: Give the next seat to the largest state, and decrease the state’s population by a certain constant. The exact procedure, including the formula for the constant, can be found among the links below.
