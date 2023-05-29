package ch3;
 class math_round {
    public static void main(String[] args) {
        double pi = 3.141592;

        System.out.println(pi);
        System.out.println(pi * 1000);
        System.out.println(Math.round(pi * 1000));
        System.out.println(Math.round(pi * 1000)/1000);
        System.out.println(Math.round(pi * 1000)/1000.0);

        //3.141을 얻으려면?
        System.out.println(pi * 1000);
        System.out.println((int)(pi * 1000));
        System.out.println((int)(pi * 1000)/ 1000.0);




    }
}