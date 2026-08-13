            package p000;

            import java.util.List;
            
            public abstract class OIOi1o0101 {
                public static final Object[] I00000oIO = new Object[0];
                public static final OI0oiiIO0 I00000oOI = new OI0oiiIO0(0);

                public static final void I00000oIO(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (i < 0 || i >= size) {
/* 37 */                lO00l0o.I00000oOI("Index " + i + " is out of bounds. The list has " + size + " elements.");
/* 106 */               throw null;
                    }
                }

                public static final void I00000oOI(int i, int i2, List list) {
/* 1 */             int size = list.size();
/* 6 */             if (i > i2) {
/* 94 */                lO00l0o.I00000oIO("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
/* 98 */                throw null;
                    }
/* 8 */             if (i < 0) {
/* 63 */                lO00l0o.I00000oOI("fromIndex (" + i + ") is less than 0.");
/* 66 */                throw null;
                    }
/* 10 */            if (i2 <= size) {
/* 12 */                return;
                    }
/* 40 */            lO00l0o.I00000oOI("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
/* 43 */            throw null;
                }
            }
