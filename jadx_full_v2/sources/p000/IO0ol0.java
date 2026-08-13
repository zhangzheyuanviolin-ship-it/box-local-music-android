            package p000;

            import java.util.Collection;
            import java.util.LinkedHashSet;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class IO0ol0 implements O1iil1I01o {
                public String I00000oOI;
                public O1iil1I01o[] I0000Il00O;

                @Override
                public final Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             O1iil1I01o[] o1iil1I01oArr = this.I0000Il00O;
/* 3 */             int length = o1iil1I01oArr.length;
/* 4 */             if (length == 0) {
/* 40 */                return Il01100l.I00iOIl;
                    }
/* 8 */             if (length == 1) {
/* 35 */                return o1iil1I01oArr[0].I00000oIO(oI1Iio0ii1, oIIl0iOOlo);
                    }
/* 11 */            Collection collectionI00000oIO = null;
/* 12 */            for (O1iil1I01o o1iil1I01o : o1iil1I01oArr) {
/* 20 */                collectionI00000oIO = lO0oioOO.I00000oIO(collectionI00000oIO, o1iil1I01o.I00000oIO(oI1Iio0ii1, oIIl0iOOlo));
                    }
                    return collectionI00000oIO == null ? Il01llIol0.I00iOIl : collectionI00000oIO;
                }

                @Override
                public final Set I00000oOI() {
/* 1 */             O1iil1I01o[] o1iil1I01oArr = this.I0000Il00O;
/* 5 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 10 */            for (O1iil1I01o o1iil1I01o : o1iil1I01oArr) {
/* 20 */                IOOii0O10Io0.I00100l0(linkedHashSet, o1iil1I01o.I00000oOI());
                    }
/* 29 */            return linkedHashSet;
                }

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 1 */             O1iil1I01o[] o1iil1I01oArr = this.I0000Il00O;
/* 3 */             int length = o1iil1I01oArr.length;
/* 4 */             if (length == 0) {
/* 40 */                return Il01100l.I00iOIl;
                    }
/* 8 */             if (length == 1) {
/* 35 */                return o1iil1I01oArr[0].I0000Il00O(iiOOioIIO0, function1);
                    }
/* 11 */            Collection collectionI00000oIO = null;
/* 12 */            for (O1iil1I01o o1iil1I01o : o1iil1I01oArr) {
/* 20 */                collectionI00000oIO = lO0oioOO.I00000oIO(collectionI00000oIO, o1iil1I01o.I0000Il00O(iiOOioIIO0, function1));
                    }
                    return collectionI00000oIO == null ? Il01llIol0.I00iOIl : collectionI00000oIO;
                }

                @Override
                public final Set I0000O() {
/* 7 */             return l1IiOIii00o1.I00000oIO(I1IoiO1l.I00000oOI(this.I0000Il00O));
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 4 */             IOIiO1lIl0l iOIiO1lIl0l = null;
/* 6 */             for (O1iil1I01o o1iil1I01o : this.I0000Il00O) {
/* 10 */                IOIiO1lIl0l iOIiO1lIl0lI0000oI00 = o1iil1I01o.I0000oI00(oI1Iio0ii1, oIIl0iOOlo);
/* 14 */                if (iOIiO1lIl0lI0000oI00 != null) {
/* 18 */                    if (!(iOIiO1lIl0lI0000oI00 instanceof IOIii00) || !((O1ii1i111o0) iOIiO1lIl0lI0000oI00).I00IO1()) {
/* 33 */                        return iOIiO1lIl0lI0000oI00;
                            }
/* 29 */                    if (iOIiO1lIl0l == null) {
/* 31 */                        iOIiO1lIl0l = iOIiO1lIl0lI0000oI00;
                            }
                        }
                    }
/* 89 */            return iOIiO1lIl0l;
                }

                @Override
                public final Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             O1iil1I01o[] o1iil1I01oArr = this.I0000Il00O;
/* 3 */             int length = o1iil1I01oArr.length;
/* 4 */             if (length == 0) {
/* 40 */                return Il01100l.I00iOIl;
                    }
/* 8 */             if (length == 1) {
/* 35 */                return o1iil1I01oArr[0].I0001Ioi1lo(oI1Iio0ii1, oIIl0iOOlo);
                    }
/* 11 */            Collection collectionI00000oIO = null;
/* 12 */            for (O1iil1I01o o1iil1I01o : o1iil1I01oArr) {
/* 20 */                collectionI00000oIO = lO0oioOO.I00000oIO(collectionI00000oIO, o1iil1I01o.I0001Ioi1lo(oI1Iio0ii1, oIIl0iOOlo));
                    }
                    return collectionI00000oIO == null ? Il01llIol0.I00iOIl : collectionI00000oIO;
                }

                @Override
                public final Set I000II() {
/* 1 */             O1iil1I01o[] o1iil1I01oArr = this.I0000Il00O;
/* 5 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 10 */            for (O1iil1I01o o1iil1I01o : o1iil1I01oArr) {
/* 20 */                IOOii0O10Io0.I00100l0(linkedHashSet, o1iil1I01o.I000II());
                    }
/* 29 */            return linkedHashSet;
                }

                public final String toString() {
/* 1 */             return this.I00000oOI;
                }
            }
