            package p000;

            import java.util.ArrayList;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class O0oiOli1Il implements Function1 {
                public final int I00iOIl;
                public O0oiiOll0O1 I00iiI;
                public O0oiOi I00iiO;

                public O0oiOli1Il(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 108 */                   O0oiiOll0O1 o0oiiOll0O1 = this.I00iiI;
/* 110 */                   O0oiOi o0oiOi = this.I00iiO;
/* 112 */                   Map.Entry entry = (Map.Entry) obj;
/* 118 */                   O0oiO0ilooli o0oiO0ilooli = (O0oiO0ilooli) entry.getKey();
/* 124 */                   O0oiOoo0oO1 o0oiOoo0oO1 = (O0oiOoo0oO1) entry.getValue();
                            while (true) {
/* 126 */                       O0oOi0I o0oOi0I = o0oiOoo0oO1.I00000oIO;
/* 128 */                       O0oOi0I o0oOi0I2 = o0oiiOll0O1.I00l0I0l0lO1;
/* 130 */                       ArrayList arrayList = o0oiiOll0O1.I00ioIO;
/* 136 */                       if (o0oOi0I.compareTo(o0oOi0I2) > 0 && !o0oiiOll0O1.I00io1l && ((OI10I1IoI0Ol) o0oiiOll0O1.I00iiO.I00iiI).I0000Il00O(o0oiO0ilooli)) {
/* 154 */                           O0oOI1Ii1Iii o0oOI1Ii1Iii = O0oOOiI0.Companion;
/* 156 */                           O0oOi0I o0oOi0I3 = o0oiOoo0oO1.I00000oIO;
/* 158 */                           o0oOI1Ii1Iii.getClass();
/* 161 */                           int iOrdinal = o0oOi0I3.ordinal();
/* 180 */                           O0oOOiI0 o0oOOiI0 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : O0oOOiI0.ON_PAUSE : O0oOOiI0.ON_STOP : O0oOOiI0.ON_DESTROY;
/* 182 */                           if (o0oOOiI0 == null) {
/* 202 */                               IoOOl0iOl1io.I001lIiIIo1O("no event down from ", o0oiOoo0oO1.I00000oIO);
                                        break;
                                    } else {
/* 188 */                               arrayList.add(o0oOOiI0.I00000oIO());
/* 191 */                               o0oiOoo0oO1.I00000oIO(o0oiOi, o0oOOiI0);
/* 194 */                               IOOii0O10Io0.I001IIilI0O(arrayList);
                                    }
                                }
                            }
                            break;
                        default:
/* 11 */                    O0oiiOll0O1 o0oiiOll0O12 = this.I00iiI;
/* 13 */                    O0oiOi o0oiOi2 = this.I00iiO;
/* 15 */                    Map.Entry entry2 = (Map.Entry) obj;
/* 21 */                    O0oiO0ilooli o0oiO0ilooli2 = (O0oiO0ilooli) entry2.getKey();
/* 27 */                    O0oiOoo0oO1 o0oiOoo0oO12 = (O0oiOoo0oO1) entry2.getValue();
                            while (true) {
/* 29 */                        O0oOi0I o0oOi0I4 = o0oiOoo0oO12.I00000oIO;
/* 31 */                        O0oOi0I o0oOi0I5 = o0oiiOll0O12.I00l0I0l0lO1;
/* 33 */                        ArrayList arrayList2 = o0oiiOll0O12.I00ioIO;
/* 39 */                        if (o0oOi0I4.compareTo(o0oOi0I5) < 0 && !o0oiiOll0O12.I00io1l && ((OI10I1IoI0Ol) o0oiiOll0O12.I00iiO.I00iiI).I0000Il00O(o0oiO0ilooli2)) {
/* 59 */                            arrayList2.add(o0oiOoo0oO12.I00000oIO);
/* 62 */                            O0oOI1Ii1Iii o0oOI1Ii1Iii2 = O0oOOiI0.Companion;
/* 64 */                            O0oOi0I o0oOi0I6 = o0oiOoo0oO12.I00000oIO;
/* 66 */                            o0oOI1Ii1Iii2.getClass();
/* 69 */                            int iOrdinal2 = o0oOi0I6.ordinal();
/* 88 */                            O0oOOiI0 o0oOOiI02 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : O0oOOiI0.ON_RESUME : O0oOOiI0.ON_START : O0oOOiI0.ON_CREATE;
/* 90 */                            if (o0oOOiI02 == null) {
/* 103 */                               IoOOl0iOl1io.I001lIiIIo1O("no event up from ", o0oiOoo0oO12.I00000oIO);
                                        break;
                                    } else {
/* 92 */                                o0oiOoo0oO12.I00000oIO(o0oiOi2, o0oOOiI02);
/* 95 */                                IOOii0O10Io0.I001IIilI0O(arrayList2);
                                    }
                                }
                            }
                            break;
                    }
/* 7 */             return null;
                }
            }
