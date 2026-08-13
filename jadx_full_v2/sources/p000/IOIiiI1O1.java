            package p000;

            import java.util.ArrayList;
            
            public final class IOIiiI1O1 {
                public static final IOIiiI1O1 I00000oOI = new IOIiiI1O1(0);
                public static final IOIiiI1O1 I0000Il00O = new IOIiiI1O1(1);
                public static final IOIiiI1O1 I0000O = new IOIiiI1O1(2);
                public final int I00000oIO;

                public IOIiiI1O1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static String I00000oIO(IOIiO1lIl0l iOIiO1lIl0l) {
/* 5 */             String strI00000oIO = lIoO00iOo.I00000oIO(iOIiO1lIl0l.getName());
/* 11 */            if (!(iOIiO1lIl0l instanceof OoOOiO)) {
/* 14 */                Ii1Ool1 ii1Ool1I000lI = iOIiO1lIl0l.I000lI();
/* 50 */                String strI00000oIO2 = ii1Ool1I000lI instanceof OI000ilOol ? I00000oIO((IOIiO1lIl0l) ii1Ool1I000lI) : ii1Ool1I000lI instanceof OIo0il ? lIoO00iOo.I0000Il00O(Ill0OI0lo.I0001Ioi1lo(((OIo0l0) ((OIo0il) ii1Ool1I000lI)).I00ilI0I1.I00000oIO)) : null;
/* 51 */                if (strI00000oIO2 != null && !strI00000oIO2.equals("")) {
/* 63 */                    return IIlIOloOOO.I000oI1ioi('.', strI00000oIO2, strI00000oIO);
                        }
                    }
/* 186 */           return strI00000oIO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [IOIiO1lIl0l, Ii1Ool1] */
                /* JADX WARN: Type inference failed for: r2v2, types: [Ii1Ool1] */
                /* JADX WARN: Type inference failed for: r2v3, types: [Ii1Ool1] */
                public final String I00000oOI(IOIiO1lIl0l iOIiO1lIl0l, IiOOllOI0io iiOOllOI0io) {
                    switch (this.I00000oIO) {
                        case 0:
                            return iOIiO1lIl0l instanceof OoOOiO ? iiOOllOI0io.I00IoIO0lI(((OoOOiO) iOIiO1lIl0l).getName(), false) : iiOOllOI0io.I000o00OoI0I(lIoO00iOo.I0000Il00O(Ill0OI0lo.I0001Ioi1lo(IiOiIO0i1Oil.I0001Ioi1lo(iOIiO1lIl0l))));
                        case 1:
/* 14 */                    if (iOIiO1lIl0l instanceof OoOOiO) {
/* 22 */                        return iiOOllOI0io.I00IoIO0lI(((OoOOiO) iOIiO1lIl0l).getName(), false);
                            }
/* 29 */                    ArrayList arrayList = new ArrayList();
/* 45 */                    do {
/* 36 */                        arrayList.add(iOIiO1lIl0l.getName());
/* 39 */                        iOIiO1lIl0l = iOIiO1lIl0l.I000lI();
/* 45 */                    } while (iOIiO1lIl0l instanceof OI000ilOol);
/* 52 */                    return lIoO00iOo.I0000Il00O(new Oi11oOI(arrayList));
                        default:
/* 7 */                     return I00000oIO(iOIiO1lIl0l);
                    }
                }
            }
