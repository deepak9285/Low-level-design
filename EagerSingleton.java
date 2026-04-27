class EagerSingleTon{
    private EagerSingleTon instance=new EagerSingleTon();
    private EagerSingleTon(){

    }
    public EagerSingleTon getInstance(){
        return instance;
    }
}