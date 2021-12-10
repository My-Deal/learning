package test;

public class DDDWithDefault {
}

interface Animal{
    public default String getName(){ return null;}
}
interface Mammal{
    public default String getName(){return null;}
}
abstract class Otter implements Animal,Mammal{
    public  String getName(){return "";};
}
