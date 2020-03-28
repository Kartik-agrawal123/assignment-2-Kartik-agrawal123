/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue();
        obj.enqueue(1,5,0);
        obj.enqueue(2,4,1);
        obj.enqueue(3,3,3);
        obj.enqueue(4,2,1);
        obj.enqueue(5,1,2);
        obj.enqueue(6,0,1);
        obj.removeBackLog();
        obj.display();

    }
}
