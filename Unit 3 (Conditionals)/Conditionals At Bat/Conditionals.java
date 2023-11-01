public class Conditionals{
    public boolean chimpTrouble(boolean chimpA, boolean chimpB){
        if(chimpA==chimpB){
            return true;
        }
        return false;
    }

    public boolean negPos(int a, int b, boolean negative){
        if((negative)&&(a<0 && b<0)){
            return true;
        }
        else if(a!=b){
            return true;
        }
        return false;
    }

    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if(!isAsleep){
            if(isMorning){
                if(isMom){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public String setAlarm(int day, boolean vacation){
        if(vacation){
            if(day != 0 || day != 6){
                return "10:00";
                }
            else{
                return "off";
            }
        }

        if(day != 0 || day != 6){
            return "7:00";
        }
        else{
            return "10:00";
        }
    }

    public boolean onesDigitSame(int a, int b, int c){
        int a1 = a%10;
        int b1 = b%10;
        int c1 = c%10;

        return (a1==b1||a1==c1||b1==c1);
    }
    public int blackjack(int a, int b){
        if(a<=21 && b<=21){
            if(a>b){
                return a;
            }
            return b;
        }
        return 0;
    }
    public static void main(String[] args){
        Conditionals con = new Conditionals();
        System.out.println(con.chimpTrouble(false, false));
        System.out.println(con.negPos(1, 1, false));
        System.out.println(con.pickUpPhone(true, true, false));
        System.out.println(con.setAlarm(3, false));
        System.out.println(con.onesDigitSame(103, 33,3));
        System.out.println("The winning card is:" + con.blackjack(20, 18));

    }
}