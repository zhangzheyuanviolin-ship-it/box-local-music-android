            package p000;

            import android.view.WindowInsets;
            
            public abstract class i00il0oII {
                public static int I00000oIO(int i) {
                    int iStatusBars;
/* 1 */             int i2 = 0;
/* 6 */             for (int i3 = 1; i3 <= 512; i3 <<= 1) {
/* 10 */                if ((i & i3) != 0) {
/* 12 */                    if (i3 == 1) {
/* 84 */                        iStatusBars = WindowInsets.Type.statusBars();
                            } else if (i3 == 2) {
/* 79 */                        iStatusBars = WindowInsets.Type.navigationBars();
                            } else if (i3 == 4) {
/* 74 */                        iStatusBars = WindowInsets.Type.captionBar();
                            } else if (i3 == 8) {
/* 69 */                        iStatusBars = WindowInsets.Type.ime();
                            } else if (i3 == 16) {
/* 64 */                        iStatusBars = WindowInsets.Type.systemGestures();
                            } else if (i3 == 32) {
/* 59 */                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                            } else if (i3 == 64) {
/* 54 */                        iStatusBars = WindowInsets.Type.tappableElement();
                            } else if (i3 == 128) {
/* 49 */                        iStatusBars = WindowInsets.Type.displayCutout();
                            } else if (i3 == 512) {
/* 43 */                        iStatusBars = WindowInsets.Type.systemOverlays();
                            }
/* 47 */                    i2 |= iStatusBars;
                        }
                    }
/* 168 */           return i2;
                }
            }
