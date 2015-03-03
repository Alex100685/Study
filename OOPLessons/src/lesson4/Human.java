package lesson4;

class Human implements Comparable {
private int age;
private String name;
private int ID;
public Human(int age) {
this.age = age;
}
public String getName() {
return name;
}
public int getID() {
return ID;
}
public int getAge() {
return age;
}
public int compareTo(Object another) {
Human h = (Human) another;
if (age < h.age)
return 1;
else if (age == h.age)
return 0;
else if (age > h.age)
return -1;
else
return 0; // make compiler happy
}
}