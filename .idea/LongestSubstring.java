class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s==null)
            return 0;
        HashMap<Character, Integer> map = new HashMap();
        int length = 0;
        int slow = 0;
        String str = " ";
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                slow = Math.max(map.get(c), slow);
            }
            length = Math.max(length,i-slow +1);
            map.put(c,i+1);
            // str = s.substring(slow,i+1);
            System.out.println(str);
        }
        return length;
    }
}


//Time complexity is O(n) n is the length of the String s
//Space complexity is O(1)