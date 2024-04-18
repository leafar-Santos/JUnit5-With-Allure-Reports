pipeline {
    agent any
    stages {
        stage ('Inicio') {
            steps {
                bat 'echo inicio'
            }
        }

        stage ('Executando testes JUnit 5') {
            steps {
                bat 'mvn clean test'
                bat 'allure generate allure-results --clean -o target/allure-report'
            }
            post {
                always {
                    allure includeProperties: false,
                          jdk: '',
                          results: [[path: 'target/allure-results']]
                }
            }
        }
    }
}
