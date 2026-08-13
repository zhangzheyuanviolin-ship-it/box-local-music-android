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
            
            public final class IOIO1iII implements Ii1i1O0lI {
                public final OOo1oliI I00000oIO;
                public final Function1 I00000oOI;
                public final I00iiI I0000Il00O;
                public final LinkedHashMap I0000O;
                public final LinkedHashMap I0000oI00;
                public final LinkedHashMap I0001Ioi1lo;

                public IOIO1iII(OOo1oliI oOo1oliI, Function1 function1) {
/* 4 */             this.I00000oIO = oOo1oliI;
/* 6 */             this.I00000oOI = function1;
/* 12 */            I00iiI i00iiI = new I00iiI(12);
/* 15 */            i00iiI.I00iiI = this;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            this.I0000Il00O = i00iiI;
/* 32 */            IlIo0o ilIo0oI0001Ioi1lo = OilO1oiooiII.I0001Ioi1lo(IOOi0Ool1i.I001IO000(oOo1oliI.I0000O()), i00iiI);
/* 38 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 41 */            Iterator it = ilIo0oI0001Ioi1lo.iterator();
                    while (true) {
/* 46 */                IlIloII10O ilIloII10O = (IlIloII10O) it;
/* 52 */                if (!ilIloII10O.hasNext()) {
                            break;
                        }
/* 54 */                Object next = ilIloII10O.next();
/* 61 */                OI1Iio0ii1 oI1Iio0ii1I0000Il00O = ((OOoIOiO0) next).I0000Il00O();
/* 65 */                Object arrayList = linkedHashMap.get(oI1Iio0ii1I0000Il00O);
/* 69 */                if (arrayList == null) {
/* 73 */                    arrayList = new ArrayList();
/* 76 */                    linkedHashMap.put(oI1Iio0ii1I0000Il00O, arrayList);
                        }
/* 81 */                ((List) arrayList).add(next);
                    }
/* 85 */            this.I0000O = linkedHashMap;
/* 101 */           IlIo0o ilIo0oI0001Ioi1lo2 = OilO1oiooiII.I0001Ioi1lo(IOOi0Ool1i.I001IO000(this.I00000oIO.I00000oOI()), this.I00000oOI);
/* 107 */           LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 110 */           Iterator it2 = ilIo0oI0001Ioi1lo2.iterator();
                    while (true) {
/* 115 */               IlIloII10O ilIloII10O2 = (IlIloII10O) it2;
/* 121 */               if (!ilIloII10O2.hasNext()) {
                            break;
                        }
/* 123 */               Object next2 = ilIloII10O2.next();
/* 134 */               linkedHashMap2.put(((OOoIIOoo0o) next2).I0000Il00O(), next2);
                    }
/* 138 */           this.I0000oI00 = linkedHashMap2;
/* 142 */           ArrayList arrayListI0001Ioi1lo = this.I00000oIO.I0001Ioi1lo();
/* 146 */           Function1 function12 = this.I00000oOI;
/* 150 */           ArrayList arrayList2 = new ArrayList();
/* 153 */           Iterator it3 = arrayListI0001Ioi1lo.iterator();
/* 161 */           while (it3.hasNext()) {
/* 163 */               Object next3 = it3.next();
/* 177 */               if (((Boolean) function12.invoke(next3)).booleanValue()) {
/* 179 */                   arrayList2.add(next3);
                        }
                    }
/* 189 */           int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(arrayList2, 10));
/* 200 */           LinkedHashMap linkedHashMap3 = new LinkedHashMap(iI00000oIO < 16 ? 16 : iI00000oIO);
/* 203 */           Iterator it4 = arrayList2.iterator();
/* 211 */           while (it4.hasNext()) {
/* 213 */               Object next4 = it4.next();
/* 224 */               linkedHashMap3.put(((OOoIlIOlOI) next4).I0000Il00O(), next4);
                    }
/* 228 */           this.I0001Ioi1lo = linkedHashMap3;
                }

                @Override
                public final Set I00000oIO() {
/* 15 */            IlIo0o ilIo0oI0001Ioi1lo = OilO1oiooiII.I0001Ioi1lo(IOOi0Ool1i.I001IO000(this.I00000oIO.I0000O()), this.I0000Il00O);
/* 21 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 24 */            Iterator it = ilIo0oI0001Ioi1lo.iterator();
                    while (true) {
/* 29 */                IlIloII10O ilIloII10O = (IlIloII10O) it;
/* 35 */                if (!ilIloII10O.hasNext()) {
/* 113 */                   return linkedHashSet;
                        }
/* 47 */                linkedHashSet.add(((OOoIOiO0) ilIloII10O.next()).I0000Il00O());
                    }
                }

                @Override
                public final OOoIlIOlOI I00000oOI(OI1Iio0ii1 oI1Iio0ii1) {
/* 7 */             return (OOoIlIOlOI) this.I0001Ioi1lo.get(oI1Iio0ii1);
                }

                @Override
                public final Collection I0000Il00O(OI1Iio0ii1 oI1Iio0ii1) {
/* 7 */             List list = (List) this.I0000O.get(oI1Iio0ii1);
                    return list != null ? list : Il01100l.I00iOIl;
                }

                @Override
                public final OOoIIOoo0o I0000O(OI1Iio0ii1 oI1Iio0ii1) {
/* 7 */             return (OOoIIOoo0o) this.I0000oI00.get(oI1Iio0ii1);
                }

                @Override
                public final Set I0000oI00() {
/* 3 */             return this.I0001Ioi1lo.keySet();
                }

                @Override
                public final Set I0001Ioi1lo() {
/* 15 */            IlIo0o ilIo0oI0001Ioi1lo = OilO1oiooiII.I0001Ioi1lo(IOOi0Ool1i.I001IO000(this.I00000oIO.I00000oOI()), this.I00000oOI);
/* 21 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 24 */            Iterator it = ilIo0oI0001Ioi1lo.iterator();
                    while (true) {
/* 29 */                IlIloII10O ilIloII10O = (IlIloII10O) it;
/* 35 */                if (!ilIloII10O.hasNext()) {
/* 113 */                   return linkedHashSet;
                        }
/* 47 */                linkedHashSet.add(((OOoIIOoo0o) ilIloII10O.next()).I0000Il00O());
                    }
                }
            }
