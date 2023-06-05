import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    static void swap(ArrayList<Integer>list,int indx1,int indx2){
        int temp=list.get(indx1);
        list.set(indx1, list.get(2));
        list.set(indx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // add element in arrayList
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(4);
//        System.out.println(list);

        // get element
        //System.out.println(list.get(3));

        // set element or update
        list.set(0,1);
        list.set(2,3);
     //   System.out.println(list);

        // delete
        list.remove(3);
       // System.out.println(list);

        // sort
        Collections.sort(list);// ascending order
       // System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());// descending order
       // System.out.println(list);

        // size
      //  System.out.println(list.size());

        // loop
        for(int i=0;i< list.size();i++){
          //  System.out.print(list.get(i)+" ");
        }

        // to check element is present or not

       // System.out.println(list.contains(3));

        // reverse
        for(int i= list.size()-1;i>=0;i--){
          //  System.out.print(list.get(i)+" ");
        }

        // max value
        int max=Integer.MIN_VALUE;
        for(int i=0;i< list.size();i++){
            if(max< list.get(i)){
                max=list.get(i);
            }
        }
      //  System.out.println("maximum element is "+max);

        // min value
        int min=Integer.MAX_VALUE;
        for(int i=0;i< list.size();i++){
            if(min> list.get(i)){
                min=list.get(i);
            }
        }
       // System.out.println("minimum element is "+min);

        // swapping of two no
        int temp,indx1=1,indx2=2;
        //System.out.println(list);
        swap(list,1,2);
       // System.out.println(list);


        // multidimensional arraylist
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
       // mainList.add(list1);
      //  System.out.println("This is list1"+list1);

        ArrayList<Integer>list2=new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//        mainList.add(list2);
       // System.out.println("This is list2"+list2);

        ArrayList<Integer>list3=new ArrayList<>();
//        list3.add(1);
//        list3.add(2);
//        mainList.add(list3);
        // System.out.println("This is list3"+list3);

        for(int i=0;i<=5;i++) {
            list1.add(i * 1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println("This is main arrayList multidimensional "+mainList);

            for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> curList=mainList.get(i);
            for(int j=0;j< curList.size();j++){
                System.out.print(curList.get(j)+" ");
            }
             System.out.println();

        }

}

    }

