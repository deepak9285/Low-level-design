public class BullpughSingleton {

    public static class abcd{
        private static final BullpughSingleton Instance=new BullpughSingleton();
    }
    public BullpughSingleton getInstance(){
        return abcd.Instance;
    }
}
