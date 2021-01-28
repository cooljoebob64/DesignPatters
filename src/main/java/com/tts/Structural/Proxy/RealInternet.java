package com.tts.Structural.Proxy;

// From: https://www.geeksforgeeks.org/proxy-design-pattern/

public class RealInternet implements Internet
{
    @Override
    public void connectTo(String serverhost)
    {
        System.out.println("Connecting to "+ serverhost);
    }
}
