class MyClass {
    def test() {
        println "test function"
    }

    static void testRun() {
        println "static test func"

    }

    static void main( String [] args ) {
        println "MyClass main()"
        MyClass.testRun()
        testRun()
        def obj = new MyClass()
        obj.test()
    }
}
