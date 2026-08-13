            package p000;

            import java.util.ArrayList;
            
            public abstract class lI1IIO {
                public static final void I00000oIO(int i, int i2, OilOloI oilOloI) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 7 */             int i3 = (~i) & i2;
/* 12 */            for (int i4 = 0; i4 < 32; i4++) {
/* 16 */                if ((i3 & 1) != 0) {
/* 22 */                    arrayList.add(oilOloI.I0001Ioi1lo(i4));
                        }
/* 25 */                i3 >>>= 1;
                    }
/* 32 */            String strI00000oIO = oilOloI.I00000oIO();
/* 215 */           throw new O1looIlIoo0O(arrayList.size() == 1 ? IIl001iO0Io.I00100o1O0lo(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", strI00000oIO, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + strI00000oIO + "', but they were missing", null, arrayList, strI00000oIO);
                }
            }
