            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class iIoOII {
                public static final I0oloIO0 I00000oIO = new I0oloIO0(5);

                public static final int I00000oIO(O0lilO o0lilO, boolean z) {
                    int iI000OOo1O;
                    int iI00000oIO;
/* 1 */             if (z) {
/* 3 */                 iI000OOo1O = o0lilO.I0000Il00O();
/* 7 */                 iI00000oIO = o0lilO.I0001Ioi1lo();
                    } else {
/* 13 */                iI000OOo1O = o0lilO.I000OOo1O();
/* 17 */                iI00000oIO = o0lilO.I00000oIO();
                    }
/* 11 */            return iI00000oIO + iI000OOo1O;
                }

                public static final List I00000oOI(int i, int i2, ArrayList arrayList, List list) {
/* 5 */             if (arrayList.isEmpty()) {
/* 7 */                 return Il01100l.I00iOIl;
                    }
/* 14 */            ArrayList arrayList2 = new ArrayList(list);
/* 17 */            int size = arrayList.size();
/* 22 */            for (int i3 = 0; i3 < size; i3++) {
/* 28 */                O0lilO o0lilO = (O0lilO) arrayList.get(i3);
/* 30 */                int index = o0lilO.getIndex();
/* 34 */                if (i <= index && index <= i2) {
/* 38 */                    arrayList2.add(o0lilO);
                        }
                    }
/* 46 */            IOOiOil.I000oI1ioi(arrayList2, I00000oIO);
/* 204 */           return arrayList2;
                }
            }
