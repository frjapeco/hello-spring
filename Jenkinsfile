pipeline {

    agent {
      docker {
       image 'zenika/alpine-maven'
       args '-p 3000:3000'
      }
    }

    environment {
      CI = 'true'
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