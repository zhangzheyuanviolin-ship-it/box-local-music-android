            package p000;
            
            public final class iooO1IiiOoOo {
                public static iooIiiOli I00000oIO(Object obj) {
/* 1 */             ilOl10 ilol10 = (ilOl10) obj;
/* 3 */             iooIiiOli iooiiioli = ilol10.zzc;
/* 7 */             if (iooiiioli != iooIiiOli.I0001Ioi1lo) {
/* 29 */                return iooiiioli;
                    }
/* 9 */             iooIiiOli iooiiioliI00000oOI = iooIiiOli.I00000oOI();
/* 13 */            ilol10.zzc = iooiiioliI00000oOI;
/* 29 */            return iooiiioliI00000oOI;
                }

                public static boolean I00000oOI(Object obj, IOOOi1 iOOOi1) throws ill0ll01OOOO {
/* 3 */             IOOOI0 ioooi0 = (IOOOI0) iOOOi1.I0000oI00;
/* 5 */             int i = iOOOi1.I00000oOI;
/* 7 */             int i2 = i >>> 3;
/* 9 */             int i3 = i & 7;
/* 14 */            if (i3 == 0) {
/* 137 */               iOOOi1.I01I1Oo0oll(0);
/* 152 */               ((iooIiiOli) obj).I0000Il00O(i2 << 3, Long.valueOf(ioooi0.I00i01iIIliI()));
/* 12 */                return true;
                    }
/* 16 */            if (i3 == 1) {
/* 117 */               iOOOi1.I01I1Oo0oll(1);
/* 133 */               ((iooIiiOli) obj).I0000Il00O((i2 << 3) | 1, Long.valueOf(ioooi0.I00OloOo()));
/* 12 */                return true;
                    }
/* 19 */            if (i3 == 2) {
/* 113 */               ((iooIiiOli) obj).I0000Il00O((i2 << 3) | 2, iOOOi1.I01O1I1());
/* 12 */                return true;
                    }
/* 21 */            if (i3 != 3) {
/* 24 */                if (i3 == 4) {
/* 11 */                    return false;
                        }
/* 27 */                if (i3 != 5) {
/* 53 */                    throw ill0ll01OOOO.I00000oIO();
                        }
/* 29 */                iOOOi1.I01I1Oo0oll(5);
/* 43 */                iooIiiOli iooiiioli = (iooIiiOli) obj;
/* 45 */                iooiiioli.I0000Il00O((i2 << 3) | 5, Integer.valueOf(ioooi0.I00OOll1()));
/* 12 */                return true;
                    }
/* 55 */            iooIiiOli iooiiioliI00000oOI = iooIiiOli.I00000oOI();
/* 59 */            int i4 = i2 << 3;
/* 68 */            while (iOOOi1.I01Iol() != Integer.MAX_VALUE && I00000oOI(iooiiioliI00000oOI, iOOOi1)) {
                    }
/* 80 */            if ((i4 | 4) != iOOOi1.I00000oOI) {
/* 103 */               throw new ill0ll01OOOO("Protocol message end-group tag did not match expected tag.");
                    }
/* 84 */            if (iooiiioliI00000oOI.I0000oI00) {
/* 86 */                iooiiioliI00000oOI.I0000oI00 = false;
                    }
/* 92 */            ((iooIiiOli) obj).I0000Il00O(i4 | 3, iooiiioliI00000oOI);
/* 12 */            return true;
                }
            }
