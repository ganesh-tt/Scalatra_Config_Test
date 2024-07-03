# My Scalatra Web App #

## Build & Run ##

```sh
$ sbt ~Jetty/start
```

Open [http://localhost:8080/](http://localhost:8080/) in your browser.

Open [http://localhost:8080/config](http://localhost:8080/config) to view all config in your browser.

Add config to application.conf to see if they are reflected 

Running build-docker.sh gives you a docker image which runs right away.

// config are also printed in startup right away , can also be checked in the above URL
// unfortunately, also includes unnecessary system values
//