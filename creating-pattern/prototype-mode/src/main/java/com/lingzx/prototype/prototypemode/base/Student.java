package com.lingzx.prototype.prototypemode.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Cloneable{
    private int id;
    private String name;
    private int scope;

    public Object clone() {
        Student s = new Student();
        s.id = this.id;
        s.name = this.name;
        s.scope = this.scope;
        return s;
    }

    public static void main(String[] args) {
        Student stu1 = new Student(1, "张三", 88);
        Student stu2 = (Student) stu1.clone();
        System.out.println(stu1);
        System.out.println(stu2);
//        System.out.println(stu1.hashCode()+" : "+System.identityHashCode(stu1));
//        System.out.println(stu2.hashCode()+" : "+System.identityHashCode(stu2));
        System.out.println(stu1 == stu2); //false

    }
}
