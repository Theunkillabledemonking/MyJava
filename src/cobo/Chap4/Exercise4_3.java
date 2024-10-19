public class Exercise4_3 {
    public static void main(String[] args) {
        // 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+..+10)
        int num = 0; 
        int tennum = 0;
        for (int i=1; i <=10; i ++){
            num += i;
            tennum += num;
        }
        System.out.println(tennum);
    } 
    
}
