            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class IollllOOIol extends O1iio0 {
                public final O1iil1I01o I00000oOI;

                public IollllOOIol(O1iil1I01o o1iil1I01o) {
/* 4 */             this.I00000oOI = o1iil1I01o;
                }

                @Override
                public final Set I00000oOI() {
/* 3 */             return this.I00000oOI.I00000oOI();
                }

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
                    Collection collection;
/* 5 */             int i = IiOOioIIO0.I000l1 & iiOOioIIO0.I00000oOI;
/* 14 */            IiOOioIIO0 iiOOioIIO02 = i == 0 ? null : new IiOOioIIO0(i, iiOOioIIO0.I00000oIO);
/* 18 */            if (iiOOioIIO02 == null) {
/* 20 */                collection = Il01100l.I00iOIl;
                    } else {
/* 25 */                Collection collectionI0000Il00O = this.I00000oOI.I0000Il00O(iiOOioIIO02, function1);
/* 33 */                ArrayList arrayList = new ArrayList();
/* 44 */                for (Object obj : collectionI0000Il00O) {
/* 52 */                    if (obj instanceof IOIii00) {
/* 54 */                        arrayList.add(obj);
                            }
                        }
/* 58 */                collection = arrayList;
                    }
/* 59 */            return collection;
                }

                @Override
                public final Set I0000O() {
/* 3 */             return this.I00000oOI.I0000O();
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 3 */             IOIiO1lIl0l iOIiO1lIl0lI0000oI00 = this.I00000oOI.I0000oI00(oI1Iio0ii1, oIIl0iOOlo);
/* 8 */             if (iOIiO1lIl0lI0000oI00 != null) {
/* 18 */                OI000ilOol oI000ilOol = iOIiO1lIl0lI0000oI00 instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI0000oI00 : null;
/* 19 */                if (oI000ilOol != null) {
/* 21 */                    return oI000ilOol;
                        }
/* 24 */                if (iOIiO1lIl0lI0000oI00 instanceof IiOoI0oI) {
/* 26 */                    return (IiOoI0oI) iOIiO1lIl0lI0000oI00;
                        }
                    }
/* 7 */             return null;
                }

                @Override
                public final Set I000II() {
/* 3 */             return this.I00000oOI.I000II();
                }

                public final String toString() {
/* 13 */            return "Classes from " + this.I00000oOI;
                }
            }
