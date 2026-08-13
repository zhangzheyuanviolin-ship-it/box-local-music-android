            package p000;
            
            public abstract class ilI10oi {
                public static final long I00000oIO(long j, long j2) {
                    int iI0000oI00;
/* 1 */             int iI000II = Oo0lI00l.I000II(j);
/* 5 */             int iI0001Ioi1lo = Oo0lI00l.I0001Ioi1lo(j);
/* 38 */            if ((Oo0lI00l.I000II(j2) < Oo0lI00l.I0001Ioi1lo(j)) && (Oo0lI00l.I000II(j) < Oo0lI00l.I0001Ioi1lo(j2))) {
/* 67 */                if ((Oo0lI00l.I000II(j2) <= Oo0lI00l.I000II(j)) && (Oo0lI00l.I0001Ioi1lo(j) <= Oo0lI00l.I0001Ioi1lo(j2))) {
/* 69 */                    iI000II = Oo0lI00l.I000II(j2);
/* 73 */                    iI0001Ioi1lo = iI000II;
                        } else {
/* 101 */                   if ((Oo0lI00l.I000II(j) <= Oo0lI00l.I000II(j2)) && (Oo0lI00l.I0001Ioi1lo(j2) <= Oo0lI00l.I0001Ioi1lo(j))) {
/* 103 */                       iI0000oI00 = Oo0lI00l.I0000oI00(j2);
                            } else {
/* 109 */                       int iI000II2 = Oo0lI00l.I000II(j2);
/* 117 */                       if (iI000II >= Oo0lI00l.I0001Ioi1lo(j2) || iI000II2 > iI000II) {
/* 130 */                           iI0001Ioi1lo = Oo0lI00l.I000II(j2);
                                } else {
/* 121 */                           iI000II = Oo0lI00l.I000II(j2);
/* 125 */                           iI0000oI00 = Oo0lI00l.I0000oI00(j2);
                                }
                            }
/* 107 */                   iI0001Ioi1lo -= iI0000oI00;
                        }
                    } else if (iI0001Ioi1lo > Oo0lI00l.I000II(j2)) {
/* 145 */               iI000II -= Oo0lI00l.I0000oI00(j2);
/* 146 */               iI0000oI00 = Oo0lI00l.I0000oI00(j2);
/* 107 */               iI0001Ioi1lo -= iI0000oI00;
                    }
/* 151 */           return lOliOi0Oi.I00000oIO(iI000II, iI0001Ioi1lo);
                }
            }
