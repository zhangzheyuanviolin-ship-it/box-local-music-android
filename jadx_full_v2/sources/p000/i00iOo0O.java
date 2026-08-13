            package p000;

            import android.view.WindowInsets;
            
            public abstract class i00iOo0O {
                public static int I00000oIO(int i) {
                    int iStatusBars;
/* 1 */             int i2 = 0;
/* 6 */             for (int i3 = 1; i3 <= 512; i3 <<= 1) {
/* 10 */                if ((i & i3) != 0) {
/* 12 */                    if (i3 == 1) {
/* 77 */                        iStatusBars = WindowInsets.Type.statusBars();
                            } else if (i3 == 2) {
/* 72 */                        iStatusBars = WindowInsets.Type.navigationBars();
                            } else if (i3 == 4) {
/* 67 */                        iStatusBars = WindowInsets.Type.captionBar();
                            } else if (i3 == 8) {
/* 62 */                        iStatusBars = WindowInsets.Type.ime();
                            } else if (i3 == 16) {
/* 57 */                        iStatusBars = WindowInsets.Type.systemGestures();
                            } else if (i3 == 32) {
/* 52 */                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                            } else if (i3 == 64) {
/* 47 */                        iStatusBars = WindowInsets.Type.tappableElement();
                            } else if (i3 == 128) {
/* 41 */                        iStatusBars = WindowInsets.Type.displayCutout();
                            }
/* 45 */                    i2 |= iStatusBars;
                        }
                    }
/* 168 */           return i2;
                }
            }
