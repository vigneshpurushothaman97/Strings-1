class customSort {
    public String customSortString(String order, String str) {
        StringBuilder result = new StringBuilder();
        if(order==null || order.length()==0)
            return result.toString();
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<order.length();i++)
        {
            char s = order.charAt(i);
            if(map.containsKey(s))
            {
                int count = map.get(s);
                while(count>0)
                {
                    result.append(s);
                    count--;
                }
                map.remove(s);
            }
        }
        //remaining
        for(char key : map.keySet())
        {
            int count = map.get(key);
            while(count>0)
            {
                result.append(key);
                count--;
            }
        }
        return result.toString();
    }
}

//Time complexity is O(n+m), Assuming m is the smaller string. So it's going to be O(n)
//Space complexity is O(1) because there'll be max 26 characters.