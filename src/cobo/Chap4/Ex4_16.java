class Ex4_16{
    public static void main(String[] args){
        int sum = 0;
        int i = 0 ;

        while(true) { // 무한 반복문 for(;true;) {}
            if(sum > 100)
            break; // 자신이 속한 하나의 반복문을 벗어난다.
            ++i;
            sum += i;

        } // end of while
        System.out.println("i=" + i);
        System.out.println("sum" + sum);
    }
}
