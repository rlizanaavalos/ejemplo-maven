pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo 'Compile'
                script {
                    dir('/home/rlizana/devops-usach/ejemplo-maven') {
                        sh './mvnw clean compile -e'
                    }
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Test'
                script {
                    dir('/home/rlizana/devops-usach/ejemplo-maven') {
                        sh './mvnw clean test -e'
                    }
                }
            }
        }
        stage('Package') {
            steps {
                echo 'Package'
                script {
                    dir('/home/rlizana/devops-usach/ejemplo-maven') {
                        sh './mvnw clean package -e'
                    }
                }
            }
        }
        stage('Run') {
            steps {
                echo 'Run'
                script {
                    dir('/home/rlizana/devops-usach/ejemplo-maven') {
                        sh 'nohup bash mvnw spring-boot:run &'
                        sleep(30)
                    }
                }
            }
        }
        stage('TestApp') {
            steps {
                echo 'TestApp'
                script {
                    dir('/home/rlizana/devops-usach/ejemplo-maven') {
                        sh """curl -X GET 'http://localhost:8081/rest/mscovid/test?msg=testing'"""
                    }
                }
            }
        }
    }
}
