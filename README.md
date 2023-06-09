# 🗒 게시판 만들기

간단히 사용자들과 소통할 수 있는 게시판 서비스입니다.

## 툴

- IntelliJ Ultimate
- Spring boot  2.6.4
- MariaDB -> MongoDB 변경 2023.05.12 변경 이유 Analyzing Performance Differences Between MySQL and MongoDB 논문 참고
- Java jdk 11
- Security 2.6.3

## 프로젝트 기능 및 설계

- 회원관리 기능
    - 사용자는 회원가입을 할 수 있다. 일반적으로 모든 사용자는 회원가입시 USER 권한 (일반 권한)을 지닌다.
    - 회원가입시 아이디, 패스워드, 이메일, 서비스이용약관동의여부, 개인정보처리방침 동의여부를 입력받으며, 아이디는 unique 해야한다.

- 로그인 기능
    - 사용자는 로그인을 할 수 있다. 로그인시 회원가입때 사용한 아이디와 패스워드가 일치해야한다.

- 게시글 작성 기능
    - 로그인한 사용자는 권한에 관계 없이 글을 작성할 수 있다.
    - 사용자의 상태가 NORMAL 상태에서 글을 작성할수 있다.
    - 사용자는 게시글 제목(텍스트), 게시글 내용(텍스트)를 작성할 수 있다.

- 게시글 목록 조회 기능
    - 로그인하지 않은 사용자를 포함한 모든 사용자는 게시글을 조회할 수 있다.
    - 게시글은 최신순으로 기본 정렬되며, 댓글이 많은순/적은순 으로도 정렬이 가능하다.
    - 게시글 목록 조회시 응답에는 게시글 제목과 작성일, 댓글 수의 정보가 필요하다.
    - 게시글은 종류가 많을수 있으므로 paging 처리를 한다.

- 특정 게시글 조회 기능
    - 로그인하지 않은 사용자를 포함한 모든 사용자는 게시글을 조회할 수 있다.
    - 게시글 제목, 게시글 내용, 작성자, 작성일이 조회된다.

- 댓글 목록 조회 기능
    - 특정 게시글 조회시 댓글목록도 함께 조회가 된다. 다만 댓글은 많을 수 있기 때문에 별도의 API로 구성한다. 이 또한 로그인하지 않은 사용자를 포함한 모든 사용자가 댓글을 조회할 수 있다.
    - 댓글은 최신순으로만 정렬되며, paging 처리를 한다.
    - 댓글 목록 조회시에는 댓글 작성자와 댓글 내용, 댓글 작성일의 정보가 필요하다.

- 댓글 작성 기능
    - 로그인한 사용자는 권한에 관계 없이 댓글을 작성할 수 있다.
    - 사용자는 댓글 내용(텍스트)를 작성할 수 있다.

## ERD
![화면 캡처 2023-05-10 011620](https://github.com/nomzzang/community/assets/56585155/681776d5-1a12-4f4c-afc3-29e0be094c05)


## Trouble Shooting

[go to the trouble shooting section](doc/TROUBLE_SHOOTING.md)

### Tech Stack

<div align=center> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
  <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> 
  <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> 
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
</div>

