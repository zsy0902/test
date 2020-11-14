import java.util.Scanner;
    class Person {
        public void equip() {
            System.out.println("你带上基本探险物资");
        }

        public void defense() {
            System.out.println("支楞起高端探险设备");
        }
    }
    class Explorer extends Person {
        public void refuse() {
            System.out.println("这其中一定有什么阴谋，实力拒绝！！！");
        }

        public void adopt() {
            System.out.println("直接接受！天都知道我只是为了帮老奶奶。");
        }

        public void attack() {
            System.out.println("触发蓄谋已久的MAX反抗");
        }

        public void help() {
            System.out.println("请求支援！请求支援！");
        }
    }
    class Choice {
        public static final int refuse = 1;
        public static final int adopt = 2;
        public static final int attack = 3;
        public static final int help = 4;
    }
    public class 剧情向 {
        public static void main(String[] args) {
            System.out.println("---某天，你决定带着脑子去探险...---\n");
            Person per = new Explorer();
            per.equip();
            per.defense();
            System.out.println("在你刚迈进丛林路口时，出现了一位请求帮忙的老奶奶，还声称要把孙女许配给你\n");
            System.out.println("这时，你会选择：（1不帮/2帮）\n");
            int m, n;
            Scanner in=new Scanner(System.in);
            m= in.nextInt();
            Explorer exp = (Explorer) per;
            switch (m) {
                case 1: {
                    exp.refuse();
                    System.out.println("老奶奶步步紧逼...\n");
                    System.out.println("面对逼迫，你选择：（3反抗/4请求支援）\n");
                    n= in.nextInt();
                    if(n==3){
                        exp.attack();
                        System.out.println("宝藏get！");
                    }
                    else{
                        exp.help();
                        System.out.println("你逃出生天，而被支援队顺手捞走treasure");
                        }
                    break;
                }
                case 2: {
                    exp.adopt();
                    System.out.println("跟着老奶奶走进丛林，发现是个圈，，圈套...\n");
                    System.out.println("走在前面，你选择：（3反抗/4请求支援）");
                    n= in.nextInt();
                    if(n==3){
                        exp.attack();
                        System.out.println("虎口逃生？？并没有！!");
                    }
                    else{
                        System.out.println("孤立无助，沦为奴隶。。");
                    }
                    break;
                }
            }
        }
    }
