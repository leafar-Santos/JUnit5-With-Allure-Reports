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
            }
            post {
                always {
                    script {
                        if (fileExists('allure-results')) {
                            bat 'allure generate allure-results --clean -o allure-report'
                        } else {
                            echo 'Nenhum resultado do Allure encontrado.'
                        }
                    }
                    allure includeProperties: false,
                          jdk: '',
                          results: [[path: 'allure-results']]
                }
            }
        }
    }
}
