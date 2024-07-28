# Collection Framework

## 개요

컬렉션 프레임워크는 자바에서 제공하는 자료구조를 담당하는 프레임워크로, 방대한 데이터를 효율적으로 관리(추가, 삭제, 조회, 정렬, 수정)할 수 있도록 도와준다.

### 자료구조와 프레임워크

- **자료구조**: 방대한 데이터를 효율적으로 관리할 수 있는 개념이다.
- **프레임워크**: 이미 만들어져 있는 코드의 틀을 의미한다.

### 배열의 단점과 컬렉션의 장점

#### 배열의 단점

1. **고정 크기**: 배열은 크기를 지정해야 한다. 새로운 값을 추가하려면 새로운 크기의 배열을 만들고 기존 값을 복사하는 코드를 작성해야 한다.
2. **복잡한 중간 삽입/삭제**: 배열 중간에 값을 추가하거나 삭제하는 경우 값을 이동시키는 복잡한 코드를 직접 작성해야 한다.
3. **단일 타입 저장**: 배열은 한 공간에 한 타입의 데이터만 저장할 수 있다.

#### 컬렉션의 장점

1. **동적 크기**: 크기를 지정할 필요가 없다. 데이터를 더 추가하면 컬렉션이 자동으로 크기를 늘린다.
2. **간편한 중간 삽입/삭제**: 중간에 값을 추가하거나 삭제할 때 복잡한 코드를 작성할 필요 없이 메소드 호출만으로 처리가 가능하다.
3. **다양한 타입 저장**: 한 공간에 여러 타입의 데이터를 저장할 수 있다. (단, 객체만 가능하며 제네릭을 사용하면 한 타입으로 제한할 수 있다.)

## 예제 코드

### ArrayList 사용 예제

```java
import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // ArrayList 생성
        List list = new ArrayList(3); 
        System.out.println(list); 

        // add(E e) : 리스트 끝에 데이터 추가
        list.add(new Music("레이니데이", "파테코"));
        list.add(new Music("비가오는날에", "김경호"));
        list.add(new Music("팔레트", "아이유"));
        list.add("끝");
        System.out.println(list); 

        // add(int index, E e) : 지정한 인덱스에 데이터 추가
        list.add(1, new Music("사랑인가봐", "윤도현"));
        System.out.println(list);

        // remove(int index) : 지정한 인덱스의 데이터 삭제
        list.remove(1);
        System.out.println(list);

        // set(int index, E e) : 지정한 인덱스의 데이터를 새로운 데이터로 변경
        list.set(2, new Music("사랑인가봐", "윤도현"));
        System.out.println(list);

        // size() : 리스트의 크기 반환
        System.out.println(list.size()); 

        // get(int index) : 지정한 인덱스의 데이터 반환
        Music m = (Music) list.get(0);
        System.out.println(m);

        // subList(int fromIndex, int toIndex) : 부분 리스트 반환
        List sub = list.subList(1, 3); 
        System.out.println(sub);

        // addAll(Collection c) : 컬렉션을 통째로 추가
        list.addAll(sub);
        System.out.println(list);

        // isEmpty() : 리스트가 비어있는지 확인
        System.out.println(list.isEmpty());

        // clear() : 리스트를 비움
        list.clear();
        System.out.println(list);

        // 전체 데이터 접근 방법
        System.out.println("========== for ==========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("========== for each ==========");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

// Music 클래스 정의
class Music {
    private String title;
    private String artist;

    public Music(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
