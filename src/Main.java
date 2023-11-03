public class Main {
    public static void main(String[] args) {

//        Triangle деген класс тузунуз.
//
//        Класстын 3 полеси болсун a, b, c.
//
//                Класстын "area" деген методу болсун.
//
//                "area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
//
//        таянып консолго уч бурчтуктун аянтын чыгарсын.

//        Triangle triangle = new Triangle(5, 6, 7);
//        triangle.area();


//        MyClass деген класс тузунуз
//
//        Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//
//        Параметри эки башка болгон эки конструктор тузунуз
//
//        MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//
//        Эки объектке эки башка конструктор иштесин.
//
//        Объекттердин маанилерин консольго чыгарыныз.

        MyClass myClass =  new MyClass("Nurgazy", "Temiraliev", (byte) 19, "JAVA, English",  "плов");
        myClass.MyClass();



        MyClass myClass1 = new MyClass();
        myClass1.name = "Ынтымак";
        myClass1.surName = "Карыев";
        myClass1.age = 19;
        myClass1.sabak = " JS, English";
        myClass1.food = "Беш бармак";
        myClass1.MyClass();

    }

    }
