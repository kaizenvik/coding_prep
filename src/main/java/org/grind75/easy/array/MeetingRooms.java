package org.grind75.easy.array;

import java.util.Arrays;

public class MeetingRooms {

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        int[][] intervals2 = {{7, 10}, {2, 4}};
        System.out.println(new MeetingRooms().canAttendMeetings(intervals));
        System.out.println(new MeetingRooms().canAttendMeetings(intervals2));
    }

    public boolean canAttendMeetings1(int[][] intervals) {
        // Sort meetings by start time in ascending order
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Check for overlapping meetings
        for (int i = 1; i < intervals.length; i++) {
            // If previous meeting's end time is after current meeting's start time,
            // there is an overlap
            if (intervals[i - 1][1] > intervals[i][0]) {
                return false;
            }
        }

        // No overlaps found, all meetings can be attended
        return true;
    }

    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < intervals[i-1][1]){
                return false;
            }
        }
        return true;
    }

}
