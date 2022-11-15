package org.example;

public interface RemoteController {
    void enable(boolean enable);
}

class TvRemoteController implements RemoteController {

    @Override
    public void enable(boolean enable) {
        System.out.println("TVRemoteController " + enable);
    }
}

class ACRemoteController implements RemoteController {

    @Override
    public void enable(boolean enable) {
        System.out.println("ACRemoteController " + enable);
    }
}

class PolimorphismExample {
    public static void main(String[] args) {
        RemoteController remoteController = new TvRemoteController();
        remoteController.enable(true);
        remoteController = new ACRemoteController();
        remoteController.enable(false);
    }
}
