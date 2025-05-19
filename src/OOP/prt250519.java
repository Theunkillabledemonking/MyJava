package src.OOP;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;

public class prt250519 {
    public static void main(String[] args) /*throws Exception*/ {

        // exception 객체를 찍엇을 뿐임 (던지기 전)
        try {
            Exception exception = new Exception();

            // throw 키워드를 이용하여 예외를 발생시킴
            throw exception;
            // 현재 상황에 맞는 객체를 생성하여 예외 발생
        } catch (Exception e) {
            // Checked 예외는 반드시 try catch, 호출하는 메인메서드에 던져줘야함.
        }

        int pos = 0;

        try {
            System.out.println("t - 1");

            if (pos == 0) { throw new Exception(); }
            if (pos == 1) { throw new CertificateEncodingException(); }
            if (pos == 2) { throw new IOException(); }

        } catch (CertificateException e) {
            System.out.println("CertificateException");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
    }
}
