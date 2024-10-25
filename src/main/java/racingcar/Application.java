package racingcar;


public class Application {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(view, model);
        controller.run();


    }
//        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼포(,)기준으로 구분");
//        String nameInput = Console.readLine();
//        System.out.println("시도할 횟수는 몇 회인가요?");
//        int tryInput = Integer.parseInt(Console.readLine());
//
//        System.out.println("실행 결과");
//        HashMap<String,Integer> carInfo = delimiterCar(nameInput);
//
//        String character = "-";
//
//
//        // 게임 진행 상황 표현
//        for (int i = 0; i < tryInput; i++) {
//            for (Map.Entry<String, Integer> entry : carInfo.entrySet()) {
//                carInfo.put(entry.getKey(), entry.getValue()+isForward());
//                System.out.println(entry.getKey()+ " : " + character.repeat(entry.getValue()) );
//
//            }
//            System.out.println();
//
//        }
//
//        int maxValue = 0;
//
//        ArrayList<String> winner = new ArrayList<>();
//
//        //최고점 구하기
//        for (Map.Entry<String, Integer> entry : carInfo.entrySet()) {
//            if (maxValue < entry.getValue()) {   //maxvalue 안에 든 값이 맵 속 밸류보다 작다면 해당 맵 속 밸류 값을 maxvalue에 저장
//                maxValue = entry.getValue();
//            }
//        }
//
//        //최고점과 같은 값들을 승자 목록에 넣기
//        for (Map.Entry<String, Integer> entry : carInfo.entrySet()) {
//            if (maxValue <= entry.getValue()) {
//                winner.add(entry.getKey());
//            }
//        }
//
//        //승자들을 소개하는 부분
//        for (int i = 0; i < winner.size(); i++) {
//            System.out.print(winner.get(i));
//            if (i == winner.size()-1) break;
//            System.out.print(", ");
//        }
//    }
//
//    // 자동차 이름을 구분하는 메서드
//    public static HashMap<String,Integer> delimiterCar(String nameInput) {
//        StringTokenizer st = new StringTokenizer(nameInput,",");
//        HashMap<String,Integer> carInfo = new HashMap<>();
//
//        while (st.hasMoreTokens()) {
//            carInfo.put(st.nextToken(),0);
//        }
//        return carInfo;
//    }
//
//    // 랜덤값에 따라 전진 여부를 결정하는 메서드
//    public static int isForward() {
//
//        int i = Randoms.pickNumberInRange(0,9);
//        if (i>=4) return 1;
//        return 0;
//    }



}
