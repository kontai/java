LinkedList:

    addFirst();
    addLast();
    
    ->jdk1.6
    offerFirst();
    offerLast();
    
    getFirst(); 獲取但不移除，如果鏈表為空，拋出NoSuchElementException
    getLast();
    
    ->jdk1.6
    offerFirst();
    offerLast();
    peekFirst(); 獲取但不移除，如果鏈表為空，返回null。
    peekLast();
    
    removeFirst(); 獲取並移除，如果鏈表為空，拋出NoSuchElementException
    removeLast();
    
    ->jdk1.6
    pollFirst();
    pollLast(); 獲取並移除，如果鏈表為空，返回null。
    