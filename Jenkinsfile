pipeline{
agent any
stages {
  stage('maven install') {
    steps {
withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'TestMaven', mavenSettingsConfig: '', traceability: true) {
    bat 'mvn clean install'
}    
    }
  }

}

}
