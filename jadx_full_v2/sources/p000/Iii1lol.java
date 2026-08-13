            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class Iii1lol {
                public final String I00000oIO;
                public final long[] I00000oOI = new long[2];
                public final ArrayList I0000Il00O = new ArrayList(2);
                public final ArrayList I0000O = new ArrayList(2);
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;
                public I1ii1l10IO I000II;
                public int I000O01llI0;
                public final IiiI0l01O I000OOo1O;

                public Iii1lol(IiiI0l01O iiiI0l01O, String str) {
/* 4 */             this.I000OOo1O = iiiI0l01O;
/* 6 */             this.I00000oIO = str;
/* 29 */            StringBuilder sb = new StringBuilder(str);
/* 34 */            sb.append('.');
/* 37 */            int length = sb.length();
/* 42 */            for (int i = 0; i < 2; i++) {
/* 44 */                sb.append(i);
/* 61 */                this.I0000Il00O.add(this.I000OOo1O.I00iOIl.I0000O(sb.toString()));
/* 66 */                sb.append(".tmp");
/* 83 */                this.I0000O.add(this.I000OOo1O.I00iOIl.I0000O(sb.toString()));
/* 86 */                sb.setLength(length);
                    }
                }

                public final Iii1oi1l1II I00000oIO() {
/* 4 */             if (!this.I0000oI00 || this.I000II != null || this.I0001Ioi1lo) {
/* 3 */                 return null;
                    }
/* 16 */            ArrayList arrayList = this.I0000Il00O;
/* 18 */            int size = arrayList.size();
/* 22 */            int i = 0;
                    while (true) {
/* 23 */                IiiI0l01O iiiI0l01O = this.I000OOo1O;
/* 25 */                if (i >= size) {
                            this.I000O01llI0++;
/* 56 */                    Iii1oi1l1II iii1oi1l1II = new Iii1oi1l1II();
/* 59 */                    iii1oi1l1II.I00iiO = iiiI0l01O;
/* 61 */                    iii1oi1l1II.I00iOIl = this;
/* 63 */                    VarHandle.storeStoreFence();
/* 66 */                    return iii1oi1l1II;
                        }
/* 39 */                if (!iiiI0l01O.I00o0l1o1o0.I000l1((OO0IIO1Il) arrayList.get(i))) {
                            try {
/* 41 */                        iiiI0l01O.I00IOO(this);
                            } catch (IOException unused) {
                            }
/* 3 */                     return null;
                        }
/* 45 */                i++;
                    }
                }
            }
