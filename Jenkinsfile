pipeline {

    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2 -p 3000:3000'
        }
    }

    stages {
       stage('Build') {
          steps {
             sh 'mvn clean package'
          }
       }
       stage('Test') {
          steps {
              sh 'java -jar target/hello-spring-1.0-SNAPSHOT.jar'
          }
       }
    }

}