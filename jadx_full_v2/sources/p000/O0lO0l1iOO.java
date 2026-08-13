            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class O0lO0l1iOO extends O0lO10oooOlI {
                public static final int I00100l0 = 0;
                public OOo1oliI I000o00OoI0I;
                public O0l1i0l I000oI1ioi;

                public static OOOO01l I001IIilI0O(OOOO01l oOOO01l) {
/* 6 */             if (oOOO01l.I000oI1ioi() != 2) {
/* 8 */                 return oOOO01l;
                    }
/* 9 */             Collection collectionI000o00OoI0I = oOOO01l.I000o00OoI0I();
/* 23 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(collectionI000o00OoI0I, 10));
/* 26 */            Iterator it = collectionI000o00OoI0I.iterator();
/* 34 */            while (it.hasNext()) {
/* 46 */                arrayList.add(I001IIilI0O((OOOO01l) it.next()));
                    }
/* 58 */            return (OOOO01l) IOOi0Ool1i.I00OilO00Il(IOOi0Ool1i.I001i1lo1io(arrayList));
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             return null;
                }

                @Override
                public final Set I000O01llI0(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                @Override
                public final Set I000OOo1O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 15 */            Set setI00iiO = IOOi0Ool1i.I00iiO(((Ii1i1O0lI) this.I0000oI00.invoke()).I00000oIO());
/* 21 */            O0lO0l1iOO o0lO0l1iOOI00000oOI = li0ol1IO.I00000oOI(this.I000oI1ioi);
/* 32 */            Set setI00000oOI = o0lO0l1iOOI00000oOI != null ? o0lO0l1iOOI00000oOI.I00000oOI() : null;
/* 33 */            if (setI00000oOI == null) {
/* 35 */                setI00000oOI = Il01llIol0.I00iOIl;
                    }
/* 39 */            setI00iiO.addAll(setI00000oOI);
/* 50 */            if (this.I000o00OoI0I.I00000oIO.isEnum()) {
/* 66 */                setI00iiO.addAll(IOOi1I.I000O01llI0(OlIlllOI1.I0000Il00O, OlIlllOI1.I00000oIO));
                    }
/* 71 */            Object obj = this.I00000oOI.I00iOIl;
/* 78 */            setI00iiO.addAll(new ArrayList());
/* 89 */            return setI00iiO;
                }

                @Override
                public final void I000OiO(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList) {
/* 3 */             Object obj = this.I00000oOI.I00iOIl;
                }

                @Override
                public final Ii1i1O0lI I000iOII() {
/* 7 */             return new IOIO1iII(this.I000o00OoI0I, IiOi0I1.I00oII);
                }

                @Override
                public final void I000l1(LinkedHashSet linkedHashSet, OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             O0l1i0l o0l1i0l = this.I000oI1ioi;
/* 3 */             O0lO0l1iOO o0lO0l1iOOI00000oOI = li0ol1IO.I00000oOI(o0l1i0l);
/* 44 */            linkedHashSet.addAll(il10lII0iIi.I0000oI00(oI1Iio0ii1, o0lO0l1iOOI00000oOI == null ? Il01llIol0.I00iOIl : IOOi0Ool1i.I00iio(o0lO0l1iOOI00000oOI.I00000oIO(oI1Iio0ii1, OIIl0iOOlo.I00ilI0I1)), linkedHashSet, o0l1i0l, ((OIIil1l0IioO) ((OIIiioOilI) ((I0l1OOl1l10) this.I00000oOI.I00iOIl).I000l1)).I0000O));
/* 55 */            if (this.I000o00OoI0I.I00000oIO.isEnum()) {
/* 63 */                if (oI1Iio0ii1.equals(OlIlllOI1.I0000Il00O)) {
/* 69 */                    linkedHashSet.add(il0ol10l.I0001Ioi1lo(o0l1i0l));
                        } else if (oI1Iio0ii1.equals(OlIlllOI1.I00000oIO)) {
/* 85 */                    linkedHashSet.add(il0ol10l.I000II(o0l1i0l));
                        }
                    }
                }

                @Override
                public final void I000lI(OI1Iio0ii1 oI1Iio0ii1, ArrayList arrayList) {
/* 1 */             O0l1i0l o0l1i0l = this.I000oI1ioi;
/* 5 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 12 */            I00iiI i00iiI = new I00iiI(22);
/* 15 */            i00iiI.I00iiI = oI1Iio0ii1;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            List listSingletonList = Collections.singletonList(o0l1i0l);
/* 26 */            iOl0lOIi11 iol0loii11 = iOl0lOIi11.I00ilI0I1;
/* 30 */            O0lO0OOIlOo o0lO0OOIlOo = new O0lO0OOIlOo();
/* 33 */            o0lO0OOIlOo.I00000oIO = o0l1i0l;
/* 35 */            o0lO0OOIlOo.I00000oOI = linkedHashSet;
/* 37 */            o0lO0OOIlOo.I0000Il00O = i00iiI;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            il01o0io.I00000oIO(listSingletonList, iol0loii11, o0lO0OOIlOo);
/* 45 */            boolean zIsEmpty = arrayList.isEmpty();
/* 49 */            o01l1ioOo0 o01l1iooo0 = this.I00000oOI;
/* 51 */            if (zIsEmpty) {
/* 75 */                LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 86 */                for (Object obj : linkedHashSet) {
/* 95 */                    OOOO01l oOOO01lI001IIilI0O = I001IIilI0O((OOOO01l) obj);
/* 99 */                    Object arrayList2 = linkedHashMap.get(oOOO01lI001IIilI0O);
/* 103 */                   if (arrayList2 == null) {
/* 107 */                       arrayList2 = new ArrayList();
/* 110 */                       linkedHashMap.put(oOOO01lI001IIilI0O, arrayList2);
                            }
/* 115 */                   ((List) arrayList2).add(obj);
                        }
/* 121 */               ArrayList arrayList3 = new ArrayList();
/* 128 */               Iterator it = linkedHashMap.entrySet().iterator();
/* 136 */               while (it.hasNext()) {
/* 166 */                   IOOii0O10Io0.I00100l0(arrayList3, il10lII0iIi.I0000oI00(oI1Iio0ii1, (Collection) ((Map.Entry) it.next()).getValue(), arrayList, o0l1i0l, ((OIIil1l0IioO) ((OIIiioOilI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000l1)).I0000O));
                        }
/* 170 */               arrayList.addAll(arrayList3);
                    } else {
/* 69 */                arrayList.addAll(il10lII0iIi.I0000oI00(oI1Iio0ii1, linkedHashSet, arrayList, o0l1i0l, ((OIIil1l0IioO) ((OIIiioOilI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000l1)).I0000O));
                    }
/* 181 */           if (this.I000o00OoI0I.I00000oIO.isEnum() && oI1Iio0ii1.equals(OlIlllOI1.I00000oOI)) {
/* 195 */               iiIiiol0.I00000oIO(arrayList, il0ol10l.I0000oI00(o0l1i0l));
                    }
                }

                @Override
                public final Set I000o00OoI0I() {
/* 15 */            Set setI00iiO = IOOi0Ool1i.I00iiO(((Ii1i1O0lI) this.I0000oI00.invoke()).I0001Ioi1lo());
/* 19 */            O0l1i0l o0l1i0l = this.I000oI1ioi;
/* 21 */            IiOi0I1 iiOi0I1 = IiOi0I1.I00oIiI10;
/* 23 */            List listSingletonList = Collections.singletonList(o0l1i0l);
/* 29 */            iOl0lOIi11 iol0loii11 = iOl0lOIi11.I00ilI0I1;
/* 33 */            O0lO0OOIlOo o0lO0OOIlOo = new O0lO0OOIlOo();
/* 36 */            o0lO0OOIlOo.I00000oIO = o0l1i0l;
/* 38 */            o0lO0OOIlOo.I00000oOI = setI00iiO;
/* 40 */            o0lO0OOIlOo.I0000Il00O = iiOi0I1;
/* 42 */            VarHandle.storeStoreFence();
/* 45 */            il01o0io.I00000oIO(listSingletonList, iol0loii11, o0lO0OOIlOo);
/* 56 */            if (this.I000o00OoI0I.I00000oIO.isEnum()) {
/* 60 */                setI00iiO.add(OlIlllOI1.I00000oOI);
                    }
/* 113 */           return setI00iiO;
                }

                @Override
                public final Ii1Ool1 I00100l0() {
/* 1 */             return this.I000oI1ioi;
                }
            }
