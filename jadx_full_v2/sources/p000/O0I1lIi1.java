            package p000;

            import java.util.Collection;
            import java.util.HashSet;
            import java.util.LinkedHashSet;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class O0I1lIi1 implements O1iil1I01o {
                public static final O0O00I1Ili[] I0001Ioi1lo = {OOoOl0i.I00000oIO.I000O01llI0(new OOOOIO0i(O0I1lIi1.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
                public o01l1ioOo0 I00000oOI;
                public O0lI0O1OOi1 I0000Il00O;
                public O0lIOO01I1l I0000O;
                public O1I0II11i I0000oI00;

                @Override
                public final Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 7 */             String str = this.I0000Il00O.I00ilI0I1.I00000oIO.I00000oIO;
/* 9 */             oI1Iio0ii1.I00000oOI();
/* 12 */            O0lIOO01I1l o0lIOO01I1l = this.I0000O;
/* 14 */            O1iil1I01o[] o1iil1I01oArrI000O01llI0 = I000O01llI0();
/* 18 */            Collection collectionI00000oIO = o0lIOO01I1l.I00000oIO(oI1Iio0ii1, oIIl0iOOlo);
/* 24 */            for (O1iil1I01o o1iil1I01o : o1iil1I01oArrI000O01llI0) {
/* 32 */                collectionI00000oIO = lO0oioOO.I00000oIO(collectionI00000oIO, o1iil1I01o.I00000oIO(oI1Iio0ii1, oIIl0iOOlo));
                    }
                    return collectionI00000oIO == null ? Il01llIol0.I00iOIl : collectionI00000oIO;
                }

                @Override
                public final Set I00000oOI() {
/* 1 */             O1iil1I01o[] o1iil1I01oArrI000O01llI0 = I000O01llI0();
/* 7 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 12 */            for (O1iil1I01o o1iil1I01o : o1iil1I01oArrI000O01llI0) {
/* 22 */                IOOii0O10Io0.I00100l0(linkedHashSet, o1iil1I01o.I00000oOI());
                    }
/* 36 */            linkedHashSet.addAll(this.I0000O.I00000oOI());
/* 113 */           return linkedHashSet;
                }

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 1 */             O0lIOO01I1l o0lIOO01I1l = this.I0000O;
/* 3 */             O1iil1I01o[] o1iil1I01oArrI000O01llI0 = I000O01llI0();
/* 7 */             Collection collectionI0000Il00O = o0lIOO01I1l.I0000Il00O(iiOOioIIO0, function1);
/* 13 */            for (O1iil1I01o o1iil1I01o : o1iil1I01oArrI000O01llI0) {
/* 21 */                collectionI0000Il00O = lO0oioOO.I00000oIO(collectionI0000Il00O, o1iil1I01o.I0000Il00O(iiOOioIIO0, function1));
                    }
                    return collectionI0000Il00O == null ? Il01llIol0.I00iOIl : collectionI0000Il00O;
                }

                @Override
                public final Set I0000O() {
/* 9 */             HashSet hashSetI00000oIO = l1IiOIii00o1.I00000oIO(I1IoiO1l.I00000oOI(I000O01llI0()));
/* 13 */            if (hashSetI00000oIO == null) {
/* 27 */                return null;
                    }
/* 23 */            hashSetI00000oIO.addAll(this.I0000O.I0000O());
/* 26 */            return hashSetI00000oIO;
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 7 */             String str = this.I0000Il00O.I00ilI0I1.I00000oIO.I00000oIO;
/* 9 */             oI1Iio0ii1.I00000oOI();
/* 14 */            IOIiO1lIl0l iOIiO1lIl0l = null;
/* 15 */            OI000ilOol oI000ilOolI001IIilI0O = this.I0000O.I001IIilI0O(oI1Iio0ii1, null);
/* 19 */            if (oI000ilOolI001IIilI0O != null) {
/* 21 */                return oI000ilOolI001IIilI0O;
                    }
/* 28 */            for (O1iil1I01o o1iil1I01o : I000O01llI0()) {
/* 32 */                IOIiO1lIl0l iOIiO1lIl0lI0000oI00 = o1iil1I01o.I0000oI00(oI1Iio0ii1, oIIl0iOOlo);
/* 36 */                if (iOIiO1lIl0lI0000oI00 != null) {
/* 40 */                    if (!(iOIiO1lIl0lI0000oI00 instanceof IOIii00) || !((O1ii1i111o0) iOIiO1lIl0lI0000oI00).I00IO1()) {
/* 55 */                        return iOIiO1lIl0lI0000oI00;
                            }
/* 51 */                    if (iOIiO1lIl0l == null) {
/* 53 */                        iOIiO1lIl0l = iOIiO1lIl0lI0000oI00;
                            }
                        }
                    }
/* 89 */            return iOIiO1lIl0l;
                }

                @Override
                public final Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 7 */             String str = this.I0000Il00O.I00ilI0I1.I00000oIO.I00000oIO;
/* 9 */             oI1Iio0ii1.I00000oOI();
/* 12 */            O0lIOO01I1l o0lIOO01I1l = this.I0000O;
/* 14 */            O1iil1I01o[] o1iil1I01oArrI000O01llI0 = I000O01llI0();
/* 18 */            o0lIOO01I1l.getClass();
/* 22 */            Collection collectionI00000oIO = Il01100l.I00iOIl;
/* 25 */            for (O1iil1I01o o1iil1I01o : o1iil1I01oArrI000O01llI0) {
/* 33 */                collectionI00000oIO = lO0oioOO.I00000oIO(collectionI00000oIO, o1iil1I01o.I0001Ioi1lo(oI1Iio0ii1, oIIl0iOOlo));
                    }
                    return collectionI00000oIO == null ? Il01llIol0.I00iOIl : collectionI00000oIO;
                }

                @Override
                public final Set I000II() {
/* 1 */             O1iil1I01o[] o1iil1I01oArrI000O01llI0 = I000O01llI0();
/* 7 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 12 */            for (O1iil1I01o o1iil1I01o : o1iil1I01oArrI000O01llI0) {
/* 22 */                IOOii0O10Io0.I00100l0(linkedHashSet, o1iil1I01o.I000II());
                    }
/* 36 */            linkedHashSet.addAll(this.I0000O.I000II());
/* 113 */           return linkedHashSet;
                }

                public final O1iil1I01o[] I000O01llI0() {
/* 1 */             O1I0II11i o1I0II11i = this.I0000oI00;
/* 6 */             O0O00I1Ili o0O00I1Ili = I0001Ioi1lo[0];
/* 12 */            return (O1iil1I01o[]) o1I0II11i.invoke();
                }

                public final String toString() {
/* 13 */            return "scope for " + this.I0000Il00O;
                }
            }
