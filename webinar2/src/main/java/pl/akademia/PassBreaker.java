package pl.akademia;

import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigInteger;

public class PassBreaker {

    void crackThePassword(String password, boolean log, int slowMotion) {
        String computePass = null;
        boolean trigger = true;
        BigInteger counter = BigInteger.ZERO;
        long start = System.nanoTime();
        while(trigger) {
            computePass = RandomStringUtils.randomAlphabetic(password.length());
            if (computePass.equals(password)){
                trigger = false;
            }
            counter = counter.add(BigInteger.ONE);
            if(log) {
               // System.out.println("Wygenerowane hasło " + computePass + "ilośc prób: " + counter);
                System.out.printf("Wygenerowane hasło %s ilośc prób: %s \n", computePass, counter);
            }
            if (slowMotion > 0) {
                try {
                    Thread.sleep(slowMotion);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long stop = System.nanoTime();
        double elapseTimeInSeconds =  (double) (stop - start) / 1_000_000_000;
        System.out.printf("Hasło zostało złamane za %s razem. W czasie %s. Hasło to %s . \n", counter,elapseTimeInSeconds,computePass);
    }
}
