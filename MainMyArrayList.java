public class MainMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String>a=new MyArrayList<>(new String[]{"sss","eee","qqqqqqq"});
        System.out.println(a);
        a.add("ali");
        a.add("ahmed");
        a.add("Baraa");
        System.out.println(a);


        MyArrayList<Integer>b=new MyArrayList<>(Integer.class,5);
        b.add(3);
        b.add(10003);
        b.add(-789);
        b.add(67);
        b.add(68);
        System.out.println(b);

        MyArrayList<Integer>c= new MyArrayList<>(Integer.class);
        c.add(5);
        c.add(12);
        c.add(3);
        c.add(35);
        c.add(14);
        c.add(11);
        c.add(102);
        c.add(32);
        System.out.println(c);




    }
}
