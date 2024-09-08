import org.example.WorkWithList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class TestWorkWithList {

    @Test
    void getSameList() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        WorkWithList workWithList = new WorkWithList(list1, list2);
        assertThat(workWithList.getMaxAverageValueFromTwoLists()).isEqualTo("Средние значения равны");
    }

    @Test
    void getList1MoreList2() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        WorkWithList workWithList = new WorkWithList(list1, list2);
        assertThat(workWithList.getMaxAverageValueFromTwoLists()).isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    void getList2MoreList1() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        WorkWithList workWithList = new WorkWithList(list1, list2);
        assertThat(workWithList.getMaxAverageValueFromTwoLists()).isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    void getTestAverageValueEmptyList() {
        List<Integer> list = new ArrayList<>();
        WorkWithList workWithList = new WorkWithList(list,list);
        try {
            workWithList.getAverageValueList1();
            Assertions.fail("Ошибка не была выброшена");
        } catch (IllegalArgumentException e) {
            Assertions.assertTrue(e.getMessage().contains("Список пуст или не задан."));
        }
    }

}
