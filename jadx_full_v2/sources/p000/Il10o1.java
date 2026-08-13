            package p000;

            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.concurrent.LinkedBlockingQueue;
            
            public final class Il10o1 implements O1I1OOiol, Serializable {
                public OliOIoIO1iol I00iOIl;
                public LinkedBlockingQueue I00iiI;

                @Override
                public final boolean I00000oIO() {
/* 1 */             return true;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             return true;
                }

                @Override
                public final void I0000Il00O(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th) {
/* 7 */             I00111O(5, o1Ol1o1Io1o, str, null, th);
                }

                @Override
                public final boolean I0000O() {
/* 1 */             return true;
                }

                @Override
                public final boolean I0000oI00() {
/* 1 */             return true;
                }

                @Override
                public final boolean I0001Ioi1lo(O1Ol1o1Io1o o1Ol1o1Io1o) {
/* 1 */             return true;
                }

                @Override
                public final boolean I000II() {
/* 1 */             return true;
                }

                @Override
                public final void I000O01llI0(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th) {
/* 7 */             I00111O(4, o1Ol1o1Io1o, str, null, th);
                }

                @Override
                public final boolean I000OOo1O(O1Ol1o1Io1o o1Ol1o1Io1o) {
/* 1 */             return true;
                }

                @Override
                public final void I000OiO(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th) {
/* 7 */             I00111O(3, o1Ol1o1Io1o, str, null, th);
                }

                @Override
                public final void I000iOII(String str, Throwable th) {
/* 7 */             I00111O(4, null, str, null, th);
                }

                @Override
                public final void I000l1(String str) {
/* 7 */             I00111O(2, null, str, null, null);
                }

                @Override
                public final boolean I000lI(O1Ol1o1Io1o o1Ol1o1Io1o) {
/* 1 */             return true;
                }

                @Override
                public final void I000o00OoI0I(String str) {
/* 7 */             I00111O(5, null, str, null, null);
                }

                @Override
                public final void I000oI1ioi(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th) {
/* 7 */             I00111O(2, o1Ol1o1Io1o, str, null, th);
                }

                @Override
                public final boolean I00100o1O0lo(O1Ol1o1Io1o o1Ol1o1Io1o) {
/* 1 */             return true;
                }

                @Override
                public final void I0010I0i(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th) {
/* 7 */             I00111O(1, o1Ol1o1Io1o, str, null, th);
                }

                @Override
                public final boolean I0010o(O1Ol1o1Io1o o1Ol1o1Io1o) {
/* 1 */             return true;
                }

                public final void I00111O(int i, O1Ol1o1Io1o o1Ol1o1Io1o, String str, Object[] objArr, Throwable th) {
/* 3 */             OliOO0Oo1 oliOO0Oo1 = new OliOO0Oo1();
/* 6 */             System.currentTimeMillis();
/* 9 */             oliOO0Oo1.I00000oIO = i;
/* 13 */            oliOO0Oo1.I0000Il00O = this.I00iOIl;
/* 15 */            if (o1Ol1o1Io1o != null) {
/* 17 */                ArrayList arrayList = oliOO0Oo1.I00000oOI;
/* 19 */                if (arrayList == null) {
/* 24 */                    arrayList = new ArrayList(2);
/* 27 */                    oliOO0Oo1.I00000oOI = arrayList;
                        }
/* 29 */                arrayList.add(o1Ol1o1Io1o);
                    }
/* 36 */            Thread.currentThread().getName();
/* 39 */            oliOO0Oo1.I0000O = objArr;
/* 43 */            this.I00iiI.add(oliOO0Oo1);
                }
            }
