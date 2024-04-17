pipeline {
    agent any
    stages{
        stage ('Inicio'){
            steps{
                bat 'echo inicio'
            }
        }
        stage('Build') {
                try {
                    git 'https://github.com/eroshenkoam/allure-example.git'
                    sh './gradlew clean test'
                }
                finally {
                    allure includeProperties:
                       false,
                       jdk: '',
                       results: [[path: 'build/allure-results']]
                }
            }
        stage ('Fim'){
                    steps{
                    bat 'echo fim'
                    }
                }
    }
}