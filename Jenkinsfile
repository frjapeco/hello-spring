pipeline {
    agent any
    parameters {
        booleanParam(name: 'INTEGRATION_TESTS', defaultValue: true, description: 'Execute integration tests')
    }
    stages {
       stage('Build') {
          steps {
             sh 'mvn clean package -DskipTests'
          }
       }
       stage('Test') {
        when {
            expression { return params.INTEGRATION_TESTS == true }
        }
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