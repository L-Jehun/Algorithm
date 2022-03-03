import java.util.*;
class plus {
    public List<Integer> solution(int[] numbers) {
        List<Integer>list = new ArrayList<Integer>();
        int[] answer={};
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int num= numbers[i]+numbers[j];
                    if(!list.contains(num))  {             
                    list.add(num);   
                    }          
            }
            
        }
        Collections.sort(list);
        System.out.println(list);
    return list;
    }
}