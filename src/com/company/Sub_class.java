package com.company;

class SuperClass {
    int num = 20;

    //display method of superclass
    public void display() {
        System.out.println("This is the display method of superclass");
    }

}

public class Sub_class extends SuperClass {
    int num = 10;

    //display method of sub class
    public void display() {
        System.out.println("This is the display method of sub class");
    }

    public void my_method() {
	    // instantiating subclass
        Sub_class sub = new Sub_class();

        // invoking the display() method of sub class
        sub.display();

        // invoking the display() method os super class
        super.display();

        // printing the value of variable num of subclass
        System.out.println("Value of the var in sub class: "+ sub.num);

        // printing the value of variable num of superclass
        System.out.println("Value of the var in super class: "+ super.num);
    }

    public static void main(String[] args) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
}