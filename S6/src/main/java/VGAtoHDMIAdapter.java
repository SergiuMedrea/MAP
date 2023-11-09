public class VGAtoHDMIAdapter implements VGAPort{
    private HDMIPort hdmiPort;

    public VGAtoHDMIAdapter(HDMIPort hdmiPort) {
        this.hdmiPort = hdmiPort;
    }

    @Override
    public void connectVGA() {
        hdmiPort.connectHDMI();
    }
}
