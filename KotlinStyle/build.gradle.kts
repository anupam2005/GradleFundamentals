tasks.register("hello"){

    doFirst{
        print("Hello")
    }

    doLast{
        println(", Kotlin Style")
    }
}

tasks.register("aDependentTask"){

    dependsOn("hello")

    doLast{
        println("This is dependent task")
    }
}