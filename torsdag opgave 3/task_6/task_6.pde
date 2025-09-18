double[] [] board = new double[8] [8];
int sideLength = 40;


void setup(){
 size(320, 320);
 for(int i = 0; i < board.length;i++){
   for(int x = 0; x < board[i].length;x++){
     if((i+x) % 2 == 0){
       board[i][x]=0;
     }else{
      board[i][x] = 1; 
     }
   }
 }
 for(int i = 0; i < board.length;i++){
  for(int y = 0;y < board[i].length;y++){
    print(board[i][y]+ " ");
  }
  println();
 }
}
void draw() {
    background(255); // Clear the canvas with white background
    
    for (int x = 0; x < board.length; x++) {
        for (int y = 0; y < board[x].length; y++) {
            if (board[x][y] == 0) {
                fill(0);  // Black for 0
            } else {
                fill(255); // White for 1
            }
            rect(x * sideLength, y * sideLength, sideLength, sideLength);
        }
    }
}
