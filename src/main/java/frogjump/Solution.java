package frogjump;

public class Solution {
    public int solution(int X, int Y,int D ){
        int key =1;
        while ((X + key*D)<=Y){
            key++;
        }
        return key;
    }
}
