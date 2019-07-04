pipeline {
    agent any
    stages {
       stage('Build') {
          steps {
             sh 'mvn clean package'
          }
       }
       stage('Test') {
          steps {
             echo 'Testing...'
          }
       }
       stage('Deploy') {
          steps {
            sh 'docker build -t hello-spring -p 8081:8081 .'
          }
       }
    }
}