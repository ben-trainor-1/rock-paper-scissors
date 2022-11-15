# rock-paper-scissors
### Basic RPS simulator
## *Tools used*
- Language: Java
- Compiler: VSCode
- Version: 1.0
## Pseudocode
1. Players choose rock, paper, or scissors
   1. Represent choices with a `char`
      1. R - rock
      2. P - paper
      3. S - scissors
    2. Store choices
       1. Prompt `Scanner` object `nextChar()`
       2. `char playerOneChoice`
       3. `char playerTwoChoice`
2. Count down and reveal choices on "shoot"
   1. `Thread.sleep()` to artificially wait
3. Compare choices of players
   1. Rock beats scissors
   2. Scissors beats paper
   3. Paper beats rock