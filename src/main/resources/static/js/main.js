function generate(){
  let projectDto;

  let buildType = document.getElementById("input-buildTool");
  console.log("this is buildType : " + buildType);
  projectDto.buildType = buildType;

  let language = document.getElementById("input-language");
  console.log("this is language : " + language);
  projectDto.language = language;

  let javaVersion = document.getElementById("input-javaVersion");
  console.log("this is javaVersion : " + javaVersion);
  projectDto.javaVersion = javaVersion;

  let metaData;
  let dataGroup = document.getElementById("input-group");
  console.log("this is metaData.group : " + dataGroup);
  metaData.group = dataGroup;

  let dataArtifact = document.getElementById("input-artifact");
  console.log("this is metaData.artifact : " + dataArtifact);
  metaData.artifact = dataArtifact;

  let dataDescription = document.getElementById("input-description");
  console.log("this is metaData.description : " + dataDescription);
  metaData.description = dataDescription;

  let dataFullPackage = document.getElementById("input-package");
  console.log("this is metaData.fullPackage : " + dataFullPackage);
  metaData.fullPackage = dataFullPackage;

  projectDto.metaData = metaData;
  console.log(projectDto);

  $.ajax({
    url: "input",
    type: 'POST',
    data: JSON.stringify(projectDto),
    headers: {'Content-Type': 'application/json'},
    dataType: "json",
    contentType: 'application/json',
    success: alert("데이터 전송에 성공했습니다!!"),
    fail: alert("데이터 전송에 실패했습니다 ㅠㅠㅠㅠㅠ")
  })
}