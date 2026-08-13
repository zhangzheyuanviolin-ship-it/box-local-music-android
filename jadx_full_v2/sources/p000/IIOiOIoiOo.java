            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IIOiOIoiOo extends IIOi0l1 {
                public int I000II;
                public ArrayList I000O01llI0;

                @Override
                public final int I0000Il00O(int i) {
                    int i2;
/* 3 */             Iterator it = this.I000O01llI0.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                IIOiiiOi0l iIOiiiOi0l = (IIOiiiOi0l) it.next();
/* 19 */                int i3 = iIOiiiOi0l.I0000Il00O;
/* 21 */                if (i >= i3 && i <= (i2 = iIOiiiOi0l.I0000O)) {
/* 27 */                    if (i < i3 || i > i2) {
/* 36 */                        return 0;
                            }
/* 34 */                    return (i - i3) + iIOiiiOi0l.I00000oIO;
                        }
                    }
/* 38 */            return super.I0000Il00O(i);
                }

                public final String toString() {
/* 9 */             StringBuilder sb = new StringBuilder(IIOiOIoiOo.class.getName());
/* 14 */            sb.append("[format=");
/* 21 */            return IIl001iO0Io.I000lI(this.I000II, "]", sb);
                }
            }
