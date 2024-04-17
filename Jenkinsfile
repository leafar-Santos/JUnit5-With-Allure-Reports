pipeline {
    agent any
    stages{
        stage ('Inicio'){
            steps{
                bat 'echo inicio'
            }
        }
        stage ('Executando testes JUnit 5'){
            steps{
             bat 'mvn clean test'
            }
        }
        stage('Publish') {
                steps{
                publishHTML(
                        target: [
                                allowMissing         : false,
                                alwaysLinkToLastBuild: false,
                                keepAll              : true,
                                reportDir            : 'target/site/allure-maven-plugin',
                                reportFiles          : 'index.html',
                                reportName           : "Allure Report"
                        ]
                )
                }
            }
          stage ('Fim'){
                    steps{
                        bat 'echo fim'
                    }
                }
    }
}