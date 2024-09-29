
/*
 HW1 Taboo problem class.
 Taboo encapsulates some rules about what objects
 may not follow other objects.
 (See handout).
*/

import java.util.*;

public class Taboo<T> {
	private Map<T, Set<T>> rulesMap;
	
	/**
	 * Constructs a new Taboo using the given rules (see handout.)
	 * @param rules rules for new Taboo
	 */
	public Taboo(List<T> rules) {
		rulesMap = new HashMap<>();

		for (int i = 0; i < rules.size() - 1; i++) {
			T currentRule = rules.get(i);
			T nextRule = rules.get(i + 1);
			if (currentRule != null && nextRule != null) {
				rulesMap.put(currentRule, new HashSet<>()).add(nextRule);
			}
		}
	}
	
	/**
	 * Returns the set of elements which should not follow
	 * the given element.
	 * @param elem
	 * @return elements which should not follow the given element
	 */
	public Set<T> noFollow(T elem) {
		return rulesMap.getOrDefault(elem, Collections.emptySet()); // YOUR CODE HERE
	}
	
	/**
	 * Removes elements from the given list that
	 * violate the rules (see handout).
	 * @param list collection to reduce
	 */
	public void reduce(List<T> list) {
		if (list == null || list.size() == 2) {
			return;
		}

		Iterator<T> iterator = list.iterator();
		T prevLi = iterator.next();

		while (iterator.hasNext()) {
			T currentList = iterator.next();
			if (rulesMap.containsKey(prevLi) && rulesMap.get(prevLi).contains(currentList)) {
				iterator.remove();
			}
			else {
				prevLi = currentList;
			}
		}
	}
}
