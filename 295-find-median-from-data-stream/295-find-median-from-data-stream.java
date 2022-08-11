class MedianFinder {
    
    PriorityQueue <Integer> left , right ;

    public MedianFinder() {
        
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        
        double med = findMedian();
        
        if( num <= med ){
            left.add(num);
        }
        
        if( num > med ){
            right.add(num);
        }
        
        if( left.size()+2 == right.size() ){
            int n = right.remove();
            left.add(n);
        }
        
        if( left.size()== right.size()+2  ){
            int n = left.remove();
            right.add(n);
        }
        
    }
    
    public double findMedian() {
        
        if( left.size() + right.size() == 0 ) return -1l ;
        
        if( left.size() == right.size() ) {
            double v = left.peek()+right.peek();
            return v/2;
        }
        
        if( left.size() + 1 == right.size() ){
            return right.peek();
        }else{
             return left.peek();
        }
                
    }
}

