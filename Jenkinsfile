pipeline {
    agent any
    stages {
       stage('Build') {
          steps {
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
            sh 'docker stop hello-spring || true && docker rm hello-spring || true'
            sh 'docker run -d --name=hello-spring -p 8081:8081 hello-spring'
          }
       }
    }
}