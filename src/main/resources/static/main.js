function generate(){
  let projectDto = {};

  let buildType = document.getElementById("input-buildTool").innerText;
  console.log("this is buildType : " + buildType);
  projectDto.buildType = buildType;

  let lang = document.querySelector('input[name="language"]:checked').value;
  console.log("this is language : " + lang);
  projectDto.language = lang;

  let springVersion = document.getElementById("input-SBVersion").innerText;
  console.log("this is springVersion : " + springVersion);
  projectDto.springVersion = springVersion;

  let metaData = {};
  let dataGroup = document.getElementById("input-group").value;
  console.log("this is metaData.group : " + dataGroup);
  metaData.group = dataGroup;

  let dataArtifact = document.getElementById("input-artifact").value;
  console.log("this is metaData.artifact : " + dataArtifact);
  metaData.artifact = dataArtifact;

  let dataName = document.getElementById("input-name").value;
  console.log("this is metaData.name : " + dataName);
  metaData.name = dataName;

  let dataDescription = document.getElementById("input-description").value;
  console.log("this is metaData.description : " + dataDescription);
  metaData.description = dataDescription;

  let dataFullPackage = document.getElementById("input-package").value;
  console.log("this is metaData.fullPackage : " + dataFullPackage);
  metaData.fullPackage = dataFullPackage;

  let dataPackaging = document.getElementById("input-packaging").innerText;
  console.log("this is metaData.dataPackaging : " + dataPackaging);
  metaData.packaging = dataPackaging;

  let dataJavaVersion = document.getElementById("input-javaVersion").innerText;
  console.log("this is metaData.javaVersion : " + dataJavaVersion);
  metaData.javaVersion = dataJavaVersion;

  projectDto.metaData = metaData;

  $.ajax({
    url: "input",
    type: 'POST',
    data: JSON.stringify(projectDto),
    headers: {'Content-Type': 'application/json'},
    dataType: "json",
    contentType: 'application/json',
    success: function (){
      alert("생성완료! 다운로드를 확인하세요")
    },
    fail: function (){
      alert("데이터 전송에 실패했습니다 ㅠㅠㅠㅠㅠ")
    }
  });
}

