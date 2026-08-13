            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            
            public final class O0l1iillll0 implements IllOOo00lI {
                public final int I00iOIl;
                public O0l1oloIi I00iiI;

                public O0l1iillll0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O0l1oloIi o0l1oloIi = this.I00iiI;
                    switch (i) {
                        case 0:
/* 157 */                   return IOOi0Ool1i.I00iio(OilO1oiooiII.I000lI(new IlIo0o(new OoI10o0iO11O(new IlIo0o(I1IoiO1l.I0000Il00O(o0l1oloIi.I000oI1ioi.I00000oIO.getDeclaredClasses()), false, OOo1l011.I00iiI), OOo1l011.I00iiO), false, new OiioI1Io0o(4))));
                        case 1:
/* 25 */                    Collection collectionI00000oOI = o0l1oloIi.I000oI1ioi.I00000oOI();
/* 33 */                    ArrayList arrayList = new ArrayList();
/* 44 */                    for (Object obj : collectionI00000oOI) {
/* 59 */                        if (((OOoIIOoo0o) obj).I00000oIO.isEnumConstant()) {
/* 61 */                            arrayList.add(obj);
                                }
                            }
/* 71 */                    int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(arrayList, 10));
/* 77 */                    if (iI00000oIO < 16) {
/* 79 */                        iI00000oIO = 16;
                            }
/* 82 */                    LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 85 */                    Iterator it = arrayList.iterator();
/* 93 */                    while (it.hasNext()) {
/* 95 */                        Object next = it.next();
/* 106 */                       linkedHashMap.put(((OOoIIOoo0o) next).I0000Il00O(), next);
                            }
/* 110 */                   return linkedHashMap;
                        default:
/* 18 */                    return Oio0lI.I0000oI00(o0l1oloIi.I00000oOI(), o0l1oloIi.I000II());
                    }
                }
            }
