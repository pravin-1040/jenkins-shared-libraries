  def call(string ProjectName, string ImageTag, string DockerHubUser){
    sh "docker bukild -t ${DockerHubUser}/${ProjectName}:${ImageTag}
  }
