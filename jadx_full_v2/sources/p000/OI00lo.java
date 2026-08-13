            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentMap;
            
            public abstract class OI00lo {
                public static final iolOOiI I00000oIO = new iolOOiI(13);

                public static void I00000oIO(IOO000ilo iOO000ilo) throws GeneralSecurityException {
                    IO0o1O0li0 iO0o1O0li0;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             OI00il1O oI00il1O = OI00il1O.I00000oOI;
/* 16 */            Iterator it = ((ConcurrentMap) iOO000ilo.I00iiI).values().iterator();
/* 24 */            while (it.hasNext()) {
/* 40 */                for (OOIiiiO oOIiiiO : (List) it.next()) {
/* 50 */                    int iOrdinal = oOIiiiO.I0000O.ordinal();
/* 55 */                    if (iOrdinal == 1) {
/* 75 */                        iO0o1O0li0 = IO0o1O0li0.I00ilO0;
                            } else if (iOrdinal == 2) {
/* 72 */                        iO0o1O0li0 = IO0o1O0li0.I00io1l;
                            } else {
/* 61 */                        if (iOrdinal != 3) {
/* 68 */                            I000II.I001IO000("Unknown key status");
/* 71 */                            return;
                                }
/* 63 */                        iO0o1O0li0 = IO0o1O0li0.I00ioIO;
                            }
/* 77 */                    int i = oOIiiiO.I0001Ioi1lo;
/* 79 */                    String strSubstring = oOIiiiO.I000II;
/* 87 */                    if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
/* 92 */                        strSubstring = strSubstring.substring(34);
                            }
/* 98 */                    String strName = oOIiiiO.I0000oI00.name();
/* 104 */                   OI00lioii010 oI00lioii010 = new OI00lioii010();
/* 107 */                   oI00lioii010.I00000oIO = iO0o1O0li0;
/* 109 */                   oI00lioii010.I00000oOI = i;
/* 111 */                   oI00lioii010.I0000Il00O = strSubstring;
/* 113 */                   oI00lioii010.I0000O = strName;
/* 115 */                   VarHandle.storeStoreFence();
/* 118 */                   arrayList.add(oI00lioii010);
                        }
                    }
/* 124 */           OOIiiiO oOIiiiO2 = (OOIiiiO) iOO000ilo.I00iiO;
/* 135 */           Integer numValueOf = oOIiiiO2 != null ? Integer.valueOf(oOIiiiO2.I0001Ioi1lo) : null;
/* 136 */           if (numValueOf != null) {
                        try {
/* 138 */                   int iIntValue = numValueOf.intValue();
/* 142 */                   Iterator it2 = arrayList.iterator();
/* 150 */                   while (it2.hasNext()) {
/* 160 */                       if (((OI00lioii010) it2.next()).I00000oOI == iIntValue) {
                                }
                            }
/* 170 */                   throw new GeneralSecurityException("primary key ID is not present in entries");
                        } catch (GeneralSecurityException e) {
/* 177 */                   OoOil11Ol1o.I000oI1ioi(e);
/* 186 */                   return;
                        }
                    }
/* 173 */           Collections.unmodifiableList(arrayList);
                }
            }
