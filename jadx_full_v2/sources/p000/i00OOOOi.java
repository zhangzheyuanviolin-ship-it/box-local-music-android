            package p000;

            import android.graphics.Rect;
            import java.util.List;
            
/* 16 */    public abstract class i00OOOOi {
                public final Rect[][] I00000oIO;
                public final Rect[][] I00000oOI;

                public i00OOOOi(i00iooo00li i00iooo00liVar) {
/* 8 */             this.I00000oIO = new Rect[10][];
/* 12 */            this.I00000oOI = new Rect[10][];
/* 14 */            I0000Il00O(i00iooo00liVar);
                }

                public abstract i00iooo00li I00000oOI();

                public void I0000Il00O(i00iooo00li i00iooo00liVar) {
/* 4 */             for (int i = 1; i <= 512; i <<= 1) {
/* 8 */                 List<Rect> listI0001Ioi1lo = i00iooo00liVar.I00000oIO.I0001Ioi1lo(i);
/* 12 */                int iI00000oIO = liIIiioO.I00000oIO(i);
/* 30 */                this.I00000oIO[iI00000oIO] = (Rect[]) listI0001Ioi1lo.toArray(new Rect[listI0001Ioi1lo.size()]);
/* 34 */                if (i != 8) {
/* 38 */                    List<Rect> listI000II = i00iooo00liVar.I00000oIO.I000II(i);
/* 56 */                    this.I00000oOI[iI00000oIO] = (Rect[]) listI000II.toArray(new Rect[listI000II.size()]);
                        }
                    }
                }

                public abstract void I0000O(Ioo0l0I ioo0l0I);

                public abstract void I0000oI00(Ioo0l0I ioo0l0I);

/* 17 */        public i00OOOOi() {
/* 18 */            this(new i00iooo00li(null));
                }

/* 19 */        public final void I00000oIO() {
                }
            }
