package stage2.Home_work1;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Comparator;

public class test {
        private ArrayList_NameSurname<Integer> list;

        @Before
        public void setUp() {
            list = new ArrayList_NameSurname<>();
        }
        @Test
        public void testInit() {
            assertEquals(0, list.size());
        }
        @Test
        public void test_ADD_GET() {
            list.add(100);
            list.add(64);
            list.add(31);

            assertEquals(Integer.valueOf(100), list.get(0));
            assertEquals(Integer.valueOf(64), list.get(1));
            assertEquals(Integer.valueOf(31), list.get(2));
        }
        @Test
        public void test_ADDINDEX_GET() {
            list.add(100);
            list.add(64);
            list.add(1, 31);

            assertEquals(Integer.valueOf(100), list.get(0));
            assertEquals(Integer.valueOf(31), list.get(1));
            assertEquals(Integer.valueOf(64), list.get(2));
        }
        @Test
        public void test_set() {
            list.add(100);
            list.add(64);
            list.add(1);

            assertEquals(Integer.valueOf(100), list.get(0));
            assertEquals(Integer.valueOf(64), list.get(1));
            assertEquals(Integer.valueOf(1), list.get(2));

            list.set(1, 31);
            assertEquals(Integer.valueOf(31), list.get(1));
        }
        @Test
        public void testRemove() {
            list.add(1);
            list.add(2);
            list.add(3);

            Integer removed = list.remove(1);
            assertEquals(Integer.valueOf(2), removed);

            assertEquals(2, list.size());
            assertEquals(Integer.valueOf(1), list.get(0));
            assertEquals(Integer.valueOf(3), list.get(1));
        }
        @Test
        public void test_sort_isSorted() {
            list.add(4);
            list.add(3);
            list.add(7);
            list.add(6);
            list.add(2);

            // Сортируем
            list.quickSort(Comparator.naturalOrder());

            assertEquals(Integer.valueOf(2), list.get(0));
            assertEquals(Integer.valueOf(3), list.get(1));
            assertEquals(Integer.valueOf(4), list.get(2));
            assertEquals(Integer.valueOf(6), list.get(3));
            assertEquals(Integer.valueOf(7), list.get(4));

            assertTrue(list.isSorted());
        }
        @Test
        public void test_clear() {
            list.add(1);
            list.add(2);
            list.add(3);

            list.clear();
            assertEquals(0, list.size());
        }
}