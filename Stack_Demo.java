package stack;

import java.util.Stack;

public class Stack_Demo {
    public static void main(String[] args) {

        Stack<String> st = new Stack<>(); // creation of stack

        st.push("white"); // adding elements into the string
        st.push("orange");
        st.push("green");
        st.push("yellow");
        st.push("tone");

        System.out.println(st);

        for (String i : st) // printing the elements
        {
            System.out.println(i);
        }

        System.out.println(st.pop()); // removing top of elements

        System.out.println(st.search("green")); // searching the elements from top to bottom

        System.out.println(st.peek()); // peek of the element in the list displays the top of the element only

        st.push(null); // allows null values also

        st.push("orange"); // allows duplicate elements in the list
        st.push("yellow");

        System.out.println(st);
    }

}
