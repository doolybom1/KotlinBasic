public class Main_04 {
    public static void main(String[] args) {

        /*
            1. 가장 전통적인 순수 java 방식
               인터페이스로 객체를 선언하고 선언된 클래스로 객체를 생성, 초기화하여 method를 호출하는 방식
               선언은 interface로 생성은 implements한 클래스로 생성
         */
        MyAdd myAdd1 = new MyAddImpl();
        int sum = myAdd1.add(3,4);

        /*
            1. 익명(무명, 식별자없는) 클래스를 생성과 동시에 사용
            인터페이스로 객체를 선언하고 인터페이스이름으로 생성자를 호출하고
            인터페이스에 정의된 method를 필수로 구현하여 메서드를 호출하는 방법
         */
        MyAdd myAdd2 = new MyAdd() {
            @Override
            public int add(int a, int b) {
                return 0;
            }
        };
        sum = myAdd2.add(4,5);


        /*
            2. java 1.8의 람다방식으로 인터페이스 구현
               람다코드로 인터페이스를 구현하여 myAdd3라는 객체를 생성하고 myAdd3의 객체를 사용하여
               add() method를 호출하는 방법
         */
        MyAdd myAdd3 = (x,y) -> {
            return x+y;
        };
        sum = myAdd3.add(10,20);


        /*
            FunctionalInterface를 사용하는 코드
           한번만 사용하고 더이상 사용할 필요가 없는 method가 있는데 이 method를 사용하기 위해서 클래스를 만들고,
           인터페이스를 implements하고 method의 코드를 작성한 후 만든 클래스 객체를 생성하고 객체로부터 method를
           호출하는 전통적인 방법은 코드의 불필요한 낭비가 발생할 수 있어서 익명클래스라는 특별한 방법을 사용하여
           인터페이스만으로 마치 클래스를 선언한것과 같은 효과를 낸다

           이 익명클래스를 만드는데 코드를 더욱 줄이기 위해 자바 1.8에서는 람다코드 방식을 도입했다

           이것은 jsp에서 어떤 함수의 매개변수 callback 함수를 전달할때 외부에 함수를 선언한 후 이름을 건네는
           방법을 사용하지 않고 직접 매개변수에 function 키워드만으로 함수를 직접 코딩하는 방법에서 패턴을 가져온 것이다.
         */





    }
}
