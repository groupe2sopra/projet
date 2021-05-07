node{
  cleanWs()
  try{
    stage('PremiereEtape'){
      sh "echo 'Hello World !!'"
      sh "ls -al"
      sh " cd . "
      sh "tar -cf test_build.tar ."
      sh "ls -al"
    }
  }
  finally{
    
  }
}
