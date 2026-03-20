package core_java.Stream_Api;
// sealed classes
//  if we want only some classes to inherit then we use sealed classes

// we only want class b and c to inherit a so we write as
sealed class A permits B,C{

}
//  if we permits b and c to inherit A then both the classes should use sealed,non-sealed or final before class and must extend the parent class.
non-sealed class B extends A{

}
final class C extends A{

}

class D{

}




// interface
sealed interface X permits Y{

}
sealed interface Y extends X{

}
//  here the class ie inheriting the parent class can have sealed or non-sealed as final is not applicable in interface.
public class _12_48 {
    
}
