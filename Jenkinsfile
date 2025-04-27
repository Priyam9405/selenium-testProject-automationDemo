pipeline{
agent any
stages {
  stage('Build & Test') {
    steps {
      echo "Building the project and running tests..."
withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'TestMaven', mavenSettingsConfig: '', traceability: true) {
    bat 'mvn clean install'
}    
    }
  }
  stage('Publish Test Results'){
steps{
echo "Publishing JUnit test reports..."
  junit '**/target/surefire-reports/*.xml'
  }
  }
  stage('Archiving Artifacts'){
    steps{
echo "Archiving important build artifacts..."
    archiveArtifacts artifacts : '**/target/*.jar', fingerprint:true
    }
}
}

}
