job("MyProject-Build") {
    description "Builds MyProject from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }
    scm {
        git {
            remote { url("https://github.com/berbawy/hello-world.git") }
            branch("origin/master")  
            extensions {
                wipeOutWorkspace()
            }
        }
    }
    steps {
        shell "Look: I'm building master!"
    }
}
