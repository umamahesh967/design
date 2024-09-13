package sample;

import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

/**
 * Media.Net LLD
 * https://leetcode.com/discuss/interview-question/2617123/Media.net-or-SDE-I-or-Aug-2022-or-LLD-Round
 *
 * https://leetcode.com/discuss/interview-experience/1394546/Media.net-Interview-Exp-or-YOE-8-yrs-or-No-Offer-or-SSELead-SE
 *
 *
 */
class Test {
    TreeMap<Integer, Integer> m = new TreeMap<>();
    int cnt = 0;
    public void add(int left, int right) {
        Map.Entry<Integer, Integer> it = m.floorEntry(left);
        if (it == null || it.getValue() < left)
            it = m.higherEntry(left);
        for (; it != null && it.getKey() <= right; it = m.higherEntry(left)) {
            left = Math.min(left, it.getKey());
            right = Math.max(right, it.getValue());
            cnt -= it.getValue() - it.getKey() + 1;
            m.remove(it.getKey());
        }
        m.put(left, right);
        cnt += right - left + 1;

        new StringBuilder().append('a').toString();
    }
    public int count() { return cnt; }
}

class FizzBuzz {
    private int n;
    private int i;


    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(i<n){
            synchronized (this){
                while(!(i%3 == 0 && i%5 !=0)){
                    wait();
                }
                printFizz.run();
                i++;
                notifyAll();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(i<n){
            synchronized(this){
                while(!(i%3 == 0 && i%5 !=0)){
                    wait();
                }
                printBuzz.run();
                i++;
                notifyAll();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(i<n){
            synchronized(this){
                while(!(i%3 == 0 && i%5 !=0)){
                    wait();
                }
                printFizzBuzz.run();
                i++;
                notifyAll();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while(i<n){
            synchronized(this){
                while(i%3 != 0 || i%5 !=0){
                    wait();
                }
                printNumber.accept(i);
                i++;
                notifyAll();
            }
        }
    }
}