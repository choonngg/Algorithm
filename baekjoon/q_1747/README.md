출처 : https://www.acmicpc.net/problem/1747

문제에서 팰린드롬 + 소수인 숫자를 구하라고 나와있다.<br>
생각한 방식 : 팰린드롬을 구하고 -> 소수를 구하자
<br>

## BeforeMain
1. `Scanner`를 사용해 입력을 받았다.<br>
2. 팰린드롬 판별
   + int타입으로 받은 n을 String으로 변환
   + `StringBuffer`를 이용해서 reverse를 구함
   + 두 String이 같은 지 확인
3. 소수 판별
   + n을 2~n-1까지 나누고, 나머지가 0이 하나라도 나오면 소수 X

<br>

## AfterMain
1. `Scanner` 대신 `BufferedReader`를 이용
    + 시간 단축 (130ms?)
2. 소수 판별 시 '에라토스테네스의 체' 사용
    + 시간 단축 (20ms?)
> [ 이렇게 한 이유 ] <br>
> 아무리봐도 틀린 게 없는데 계속 틀렸다고 하니까... 인터넷을 좀 봤다. <br>
> 근데 많은 분들이 이 방식을 사용하고 있었고, 시간 단축에 도움이 된다는 것을 알았다.

<br>

## 진짜 틀린 이유
뒤늦게 알은 사실인데... 문제에서 주어진 n의 범위는 입력값을 제한시킨 것이다. <br>
하지만 내 코드에서는 `while (n<1000000)`을 통해 출력값의 범위까지 제한시켰기 때문에 틀린 것이었다. <br>
생각을 너무 안해서... 그것도 모르고 계속 헛발짓만 하고 있었음