            package p000;
            
            public interface O1I1OOiol {
                boolean I00000oIO();

                boolean I00000oOI();

                void I0000Il00O(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th);

                boolean I0000O();

                boolean I0000oI00();

                boolean I0001Ioi1lo(O1Ol1o1Io1o o1Ol1o1Io1o);

                boolean I000II();

                void I000O01llI0(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th);

                boolean I000OOo1O(O1Ol1o1Io1o o1Ol1o1Io1o);

                void I000OiO(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th);

                void I000iOII(String str, Throwable th);

                void I000l1(String str);

                boolean I000lI(O1Ol1o1Io1o o1Ol1o1Io1o);

                void I000o00OoI0I(String str);

                void I000oI1ioi(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th);

                default boolean I00100l0(int i) {
                    char c;
/* 2 */             if (i == 1) {
/* 29 */                c = '(';
                    } else if (i == 2) {
/* 26 */                c = 30;
                    } else if (i == 3) {
/* 23 */                c = 20;
                    } else if (i == 4) {
/* 20 */                c = '\n';
                    } else {
/* 14 */                if (i != 5) {
/* 19 */                    throw null;
                        }
/* 16 */                c = 0;
                    }
/* 31 */            if (c == 0) {
/* 110 */               return I000II();
                    }
/* 35 */            if (c == '\n') {
/* 105 */               return I00000oOI();
                    }
/* 39 */            if (c == 20) {
/* 100 */               return I0000oI00();
                    }
/* 43 */            if (c == 30) {
/* 95 */                return I00000oIO();
                    }
/* 47 */            if (c == '(') {
/* 49 */                return I0000O();
                    }
/* 90 */            IoOOl0iOl1io.I000o00OoI0I(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR", "Level [", "] not recognized.");
/* 93 */            return false;
                }

                boolean I00100o1O0lo(O1Ol1o1Io1o o1Ol1o1Io1o);

                void I0010I0i(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th);

                boolean I0010o(O1Ol1o1Io1o o1Ol1o1Io1o);
            }
