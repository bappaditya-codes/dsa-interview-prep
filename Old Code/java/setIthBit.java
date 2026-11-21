public class setIthBit {
    
    public static int setBit(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        int n=10;
        int i=2;
        System.out.println(setBit(n, i));
    }
}
