# Strategy Pattern

Based on the Zax story of Dr.Seuss
https://seuss.fandom.com/wiki/The_Zax 
### 
The original Zax is North or South going 
but in our
case it can also be East or West going.
Also it may move fast or slow or it may 
stop and not move at all.
###
There are two (2) versions:
1. AppSimple + Zax Plain: no pattern used, difficult to add new capabilities.
2. AppFixed + Zax: Strategy pattern applied for direction and speed. Now it is easy to add new directions (e.g. NW) and speed behaviours.
###
As the new requirements for East-West 
and fast-slow were added later, the 
ZaxPlain class which is not using the pattern
had to be modified several times.
###
Using the Strategy Pattern for direction
and speed we are able to add any new requirement
may arise in the future, without messing
with the Zax class. 

