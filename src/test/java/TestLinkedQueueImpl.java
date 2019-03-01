import org.junit.Test;

import java.util.Queue;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


public class TestLinkedQueueImpl {

    private Queue q;


    @Test
        public void insert() {
        int numberOfInserts = 6;
        for (int i = 0; i < numberOfInserts; i++) {
            q.add("ГГГ");
        }
        assertTrue(!q.isEmpty());
        assertEquals(q.size(), numberOfInserts);
    }

    @Test
        public void remove() {
            assertTrue(q.isEmpty());
            q.remove();
        }

        @Test
        public void peek() {
            String message = "hello";
            q.add(message);
            int size = q.size();
            assertEquals(q.peek(), message);
            assertEquals(q.size(), size);
        }



        @Test
        public void isEmpty() {
            assertTrue(q.isEmpty());
            assertEquals(q.size(), 0);
        }

}


