/*
 * Solution: simulation
 * Difficulty level: Medium 
 * Date: 2021/10/29
 * Author: Jan1ey
 */

class Solution {
    public List<String> letterCombinations(String digits) {
    	List<String> answerList = new ArrayList<String>();
    	List<char[]> letterList = new ArrayList<char[]>();
    	letterList.add(new char[]{'a', 'b', 'c'});
    	letterList.add(new char[]{'d', 'e', 'f'});
    	letterList.add(new char[]{'g', 'h', 'i'});
    	letterList.add(new char[]{'j', 'k', 'l'});
    	letterList.add(new char[]{'m', 'n', 'o'});
    	letterList.add(new char[]{'p', 'q', 'r', 's'});
    	letterList.add(new char[]{'t', 'u', 'v'});
    	letterList.add(new char[]{'w', 'x', 'y', 'z'});

    	Queue<String> stringQueue = new LinkedList<String>();
    	for(int i = 0; i < digits.length(); ++i) {
    		int number = (int) (digits.charAt(i) - '2');

    		char[] letters = letterList.get(number);
    		if(i == 0) {
    			String emptyString = "";
    			for(int j = 0; j < letters.length; ++j) {
    				stringQueue.offer(emptyString + letters[j]);
    			}
    		} else {
    			while(stringQueue.size() != 0) {
    				String currentString = stringQueue.peek();
    				if(currentString.length() > i) {
    					break;
    				}

    				for(int j = 0; j < letters.length; ++j) {
    					stringQueue.offer(currentString + letters[j]);
    				}
    				stringQueue.poll();
    			}
    		}
    	}

    	while(stringQueue.size() != 0) {
    		String currentString = stringQueue.poll();
    		answerList.add(currentString);
    	}

    	return answerList;
    }
}