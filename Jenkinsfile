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
<<<<<<< HEAD
            sh 'docker stop hello-spring || true && docker rm hello-spring || true'
            sh 'docker run -d -p --name hello-spring 8081:8081 hello-spring'
=======
            sh 'docker run -d --name=hello-spring -p 8081:8081 hello-spring'
>>>>>>> 88a59b1f350c637f4ebb8ea6bbdbf1d9ddc906c2
          }
       }
    }
}