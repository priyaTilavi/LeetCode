package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Trial {
    public static void main(String[] args) {
        Trial trial = new Trial();
        System.out.println(trial.isPrime("This is"));
    }

    public List<String> prioritizedOrders(int numOrders, List<String> orderList)
    {
        // WRITE YOUR CODE HERE
        List<String> primeList= new ArrayList<>();
        List<String> nonPrimeList= new ArrayList<>();
        List<String> mergedList= new ArrayList<>();


        for(int i=0;i<numOrders;i++){
            String arr[]=  orderList.get(i).split(" ",2);

            //check if prime
            if(isPrime(arr[1]))
            {
                primeList.add(orderList.get(i));
            }
            //check if not prime
            if(isNonPrime(arr[1])){
                nonPrimeList.add(orderList.get(i));
            }

        }
        //sort
        primeList=sortAlphabetically(primeList);
        nonPrimeList=sortAlphabetically(nonPrimeList);


        //merge
        for(int i=0;i<primeList.size();i++){
            mergedList.add(primeList.get(i));
        }
        for(int j=0;j<nonPrimeList.size();j++){
            mergedList.add(nonPrimeList.get(j));
        }

        return mergedList;

    }

    private List<String> sortAlphabetically(List<String> locallist) {
        Collections.sort(locallist);
        return locallist;

    }

    private boolean isNonPrime(String s) {
        s=s.replaceAll(" ","");
        if(s.matches("[0-9]+"))
            return true;

        else
            return false;
    }

    private boolean isPrime(String s) {
        s=s.replaceAll(" ","");
        if(s.matches("[a-zA-Z]+"))
            return true;

        else
            return false;
    }


}
