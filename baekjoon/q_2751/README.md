출처 : https://www.acmicpc.net/problem/2751

맨 처음에 2750번이랑 조건이 다른게 뭐야? 하고 그냥 해봤다.<br>
그런데 시간초과가 뜨길래 '아... 다른 정렬알고리즘을 사용해서 시간을 단축시켜야는구나' 생각했다.<br>
2750번은 선택 정렬을 사용해서 시간 복잡도가 O(n^2)이다.<br>
그러면 O(nlogn)의 시간복잡도를 갖는 정렬 알고리즘 중에서 사용하면 된다고 결론냈다.<br>

## Main1
`Arrays.sort()`메서드는 선택정렬을 사용한다고 알고 있어가지고 비슷한 그런게 있지 않을까? 했다.<br>
검색해보니 '`Collections.sort()`메서드가 Tim sort를 사용한다고 한다.<br>
그래서 이걸 사용하면 되겠다 싶어서 코드를 작성했다.<br>
(자세한 거는 첫 번째 참고 링크로...)

## Main2
Main1이랑 다른 점이라면 출력할 때 `System.out.println();`을 사용하지 않고, `BufferedWriter`를 통해 출력했다. <br>
검색하면서 알게 된 것인데, 이를 사용하면 시간을 단축할 수 있다고 한다.<br>
(자세한 거는 두 번째 참고 링크로...)  <br><br>

---
참고: https://d2.naver.com/helloworld/0315536 <br>
참고: https://rlakuku-program.tistory.com/33
