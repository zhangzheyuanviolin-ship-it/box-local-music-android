            package p000;

            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class O0lIOlO1O1O0 implements IllOOo00lI {
                public final int I00iOIl;
                public O0lIlO1i I00iiI;

                public O0lIOlO1O1O0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             O0lIlO1i o0lIlO1i = this.I00iiI;
                    switch (i) {
                        case 0:
/* 35 */                    IiOOioIIO0 iiOOioIIO0 = IiOOioIIO0.I000lI;
/* 39 */                    O1iil1I01o.I00000oIO.getClass();
/* 42 */                    IiOi0I1 iiOi0I1 = IiOi0I1.I00olI;
/* 44 */                    List list = iiOOioIIO0.I00000oIO;
/* 46 */                    OIIl0iOOlo oIIl0iOOlo = OIIl0iOOlo.I00iio;
/* 50 */                    LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 59 */                    if (iiOOioIIO0.I00000oIO(IiOOioIIO0.I000l1)) {
/* 65 */                        Iterator it = o0lIlO1i.I000O01llI0(iiOOioIIO0, iiOi0I1).iterator();
/* 73 */                        while (it.hasNext()) {
/* 85 */                            iiIiiol0.I00000oIO(linkedHashSet, o0lIlO1i.I0000oI00((OI1Iio0ii1) it.next(), oIIl0iOOlo));
                                }
                            }
/* 95 */                    if (iiOOioIIO0.I00000oIO(IiOOioIIO0.I000OOo1O) && !list.contains(IiOOO0oll.I00000oIO)) {
/* 109 */                       Iterator it2 = o0lIlO1i.I000OOo1O(iiOOioIIO0, iiOi0I1).iterator();
/* 117 */                       while (it2.hasNext()) {
/* 129 */                           linkedHashSet.addAll(o0lIlO1i.I00000oIO((OI1Iio0ii1) it2.next(), oIIl0iOOlo));
                                }
                            }
/* 139 */                   if (iiOOioIIO0.I00000oIO(IiOOioIIO0.I000OiO) && !list.contains(IiOOO0oll.I00000oIO)) {
/* 153 */                       Iterator it3 = o0lIlO1i.I000o00OoI0I().iterator();
/* 161 */                       while (it3.hasNext()) {
/* 173 */                           linkedHashSet.addAll(o0lIlO1i.I0001Ioi1lo((OI1Iio0ii1) it3.next(), oIIl0iOOlo));
                                }
                            }
/* 177 */                   return IOOi0Ool1i.I00iIi0i1o(linkedHashSet);
                        case 1:
/* 30 */                    return o0lIlO1i.I000iOII();
                        case 2:
/* 25 */                    return o0lIlO1i.I000OOo1O(IiOOioIIO0.I00100l0, null);
                        case 3:
/* 16 */                    loIOiIO1O1 loioiio1o1 = IiOOioIIO0.I0000Il00O;
/* 18 */                    return o0lIlO1i.I000o00OoI0I();
                        default:
/* 11 */                    return o0lIlO1i.I000O01llI0(IiOOioIIO0.I000oI1ioi, null);
                    }
                }
            }
