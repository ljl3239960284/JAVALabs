package TEST.Words;

import java.util.*;

public class PhraseQuiz {
    private static final Map<String, String> phrases = new LinkedHashMap<>();
    private static final List<String> mistakes = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        // 填充短语到字典
        phrases.put("吸引", "appeal to");
        phrases.put("有助于", "assist with");
        phrases.put("更好地达到工作生活平衡", "create better work-life balance");
        phrases.put("带薪休假", "paid time off");
        phrases.put("弹性工作制", "workplace flexibility");
        phrases.put("增加就业机会", "boost job creation");
        phrases.put("把...排除在外", "crowd out");
        phrases.put("促进经济增长", "promote economic growth");
        phrases.put("消除监管障碍", "remove regulatory barriers");
        phrases.put("学会", "pick up");
        phrases.put("尽一切办法", "by all means");
        phrases.put("不辜负", "live up to");
        phrases.put("顺从", "submit to");
        phrases.put("充满", "abound with");
        phrases.put("看一看", "check out");
        phrases.put("标志性地标", "iconic landmark");
        phrases.put("是...的家", "be home to");
        phrases.put("加速", "rev up");
        phrases.put("起飞", "take off");
        phrases.put("大城市的生活方式", "a metropolitan lifestyle");
        phrases.put("人均收入", "average person's income");
        phrases.put("暴露", "be exposed to");
        phrases.put("一点也不相似", "bear no relation to");
        phrases.put("远距离通勤", "commute long distance");
        phrases.put("休闲放松的环境", "laid-back environment");
        phrases.put("与...类似", "be akin to");
        phrases.put("迎合", "cater to");
        phrases.put("把...考虑在内", "account for");
        phrases.put("归功于", "be down to");
        phrases.put("达不到基础水平", "fall short of baseline proficiency");
        phrases.put("有进步空间", "have room for improvement");
        phrases.put("落实的政策", "the policies in place");
        phrases.put("减少", "fall away");
        phrases.put("有充分理由", "for good reason");
        phrases.put("同样重要", "just as importantly");
        phrases.put("政府开支", "public spending");
        phrases.put("稳步发展", "steady progress");
        phrases.put("按能力分班", "stream by ability");
        phrases.put("特别容易", "be especially prone to");
        phrases.put("竭尽全力", "go to great lengths to");
        phrases.put("完全取决于", "hinge on");
        phrases.put("显著的特点", "a distinctive feature");
        phrases.put("社交网络应用", "social networking apps");
        phrases.put("观看现场直播", "watch live broadcasts");
        phrases.put("被大多数人接受或使用", "be here to stay");
        phrases.put("引起", "give rise to");
        phrases.put("上升", "on the rise");
        phrases.put("几乎没有", "is slim to none");
        phrases.put("共享乘车", "pool rides");
        phrases.put("倾向于", "show a propensity to");
        phrases.put("同比", "year on year");
        phrases.put("移动支付", "mobile payment");
        phrases.put("在线食品外卖", "online food delivery");
        phrases.put("打车服务", "ride-hailing");
        phrases.put("智能设备", "smart device");
        phrases.put("市场规模", "the market scales");
        phrases.put("对准", "be aligned with");
        phrases.put("可以追溯到", "be traced as far back as");
        phrases.put("公历", "the Gregorian calendar");
        phrases.put("农历新年", "the Lunar New Year");
        phrases.put("旅游产业", "the tourism industry");
        phrases.put("预定民宿", "book a homestay");
        phrases.put("为旅行打包", "pack for a trip");
        phrases.put("符合当地格调", "fit with the tone of a place");
        phrases.put("坚持", "adhere to");
        phrases.put("文化礼节", "cultural etiquette");
    }

    public static void main(String[] args) {
        while (!phrases.isEmpty() || !mistakes.isEmpty()) {
            List<String> currentQuiz = selectPhrases(10);
            for (String chinese : currentQuiz) {
                System.out.println("请输入这个中文短语的英文翻译: " + chinese);
                String userAnswer = scanner.nextLine().trim();
                if (!userAnswer.equalsIgnoreCase(phrases.get(chinese))) {
                    System.out.println("错误! 正确答案是: " + phrases.get(chinese));
                    if (!mistakes.contains(chinese)) {
                        mistakes.add(chinese);
                    }
                } else {
                    System.out.println("正确!");
                    mistakes.remove(chinese);
                    phrases.remove(chinese);
                }
            }
        }
        System.out.println("恭喜你完成了所有的短语练习!");
    }

    private static List<String> selectPhrases(int count) {
        List<String> keys = new ArrayList<>(mistakes.isEmpty() ? phrases.keySet() : mistakes);
        Collections.shuffle(keys);
        return keys.subList(0, Math.min(count, keys.size()));
    }
}
