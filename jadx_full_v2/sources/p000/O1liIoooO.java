            package p000;

            import android.util.SparseArray;
            
            public final class O1liIoooO {
                public final SparseArray I00000oIO;
                public OoOl1ol1l I00000oOI;

                public O1liIoooO(int i) {
/* 9 */             this.I00000oIO = new SparseArray(i);
                }

                public final void I00000oIO(OoOl1ol1l ooOl1ol1l, int i, int i2) {
/* 1 */             int iI00000oIO = ooOl1ol1l.I00000oIO(i);
/* 5 */             SparseArray sparseArray = this.I00000oIO;
/* 11 */            O1liIoooO o1liIoooO = (O1liIoooO) sparseArray.get(iI00000oIO);
/* 14 */            if (o1liIoooO == null) {
/* 18 */                o1liIoooO = new O1liIoooO(1);
/* 25 */                sparseArray.put(ooOl1ol1l.I00000oIO(i), o1liIoooO);
                    }
/* 28 */            if (i2 > i) {
/* 31 */                o1liIoooO.I00000oIO(ooOl1ol1l, i + 1, i2);
                    } else {
/* 35 */                o1liIoooO.I00000oOI = ooOl1ol1l;
                    }
                }
            }
