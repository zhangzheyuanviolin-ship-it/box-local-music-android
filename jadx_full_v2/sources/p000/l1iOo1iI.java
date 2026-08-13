            package p000;

            import android.os.Build;
            import android.window.BackEvent;
            import java.lang.invoke.VarHandle;
            
            public abstract class l1iOo1iI {
                public static final OII0l0 I00000oIO(BackEvent backEvent) {
/* 1 */             float touchX = backEvent.getTouchX();
/* 5 */             float touchY = backEvent.getTouchY();
/* 9 */             float progress = backEvent.getProgress();
/* 13 */            int swipeEdge = backEvent.getSwipeEdge();
/* 28 */            long frameTimeMillis = Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L;
/* 32 */            OII0l0 oII0l0 = new OII0l0();
/* 35 */            oII0l0.I00000oIO = swipeEdge;
/* 37 */            oII0l0.I00000oOI = progress;
/* 39 */            oII0l0.I0000Il00O = touchX;
/* 41 */            oII0l0.I0000O = touchY;
/* 43 */            oII0l0.I0000oI00 = frameTimeMillis;
/* 45 */            VarHandle.storeStoreFence();
/* 77 */            return oII0l0;
                }
            }
