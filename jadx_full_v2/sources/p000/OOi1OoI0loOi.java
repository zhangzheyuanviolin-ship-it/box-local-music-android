            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            
            public final class OOi1OoI0loOi implements Oili0i1IOo {
                public String I00000oIO;
                public IIOIlli0IO I00000oOI;
                public IIOI1Ii1I I0000Il00O;
                public O0O1ii I0000O;
                public OIl1lli I0000oI00;
                public Integer I0001Ioi1lo;

                public static OOi1OoI0loOi I00000oIO(String str, IIOI1Ii1I iIOI1Ii1I, O0O1ii o0O1ii, OIl1lli oIl1lli, Integer num) throws GeneralSecurityException {
/* 4 */             if (oIl1lli == OIl1lli.RAW) {
/* 6 */                 if (num != null) {
/* 11 */                    IioIoO10iOiI.I000oI1ioi("Keys with output prefix type raw should not have an id requirement.");
/* 3 */                     return null;
                        }
                    } else if (num == null) {
/* 44 */                IioIoO10iOiI.I000oI1ioi("Keys with output prefix type different from raw should have an id requirement.");
/* 3 */                 return null;
                    }
/* 19 */            OOi1OoI0loOi oOi1OoI0loOi = new OOi1OoI0loOi();
/* 22 */            oOi1OoI0loOi.I00000oIO = str;
/* 28 */            oOi1OoI0loOi.I00000oOI = Ooll0Ooo1.I00000oOI(str);
/* 30 */            oOi1OoI0loOi.I0000Il00O = iIOI1Ii1I;
/* 32 */            oOi1OoI0loOi.I0000O = o0O1ii;
/* 34 */            oOi1OoI0loOi.I0000oI00 = oIl1lli;
/* 36 */            oOi1OoI0loOi.I0001Ioi1lo = num;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            return oOi1OoI0loOi;
                }
            }
