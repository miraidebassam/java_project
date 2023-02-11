public class SingleUser {

    private static SingleUser instance = new SingleUser () ;
    private SingleUser() {
    }
    public static SingleUser getInstances(){
        return instance;
    }

}
