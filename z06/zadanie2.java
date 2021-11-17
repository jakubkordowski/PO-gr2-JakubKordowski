package pl.edu.uwm.wmii.kordowskijakub.javaz06;

public class zadanie2 {
    public static void main(String[] args){
        IntegerSet list1 = new IntegerSet();
        list1.insertElement(27);
        list1.insertElement(54);
        list1.insertElement(12);
        System.out.println(list1.toString());
        list1.deleteElement(27);
        System.out.println(list1.toString());
        IntegerSet list2 = new IntegerSet();
        list2.insertElement(100);
        list2.insertElement(54);
        System.out.println(list2.toString());
        System.out.println(IntegerSet.union(list1,list2));
        System.out.println(IntegerSet.intersection(list1,list2));
        System.out.println(list1.equals(list2));
        IntegerSet list3 = new IntegerSet();
        list3.insertElement(11);
        IntegerSet list4 = new IntegerSet();
        list4.insertElement(11);
        System.out.println(list3.equals(list4));
    }
}
