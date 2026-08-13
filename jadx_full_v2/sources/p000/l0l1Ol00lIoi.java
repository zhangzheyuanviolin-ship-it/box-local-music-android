            package p000;

            import android.view.KeyEvent;
            
            public abstract class l0l1Ol00lIoi {
                public static final int I00000oIO(KeyEvent keyEvent) {
/* 34 */            return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
                }
            }
