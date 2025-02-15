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
DisplayGrid(Cell[][] grid)
```
---

Updates grid object. 
```java
GridUpdate(Player player, Cell[][] grid, int row, int col)
```
---

Checks grid object `STATE_CELL`. 
```java
IsValidMove(Cell[][] grid, int row, int col)
```

## Player
### Purpose
x

---


```java
{
  PosType TYPE
  char CHAR
  int SCORE
}
```


## Move
### Purpose
x

---


```java
Move<P, G>
{
  P player
  G grid
  int x
  int y
}
```


## Cell
### Purpose
x

---


```java
{
  Player.PosType STATE_CELL
  int TURN_N
  char CHAR_CELL
}
```

# Agent Player
---

x
