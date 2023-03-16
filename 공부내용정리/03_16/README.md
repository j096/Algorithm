# 3월 16일 알고리즘

- 배열 탐색

     [[최대 길이 연속수열]](https://github.com/j096/Algorithm/blob/main/src/array_search/MaxConsecutiveSequence.java)

  1. 배열에서 중복을 제거하기 위해 `HashSet`에 넣어준다.
  2. 단순 완전 탐색이 아닌, 수열의 시작점이 될 수 있는 수의 조건문을 추가하여 시간 복잡도를 줄인다.(수열의 시작점은 자신보다 1작은 수가 없으면 된다.)

  

- 정렬

     [[이진수 정렬]](https://github.com/j096/Algorithm/blob/main/src/sorting/BinaryNumberSorting.java)

  1. 이진수를 구하며 1의 갯수 바로 카운트 하기(다 구한 후 카운트 하는 것이 아님)

  2. 이진수를 구하는 반복문의 조건은 num >= 2 가 아닌 num > 0 이어야 마지막 몫의 1까지 카운트 할 수 있다. (아니면 따로 조건을 또 주어 구해야한다.)

  ```java
  while(num>0){
  	cnt += num%2;
  	num = num/2
  }
  ```

  

- 그리디

  [[타이타닉 침몰]](https://github.com/j096/Algorithm/blob/main/src/greedy_algorithm/Titanic2.java)

  -> 1차원 배열을 양 극단에서 중심으로 탐색할 때, left/right 인덱스를 주어서 처리한다.
  
  ```java
  while(left<=right){
  	if(조건1)
  		left++;
  	if(조건2)
  		right--;
  }
  ```
  
  