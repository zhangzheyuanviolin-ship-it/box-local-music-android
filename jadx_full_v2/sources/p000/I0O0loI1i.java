            package p000;

            import com.google.ai.edge.gallery.data.AllowedSkill;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class I0O0loI1i implements Function1 {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public IlliIlI I00io1l;
                public Object I00ioIO;

                public I0O0loI1i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    float f;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 406 */                   Ol0o1OiOIIIl ol0o1OiOIIIl = (Ol0o1OiOIIIl) this.I00iiO;
/* 408 */                   OI10i0Il oI10i0Il = this.I00iiI;
/* 412 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00io1l;
/* 416 */                   IllOOo00lI illOOo00lI2 = (IllOOo00lI) this.I00ioIO;
/* 420 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00iio;
/* 424 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00ilI0I1;
/* 428 */                   OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00ilO0;
/* 432 */                   AllowedSkill allowedSkill = (AllowedSkill) obj;
/* 434 */                   String skillUrl = allowedSkill.getSkillUrl();
/* 442 */                   if (I0O1ii1l.I00000oOI(skillUrl)) {
/* 454 */                       oI10i0Il.setValue(Oio0lI.I0001Ioi1lo((Set) oI10i0Il.getValue(), skillUrl));
/* 460 */                       I0O10II11ioi i0O10II11ioi = new I0O10II11ioi(0);
/* 463 */                       i0O10II11ioi.I00iiI = skillUrl;
/* 465 */                       i0O10II11ioi.I00iiO = illOOo00lI;
/* 467 */                       i0O10II11ioi.I00iio = illOOo00lI2;
/* 469 */                       i0O10II11ioi.I00ilI0I1 = oI10i0Il;
/* 471 */                       VarHandle.storeStoreFence();
/* 476 */                       I0O10ll i0O10ll = new I0O10ll(0);
/* 479 */                       i0O10ll.I00iiI = skillUrl;
/* 481 */                       i0O10ll.I00iiO = oI10i0Il;
/* 483 */                       i0O10ll.I00iio = oI10i0Il2;
/* 485 */                       VarHandle.storeStoreFence();
/* 488 */                       ol0o1OiOIIIl.I0010o(i0O10II11ioi, skillUrl, i0O10ll);
                            } else {
/* 492 */                       oI10i0Il3.setValue(allowedSkill);
/* 497 */                       oI10i0Il4.setValue(Boolean.TRUE);
                            }
/* 500 */                   return ooiIlOl1iI;
                        case 1:
/* 183 */                   ArrayList<OIoi0IIoi> arrayList = (ArrayList) this.I00iiO;
/* 187 */                   Ol1o0O0O0 ol1o0O0O0 = (Ol1o0O0O0) this.I00iio;
/* 189 */                   OI10i0Il oI10i0Il5 = this.I00iiI;
/* 193 */                   Ol1o1llOII ol1o1llOII = (Ol1o1llOII) this.I00ilI0I1;
/* 197 */                   O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00ilO0;
/* 201 */                   Function1 function1 = (Function1) this.I00io1l;
/* 205 */                   Function1 function12 = (Function1) this.I00ioIO;
/* 209 */                   O0lolo o0lolo = (O0lolo) obj;
/* 215 */                   I0O1IiI i0O1IiI = new I0O1IiI(12);
/* 218 */                   i0O1IiI.I00iiI = oI10i0Il5;
/* 220 */                   VarHandle.storeStoreFence();
/* 235 */                   O0lolo.I0000O(o0lolo, "promo", new IOii1l(-496707267, i0O1IiI, true), 2);
/* 249 */                   for (OIoi0IIoi oIoi0IIoi : arrayList) {
/* 259 */                       String str = (String) oIoi0IIoi.I00iOIl;
/* 263 */                       List list = (List) oIoi0IIoi.I00iiI;
/* 267 */                       String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("header_", str);
/* 274 */                       I1iIllIiO i1iIllIiO = new I1iIllIiO(3);
/* 277 */                       i1iIllIiO.I00iiI = str;
/* 279 */                       VarHandle.storeStoreFence();
/* 290 */                       O0lolo.I0000O(o0lolo, strI000o00OoI0I, new IOii1l(-1936258124, i1iIllIiO, true), 2);
/* 293 */                       int size = list.size();
/* 301 */                       I0O11IOOo0OI i0O11IOOo0OI = new I0O11IOOo0OI(15);
/* 304 */                       i0O11IOOo0OI.I00iiI = list;
/* 306 */                       VarHandle.storeStoreFence();
/* 313 */                       I0O11IOOo0OI i0O11IOOo0OI2 = new I0O11IOOo0OI(16);
/* 316 */                       i0O11IOOo0OI2.I00iiI = list;
/* 318 */                       VarHandle.storeStoreFence();
/* 323 */                       Iloio01l0Il iloio01l0Il = new Iloio01l0Il(1);
/* 326 */                       iloio01l0Il.I00iiI = list;
/* 328 */                       iloio01l0Il.I00ilI0I1 = ol1o1llOII;
/* 330 */                       iloio01l0Il.I00ilO0 = o1ol100o0O;
/* 332 */                       iloio01l0Il.I00iiO = function1;
/* 334 */                       iloio01l0Il.I00iio = function12;
/* 336 */                       VarHandle.storeStoreFence();
/* 344 */                       o0lolo.I0000oI00(size, i0O11IOOo0OI, i0O11IOOo0OI2, new IOii1l(802480018, iloio01l0Il, true));
                            }
/* 352 */                   if (!ol1o0O0O0.isEmpty()) {
/* 358 */                       O0lolo.I0000O(o0lolo, "imported_models_label", i1i10Oi.I0000O, 2);
                            }
/* 361 */                   int size2 = ol1o0O0O0.size();
/* 369 */                   I0O11IOOo0OI i0O11IOOo0OI3 = new I0O11IOOo0OI(14);
/* 372 */                   i0O11IOOo0OI3.I00iiI = ol1o0O0O0;
/* 374 */                   VarHandle.storeStoreFence();
/* 380 */                   Io0IlIIo0 io0IlIIo0 = new Io0IlIIo0(0);
/* 383 */                   io0IlIIo0.I00iiI = ol1o0O0O0;
/* 385 */                   io0IlIIo0.I00iiO = o1ol100o0O;
/* 387 */                   io0IlIIo0.I00iio = function1;
/* 389 */                   io0IlIIo0.I00ilI0I1 = function12;
/* 391 */                   VarHandle.storeStoreFence();
/* 400 */                   o0lolo.I0000oI00(size2, null, i0O11IOOo0OI3, new IOii1l(802480018, io0IlIIo0, true));
/* 403 */                   return ooiIlOl1iI;
                        default:
/* 12 */                    OI0o0olO1 oI0o0olO1 = (OI0o0olO1) this.I00iiO;
/* 16 */                    IOl00O1iI1Oo iOl00O1iI1Oo = (IOl00O1iI1Oo) this.I00iio;
/* 20 */                    Function1 function13 = (Function1) this.I00ilI0I1;
/* 24 */                    Function1 function14 = (Function1) this.I00ilO0;
/* 28 */                    Function1 function15 = (Function1) this.I00io1l;
/* 32 */                    OlO01l1oOil olO01l1oOil = (OlO01l1oOil) this.I00ioIO;
/* 34 */                    OI10i0Il oI10i0Il6 = this.I00iiI;
/* 38 */                    I10l1l11 i10l1l11 = (I10l1l11) obj;
/* 54 */                    if (!((List) olO01l1oOil.getValue()).contains(i10l1l11.I00000oOI())) {
/* 176 */                       return new IOoOi11Io0o(Il0l0iooI.I00000oOI, Il1OOloOIl1.I00000oOI);
                            }
/* 62 */                    String str2 = ((OI1OloOIO1O) i10l1l11.I00000oOI()).I00ilO0;
/* 64 */                    int iI00000oOI = oI0o0olO1.I00000oOI(str2);
/* 68 */                    if (iI00000oOI >= 0) {
/* 72 */                        f = oI0o0olO1.I0000Il00O[iI00000oOI];
                            } else {
/* 76 */                        oI0o0olO1.I0001Ioi1lo(str2, 0.0f);
/* 79 */                        f = 0.0f;
                            }
/* 100 */                   if (!O0000Ioio00.I0000O(((OI1OloOIO1O) i10l1l11.I0000oI00()).I00ilO0, ((OI1OloOIO1O) i10l1l11.I00000oOI()).I00ilO0)) {
/* 134 */                       f = (((Boolean) iOl00O1iI1Oo.I0000Il00O.getValue()).booleanValue() || ((Boolean) oI10i0Il6.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                            }
/* 143 */                   oI0o0olO1.I0001Ioi1lo(((OI1OloOIO1O) i10l1l11.I0000oI00()).I00ilO0, f);
/* 166 */                   return new IOoOi11Io0o((Il0l0iooI) function13.invoke(i10l1l11), (Il1OOloOIl1) function14.invoke(i10l1l11), f, (Ol0iiil01) function15.invoke(i10l1l11));
                    }
                }
            }
