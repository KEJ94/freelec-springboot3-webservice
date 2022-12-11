# 스프링 부트와 AWS로 혼자 구현하는 웹 서비스
### 프로젝트 생성 특이사항
- 책에는 인텔리제이 환경에서 프로젝트 생성을 권유했지만 vscode 로 진행
- Spring Initializr 로 Spring Boot 프로젝트 생성
  - (1) 깃허브 데스크톱에서 NEW 리포지토리 생성 
  - (2) 로컬 패스 경로를 Github 디렉터리 까지만 설정
  - (3) freelec-springboot3-webservice 빈 디렉터리가 생기면 Spring Initializr 로 생성한 프로젝트 파일을 모두 이동
- 기존의 Java 11 버전을 사용하려고 했으나, vscode 익스텐션 호환 문제로 Java 17 로 변경하게됨 그리고 Java 자체를 인식못해서 아래 코드를 setting.json 에 추가하게됨 
```
{
    "workbench.colorTheme": "One Dark Pro",
    "workbench.iconTheme": "vscode-icons",
    "editor.fontSize": 10,
    "boot-java.remote-apps": [

    ],
    // 여기서부터 추가된 코드
    "java.jdt.ls.java.home":  "/Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home",
    "java.configuration.runtimes": [
        
        {
            "name": "JavaSE-11",
            "path": "/Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home",
            "default": true,
        }
    ],
    "spring-boot.ls.java.home": "/Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home",
    "boot-java.rewrite.reconcile": true,
    "editor.codeActionsOnSave": {
    
    }
}
```
- 스프링 부트 최초 설치 후 빌드인데 ??? DB 설정관련 에러가 발생해서 아래 코드 추가 후 정상 빌드 확인
```
@SpringBootApplication (추가) -> (exclude = {DataSourceAutoConfiguration.class})
```


