package lesson8;

import java.util.ArrayList;

/**
 * This program calculates the first 8 happy numbers starting from a given
 * number.
 *
 * Happy Number: http://en.wikipedia.org/wiki/Happy_number
 *
 * @author manojreddy
 *
 */


    public class HappyNumber {

        public static boolean isHappy(int x){
            ArrayList<Integer> history = new ArrayList<Integer>();
            while(x!=1){
                history.add(x);

                int sum = 0;
                while(x!=0){
                    sum+= Math.pow(x%10,2);
                    x/=10;
                }

                x = sum;

                if(history.contains(x)){
                    return false;
                }

            }

            return true;

        }

        //Assuming that "start" is a positive integer
        public static void print8HappyNumbers(int start){
            int found = 0;

            while(found < 8){
                if(isHappy(start)){
                    System.out.println(start);
                    found++;
                }
                start++;
            }

        }

        public static void main(String[] args) {
            print8HappyNumbers(100);
        }
    }

