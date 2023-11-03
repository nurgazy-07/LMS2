public class MyClass {
//    (атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)

    String name;
    String surName;
    byte age;
    String sabak;
    String food;

    public MyClass(String name, String surName, byte age, String sabak, String food) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.sabak = sabak;
        this.food = food;

    }
        public void MyClass () {
            System.out.println(name + ", " + surName + ", " + age + ", " + sabak + ", " + food);
        }

    public MyClass(){}
}