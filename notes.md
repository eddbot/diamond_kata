# Diamond Kata

- it seems for every extra letter added, we must add 1 spaces of padding either side?

A = 0 padding
B = 1 padding
C = 2 padding
...
Z = 25 padding

- we should be able to run through the alphabet once, and push each line onto a stack.
- when we reach the 'goal' letter, we should start yoinking them from the stack?


---
> some examples

```
_A_
B_B
_A_
```
```
__A__
_B_B_
C___C
_B_B_
__A__
```