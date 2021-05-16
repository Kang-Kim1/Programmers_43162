# Programmers_43162
## 프로그래머스 - 네트워크(https://programmers.co.kr/learn/courses/30/lessons/43162)
BFS 알고리즘을 사용하여 하나의 연결된 네트워크에 연결된 모든 컴퓨터를 확인하며 총 네트워크 개수를 확인하는 문제.  
하나의 네트워크를 확인한 뒤, 어떻게 효율적으로 다음 확인할 컴퓨터를 queue에 넣을 수 있을지에 대한 고민 +   
네트워크 개수 카운팅 코드 위치 때문에 시간이 생각했던 것보다 초큼 더 소요됐다.  
별건 아니지만,, 코드 리뷰를 통해 두 Computer의 연결을 [computers[l][k] == 1 && computers[k][l] == 1]에서  
[computers[k][l] + computers[l][k] == 2]로 간결하게 표현해줬다,, 뭔가 뿌듯했다.

실행 순서는 다음과 같다 : 
1. 다른 컴퓨터에 연결된 컴퓨터를 확인  
2. 상기 확인된 컴퓨터를 queue에 입력. visited 방문 처리 & 네트워크 개수 증가
3. BFS 알고리즘으로 queue에 입력된 컴퓨터와 연결된 모든 컴퓨터를 확인하여 방문 처리
4. queue가 비었을 경우(네트워크와 연결된 코든 컴퓨터를 확인한 상태) 아직 방문하지 않은 컴퓨터 확인하며 위 step 반복
