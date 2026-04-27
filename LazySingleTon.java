public class LazySingleTon {
    private static LazySingleTon instance;
    private LazySingleTon(){}

    public LazySingleTon getInstance(){
        if(instance==null){
            return new LazySingleTon();
        }
        return instance;
    }
}

//in lazy singleton multiple cthread will have multiple objects