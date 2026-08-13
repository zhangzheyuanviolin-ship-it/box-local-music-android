            package p000;

            import java.util.HashMap;
            import java.util.Iterator;
            
            public final class ii1llo1liOl0 {
                public static final ii10o1 I0000oI00;
                public static final ii1IlO0lI0 I0001Ioi1lo;
                public HashMap I00000oIO;
                public HashMap I00000oOI;
                public ii10o1 I0000Il00O;
                public ii1IlO0lI0 I0000O;

                static {
/* 3 */             int i = 0;
/* 7 */             I0000oI00 = new ii10o1(i);
/* 14 */            I0001Ioi1lo = new ii1IlO0lI0(i);
                }

                public void I00000oIO(iIIoI1 iiioi1, Object obj, iOoO1O iooo1o) {
/* 7 */             ii10o1 ii10o1Var = (ii10o1) this.I00000oIO.get(iiioi1);
/* 9 */             if (ii10o1Var != null) {
/* 11 */                ii10o1Var.I00000oIO(iiioi1, obj, iooo1o);
                    } else {
/* 17 */                this.I0000Il00O.I00000oIO(iiioi1, obj, iooo1o);
                    }
                }

                public void I00000oOI(iIIoI1 iiioi1, Iterator it, iOoO1O iooo1o) {
/* 1 */             ii1IlO0lI0 ii1ilo0li0 = this.I0000O;
/* 9 */             ii1IlO0lI0 ii1ilo0li02 = (ii1IlO0lI0) this.I00000oOI.get(iiioi1);
/* 11 */            if (ii1ilo0li02 != null) {
/* 13 */                ii1ilo0li02.I00000oIO(iiioi1, it, iooo1o);
                    } else if (ii1ilo0li0 != null && !this.I00000oIO.containsKey(iiioi1)) {
/* 28 */                ii1ilo0li0.I00000oIO(iiioi1, it, iooo1o);
                    } else {
/* 36 */                while (it.hasNext()) {
/* 42 */                    I00000oIO(iiioi1, it.next(), iooo1o);
                        }
                    }
                }
            }
