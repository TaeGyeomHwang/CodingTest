class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int axisX = 0;
        int axisY = 0;
        
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("left") && axisX-1 >= -(board[0]-1)/2) axisX--;
            else if(keyinput[i].equals("right") && axisX+1 <= (board[0]-1)/2) axisX++;
            else if(keyinput[i].equals("up") && axisY+1 <= (board[1]-1)/2) axisY++;
            else if(keyinput[i].equals("down") && axisY-1 >= -(board[1]-1)/2) axisY--;
        }
        return new int[] {axisX,axisY};
    }
}