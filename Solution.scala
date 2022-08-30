// import Queue 
import scala.collection.mutable._

object Solution {
    def moveZeroes(nums: Array[Int]): Unit = {
        var q = Queue[Int]();
        // add items to queue
        for (num <- nums) {
            if (num != 0) {
                q += num;
            }
        }
        
        // print the elements of queue
        print("Queue Elements: ")
        q.foreach((element:Int) => print(element + " "))
        
        // add queue elements to array
        var i: Int = 0;
        while (!q.isEmpty) {
            nums(i) = q.dequeue();
            i += 1;
        }
        
        // add zeros to the end
        for (i <- i until nums.length) {
            nums(i) = 0;
        }
    }
}