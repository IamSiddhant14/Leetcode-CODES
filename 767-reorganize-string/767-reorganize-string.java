class Solution {

    public String reorganizeString(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(new Ans());

        for (Character ch : hm.keySet()) {
            int v = hm.get(ch);
            Pair p = new Pair(ch, v);

            pq.add(p);
        }

        StringBuilder sb = new StringBuilder();
        while (pq.size() > 0) {
            
            Pair p1 = pq.remove();
            sb.append(p1.ch);

            if (pq.size() == 0) {
                if( p1.freq > 1 ) return "";
            }

            if (pq.size() > 0) {
                
                Pair p2 = pq.remove();
                sb.append(p2.ch);

                if (p2.freq > 1) {
                    pq.add(new Pair(p2.ch, p2.freq - 1));
                }
            }

            if (p1.freq > 1) {
                pq.add(new Pair(p1.ch, p1.freq - 1));
            }
        }
        
        String ans = sb.toString();
        return ans;
        
    }

    static class Pair {
        char ch;
        int freq;

        Pair(char c, int a) {
            this.ch = c;
            this.freq = a;
        }
    }

    static class Ans implements Comparator<Pair> {

        public int compare(Pair a1, Pair a2) {
            if (a1.freq == a2.freq) {
                return a1.ch - a2.ch;
            }

            return a2.freq - a1.freq;
        }
    }
}
