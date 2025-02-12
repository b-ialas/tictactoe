# tictactoe
A simple tictactoe game made in Java showcasing use of object-oriented design and an implementation of the minimax algorithm. 

# Class Usage
## Board
```java
GridReset(Cell[][] grid)
```
```java
DisplayGrid(Cell[][] grid)
```
```java
GridUpdate(Player player, Cell[][] grid, int row, int col)
```
```java
IsValidMove(Cell[][] grid, int row, int col)
```
## Player
```java
{
  PosType TYPE
  char CHAR
  int SCORE
}
```

## Move
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
```java
{
  Player.PosType STATE_CELL
  int TURN_N
  char CHAR_CELL
}
```

