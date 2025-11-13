class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9;i++){
            int [] row = new int[9];
            for(int x = 0; x<9;x++){
                int place = board[i][x]-'0'-1;
                if (place >=0){
                    if(row[place] ==1)
                        return false;
                    row[place] += 1;
                }
            }
        }
        for(int i = 0; i<9;i++){
            int [] row = new int[9];
            for(int x = 0; x<9;x++){
                int place = board[x][i]-'0'-1;
                if (place >=0){
                    if(row[place] ==1)
                        return false;
                    row[place] += 1;
                }
            }
        }
        for(int i = 0; i<9; i+=3){
            for(int z = 0;z <9; z+=3){
                int [] row = new int[9];
                for(int y = 0; y<9;y++){
                    int place = board[i+y/3][z+y%3]-'0' -1;
                    if (place >=0){
                        if(row[place] ==1)
                        return false;
                        row[place] += 1;
                    }
                }
            }
            
            
        }
        return true;
    }
}