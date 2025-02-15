# tictactoe
A simple tictactoe game made in Java showcasing use of object-oriented design and an implementation of the minimax algorithm. 

# Class Usage
## Board
### Purpose
The `Board` class is used to create a well-defined structure for the tictactoe playing board. 

Creating a new board instance creates a composite object which initializes a 2-dimentional array of objects type `Cell`, where each cell stores it's own [cell attributes](#Cell). During initialisation, `GridReset()` is called to ensure all cells are of `STATE_CELL` empty. 
```java
Board board = new Board();
```

---

Resets grid object. 
```java
GridReset(Cell[][] grid)
```
---

Displays grid object. 
```java
GridDisplay(Cell[][] grid)
```
---

Updates grid object. 
```java
GridUpdate(Player player, Cell[][] grid, int row, int col)
```
---

Checks grid object `STATE_CELL`. Determines a winner. 
```java
IsWinner(Cell[][] grid, Player player)
```

Checks grid object `STATE_CELL`. Determines if move is valid. 
```java
IsValidMove(Cell[][] grid, int row, int col)
```

## Player
### Purpose
Store player type, playing character, and score. Creating a new board instance creates a composite object taking 2 parameters which initializes a Player object containing the type, character, and score (initialized to 0). In essence, this allows us to create many player instances, without the need for two instances of the same thing i.e the user player and the agent player will always have the same properties, where the agent might just have different functionality. 

```java
Player minP = new Player(Player.PosType.MIN, 'O');
Player maxP = new Player(Player.PosType.MAX, 'X');
```

---


```java
{
  PosType TYPE
  char CHAR
  int SCORE
}
```

## Cell
### Purpose
Contains a `Player` class object type `PosType`, as well as the type of character it is associated with. This is useful for any functionality that will require more abstract use cases i.e the backtracking algorithm. Overall, the `Cell` class is used to create an abstraction for the board elements. 

---


```java
{
  Player.PosType STATE_CELL
  char CHAR_CELL
}
```

# Agent Player
---

x
