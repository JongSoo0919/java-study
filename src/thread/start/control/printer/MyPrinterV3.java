package thread.start.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static util.MyLogger.log;

public class MyPrinterV3 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread printerThread = new Thread(printer, "printer");
        printerThread.start();

        Scanner userInput = new Scanner(System.in);
        while(true) {
            log("프린터할 문서를 입력하세요. 종료 (q): ");
            String input = userInput.nextLine();
            if(input.equals("q")) {
                log("작업 중단 지시 thread.interrupt()");
                printerThread.interrupt();
                break;
            }
            printer.addJob(input);
        }
    }

    static class Printer implements Runnable {
        volatile boolean work = true;
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>();

        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    if (jobQueue.isEmpty()) {
                        Thread.yield();
                        continue;
                    }

                    String job = jobQueue.poll();
                    log("출력 시작" + job + ", 대기 문서 : " + jobQueue);
                    Thread.sleep(3000);
                    log("출력 완료");

                }
            } catch (InterruptedException e){
                log("interrupted : 프린터 종료");
            }

            log("프린터 완료");
        }

        public void addJob(String input) {
            jobQueue.add(input);
        }
    }
}
