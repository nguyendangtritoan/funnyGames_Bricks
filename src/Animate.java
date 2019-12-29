public class Animate implements Runnable {
    BlockBreakerPanel bp;
    Animate(BlockBreakerPanel blockBreakerPanel) {
        bp = blockBreakerPanel;
    }
    @Override
    public void run() {
        while (true) {
            bp.update();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
