package medium;

import java.util.Stack;

class Pair{
	char data;
	int freq;
	Pair(char data, int freq){
		this.data = data;
		this.freq = freq;
	}
}

public class RemoveAllAdjacentDuplicatesInStringII_1209 {
	public String removeDuplicates(String s, int k) {
        int i = 0;
        Stack<Pair> stack = new Stack<>();
        while(i < s.length()){
        	if(stack.isEmpty()) {
        		stack.add(new Pair(s.charAt(i), 1));
        	}
        	else if(stack.peek().data == s.charAt(i)) {
        		Pair p = stack.pop();
        		p.freq += 1;
        		if(p.freq == k) {
        			i++;
        			continue;
        		}
        		stack.add(p);
        	}
        	else {
        		stack.add(new Pair(s.charAt(i), 1));
        	}
        	i++;
        }
        StringBuilder ans = new StringBuilder();
        while (stack.size() > 0) {
            char ch = stack.peek().data;
            int freq = stack.peek().freq;
            while (freq-->0) {
            	String temp = ans.toString();
            	ans.setLength(0);
            	ans.append(ch + temp);
            }
            stack.pop();
        }
        return ans.toString();
    }
}
