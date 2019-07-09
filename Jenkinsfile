pipeline {
    agent any
    stages {
       stage('Build') {
          steps {
             sh 'docker rm $(docker ps --filter name=hello-spring)'
             sh 'mvn clean package'
             sh 'docker build -t hello-spring .'
          }
       }
       stage('Test') {
          steps {
             echo 'Testing...'
          }
       }
       stage('Deploy') {
          steps {
            sh 'docker run -d -p --name hello-spring 8081:8081 hello-spring'
          }
       }
    }
}