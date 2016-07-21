import demo.Helper

class BootStrap {

    Helper helper

    def init = { servletContext ->
        println "First: ${helper.firstOne.name}"
        println "Second: ${helper.secondOne.name}"
    }
    def destroy = {
    }
}
