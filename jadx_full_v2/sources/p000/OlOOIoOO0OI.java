            package p000;

            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            
            public abstract class OlOOIoOO0OI {
                public static final I1ioiI I00000oIO = I1ioiI.I00000oIO("camera2.streamSpec.streamUseCase", Long.TYPE, null);
                public static final O1OOII I00000oOI;
                public static final O1OOII I0000Il00O;

                static {
/* 14 */            O1OOII o1ooii = new O1OOII();
/* 23 */            OolO01iOo0O oolO01iOo0O = OolO01iOo0O.I00iiI;
/* 25 */            OolO01iOo0O oolO01iOo0O2 = OolO01iOo0O.I00ilO0;
/* 27 */            OolO01iOo0O oolO01iOo0O3 = OolO01iOo0O.I00iiO;
/* 37 */            o1ooii.put(4L, I1IoiO1l.I00IlilI0i0i(new OolO01iOo0O[]{oolO01iOo0O, oolO01iOo0O2, oolO01iOo0O3}));
/* 54 */            o1ooii.put(1L, I1IoiO1l.I00IlilI0i0i(new OolO01iOo0O[]{oolO01iOo0O, oolO01iOo0O2, oolO01iOo0O3}));
/* 63 */            OolO01iOo0O oolO01iOo0O4 = OolO01iOo0O.I00iOIl;
/* 69 */            o1ooii.put(2L, Collections.singleton(oolO01iOo0O4));
/* 78 */            OolO01iOo0O oolO01iOo0O5 = OolO01iOo0O.I00iio;
/* 84 */            o1ooii.put(3L, Collections.singleton(oolO01iOo0O5));
/* 91 */            I00000oOI = o1ooii.I00000oOI();
/* 95 */            O1OOII o1ooii2 = new O1OOII();
/* 106 */           o1ooii2.put(4L, I1IoiO1l.I00IlilI0i0i(new OolO01iOo0O[]{oolO01iOo0O, oolO01iOo0O4, oolO01iOo0O5}));
/* 117 */           o1ooii2.put(3L, I1IoiO1l.I00IlilI0i0i(new OolO01iOo0O[]{oolO01iOo0O, oolO01iOo0O5}));
/* 124 */           I0000Il00O = o1ooii2.I00000oOI();
                }

                public static IIl0oI I00000oIO(IOlOo1ll1l1 iOlOo1ll1l1, Long l) {
/* 1 */             I1ioiI i1ioiI = I00000oIO;
/* 7 */             if (iOlOo1ll1l1.I000O01llI0(i1ioiI) && O0000Ioio00.I0000O(iOlOo1ll1l1.I0000O(i1ioiI), l)) {
/* 19 */                return null;
                    }
/* 21 */            OI0oiliol10O oI0oiliol10OI000iOII = OI0oiliol10O.I000iOII(iOlOo1ll1l1);
/* 25 */            oI0oiliol10OI000iOII.I0010I0i(i1ioiI, l);
/* 32 */            return new IIl0oI(oI0oiliol10OI000iOII, 8);
                }

                public static boolean I00000oOI(OolO01iOo0O oolO01iOo0O, long j, List list) {
/* 3 */             if (oolO01iOo0O != OolO01iOo0O.I00ilI0I1) {
/* 62 */                Long lValueOf = Long.valueOf(j);
/* 66 */                O1OOII o1ooii = I00000oOI;
                        return o1ooii.containsKey(lValueOf) && ((Set) o1ooii.get(Long.valueOf(j))).contains(oolO01iOo0O);
                    }
/* 5 */             Long lValueOf2 = Long.valueOf(j);
/* 9 */             O1OOII o1ooii2 = I0000Il00O;
/* 15 */            if (!o1ooii2.containsKey(lValueOf2)) {
/* 92 */                return false;
                    }
/* 26 */            Set set = (Set) o1ooii2.get(Long.valueOf(j));
/* 36 */            if (list.size() != set.size()) {
/* 92 */                return false;
                    }
/* 39 */            Iterator it = list.iterator();
/* 47 */            while (it.hasNext()) {
/* 59 */                if (!set.contains((OolO01iOo0O) it.next())) {
/* 92 */                    return false;
                        }
                    }
/* 90 */            return true;
                }

                public static boolean I0000Il00O(IOlOo1ll1l1 iOlOo1ll1l1, OolO01iOo0O oolO01iOo0O) {
/* 15 */            if (((Boolean) iOlOo1ll1l1.I00000oOI(OolIl0ii1.I00OI1, Boolean.FALSE)).booleanValue()) {
/* 49 */                return false;
                    }
/* 18 */            I1ioiI i1ioiI = Ioi1iI0IiOl.I00iiI;
/* 24 */            if (iOlOo1ll1l1.I000O01llI0(i1ioiI)) {
                        return oolO01iOo0O.ordinal() == 0 && ((Number) iOlOo1ll1l1.I0000O(i1ioiI)).intValue() == 2;
                    }
/* 49 */            return false;
                }
            }
