public class Variable {
    public static void main(String[] args) {
        var str = "Thế giới của Long!!!";
        System.out.println(str);

        Integer a = 100,b= 200;
        swap(a,b);
        System.out.println("a= "+ a +" b= "+b );
        //a
    }

    public static void swap(Integer a, Integer b){
        var temp = a;
        a=b;
        b=temp;
    }
}
