# 3월 17일 알고리즘

- 정렬 및 단순 로직

  [[수열 찾기]](https://github.com/j096/Algorithm/blob/main/src/sorting/FindingSequence.java)

  1. 숫자별 빈도수를 저장하기 위해 `HashMap`을 사용한다.
  2. 단순 완전 탐색이 아닌(n^2), **가장 작은 수가 원래 수열의 수**인 조건을 추가하고 **빈도수**를 확인하여 반복문을 n번만 반복한다.

  

- 그리디

  [[이동 횟수]](https://github.com/j096/Algorithm/blob/main/src/greedy_algorithm/MovingCount.java)

  1. 1차원 배열을 양 극단에서 중심으로 탐색할 때, left/right 인덱스를 주어서 처리한다.

  2. 가장 무거운 것과 가장 가벼운 것을 n 개 들 수 있는 가정이지만 (2개 이상), 무게의 조건이

     2 이상 5 이하이므로 최대 2개까지 밖에 들 수 없다는 **조건을 확인**하여 구현해야한다.

  

- DFS

  [[가장 가까운 큰 수]](https://github.com/j096/Algorithm/blob/main/src/recursive/dfs/MaxNearestNumber.java)

  - 자리수를 저장한 배열을 **오름차순으로 정렬한 후 최소값이 구해지면 더이상 탐색하지 않도록 flag 값을 둔다.** (정렬하지 않아도 모든 경우의 수를 탐색하므로 정답을 구할 수 있지만 시간 효율이 떨어진다.

    
  
  