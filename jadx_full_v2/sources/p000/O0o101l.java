            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
/* 24 */    public final class O0o101l implements O1iil1I01o {
                public final int I00000oOI = 1;
                public Object I0000Il00O;

                public O0o101l(O1I0OloI o1I0OloI, IllOOo00lI illOOo00lI) {
/* 10 */            IiOliI0O0 iiOliI0O0 = new IiOliI0O0(1);
/* 13 */            iiOliI0O0.I00iiI = illOOo00lI;
/* 15 */            VarHandle.storeStoreFence();
/* 23 */            this.I0000Il00O = new O1I0II11i(o1I0OloI, iiOliI0O0);
                }

                @Override
                public Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
                    switch (this.I00000oOI) {
                        case 1:
/* 17 */                    return l1lio1l1.I00000oIO(I000OiO(oI1Iio0ii1, oIIl0iOOlo), OOo1l011.I00ooiO1I);
                        default:
/* 6 */                     return I000OiO(oI1Iio0ii1, oIIl0iOOlo);
                    }
                }

                @Override
                public final Set I00000oOI() {
/* 5 */             return I000l1().I00000oOI();
                }

                @Override
                public Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
                    switch (this.I00000oOI) {
                        case 1:
/* 11 */                    Collection collectionI000OOo1O = I000OOo1O(iiOOioIIO0, function1);
/* 19 */                    ArrayList arrayList = new ArrayList();
/* 24 */                    ArrayList arrayList2 = new ArrayList();
/* 35 */                    for (Object obj : collectionI000OOo1O) {
/* 46 */                        if (((Ii1Ool1) obj) instanceof IIiIoIl11IO) {
/* 48 */                            arrayList.add(obj);
                                } else {
/* 52 */                            arrayList2.add(obj);
                                }
                            }
/* 62 */                    return IOOi0Ool1i.I00O10llo(l1lio1l1.I00000oIO(arrayList, OOo1l011.I0100i), arrayList2);
                        default:
/* 6 */                     return I000OOo1O(iiOOioIIO0, function1);
                    }
                }

                @Override
                public final Set I0000O() {
/* 5 */             return I000l1().I0000O();
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 5 */             return I000l1().I0000oI00(oI1Iio0ii1, oIIl0iOOlo);
                }

                @Override
                public Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
                    switch (this.I00000oOI) {
                        case 1:
/* 17 */                    return l1lio1l1.I00000oIO(I000iOII(oI1Iio0ii1, oIIl0iOOlo), OOo1l011.I00oooO);
                        default:
/* 6 */                     return I000iOII(oI1Iio0ii1, oIIl0iOOlo);
                    }
                }

                @Override
                public final Set I000II() {
/* 5 */             return I000l1().I000II();
                }

                public final O1iil1I01o I000O01llI0() {
                    return I000l1() instanceof O0o101l ? ((O0o101l) I000l1()).I000O01llI0() : I000l1();
                }

                public final Collection I000OOo1O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 5 */             return I000l1().I0000Il00O(iiOOioIIO0, function1);
                }

                public final Collection I000OiO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 5 */             return I000l1().I00000oIO(oI1Iio0ii1, oIIl0iOOlo);
                }

                public final Collection I000iOII(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 5 */             return I000l1().I0001Ioi1lo(oI1Iio0ii1, oIIl0iOOlo);
                }

                public final O1iil1I01o I000l1() {
                    switch (this.I00000oOI) {
                        case 0:
/* 19 */                    return (O1iil1I01o) ((O1I0II11i) this.I0000Il00O).invoke();
                        default:
/* 8 */                     return (O1iil1I01o) this.I0000Il00O;
                    }
                }

/* 25 */        public O0o101l() {
                }
            }
