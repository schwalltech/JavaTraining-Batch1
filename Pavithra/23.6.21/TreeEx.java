package collections;

import java.util.Comparator;

public class TreeEx implements Comparator<EmployeeEx>{

		@Override
		public int compare(EmployeeEx o1, EmployeeEx o2) {
			int m=o1.length();
			int n=o2.length();
			if(m>n)
			return 1;
			else if(m<n)
				return -1;
			return 0;
		}

	}

