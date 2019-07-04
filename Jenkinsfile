pipeline {

    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2 -p 8081:8081'
        }
    }

    stages {
       stage('Build') {
          steps {
             sh 'mvn clean package'
          }
       }
       stage('Run') {
          steps {
              sh 'java -jar target/hello-spring-1.0-SNAPSHOT.jar'
          }
       }
    }

}