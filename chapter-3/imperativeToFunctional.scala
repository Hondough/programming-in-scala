println("printArgs1")
printArgs1(args)

println("printArgs2")
printArgs2(args)

println("printArgs3")
printArgs3(args)

println("formatArgs")
println(formatArgs(args))

def printArgs1(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
        println(args(i))
        i += 1
    }
}

def printArgs2(args: Array[String]): Unit = {
    for (arg <- args)
        println(arg)
}

def printArgs3(args: Array[String]): Unit = args.foreach(println)

def formatArgs(args: Array[String]): String = args.mkString("\n")

// test
val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")