package level1;

import java.util.ArrayList;

// 크레인 인형뽑기
public class exam11 {

	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        
        int boardlength = 0;
        
        
        for (int i = 0; i < moves.length; i++) {
        	if(moves[i] < 1 || moves[i] > board.length) {
        		return answer;
        	} else {
        	while (board[boardlength][moves[i]-1] == 0) {
        		if (board[boardlength][moves[i]-1] == 0) {
        			
        		} else {
        			list.add(board[boardlength][moves[i]-1]);
        			board[boardlength][moves[i]-1] = 0;
        			boardlength=0;
        			break;
        		}
        		boardlength++;
        		if (boardlength == board.length) {
        			boardlength = 0;
        			break;
        		}
        	}
        	
        	while (board[boardlength][moves[i]-1] != 0) {
        		if (board[boardlength][moves[i]-1] == 0) {
        			
        		} else {
        			list.add(board[boardlength][moves[i]-1]);
        			board[boardlength][moves[i]-1] = 0;
        			boardlength=0;
        			break;
        		}
        		boardlength++;
        		if (boardlength == board.length) {
        			boardlength = 0;
        			break;
        		}
        	}
        
        	
        }
        }
        for (int i = 1; i < list.size(); i++) {
        		if (list.get(i-1) == list.get(i)) {
        		list.remove(i);
        		list.remove(i-1);
        		answer += 2;
        		i=0;
        	}
        		if (list.size()==1) {
        			break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}}, new int[] {1,2,3,3,2,3,1}));
	}
}
