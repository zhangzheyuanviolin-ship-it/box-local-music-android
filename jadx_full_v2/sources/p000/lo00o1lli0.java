            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class lo00o1lli0 {
                public static final lo00o1lli0 I0000Il00O;
                public boolean I00000oIO;
                public lIil0l010OO I00000oOI;

                static {
/* 7 */             lIil0l010OO liil0l010ooI001iOo1i0O = lIOiOOl.I001iOo1i0O(0, new Object[4]);
/* 11 */            lo00o1lli0 lo00o1lli0Var = new lo00o1lli0();
/* 14 */            lo00o1lli0Var.I00000oIO = false;
/* 16 */            lo00o1lli0Var.I00000oOI = liil0l010ooI001iOo1i0O;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            I0000Il00O = lo00o1lli0Var;
/* 23 */            Object[] objArrCopyOf = new Object[4];
/* 27 */            li0Oo1Oi11 li0oo1oi11 = new li0Oo1Oi11();
/* 31 */            int i = 0 + 1;
/* 33 */            int length = objArrCopyOf.length;
/* 34 */            if (length < i) {
/* 39 */                int i2 = length + (length >> 1) + 1;
/* 41 */                if (i2 < i) {
/* 43 */                    int iHighestOneBit = Integer.highestOneBit(0);
/* 47 */                    i2 = iHighestOneBit + iHighestOneBit;
                        }
/* 49 */                if (i2 < 0) {
/* 51 */                    i2 = Integer.MAX_VALUE;
                        }
/* 54 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                    }
/* 61 */            objArrCopyOf[0] = li0oo1oi11;
/* 63 */            lIOiOOl.I001iOo1i0O(0 + 1, objArrCopyOf);
/* 68 */            lIOiOOl.I001iOo1i0O(0, new Object[4]);
                }
            }
