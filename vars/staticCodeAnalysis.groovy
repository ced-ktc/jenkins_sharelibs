def call(Map stageParams){
    sh 'mvn clean package sonar:sonar'
}