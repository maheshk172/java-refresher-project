package org.java8.problems;

import org.refresher.collections.StringItem;
import org.refresher.collections.Utilities;

import javax.rmi.CORBA.Util;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by kulkamah on 2/8/2017.
 */
public class ArrayOperationsExamples {
    public static void main(String[] args) {
       Problems probs = new Problems();

       //probs.arrayListCompareExample();
       //probs.findDuplicateCharactersInString();
        probs.filterProblem();
    }

}

class Problems {

    //Array List compare problem
    public void arrayListCompareExample() {
        Integer[] arr1 = {10, 11, 12, 13, 50, 60, 61, 70, 71};
        Integer[] arr2 = {-2, 12, 50, 60, 61, 70, 71, 72, 81};

        //convert into List, so can be used for compare
        List<Integer> list1 = Arrays.asList(arr2);

        List<Integer> commonArray = new ArrayList<>();

        for (int i=0; i < arr1.length; i++) {
            if (list1.contains(arr1[i])) {
                commonArray.add(arr1[i]);
            }
        }

        Utilities.printCollection(commonArray);
    }

    // Find Duplicates in String
    public void findDuplicateCharactersInString()  {
        String str = "AABBCCDDEEfghijklmnopqRRSSTT";
        str.subS
        HashMap<Character, Integer> charMap = new HashMap<>();


        for(int i=0; i < str.length(); i++) {
            Character character = str.charAt(i);
            if(charMap.containsKey(character)){
                charMap.replace(character, charMap.get(character ) + 1);
            } else {
                charMap.put(character, 1);
            }
        }

        System.out.println("String: " + str);
        Utilities.printHashMap(charMap);
    }

    public void filterProblem() {

        List<Employee> list1 = new ArrayList<>();

        list1.add(new Employee("Ajay", "Vijay"));
        list1.add(new Employee("Sachin", "Varun"));
        list1.add(new Employee("Ramesh", "Vijay"));
        list1.add(new Employee("Karan", "Varun"));

        Utilities.printCollection(list1);
        List <Employee> filteredList = list1.stream().filter(p -> p.getManagerName().equalsIgnoreCase("varun")).collect(Collectors.toList());
        Utilities.printCollection(filteredList);
    }

}

class EmployeeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
       return o1.getEmpName().compareTo(o2.getEmpName());
    }
}

class Employee implements Comparable<Employee>{
    private String empName;
    private String managerName;

    Employee() {
        super();
    }

    Employee(String empName, String managerName) {
        this.empName = empName;
        this.managerName = managerName;
    }


    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(final String empName) {
        this.empName = empName;
    }

    public String getManagerName() {
        return this.managerName;
    }

    public void setManagerName(final String managerName) {
        this.managerName = managerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (!getEmpName().equals(employee.getEmpName())) return false;
        return getManagerName().equals(employee.getManagerName());
    }

    @Override
    public int hashCode() {
        int result = getEmpName().hashCode();
        result = 31 * result + getManagerName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("[EmpName: ").append(this.empName)
                .append(", Manager Name: ").append(this.managerName).append("]").toString();
    }

    @Override
    public int compareTo(Employee o) {
        return o.getEmpName().compareTo(this.getEmpName());
    }
}

