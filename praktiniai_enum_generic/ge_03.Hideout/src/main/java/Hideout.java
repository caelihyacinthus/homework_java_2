public class Hideout<T> {
    private T hidden = null;

    public Hideout(){}

    public void putIntoHideout(T toHide){
        hidden = toHide;
    }

    public T takeFromHideout(){
        T unhidden = hidden;
        hidden = null;
        return unhidden;
    }

    public boolean isInHideout(){
        return hidden != null;
    }



}
