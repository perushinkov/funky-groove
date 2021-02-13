package funkygroove
class HelloWorldTest extends GroovyTestCase {
    void testGetHello() {
        assert HelloWorld.hello == "Hello"
    }
}
