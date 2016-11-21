package groovyscripttest

class Greeter1 {
    String sayHello() {
        def greet = new Dependency().message
        greet
    }
}

new Greeter1()
