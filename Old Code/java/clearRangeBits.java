public class clearRangeBits {

    public static int isClearRangeBits(int n, int i, int j){
        int a=-1<<i; // 111111100
        int b= ~(-1<<j); //0000001111
        int bitMask=a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {   
        System.out.println(isClearRangeBits( 10,4,4));
    }
}
