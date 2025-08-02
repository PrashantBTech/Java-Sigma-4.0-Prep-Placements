// Greedy Approach
// JOb Sequencing Problem
// maximise the total profit if only one job can be scheduled at a time

import java.util.*;

public class hundredtwentyfive125 {
    static class Job {
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);
        // descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int Tprofit = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
               
                Tprofit += curr.profit;
                 time++;
            }
        }

        // print 
        System.out.println("Max jobs = "+ seq.size());
         System.out.println("Total profit = "+ Tprofit);

        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+ " ");
        }System.out.println();
    }
}
