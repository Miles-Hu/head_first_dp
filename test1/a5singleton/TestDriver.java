package test1.a5singleton;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-5 下午6:48
 */
public class TestDriver {

    //测试fast和slow两种线程安全的懒汉式的性能差别
    public static void main(String[] args) {
        System.out.printf("%10s %10s %10s %10s \n","访问次数","fast耗时","slow耗时","slow/fast耗时比");
        for (long j = 10000; j < 100000000000l; j = j * 10) {
            LazySingletonSafeFast fast;
            long start1 = System.currentTimeMillis();
            for (long i = 0; i < j; i++) {
                fast = LazySingletonSafeFast.getInstance();
            }
            long fastElapse = System.currentTimeMillis()-start1;

            LazySingletonSafeSlow slow;
            long start2 = System.currentTimeMillis();
            for (long i = 0; i < j; i++) {
                slow = LazySingletonSafeSlow.getInstance();
            }
            long slowElapse = System.currentTimeMillis()-start2;
            System.out.printf("%12d %10d %10d %10.2f \n",j,fastElapse,slowElapse,((double)slowElapse)/fastElapse);
        }
    }

    //测试线程不安全的懒汉式
    @Test
    public void test() {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) {
            pool.execute(()->{
                System.out.println(Thread.currentThread().getName()+": ");
                System.out.println(LazySingletomUnsafe.getInstance().toString());
            });
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
