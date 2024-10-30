public class Ex4_19 {
    public static void main(String[] args){
     // for문에 Loop1이라는 이름
     Loop1 : for (int i=2; i <=9; i++){
        for (int j=1; j <=9; j++){
            if (j == 5)
            break Loop1;
            //break만 할 시에 전체에 벗어나지 못한다
            System.out.println(i + "*" + j +"=" + i*j);

        } // end of for i
        System.out.println();
                
     }   // end for loop1
    }
}
