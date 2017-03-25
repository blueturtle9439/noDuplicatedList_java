import java.util.ArrayList;
import java.util.List;

public class test { // 로직을 이용한 중복제거 removing duplication by logic
    static List<String> resultList;
    static List<String> dataList;

    public static void main(String[] args) {
        dataList = new ArrayList<String>();
        dataList.add("1111");
        dataList.add("2222");
        dataList.add("3333");
        dataList.add("3333");
        dataList.add("aaaa");
        dataList.add("bbbb");
        dataList.add("eeee");
        dataList.add("bbbb");
        dataList.add("안녕");
        dataList.add("안녕?");
        dataList.add("안녕");
        dataList.add("이건 코드가 아니다");

        int x = 0;
        while (x < 1000) {

            long starttime = System.nanoTime();// 시작점 시간 저장 save time when your code started
//---------------------------------------------------중복제거----------------------------------------
            resultList = new ArrayList<String>();
            for (int i = 0; i < dataList.size(); i++) {
                if (!resultList.contains(dataList.get(i))) {
                    resultList.add(dataList.get(i));
                }
            }
//---------------------------------------------------중복제거----------------------------------------
            long endtime = System.nanoTime(); // 모든 코드가 실행되고 시간 저장 save time when your code ended

            long estimatedTime = endtime - starttime; //시작점과 끝점을 계산하여 걸린 시간 측정 calculate the spending time of your code
            System.out.println(estimatedTime); //걸린시간을 출력 show the time.
            x++;
        }

        System.out.println(resultList);// 중복제거가 잘 되었는지 확인


    }
}
