            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class O100I1IIi10I extends I00ooiO1I {
                public final O0O01001OOII I00000oIO;
                public final O100I0 I00000oOI;

                public O100I1IIi10I(O0O01001OOII o0o01001ooii) {
/* 1 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 6 */             this.I00000oIO = o0o01001ooii;
/* 10 */            OOIii1ili oOIii1ili = OlOlllO.I00000oOI;
/* 12 */            OilOloI oilOloII0000O = o0o01001ooii.I0000O();
/* 16 */            O100I0 o100i0 = new O100I0();
/* 19 */            o100i0.I00000oIO = oOIii1ili;
/* 21 */            o100i0.I00000oOI = oilOloII0000O;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            this.I00000oOI = o100i0;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 4 */             ((Map) obj).size();
/* 7 */             O100I0 o100i0 = this.I00000oOI;
/* 9 */             IOl1l0o0i1I0 iOl1l0o0i1I0I00000oOI = il0I1ii.I00000oOI(o100i0);
/* 13 */            Iterator itI000II = I000II(obj);
/* 17 */            int i = 0;
/* 22 */            while (itI000II.hasNext()) {
/* 28 */                Map.Entry entry = (Map.Entry) itI000II.next();
/* 30 */                Object key = entry.getKey();
/* 34 */                Object value = entry.getValue();
/* 38 */                int i2 = i + 1;
/* 42 */                iOl1l0o0i1I0I00000oOI.I000l1(o100i0, i, OlOlllO.I00000oIO, key);
/* 45 */                i += 2;
/* 51 */                iOl1l0o0i1I0I00000oOI.I000l1(o100i0, i2, this.I00000oIO, value);
                    }
/* 55 */            iOl1l0o0i1I0I00000oOI.I0000oI00();
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final Object I0000oI00() {
/* 3 */             return new LinkedHashMap();
                }

                @Override
                public final int I0001Ioi1lo(Object obj) {
/* 7 */             return ((LinkedHashMap) obj).size() * 2;
                }

                @Override
                public final Iterator I000II(Object obj) {
/* 7 */             return ((Map) obj).entrySet().iterator();
                }

                @Override
                public final int I000O01llI0(Object obj) {
                    throw null;
                }

                @Override
                public final void I000OiO(IOl1ii1loO iOl1ii1loO, int i, Object obj) {
/* 1 */             Map map = (Map) obj;
/* 3 */             OlOlllO olOlllO = OlOlllO.I00000oIO;
/* 5 */             O100I0 o100i0 = this.I00000oOI;
/* 8 */             Object objI00100o1O0lo = iOl1ii1loO.I00100o1O0lo(o100i0, i, olOlllO, null);
/* 12 */            int iI000II = iOl1ii1loO.I000II(o100i0);
/* 18 */            if (iI000II != i + 1) {
/* 69 */                I000II.I0010I0i(IIl001iO0Io.I000l1(i, iI000II, "Value must follow key in a map, index for key: ", ", returned index for value: "));
/* 215 */               return;
                    }
/* 20 */            boolean zContainsKey = map.containsKey(objI00100o1O0lo);
/* 24 */            O0O01001OOII o0o01001ooii = this.I00000oIO;
/* 57 */            map.put(objI00100o1O0lo, (!zContainsKey || (o0o01001ooii.I0000O().I000oI1ioi() instanceof OOIOoio0iiI)) ? iOl1ii1loO.I00100o1O0lo(o100i0, iI000II, o0o01001ooii, null) : iOl1ii1loO.I00100o1O0lo(o100i0, iI000II, o0o01001ooii, O1Oii0O0loo.I00000oOI(objI00100o1O0lo, map)));
                }

                @Override
                public final Object I000iOII(Object obj) {
                    throw null;
                }

                @Override
                public final Object I000l1(Object obj) {
/* 1 */             return (LinkedHashMap) obj;
                }
            }
