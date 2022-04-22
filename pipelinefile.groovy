pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                echo "pull successful"
            }
        }
       stage('Build') { 
            steps {
                echo "build successful"
            }
        }
        stage('Test') { 
            steps {
                echo "test successful"
            }
        }
        stage('Deploy') { 
            steps {
                echo "deploy sussesful"
            }
        }
    }
}
