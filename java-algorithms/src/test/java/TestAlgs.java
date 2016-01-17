/**
 * Created by root on 1/15/16.
 */
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import eric.api.AccumulatorVisual;
import org.junit.Test;

public class TestAlgs {

    @Test
    public void test1() {
        StdDraw.setScale(-1.0D, 1.0D);
        StdDraw.clear(StdDraw.BLACK);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.square(0.0D, 0.0D, 1.0D);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(0.0D, 0.95D, "Hello, world! This is a test Java program.");
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.filledCircle(0.0D, 0.0D, 0.9D);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(0.0D, 0.0D, 0.8D);
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.filledCircle(0.0D, 0.0D, 0.7D);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(0.0D, 0.0D, 0.6D);
        StdDraw.picture(0.0D, 0.0D, "cover.jpg", 0.65D, 0.8D);
    }

    @Test
    public void testVisualAccumulator(){
        int T = 1000;
        AccumulatorVisual a = new AccumulatorVisual(T, 1.0);
        for(int t = 0; t < T; t++)
            a.addDataValue(StdRandom.uniform());
        StdOut.println(a);
    }

}
