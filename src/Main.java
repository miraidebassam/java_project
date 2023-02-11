public class Main {
    public static void main(String[] args) {
        SingleUser single1 = SingleUser.getInstances();
        SingleUser single2 = SingleUser.getInstances();
        MultipleUser multipleUser1 = new MultipleUser();
        MultipleUser multipleUser2 = new MultipleUser();
        System.out.println(single1+" - "+single2);
        System.out.println(multipleUser1+" - "+multipleUser2);
    }
}