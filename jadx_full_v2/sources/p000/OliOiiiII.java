            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class OliOiiiII implements O1iil1I01o {
                public final O1iil1I01o I00000oOI;
                public final OoOilII0 I0000Il00O;
                public HashMap I0000O;
                public final OllO00oiil I0000oI00;

                public OliOiiiII(O1iil1I01o o1iil1I01o, OoOilII0 ooOilII0) {
/* 4 */             this.I00000oOI = o1iil1I01o;
/* 17 */            this.I0000Il00O = new OoOilII0(iOl0oOOO1.I00000oOI(ooOilII0.I00000oIO));
/* 22 */            O0l1iloO o0l1iloO = new O0l1iloO(7);
/* 25 */            o0l1iloO.I00iiI = this;
/* 27 */            VarHandle.storeStoreFence();
/* 35 */            this.I0000oI00 = new OllO00oiil(o0l1iloO);
                }

                @Override
                public final Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 7 */             return I000OOo1O(this.I00000oOI.I00000oIO(oI1Iio0ii1, oIIl0iOOlo));
                }

                @Override
                public final Set I00000oOI() {
/* 3 */             return this.I00000oOI.I00000oOI();
                }

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 7 */             return (Collection) this.I0000oI00.getValue();
                }

                @Override
                public final Set I0000O() {
/* 3 */             return this.I00000oOI.I0000O();
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 3 */             IOIiO1lIl0l iOIiO1lIl0lI0000oI00 = this.I00000oOI.I0000oI00(oI1Iio0ii1, oIIl0iOOlo);
/* 7 */             if (iOIiO1lIl0lI0000oI00 != null) {
/* 13 */                return (IOIiO1lIl0l) I000O01llI0(iOIiO1lIl0lI0000oI00);
                    }
/* 16 */            return null;
                }

                @Override
                public final Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 7 */             return I000OOo1O(this.I00000oOI.I0001Ioi1lo(oI1Iio0ii1, oIIl0iOOlo));
                }

                @Override
                public final Set I000II() {
/* 3 */             return this.I00000oOI.I000II();
                }

                public final Ii1Ool1 I000O01llI0(Ii1Ool1 ii1Ool1) {
/* 1 */             OoOilII0 ooOilII0 = this.I0000Il00O;
/* 9 */             if (ooOilII0.I00000oIO.I0000oI00()) {
/* 11 */                return ii1Ool1;
                    }
/* 12 */            HashMap map = this.I0000O;
/* 14 */            if (map == null) {
/* 18 */                map = new HashMap();
/* 21 */                this.I0000O = map;
                    }
/* 23 */            Object objI0000oI00 = map.get(ii1Ool1);
/* 27 */            if (objI0000oI00 == null) {
/* 31 */                if (!(ii1Ool1 instanceof OliOI1olOI)) {
/* 73 */                    IOOlIIilOl0.I000lI("Unknown descriptor in scope: ", ii1Ool1);
/* 76 */                    return null;
                        }
/* 36 */                objI0000oI00 = ((OliOI1olOI) ii1Ool1).I0000oI00(ooOilII0);
/* 40 */                if (objI0000oI00 == null) {
/* 70 */                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + ii1Ool1 + " substitution fails");
                        }
/* 42 */                map.put(ii1Ool1, objI0000oI00);
                    }
/* 78 */            return (Ii1Ool1) objI0000oI00;
                }

                public final Collection I000OOo1O(Collection collection) {
/* 9 */             if (this.I0000Il00O.I00000oIO.I0000oI00() || collection.isEmpty()) {
/* 18 */                return collection;
                    }
/* 19 */            int size = collection.size();
/* 34 */            LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
/* 37 */            Iterator it = collection.iterator();
/* 45 */            while (it.hasNext()) {
/* 57 */                linkedHashSet.add(I000O01llI0((Ii1Ool1) it.next()));
                    }
/* 186 */           return linkedHashSet;
                }
            }
