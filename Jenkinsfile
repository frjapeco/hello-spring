pipeline {
    agent any
    parameters {
        boolean(name: 'Integration Tests', defaultValue: true, description: 'Execute integration tests')
    }
    stages {
       stage('Build') {
          steps {
             sh 'mvn clean package -DskipTests'
          }
       }
       stage('Test') {
          steps {
             sh 'mvn test'
          }
       }
       stage('Deploy') {
          steps {
            sh 'docker stop hello-spring || true && docker rm hello-spring || true'
            sh 'docker build -t hello-spring .'
            sh 'docker run -d --name=hello-spring -p 8081:8081 hello-spring'
          }
       }
    }
}