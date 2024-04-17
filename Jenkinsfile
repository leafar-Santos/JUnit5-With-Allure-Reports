pipeline {
    agent any
    stages {
        stage ('Inicio') {
            steps {
                bat 'echo inicio'
            }
        }
        stage ("Executando testes JUnit 5") {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    script {
                     bat 'allure generate --clean'
                        // Gerar o relatório do Allure
                        allure([
                            includeProperties: false,
                            jdk: '',
                            properties: [],
                            reportBuildPolicy: 'ALWAYS',
                            results: [[path: 'target/allure-results']],
                            clean:true
                        ])
                        

                    }
                }
            }
        }
    }
}
