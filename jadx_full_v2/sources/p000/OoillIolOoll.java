            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.LinkedHashSet;
            import java.util.Set;
            
            public abstract class OoillIolOoll {
                public static final Set I00000oIO;
                public static final HashMap I00000oOI;
                public static final HashMap I0000Il00O;
                public static final LinkedHashSet I0000O;

                static {
/* 1 */             Ooill1l[] ooill1lArrValues = Ooill1l.values();
/* 8 */             ArrayList arrayList = new ArrayList(ooill1lArrValues.length);
/* 14 */            for (Ooill1l ooill1l : ooill1lArrValues) {
/* 20 */                arrayList.add(ooill1l.I00iiI);
                    }
/* 30 */            I00000oIO = IOOi0Ool1i.I00iio(arrayList);
/* 32 */            Ooill11[] ooill11ArrValues = Ooill11.values();
/* 39 */            ArrayList arrayList2 = new ArrayList(ooill11ArrValues.length);
/* 44 */            for (Ooill11 ooill11 : ooill11ArrValues) {
/* 50 */                arrayList2.add(ooill11.I00iOIl);
                    }
/* 56 */            IOOi0Ool1i.I00iio(arrayList2);
/* 64 */            I00000oOI = new HashMap();
/* 71 */            I0000Il00O = new HashMap();
/* 129 */           O1Oii0O0loo.I0000Il00O(new OIoi0IIoi(Ooill11.I00iiI, OI1Iio0ii1.I0000oI00("ubyteArrayOf")), new OIoi0IIoi(Ooill11.I00iiO, OI1Iio0ii1.I0000oI00("ushortArrayOf")), new OIoi0IIoi(Ooill11.I00iio, OI1Iio0ii1.I0000oI00("uintArrayOf")), new OIoi0IIoi(Ooill11.I00ilI0I1, OI1Iio0ii1.I0000oI00("ulongArrayOf")));
/* 132 */           Ooill1l[] ooill1lArrValues2 = Ooill1l.values();
/* 138 */           LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 143 */           for (Ooill1l ooill1l2 : ooill1lArrValues2) {
/* 153 */               linkedHashSet.add(ooill1l2.I00iiO.I0001Ioi1lo());
                    }
/* 159 */           I0000O = linkedHashSet;
/* 166 */           for (Ooill1l ooill1l3 : Ooill1l.values()) {
/* 170 */               HashMap map = I00000oOI;
/* 172 */               IOIOill iOIOill = ooill1l3.I00iiO;
/* 174 */               IOIOill iOIOill2 = ooill1l3.I00iOIl;
/* 176 */               map.put(iOIOill, iOIOill2);
/* 183 */               I0000Il00O.put(iOIOill2, ooill1l3.I00iiO);
                    }
                }

                public static final boolean I00000oIO(O0iIl1 o0iIl1) {
                    IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo;
/* 5 */             if (OoOilo0Oliii.I000lI(o0iIl1) || (iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo()) == null) {
/* 55 */                return false;
                    }
/* 19 */            Ii1Ool1 ii1Ool1I000lI = iOIiO1lIl0lI00100o1O0lo.I000lI();
                    return (ii1Ool1I000lI instanceof OIo0il) && O0000Ioio00.I0000O(((OIo0l0) ((OIo0il) ii1Ool1I000lI)).I00ilI0I1, OlIlllOI1.I000l1) && I00000oIO.contains(iOIiO1lIl0lI00100o1O0lo.getName());
                }
            }
