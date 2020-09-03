pipeline {
  agent any
  stages {
    stage('Bygg') {
      agent {
        docker {
          image 'gradle:6.6-jdk8'
        }

      }
      steps {
        sh './gradlew clean build'
      }
    }

    stage('Test') {
      steps {
        echo 'Test'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploy'
      }
    }

  }
}