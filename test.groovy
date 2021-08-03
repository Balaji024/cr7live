println("Hello world")
//'cd cr7live'.execute()
def gitLog = ['git', 'log', 'origin/master...1.6','--oneline'].execute()
println(gitLog)

//def gitLog() { 
 // ['git', 'log', "--pretty=format:* %h: %s", 'master..HEAD'].execute().text.trim() 
//}
String output = new StringWriter().with { out ->
    Process proc = ['echo','hello'].execute()
    proc.consumeProcessOutput( out, System.err )
    proc.waitFor()
    out.toString()
}
println output