package test2.a5singleton;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-8 下午12:21
 */
public class TestDrive {

    public static void main(String[] args) {
        System.out.printf("%10s %10s %10s %10s \n","访问次数","Lazy耗时","Holder耗时","耗时比(L/H)");
        for (long i = 1000000; i < 10000000000000l; i = i * 10) {
            long start1 = System.currentTimeMillis();
            for (long j = 0; j < i; j++) {
                LazySingleton.getInstance();
            }
            long elapseLazy = System.currentTimeMillis()-start1;

            long start2 = System.currentTimeMillis();
            for (long j = 0; j < i; j++) {
                HolderSingltton.getInstance();
            }
            long elapseHolder = System.currentTimeMillis()-start2;

            System.out.printf("%15d %10d %10d %10.4f \n",i,elapseLazy,elapseHolder,((double)elapseLazy)/elapseHolder);
        }
    }

}
