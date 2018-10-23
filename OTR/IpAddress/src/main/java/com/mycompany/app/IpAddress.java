package com.mycompany.app;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class IpAddress {
    private static final long N0 = 256 * 256 * 256;
    private static final long N1 = 256 * 256;
    private static final long N2 = 256;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первый IP-адрес: ");
        String s1 = in.nextLine();
        System.out.print("Введите второй IP-адрес: ");
        String s2 = in.nextLine();

        ArrayList<String> list = ipList(s1, s2);
        for (String ip : list) {
            System.out.println(ip);
        }
    }

    public static ArrayList<String> ipList(String s11, String s22) throws UnknownHostException {
        ArrayList<String> list = new ArrayList<>();
        InetAddress ip1 = InetAddress.getByName(s11);
        InetAddress ip2 = InetAddress.getByName(s22);
        long l1 = IpAddress.ipToLong(ip1);
        long l2 = IpAddress.ipToLong(ip2);
        long res = Math.abs(l1 - l2);

        if (l2 > l1) {
            for (long i = 1; i < res; i++) {
                list.add(IpAddress.longToIp(l1 + i));
            }
        } else {
            for (long i = 1; i < res; i++) {
                list.add(IpAddress.longToIp(l2 + i));
            }
        }
        return list;
    }

    public static long ipToLong(InetAddress ia) {
        byte iab[] = ia.getAddress();

        int i0 = iab[0];
        if (i0 < 0) {
            i0 += 256;
        }
        int i1 = iab[1];
        if (i1 < 0) {
            i1 += 256;
        }
        int i2 = iab[2];
        if (i2 < 0) {
            i2 += 256;
        }
        int i3 = iab[3];
        if (i3 < 0) {
            i3 += 256;
        }
        return (N0 * i0) + (N1 * i1) + (N2 * i2) + i3;
    }

    public static String longToIp(long ip) {

        long a = ip;
        long r0 = a / N0;
        a -= (r0 * N0);
        long r1 = a / N1;
        a -= (r1 * N1);
        long r2 = a / N2;
        a -= (r2 * N2);
        long r3 = a;
        String ips = r0 + "." + r1 + "." + r2 + "." + r3;
        return ips;
    }
}
