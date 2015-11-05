package mx.iteso.Chocolatefactory;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * Created by houstonsalgado on 04/11/15.
 */
public class ChocolateBoilerTest {

    ChocolateBoiler chocolateBoiler;
    ChocolateBoiler chocolateBoiler1;
    ChocolateBoiler chocolateBoiler2;
    ChocolateBoiler chocolateBoilerArray [];
    int count;

    @Before
    public void setUp(){
        chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoilerArray = new ChocolateBoiler[200];
        count=0;
    }

    @Test
    public void FillTest(){
        chocolateBoiler.fill();
        assertEquals(false, chocolateBoiler.isEmpty());
        System.out.println();
    }

    @Test
    public void BoilTest(){
        chocolateBoiler.boil();
        assertEquals(true, chocolateBoiler.isBoiled());
    }

    @Test
    public void DrainTest(){
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        assertEquals(true, chocolateBoiler.isEmpty());
    }

    @Test
    public void InstanceTest(){
        chocolateBoiler1 = ChocolateBoiler.getInstance();
        assertEquals(true, chocolateBoiler == chocolateBoiler1);
    }


    @Test
    public void ThreadSafeInstancesTest(){
        ChocolateBoiler.cleanInstance();
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(4);

        Thread t1 = new Thread(){
            public void run(){
                try {
                    cyclicBarrier.await();
                    chocolateBoiler = ChocolateBoiler.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }};
        Thread t2 = new Thread(){
            public void run(){
                try {
                    cyclicBarrier.await();
                    chocolateBoiler1 = ChocolateBoiler.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }};

        Thread t3 = new Thread(){
            public void run(){
                try {
                    cyclicBarrier.await();
                    chocolateBoiler2 = ChocolateBoiler.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }};

        t1.start();
        t2.start();
        t3.start();

        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertSame(chocolateBoiler, chocolateBoiler1);
        assertSame(chocolateBoiler1, chocolateBoiler2);

    }

    @Test
    public void MethodsThreadsTest(){
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(200);
        Thread threads [] = new Thread[200];

        for(count=0; count<200; count++){
            threads[count] = new Thread(){
                public void run(){
                    try {
                        cyclicBarrier.await();
                        System.out.println(""+count);
                        chocolateBoilerArray[count] = ChocolateBoiler.getInstance();
                        chocolateBoilerArray[count].fill();
                        chocolateBoilerArray[count].boil();
                        chocolateBoilerArray[count].drain();
                        count++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            };
        }

        for(count=0; count<200; count++){
            threads[count].start();
        }

        count=0;

        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(500);
            assertEquals(true, chocolateBoiler.fillChocolate == chocolateBoiler.boilChocolate);
            assertEquals(true, chocolateBoiler.boilChocolate == chocolateBoiler.drainChocolate);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


