            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class IiOl1IoO1 extends IiOo0lO1 {
                public final O0iIoIOO0O0 I000II;
                public final O1I0II11i I000O01llI0;
                public final O1I0II11i I000OOo1O;
                public final IiOlI10iOI I000OiO;

                public IiOl1IoO1(IiOlI10iOI iiOlI10iOI, O0iIoIOO0O0 o0iIoIOO0O0) {
/* 1 */             this.I000OiO = iiOlI10iOI;
/* 3 */             IiOili0lOO1 iiOili0lOO1 = iiOlI10iOI.I00ll1;
/* 5 */             OOOi0i1IOo oOOi0i1IOo = iiOlI10iOI.I00ilI0I1;
/* 7 */             List list = oOOi0i1IOo.I00o101lO;
/* 9 */             List list2 = oOOi0i1IOo.I00oI0i;
/* 11 */            List list3 = oOOi0i1IOo.I00oII;
/* 13 */            List list4 = oOOi0i1IOo.I00li1OI;
/* 19 */            OI1IlOlol oI1IlOlol = (OI1IlOlol) iiOili0lOO1.I00iiO;
/* 24 */            Ii10lIo0l1 ii10lIo0l1 = (Ii10lIo0l1) iiOili0lOO1.I00iiI;
/* 34 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list4, 10));
/* 37 */            Iterator it = list4.iterator();
/* 45 */            while (it.hasNext()) {
/* 61 */                arrayList.add(l1iI1lOO.I00000oOI(oI1IlOlol, ((Number) it.next()).intValue()));
                    }
/* 68 */            IiOl01 iiOl01 = new IiOl01(0);
/* 71 */            iiOl01.I00iiI = arrayList;
/* 73 */            VarHandle.storeStoreFence();
/* 78 */            super(iiOili0lOO1, list, list2, list3, iiOl01);
/* 81 */            this.I000II = o0iIoIOO0O0;
/* 85 */            O1I0OloI o1I0OloI = (O1I0OloI) ii10lIo0l1.I00000oIO;
/* 89 */            IiOl0i0Il iiOl0i0Il = new IiOl0i0Il(0);
/* 92 */            iiOl0i0Il.I00iiI = this;
/* 94 */            VarHandle.storeStoreFence();
/* 97 */            o1I0OloI.getClass();
/* 105 */           this.I000O01llI0 = new O1I0II11i(o1I0OloI, iiOl0i0Il);
/* 109 */           O1I0OloI o1I0OloI2 = (O1I0OloI) ii10lIo0l1.I00000oIO;
/* 114 */           IiOl0i0Il iiOl0i0Il2 = new IiOl0i0Il(1);
/* 117 */           iiOl0i0Il2.I00iiI = this;
/* 119 */           VarHandle.storeStoreFence();
/* 122 */           o1I0OloI2.getClass();
/* 130 */           this.I000OOo1O = new O1I0II11i(o1I0OloI2, iiOl0i0Il2);
                }

                @Override
                public final Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 3 */             Object obj = this.I00000oOI.I00iiI;
/* 5 */             return super.I00000oIO(oI1Iio0ii1, oIIl0iOOlo);
                }

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 7 */             return (Collection) this.I000O01llI0.invoke();
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
                    OI000ilOol oI000ilOol;
/* 3 */             Object obj = this.I00000oOI.I00iiI;
/* 7 */             iOliil ioliil = this.I000OiO.I00o0l1o1o0;
                    return (ioliil == null || (oI000ilOol = (OI000ilOol) ((I1ooIoloo0) ioliil.I00iiO).invoke(oI1Iio0ii1)) == null) ? super.I0000oI00(oI1Iio0ii1, oIIl0iOOlo) : oI000ilOol;
                }

                @Override
                public final Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 3 */             Object obj = this.I00000oOI.I00iiI;
/* 5 */             return super.I0001Ioi1lo(oI1Iio0ii1, oIIl0iOOlo);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
                /* JADX WARN: Type inference failed for: r1v3, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                @Override
                public final void I000O01llI0(ArrayList arrayList) {
                    ?? arrayList2;
/* 3 */             iOliil ioliil = this.I000OiO.I00o0l1o1o0;
/* 5 */             if (ioliil != null) {
/* 11 */                Set setKeySet = ((LinkedHashMap) ioliil.I00iiI).keySet();
/* 19 */                arrayList2 = new ArrayList();
/* 22 */                Iterator it = setKeySet.iterator();
/* 30 */                while (it.hasNext()) {
/* 46 */                    OI000ilOol oI000ilOol = (OI000ilOol) ((I1ooIoloo0) ioliil.I00iiO).invoke((OI1Iio0ii1) it.next());
/* 48 */                    if (oI000ilOol != null) {
/* 50 */                        arrayList2.add(oI000ilOol);
                            }
                        }
                    } else {
/* 54 */                arrayList2 = 0;
                    }
