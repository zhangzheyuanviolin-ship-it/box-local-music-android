            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.ListIterator;
            import kotlin.jvm.functions.Function1;
            
            public final class OiiOolOl implements Function1 {
                public final int I00iOIl;
                public OiioIllIl I00iiI;
                public Oiill0lI1il1 I00iiO;

                public OiiOolOl(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v2, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
                @Override
                public final Object invoke(Object obj) {
                    Object arrayList;
                    int iNextIndex;
                    switch (this.I00iOIl) {
                        case 0:
/* 52 */                    OiioIllIl oiioIllIl = this.I00iiI;
/* 54 */                    Oiill0lI1il1 oiill0lI1il1 = this.I00iiO;
/* 60 */                    oiioIllIl.I00000oIO.setValue((OiiOlI0I) obj);
/* 63 */                    Oiio1oll000 oiio1oll000 = oiill0lI1il1.I00iOIl;
/* 69 */                    if (oiill0lI1il1.I000OOo1O() == null || oiio1oll000.I00000oIO().I0000oI00 == 0) {
/* 208 */                       arrayList = Il01100l.I00iOIl;
                            } else {
/* 83 */                        arrayList = new ArrayList();
/* 90 */                        ArrayList arrayListI0000oI00 = oiio1oll000.I0000oI00(oiill0lI1il1.I000lI());
/* 98 */                        ListIterator listIterator = arrayListI0000oI00.listIterator(arrayListI0000oI00.size());
                                while (true) {
/* 107 */                           if (listIterator.hasPrevious()) {
/* 125 */                               OiiOlI0I oiiOlI0I = (OiiOlI0I) oiio1oll000.I00000oIO().I0000oI00(((OI0i1o0iOo0) listIterator.previous()).I00000oIO);
/* 127 */                               if (oiiOlI0I != null && oiiOlI0I.I00000oIO.I00000oOI != oiiOlI0I.I00000oOI.I00000oOI) {
/* 139 */                                   iNextIndex = listIterator.nextIndex();
                                        }
                                    } else {
/* 144 */                               iNextIndex = -1;
                                    }
                                }
/* 145 */                       if (iNextIndex != -1) {
/* 147 */                           int size = arrayListI0000oI00.size();
/* 152 */                           for (int i = 0; i < size; i++) {
/* 158 */                               OI0i1o0iOo0 oI0i1o0iOo0 = (OI0i1o0iOo0) arrayListI0000oI00.get(i);
/* 170 */                               OiiOlI0I oiiOlI0I2 = (OiiOlI0I) oiio1oll000.I00000oIO().I0000oI00(oI0i1o0iOo0.I00000oIO);
/* 172 */                               if (oiiOlI0I2 != null) {
/* 174 */                                   I1111OO10i i1111OO10iI0000oI00 = oI0i1o0iOo0.I0000oI00();
/* 186 */                                   long jI00000oIO = lOliOi0Oi.I00000oIO(oiiOlI0I2.I00000oIO.I00000oOI, oiiOlI0I2.I00000oOI.I00000oOI);
/* 202 */                                   arrayList.add(i1111OO10iI0000oI00.subSequence(Oo0lI00l.I000II(jI00000oIO), Oo0lI00l.I0001Ioi1lo(jI00000oIO)));
                                        }
                                    }
                                }
                            }
/* 212 */                   oiioIllIl.I0000Il00O.setValue(arrayList);
/* 215 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 6 */                     OiioIllIl oiioIllIl2 = this.I00iiI;
/* 8 */                     Oiill0lI1il1 oiill0lI1il12 = this.I00iiO;
/* 12 */                    Oiill0lI1il1 oiill0lI1il13 = oiioIllIl2.I00000oOI;
/* 17 */                    if (oiill0lI1il13 != null && oiill0lI1il13 != oiill0lI1il12) {
/* 22 */                        I000II.I001IO000("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
/* 14 */                        return null;
                            }
/* 26 */                    if (oiill0lI1il13 != null && oiill0lI1il13 != oiill0lI1il12) {
/* 31 */                        I000II.I001IO000("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
/* 14 */                        return null;
                            }
/* 35 */                    oiioIllIl2.I00000oOI = oiill0lI1il12;
/* 41 */                    I1loO00 i1loO00 = new I1loO00(10);
/* 44 */                    i1loO00.I00000oOI = oiioIllIl2;
/* 46 */                    i1loO00.I0000Il00O = oiill0lI1il12;
/* 48 */                    VarHandle.storeStoreFence();
/* 51 */                    return i1loO00;
                    }
                }
            }
