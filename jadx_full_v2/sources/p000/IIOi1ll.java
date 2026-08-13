            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class IIOi1ll extends IIOi0l1 {
                public int I000II;
                public ArrayList I000O01llI0;

                @Override
                public final int I0000Il00O(int i) {
                    int i2;
/* 3 */             if (this.I00000oIO) {
/* 7 */                 Iterator it = this.I000O01llI0.iterator();
/* 15 */                while (it.hasNext()) {
/* 21 */                    IIOiiiOi0l iIOiiiOi0l = (IIOiiiOi0l) it.next();
/* 23 */                    int i3 = iIOiiiOi0l.I0000Il00O;
/* 25 */                    if (i >= i3 && i <= (i2 = iIOiiiOi0l.I0000O)) {
/* 31 */                        if (i < i3 || i > i2) {
/* 40 */                            return 0;
                                }
/* 38 */                        return (i - i3) + iIOiiiOi0l.I00000oIO;
                            }
                        }
                    }
/* 42 */            return super.I0000Il00O(i);
                }

                public final String toString() {
/* 9 */             StringBuilder sb = new StringBuilder(IIOi1ll.class.getName());
/* 14 */            sb.append("[format=");
/* 21 */            return IIl001iO0Io.I000lI(this.I000II, "]", sb);
                }
            }
