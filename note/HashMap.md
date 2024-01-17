### HashMap

HashMap VS ArrayList

ArrayList

- 요소 접근 > 첨자(index) 사용 > 방번호

- 순서가 있는 집합(방번호 == 요소의 순서)

ex)1강의실, 2강의실, 3강의실

- 스칼라 배열(Scalar array)

- 요소 = 첨자(index) + 값(value)

- 첨자(index)는 유일하다.

- 값(value)은 중복이 가능하다. > 방번호가 유일하기 때문

HashMap

- 요소 접근 > 키(key) 사용 > 방이름

- 순서가 없는 집합

ex) 햇님반, 달님반, 별님반

- 연관 배열, 사전 구조(Dictionary)

- 요소 = 키(key) + 값(value)

- 키(Key)가 유일하다.

- 값(value)은 중복이 가능하다. > 키가 유일하니까

- 방이름을 사용했기에 가독성이 높음(클래스처럼)

- 주로 일회용 객체 만들때 사용

- 반복 돌릴 예정이면 Hash는 안쓰는것이 좋다.

```java
HashMap<String, String> map = new HashMap<>();
//1. 요소 추가
map.put("red", "빨강");
map.put("yellow", "노랑");
map.put("blue", "파랑");

//2.요소 개수
System.out.println(map.size());

//3. 요소 읽기
System.out.println(map.get("yellow"));
System.out.println(map.get("black"));    //map계열들은 에러발생 x > null반환

//4. 요소 수정
map.put("blue", "퍼렁");
System.out.println(map);

//5. 요소 삭제
map.remove("blue");
System.out.println(map);

//6. 검색
System.out.println(map.containsKey("red"));
System.out.println(map.containsValue("빨강"));
map.put("red", "파랑"); //수정

//7. 초기화
map.clear();
System.out.println(map);
```
