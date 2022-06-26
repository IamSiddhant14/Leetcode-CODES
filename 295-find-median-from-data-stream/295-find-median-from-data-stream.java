class MedianFinder {
    
    PriorityQueue<Integer> left , right;
    

    public MedianFinder() {
        
        left = new PriorityQueue<>(Collections.reverseOrder());//max heap
        right = new PriorityQueue<>();//min heap
        
    }
    
    public void addNum(int nums) {
        // Insertion
        double med = findMedian();
        
        if( nums <= med ){
            left.add(nums);
            
        }else{
            right.add(nums);
            
        }
        
        // Balancing
        if( left.size() == right.size()+2 ){
            right.add(left.remove());
            
        }else if( left.size()+2 == right.size() ){
            left.add(right.remove());
            
        }

        
    }
    
    public double findMedian() {
                if(left.size() + right.size() == 0) return -1;
        
        if(left.size() == right.size()){
            return (left.peek() + right.peek()) / 2.0;
        } else if(left.size() == right.size() + 1){
            return left.peek();
        } else {
            return right.peek();
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */