package pl.edu.uwm.wmii.kordowskijakub.javaz06;

public class IntegerSet {
    public boolean[] tab = new boolean[101];
    public IntegerSet(){

    }
    public static IntegerSet union(IntegerSet tab1, IntegerSet tab2){
        IntegerSet result = new IntegerSet();
        for(int i=0; i<tab1.tab.length; i++){
            if(tab1.tab[i] == true || tab2.tab[i] == true){
                result.tab[i] = true;
            }
        }
        return result;
    }
    public static IntegerSet intersection(IntegerSet tab1, IntegerSet tab2){
        IntegerSet result = new IntegerSet();
        for(int i=0;i<tab1.tab.length; i++){
            if(tab1.tab[i] == true && tab2.tab[i] == true){
                result.tab[i] = true;
            }
        }
        return result;
    }
    public void insertElement(int k){
        this.tab[k] = true;
    }
    public void deleteElement(int k){
        this.tab[k] = false;
    }
    public String toString(){
        StringBuffer str = new StringBuffer();
        for(int i=0;i<this.tab.length;i++){
            if(this.tab[i] == true) str.append(i).append(" ");
        }
        return str.toString();
    }
    public boolean equals(IntegerSet tab1){
        for(int i=0;i<this.tab.length;i++){
            if(this.tab[i] != tab1.tab[i])
                return false;
        }
        return true;
    }
}
