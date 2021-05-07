node{
  cleanWs()
  try{
    stage('PremiereEtape'){
      sh "echo 'Hello World !!'"
      sh "ls -al"
      
    }
  }
  finally{
    
  }
}
