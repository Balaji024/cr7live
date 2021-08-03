println("Hello world")
'cd cr7live'.execute()
//def gitLog = ['git', 'log', '--oneline'].execute().text
//println(gitLog)

//def gitLog() { 
 // ['git', 'log', "--pretty=format:* %h: %s", 'master..HEAD'].execute().text.trim() 
//}

String output = new StringWriter().with { out ->
    Process proc = ['git', 'log', '--oneline'].execute()
    proc.consumeProcessOutput( out, System.err )
    proc.waitFor()
    out.toString()
}
println output