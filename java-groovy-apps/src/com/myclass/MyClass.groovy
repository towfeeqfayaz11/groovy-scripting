package com.myclass
class MyClass {
    def test() {
        println "test function"
        this.run()
        //run()     // implicitly calls this.run()
    }
    def run() {
        println "this is instance method run"
    }

    static void testRun() {
        println "static test func"

    }

    static void main( String [] args ) {
        println "MyClass main()"
        MyClass.testRun()
        testRun()
        def obj = new MyClass()   // also created default constructor with same name as MyClass
        obj.test()
    }
}
