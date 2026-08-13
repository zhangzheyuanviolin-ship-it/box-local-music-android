            package p000;

            import java.util.List;
            
            public abstract class OI110iiil0 {
                public static final void I00000oIO(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (i < 0 || i >= size) {
/* 11 */                I0000Il00O(i, size);
                    }
                }

                public static final void I00000oOI(int i, int i2, List list) {
/* 1 */             if (i > i2) {
/* 3 */                 I0001Ioi1lo(i, i2);
                    }
/* 6 */             if (i < 0) {
/* 8 */                 I0000O(i);
                    }
/* 15 */            if (i2 > list.size()) {
/* 21 */                I0000oI00(i2, list.size());
                    }
                }

                private static final void I0000Il00O(int i, int i2) {
/* 37 */            throw new IndexOutOfBoundsException(Oi010OO0.I0010o("Index ", i, " is out of bounds. The list has ", i2, " elements."));
                }

                private static final void I0000O(int i) {
/* 29 */            throw new IndexOutOfBoundsException(IIlIOloOOO.I00100l0("fromIndex (", i, ") is less than 0."));
                }

                private static final void I0000oI00(int i, int i2) {
/* 37 */            throw new IndexOutOfBoundsException(Oi010OO0.I0010o("toIndex (", i, ") is more than than the list size (", i2, ")"));
                }

                private static final void I0001Ioi1lo(int i, int i2) {
/* 37 */            throw new IllegalArgumentException(Oi010OO0.I0010o("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
                }
            }