/* 55 */            if (arrayList2 == 0) {
/* 57 */                arrayList2 = Il01100l.I00iOIl;
                    }
/* 59 */            arrayList.addAll(arrayList2);
                }

                @Override
                public final void I000OiO(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList) {
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 14 */            Iterator it = ((Collection) this.I000OOo1O.invoke()).iterator();
/* 22 */            while (it.hasNext()) {
/* 40 */                arrayList2.addAll(((O0iIl1) it.next()).I00IoiI().I00000oIO(oI1Iio0ii1, OIIl0iOOlo.I00iiO));
                    }
/* 60 */            arrayList.addAll(((I0OI00O) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I000lI).I00OOll1(oI1Iio0ii1, this.I000OiO));
/* 63 */            I0010o(oI1Iio0ii1, arrayList2, arrayList);
                }

                @Override
                public final void I000iOII(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList) {
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 14 */            Iterator it = ((Collection) this.I000OOo1O.invoke()).iterator();
/* 22 */            while (it.hasNext()) {
/* 40 */                arrayList2.addAll(((O0iIl1) it.next()).I00IoiI().I0001Ioi1lo(oI1Iio0ii1, OIIl0iOOlo.I00iiO));
                    }
/* 44 */            I0010o(oI1Iio0ii1, arrayList2, arrayList);
                }

                @Override
                public final IOIOill I000l1(OI1Iio0ii1 oI1Iio0ii1) {
/* 5 */             return this.I000OiO.I00ioIO.I0000O(oI1Iio0ii1);
                }

                @Override
                public final Set I000o00OoI0I() {
/* 5 */             List listI0000oI00 = this.I000OiO.I00lll10.I0000oI00();
/* 13 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 16 */            Iterator it = listI0000oI00.iterator();
/* 24 */            while (it.hasNext()) {
/* 36 */                Set setI0000O = ((O0iIl1) it.next()).I00IoiI().I0000O();
/* 42 */                if (setI0000O == null) {
/* 44 */                    return null;
                        }
/* 46 */                IOOii0O10Io0.I00100l0(linkedHashSet, setI0000O);
                    }
/* 113 */           return linkedHashSet;
                }

                @Override
                public final Set I000oI1ioi() {
/* 1 */             IiOlI10iOI iiOlI10iOI = this.I000OiO;
/* 5 */             List listI0000oI00 = iiOlI10iOI.I00lll10.I0000oI00();
/* 13 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 16 */            Iterator it = listI0000oI00.iterator();
/* 24 */            while (it.hasNext()) {
/* 42 */                IOOii0O10Io0.I00100l0(linkedHashSet, ((O0iIl1) it.next()).I00IoiI().I00000oOI());
                    }
/* 60 */            linkedHashSet.addAll(((I0OI00O) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I000lI).I00IOO(iiOlI10iOI));
/* 113 */           return linkedHashSet;
                }

                @Override
                public final Set I00100l0() {
/* 5 */             List listI0000oI00 = this.I000OiO.I00lll10.I0000oI00();
/* 13 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 16 */            Iterator it = listI0000oI00.iterator();
/* 24 */            while (it.hasNext()) {
/* 42 */                IOOii0O10Io0.I00100l0(linkedHashSet, ((O0iIl1) it.next()).I00IoiI().I000II());
                    }
/* 113 */           return linkedHashSet;
                }

                @Override
                public final boolean I0010I0i(IiOoI01 iiOoI01) {
/* 13 */            return ((OO1I1O0ooilo) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I000o00OoI0I).I000OOo1O(this.I000OiO, iiOoI01);
                }

                public final void I0010o(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList, ArrayList arrayList2) {
/* 3 */             ArrayList arrayList3 = new ArrayList(arrayList2);
/* 18 */            OIlIlOllioi oIlIlOllioi = ((OIIil1l0IioO) ((OIIiioOilI) ((Ii10lIo0l1) this.I00000oOI.I00iiI).I00100l0)).I0000O;
/* 23 */            IiOl10OlO0 iiOl10OlO0 = new IiOl10OlO0(0);
/* 26 */            iiOl10OlO0.I00000oOI = arrayList2;
/* 28 */            VarHandle.storeStoreFence();
/* 35 */            oIlIlOllioi.I000O01llI0(oI1Iio0ii1, arrayList, arrayList3, this.I000OiO, iiOl10OlO0);
                }
            }
