            package p000;
            
            public final class I1iiOilioi implements OIOi0lOI {
                public static final I1iiOilioi I00000oIO = new I1iiOilioi();
                public static final IlIO00o1 I00000oOI = IlIO00o1.I0000Il00O("eventTimeMs");
                public static final IlIO00o1 I0000Il00O = IlIO00o1.I0000Il00O("eventCode");
                public static final IlIO00o1 I0000O = IlIO00o1.I0000Il00O("eventUptimeMs");
                public static final IlIO00o1 I0000oI00 = IlIO00o1.I0000Il00O("sourceExtension");
                public static final IlIO00o1 I0001Ioi1lo = IlIO00o1.I0000Il00O("sourceExtensionJsonProto3");
                public static final IlIO00o1 I000II = IlIO00o1.I0000Il00O("timezoneOffsetSeconds");
                public static final IlIO00o1 I000O01llI0 = IlIO00o1.I0000Il00O("networkConnectionInfo");

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             O1I0ll0i o1I0ll0i = (O1I0ll0i) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 12 */            oIOi0o.add(I00000oOI, ((I1l10O) o1I0ll0i).I00000oIO);
/* 15 */            I1l10O i1l10O = (I1l10O) o1I0ll0i;
/* 21 */            oIOi0o.add(I0000Il00O, i1l10O.I00000oOI);
/* 28 */            oIOi0o.add(I0000O, i1l10O.I0000Il00O);
/* 35 */            oIOi0o.add(I0000oI00, i1l10O.I0000O);
/* 42 */            oIOi0o.add(I0001Ioi1lo, i1l10O.I0000oI00);
/* 49 */            oIOi0o.add(I000II, i1l10O.I0001Ioi1lo);
/* 56 */            oIOi0o.add(I000O01llI0, i1l10O.I000II);
                }
            }
