fun main(args: Array<String>){
    println("Jai Sai Ram");

    var test = TestClass();
    println("From Main file: ${test.name}");
}

class TestClass{
    var name: String = "Sai";
}