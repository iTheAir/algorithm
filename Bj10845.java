package data_structure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test {

    private static class Queue {
        int[] queue;
        int start;
        int end;

        public Queue(int n) {
            queue = new int[n];
            start = end = 0;
        }

        private void push(int x) {
            queue[end] = x;
            end++;
        }

        private int pop() {
            if (start == end) {
                return -1;
            }
            int ans = queue[start];
            start++;
            return ans;
        }

        private int size() {
            return end - start;
        }

        private int empty() {
            int ans;
            if (end  == start) ans = 1;
            else ans = 0;
            return ans;
        }

        private int front() {
            int ans;
            if (start == end) {
                ans = -1;
            } else {
                ans = queue[start];
            }
            return ans;
        }

        private int back() {
            int ans;
            if (start == end) {
                ans = -1;
            } else {
                ans = queue[end - 1];
            }
            return ans;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Queue q = new Queue(n);
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String instruction = st.nextToken();
            if (instruction.equals("push")) {
                int inputNumber = Integer.parseInt(st.nextToken());
                q.push(inputNumber);
            } else if (instruction.equals("pop")) {
                sb.append(q.pop()).append('\n');
            } else if (instruction.equals("size")) {
                sb.append(q.size()).append('\n');
            } else if (instruction.equals("empty")) {
                sb.append(q.empty()).append('\n');
            } else if (instruction.equals("front")) {
                sb.append(q.front()).append('\n');
            } else if (instruction.equals("back")) {
                sb.append(q.back()).append('\n');
            }
        }

        System.out.println(sb);
    }
}
