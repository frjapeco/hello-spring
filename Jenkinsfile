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
            echo
            sh 'docker run hello-spring'
          }
       }
    }
}