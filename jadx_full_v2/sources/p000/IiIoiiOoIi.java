            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class IiIoiiOoIi {
                public ArrayList I00000oIO;
                public char I00000oOI;
                public int I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;
                public IiIoiiOoIi I0001Ioi1lo;
                public IiIoiiOoIi I000II;

                public final List I00000oIO(int i) {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 4 */             if (i >= 1 && i <= arrayList.size()) {
/* 13 */                return arrayList.subList(0, i);
                    }
/* 186 */           throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
                }

                public final List I00000oOI(int i) {
/* 1 */             ArrayList arrayList = this.I00000oIO;
/* 4 */             if (i >= 1 && i <= arrayList.size()) {
/* 21 */                return arrayList.subList(arrayList.size() - i, arrayList.size());
                    }
/* 186 */           throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
                }
            }
