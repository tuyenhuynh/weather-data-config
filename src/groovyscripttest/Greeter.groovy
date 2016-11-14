/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package groovyscripttest

class Greeter1 {
    String sayHello() {
        def greet = new Dependency().message
        greet
    }
}

new Greeter1()
