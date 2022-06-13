package BubbleSort;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class BubbleSort{

    public List<Number> sort(List<Number> input) throws RuntimeException{
        
        if(input == null){
            throw new RuntimeException("RuntimeException");
        }

        for(int i = 0; i < input.size(); i++){
            if(input.get(i) == null){
                input.remove(i);
            }
        }

        for(int i = 0; i < input.size(); i++){
            for(int j = input.size() - 1; j > 0 + i; j--){
                
                Number first = input.get(j), second = input.get(j-1);

                if(second.doubleValue() > first.doubleValue()){
                    if(first.doubleValue() % first.intValue() == 0){
                        input.set(j-1, first);
                    }else{
                        input.set(j-1, first);
                    }
                    if(second.doubleValue() % second.intValue() == 0){
                        input.set(j, second);
                    }else{
                        input.set(j, second);
                    }
                    
                    
                }
            }
            System.out.println(input);

        }

        return input;
    }


    public static void main(String[] args){
        BubbleSort bubble = new BubbleSort();
        List<Number> list = new ArrayList<Number>(Arrays.asList(null,5.0001));

        bubble.sort(null);
    }


    @Test
    public void test0(){

       final BubbleSort bubble = new BubbleSort();
       List<Number> list = new ArrayList<Number>(Arrays.asList(1,4,5,6,8,3,8));
       List<Number> odp = new ArrayList<Number>(Arrays.asList(1,3,4,5,6,8,8));
       assertEquals(odp, bubble.sort(list));

       list = new ArrayList<Number>(Arrays.asList(-9.3,0.2,4,0.1,5,9));
       odp = new ArrayList<Number>(Arrays.asList(-9.3,0.1,0.2,4,5,9));
       assertEquals(odp, bubble.sort(list));

       list = Arrays.asList();
       odp = Arrays.asList();
       assertEquals(odp, bubble.sort(list));

       list = new ArrayList<Number>(Arrays.asList(null,5.0001));
       odp = new ArrayList<Number>(Arrays.asList(5.0001));
       assertEquals(odp, bubble.sort(list));

       assertThrows(RuntimeException.class, () -> bubble.sort(null));

    }
}