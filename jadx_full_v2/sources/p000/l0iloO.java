            package p000;

            import android.view.KeyEvent;
            
            public abstract class l0iloO {
                public static final long I00000oIO(KeyEvent keyEvent) {
/* 5 */             return l0lIloi.I00000oIO(keyEvent.getKeyCode());
                }

                public static final int I00000oOI(KeyEvent keyEvent) {
/* 1 */             int action = keyEvent.getAction();
/* 5 */             if (action != 0) {
                        return action != 1 ? 0 : 1;
                    }
/* 13 */            return 2;
                }
            }
