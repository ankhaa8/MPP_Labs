package Lab10.prob1;
import java.util.*;

public class GroupUtil {
	//Fix this code
	
	public static Group<?> copy(Group<?> group) {
		return copyHelper(group);
	}
	
	public static <T> Group<T> copyHelper(Group<T> group) {
		List<T> elements = group.getElements();
		Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
		return grp;
	}
	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		Group<Integer> group = new Group<>(1, list);
		List<Integer> list1 = Arrays.asList(4,8,5,6);
		Group<Integer> group1 = new Group<>(8, list1);
		List<String> list2 = Arrays.asList("C++","C#", "Java","Kotlin");
		Group<String> group2 = new Group<>("Java", list2);
		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
		System.out.println(GroupUtil.copy(group1));
		System.out.println(GroupUtil.copy(group2));
		//System.out.println(GroupUtil.copy(group));
	}
}
