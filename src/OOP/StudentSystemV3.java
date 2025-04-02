package src.OOP;

class StudentV3 {
    int id;
    String name;
    private static String university = "영진";
    SubInfo[] subList;
    int sum;
    float avg;

    StudentV3(int subNum, String argName, int argId) {
        subList = new SubInfo[subNum];
        for(int i = 0; i < subNum; i++) {
            subList[i] = new SubInfo();
        }
        name = argName;
        id = argId;
    }
    int getSum() {
        sum = 0;
        for(SubInfo temp:subList) {
            sum += temp.score;
        }
        return sum;
    }
    float getAvg() {
        avg = getSum() / subList.length ;
        return avg;
    }

    static void prtUniversity() { System.out.println(university); }
}

class SubInfo {
    String title;
    int score;

    SubInfo(String argTitle, int argScore) {
        title = argTitle;
        score = argScore;
    }
    SubInfo() {

    }
}

public class StudentSystemV3 {
    public static void main(String[] args) {

    }
}
