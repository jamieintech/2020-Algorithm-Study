# :rocket: Git 사용법 정리 :rocket:
스터디 저장소 Fork + Clone + Sync 하기


### 참고한 사이트 
> [GitHub Help](https://help.github.com/en/github)   
> [Pro Git Book](https://git-scm.com/book/en/v2)


## 1. Git config 설정

Git을 설치하고 나서 가장 먼저 해야 하는 것은 username과 email을 설정하는 것이다. Git은 커밋할 때마다 이 정보를 사용한다.

  ```
  git config --global user.name "Dong-wook94"
  git config --global user.email example@example.com
  ```

git config 설정 확인 하기
```
git config --list
```



## 2. Git Fork
Fork는 다른 사람의 Repository(저장소)를 내 GitHub으로 복사하는 것이다. 흔히 fork는 다른 사람의 프로젝트를 수정하거나 추가 기능을 넣고 싶을 때 사용한다. Fork한 저장소는 원본 (기존의 저장소)와 연결되어 있다. 이는 원본에 수정이 있으면 내가 fork한 저장소로 `fetch`와 `merge`를 통해 원본의 변경 사항을 반영하거나 내가 한 수정한 커밋 결과를 원본에 반영할 수 있다는 뜻이다. 

> 스터디 저장소 Fork하기   
![image](https://user-images.githubusercontent.com/53888115/74158015-ad838000-4c5c-11ea-9fba-949af5054164.png)

> Fork한 저장소   
![image](https://user-images.githubusercontent.com/53888115/74160153-52ec2300-4c60-11ea-8ea3-1198e383c570.png)


## 3. Git Clone
`git clone`은 원격 저장소를 내 로컬 저장소로 복사해서 가져오는 것이다. Fork한 내 저장소를 로컬 환경에 복사해오도록 하자. 

### Fork한 내 저장소 Clone하기

1. Clone with HTTPS (원격 저장소 주소 복사)
![image](https://user-images.githubusercontent.com/53888115/74159624-6a76dc00-4c5f-11ea-9288-8be023507ff8.png)

2. 원하는 위치의 디렉토리에서 cmd 열기   
```
예시) C:\Git
```     

3. `git clone` + 복사한 저장소 주소    
```
$ git clone https://github.com/YOUR-USERNAME/2020-Algorithm-Study
```

4. Enter   
```
$ git clone https://github.com/YOUR-USERNAME/2020-Algorithm-Study   
> Cloning into '2020-Algorithm-Study'...   
> remote: Counting objects: 10, done.   
> remote: Compressing objects: 100% (8/8), done.  
> remove: Total 10 (delta 1), reused 10 (delta 1)   
> Unpacking objects: 100% (10/10), done.
```   


### 원본 저장소랑 sync 맞추기
1. Clone 후 로컬 디렉토리에서 cmd 열기   
```예시) C:\Git\2020-Algorithm-Study```

2. **원본 저장소**의 주소 복사하기
![image](https://user-images.githubusercontent.com/53888115/74162149-8aa89a00-4c63-11ea-8fee-a68869bdd121.png)

3. cmd에서 `git remote -v` + Enter (현재 origin = fork한 내 저장소)   
```
$ git remote -v   
> origin  https://github.com/YOUR_USERNAME/2020-Algorithm-Study.git (fetch)   
> origin  https://github.com/YOUR_USERNAME/2020-Algorithm-Study.git (push)
```

4. `git remote add upstream` + 복사해온 **원본 저장소의 주소** + Enter   
```
$ git remote add upstream https://github.com/itzjamie96/2020-Algorithm-Study.git
```

5. 잘 됐는지 확인하기
```
$ git remote -v
> origin    https://github.com/YOUR_USERNAME/YOUR_FORK.git (fetch)
> origin    https://github.com/YOUR_USERNAME/YOUR_FORK.git (push)
> upstream  https://github.com/ORIGINAL_OWNER/ORIGINAL_REPOSITORY.git (fetch)
> upstream  https://github.com/ORIGINAL_OWNER/ORIGINAL_REPOSITORY.git (push)
```   

6. 로컬 저장소에서 원본 저장소의 변경 사항 있는지 확인 = `git fetch upstream`   
```
$ git fetch upstream
> remote: Counting objects: 75, done.
> remote: Compressing objects: 100% (53/53), done.
> remote: Total 62 (delta 27), reused 44 (delta 9)
> Unpacking objects: 100% (62/62), done.
> From https://github.com/ORIGINAL_OWNER/ORIGINAL_REPOSITORY
>  * [new branch]      master     -> upstream/master
```   

7. 변경 사항 반영 (로컬 변경사항은 수정되지 않으니 걱정ㄴㄴ) = `git merge upstream/master`
```
$ git merge upstream/master
> Updating a422352..5fdff0f
> Fast-forward
>  README                    |    9 -------
>  README.md                 |    7 ++++++
>  2 files changed, 7 insertions(+), 9 deletions(-)
>  delete mode 100644 README
>  create mode 100644 README.md
```   

## 3. Git Commit & Push
**add**
- 전체 변경 내용 add   
`git add .`       
- 특정 폴더 add   
`git add 폴더이름/`


**commit**   
`git commit -m "커밋 메시지"`   
> 커밋 메세지 규칙   
> [add], [update], [delete]

**push**   
`git push origin master`

## :exclamation: 우리 스터디에서 소스코드 올릴 때 :exclamation:
- 소스코드는 `Main문제번호_이름.확장자` 형식으로 저장
- 원본 저장소 `merge` 이후 **내 로컬 저장소**의 해당 폴더에 소스코드 파일 넣기
- 먼저 fork한 내 저장소에 commit 후 push
```
git push origin master
```   
- 이후 원본 저장소에 push
```
git push upstream master
```


