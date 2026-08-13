            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OI0l00II implements Function1 {
                public final int I00iOIl;
                public Ill0IO I00iiI;
                public O0IOli0o0 I00iiO;

                @Override
                public final Object invoke(Object obj) {
                    O0IOli0o0 o0IOli0o0I0000O;
                    switch (this.I00iOIl) {
                        case 0:
/* 293 */                   O0IOli0o0 o0IOli0o0 = this.I00iiO;
/* 295 */                   Ill0IO ill0IO = this.I00iiI;
/* 297 */                   OI0l0000lOo oI0l0000lOo = (OI0l0000lOo) obj;
/* 299 */                   List typeParameters = o0IOli0o0.getTypeParameters();
/* 311 */                   ArrayList arrayList = new ArrayList(IOOi1I.I0000O(typeParameters, 10));
/* 314 */                   Iterator it = typeParameters.iterator();
/* 322 */                   while (it.hasNext()) {
/* 358 */                       O0O0iO o0O0iO = new O0O0iO(oI0l0000lOo, ((O0O0OIOO) it.next()).getName(), (O0000Ioio00.I0000O(ill0IO, OlIllOO11lOl.I00IlilI0i0i) || O0000Ioio00.I0000O(ill0IO, OlIllOO11lOl.I00IioO0OiOi)) ? O0O10O.I00iiO : O0O10O.I00iOIl);
/* 367 */                       o0O0iO.I00ilO0 = Collections.singletonList(OlIlOIi.I00000oOI);
/* 369 */                       arrayList.add(o0O0iO);
                            }
/* 373 */                   return arrayList;
                        default:
/* 8 */                     Ill0IO ill0IO2 = this.I00iiI;
/* 10 */                    O0IOli0o0 o0IOli0o02 = this.I00iiO;
/* 12 */                    OI0l0000lOo oI0l0000lOo2 = (OI0l0000lOo) obj;
/* 23 */                    if (O0000Ioio00.I0000O(ill0IO2, OlIllOO11lOl.I00Io1lO)) {
/* 29 */                        O0O01O0o o0O01O0oI00000oOI = OOoOl0i.I00000oOI(Iterable.class, O0O0o1io.I0000Il00O);
/* 33 */                        OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 41 */                        o0IOli0o0I0000O = ((I011olOoO) oOoOl1001II.I0000O(o0O01O0oI00000oOI)).I0000O();
/* 45 */                        if (o0IOli0o0I0000O == null) {
/* 63 */                            throw new Ii01OOool(Oi010OO0.I00100o1O0lo(oOoOl1001II, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                                }
                            } else if (O0000Ioio00.I0000O(ill0IO2, OlIllOO11lOl.I00Io1o110i)) {
/* 76 */                        O0O01O0o o0O01O0oI00000oOI2 = OOoOl0i.I00000oOI(Collection.class, O0O0o1io.I0000Il00O);
/* 80 */                        OOoOl1001II oOoOl1001II2 = OOoOl0i.I00000oIO;
/* 88 */                        o0IOli0o0I0000O = ((I011olOoO) oOoOl1001II2.I0000O(o0O01O0oI00000oOI2)).I0000O();
/* 92 */                        if (o0IOli0o0I0000O == null) {
/* 109 */                           throw new Ii01OOool(Oi010OO0.I00100o1O0lo(oOoOl1001II2, Collection.class, new StringBuilder("No mutable collection class found: ")));
                                }
                            } else if (O0000Ioio00.I0000O(ill0IO2, OlIllOO11lOl.I00IoO0)) {
/* 120 */                       O0O01O0o o0O01O0oI00000oOI3 = OOoOl0i.I00000oOI(Collection.class, O0O0o1io.I0000Il00O);
/* 124 */                       OOoOl1001II oOoOl1001II3 = OOoOl0i.I00000oIO;
/* 132 */                       o0IOli0o0I0000O = ((I011olOoO) oOoOl1001II3.I0000O(o0O01O0oI00000oOI3)).I0000O();
/* 136 */                       if (o0IOli0o0I0000O == null) {
/* 153 */                           throw new Ii01OOool(Oi010OO0.I00100o1O0lo(oOoOl1001II3, Collection.class, new StringBuilder("No mutable collection class found: ")));
                                }
                            } else if (O0000Ioio00.I0000O(ill0IO2, OlIllOO11lOl.I00IoIO0lI)) {
/* 166 */                       O0O01O0o o0O01O0oI00000oOI4 = OOoOl0i.I00000oOI(Iterator.class, O0O0o1io.I0000Il00O);
/* 170 */                       OOoOl1001II oOoOl1001II4 = OOoOl0i.I00000oIO;
/* 178 */                       o0IOli0o0I0000O = ((I011olOoO) oOoOl1001II4.I0000O(o0O01O0oI00000oOI4)).I0000O();
/* 182 */                       if (o0IOli0o0I0000O == null) {
/* 199 */                           throw new Ii01OOool(Oi010OO0.I00100o1O0lo(oOoOl1001II4, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                                }
                            } else {
/* 200 */                       o0IOli0o0I0000O = null;
                            }
/* 201 */                   List<O0O0OIOO> list = oI0l0000lOo2.I00iiO;
/* 211 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list, 10));
/* 222 */                   for (O0O0OIOO o0o0oioo : list) {
/* 230 */                       O0O0o1io o0O0o1io = O0O0o1io.I0000Il00O;
/* 241 */                       arrayList2.add(l0iOII0lllIo.I00000oIO(l0i10lIio.I00000oOI(o0o0oioo, null, 7)));
                            }
/* 254 */                   ArrayList arrayListI001IIilI0O = I1IoiO1l.I001IIilI0O(new O0IOli0o0[]{o0IOli0o02, o0IOli0o0I0000O});
/* 264 */                   ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(arrayListI001IIilI0O, 10));
/* 267 */                   Iterator it2 = arrayListI001IIilI0O.iterator();
/* 275 */                   while (it2.hasNext()) {
/* 288 */                       arrayList3.add(l0i10lIio.I00000oOI((O0IOli0o0) it2.next(), arrayList2, 6));
                            }
/* 292 */                   return arrayList3;
                    }
                }
            }
