            package p000;
            
            public final class I1iii0 implements OIOi0lOI {
                public static final I1iii0 I00000oIO = new I1iii0();
                public static final IlIO00o1 I00000oOI = IlIO00o1.I0000Il00O("requestTimeMs");
                public static final IlIO00o1 I0000Il00O = IlIO00o1.I0000Il00O("requestUptimeMs");
                public static final IlIO00o1 I0000O = IlIO00o1.I0000Il00O("clientInfo");
                public static final IlIO00o1 I0000oI00 = IlIO00o1.I0000Il00O("logSource");
                public static final IlIO00o1 I0001Ioi1lo = IlIO00o1.I0000Il00O("logSourceName");
                public static final IlIO00o1 I000II = IlIO00o1.I0000Il00O("logEvent");
                public static final IlIO00o1 I000O01llI0 = IlIO00o1.I0000Il00O("qosTier");

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             O1I1101oiOi o1I1101oiOi = (O1I1101oiOi) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 12 */            oIOi0o.add(I00000oOI, ((I1l11OoIO) o1I1101oiOi).I00000oIO);
/* 15 */            I1l11OoIO i1l11OoIO = (I1l11OoIO) o1I1101oiOi;
/* 21 */            oIOi0o.add(I0000Il00O, i1l11OoIO.I00000oOI);
/* 28 */            oIOi0o.add(I0000O, i1l11OoIO.I0000Il00O);
/* 35 */            oIOi0o.add(I0000oI00, i1l11OoIO.I0000O);
/* 42 */            oIOi0o.add(I0001Ioi1lo, i1l11OoIO.I0000oI00);
/* 49 */            oIOi0o.add(I000II, i1l11OoIO.I0001Ioi1lo);
/* 56 */            oIOi0o.add(I000O01llI0, OOiiiloIIil0.I00iOIl);
                }
            }
