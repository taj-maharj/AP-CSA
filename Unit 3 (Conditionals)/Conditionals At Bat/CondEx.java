public class CondEx{
    //Arjun Mahajan

    public boolean isLeapYear(int year){
        return (year%4==0 && (year%100!=0 || year%400 == 0));
    }

    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2){
        if(year1<year2){
            return true;
        }
        else if(year1>year2){
            return false;
        }
        else{
            if(month1<month2){
                return true;
            }
            else if(month1>month2){
                return false;
            }
            else{
                if(day1<day2){
                    return true;
                }
            }
        }
        return false;
    }

    public int findBestFit(int space, int size1, int size2){
        /*space is the amount of available space on a memory card.  size1 and size2 are the sizes of two files.  
        Write a method that takes these integer numbers as parameters and figures out the largest combinations of files that fits on the card.  
        The method should return 3 if both files fit together, the file number (1 or 2) corresponding to the largest file that fits by itself (1 if they are the same size) 
        or 0 if neither file fits on the card.  */
        if(size1+size2>=space){
            return 3;
        }
        else if(size1>space && size2>space){
            return 0;
        }
        else if(size1>=size2){
            return 1;
        }
        return 2;
    }

    public boolean makeBenches(int small, int big, int goal){
        /*We want to make a row of benches that is goal feet long. We have a number of small benches (1 foot each) and big benches (5 feet each). 
        Return true if it is possible to make the goal by choosing from the given benches.  You do not have to use all of the benches, just return true if you have at least enough. */
        if(goal%5!=0){
            return (small>=goal);
        }
    }

    public static void main(String[]args){
        CondEx ce = new CondEx();
        // leap year
        System.out.println("2000 " + ce.isLeapYear(2000));
        System.out.println("2004 " + ce.isLeapYear(2004));
        System.out.println("2003 " + ce.isLeapYear(2003));
        System.out.println("2100 " + ce.isLeapYear(2100));

        // is sooner
        System.out.println("isSooner");
        System.out.println("1/2/2010 is sooner than 1/2/2011 " + ce.isSooner(1,2,2010, 1,2,2011));
        System.out.println("2/1/2011 is sooner than 2/2/2010 " + ce.isSooner(2,1,2011, 2,2,2010));
        System.out.println("1/2/2011 is sooner than 2/2/2010 " + ce.isSooner(1,2,2011, 2,2,2010));
        System.out.println("1/5/2010 is sooner than 3/2/2010 " + ce.isSooner(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is sooner than 1/2/2010 " + ce.isSooner(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is sooner than 1/2/2010 " + ce.isSooner(1,3,2010, 1,2,2010));
        System.out.println("5/2/2010 is sooner than 1/3/2011 " + ce.isSooner(5,2,2010, 1,3,2011));
        System.out.println("1/2/2010 is sooner than 1/2/2010 " + ce.isSooner(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is sooner than 1/2/2010 " + ce.isSooner(4,8,2010, 1,2,2010));


        // Best Fit
        System.out.println("Best Fit");
        System.out.println("Find Best fit 6 2 3 is " + ce.findBestFit(6,2,3));
        System.out.println("Find Best fit 6 4 3 is " + ce.findBestFit(6,4,3));
        System.out.println("Find Best fit 6 3 4 is " + ce.findBestFit(6,3,4));
        System.out.println("Find Best fit 1 2 3 is " + ce.findBestFit(1,2,3));
        System.out.println("Find Best fit 4 6 3 is " + ce.findBestFit(4,6,3));
        System.out.println("Find Best fit 4 3 6 is " + ce.findBestFit(4,3,6));
        System.out.println("Find Best fit 4 3 3 is " + ce.findBestFit(4,3,3));
        System.out.println("Find Best fit 4 4 3 is " + ce.findBestFit(4,4,3));


        // Make Bench
        System.out.println("Make benches 3 1 8 is " + ce.makeBenches(3,1,8));
        System.out.println("Make benches 3 1 9 is " + ce.makeBenches(3,1,9));
        System.out.println("Make benches 11 1 15 is " + ce.makeBenches(11,1,15));
        System.out.println("Make benches 4 2 15 is " + ce.makeBenches(4,2,15));
        System.out.println("Make benches 20 0 20 is " + ce.makeBenches(20,0,20));
        System.out.println("Make benches 3 4 20 is " + ce.makeBenches(3,4,20));
        System.out.println("Make benches 0 6 30 is " + ce.makeBenches(0,6,30));
        System.out.println("Make benches 0 5 30 is " + ce.makeBenches(0,5,30));
        System.out.println("Make benches 2 6 23 is " + ce.makeBenches(2,6,23));
        System.out.println("Make benches 3 2 23 is " + ce.makeBenches(3,2,23));
    }
}