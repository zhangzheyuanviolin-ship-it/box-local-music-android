            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            
            public final class Ilo10I0 implements IlliOIilI {
                public O1ol100o0O I00iOIl;
                public OI1o1o1iO1l I00iiI;
                public OI10i0Il I00iiO;
                public OI10i0Il I00iio;

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    String string;
                    boolean z;
                    String string2;
/* 3 */             O1ol100o0O o1ol100o0O = this.I00iOIl;
/* 5 */             OI1o1o1iO1l oI1o1o1iO1l = this.I00iiI;
/* 7 */             OI10i0Il oI10i0Il = this.I00iiO;
/* 9 */             OI10i0Il oI10i0Il2 = this.I00iio;
/* 21 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 27 */            ((Integer) obj4).getClass();
/* 30 */            OI1Oo1II110 oI1Oo1II110 = ((OI1OloOIO1O) obj2).I00ioIO;
/* 32 */            Bundle bundleI00000oIO = oI1Oo1II110.I00000oIO();
/* 36 */            String str = "";
/* 38 */            if (bundleI00000oIO == null || (string = bundleI00000oIO.getString("modelName")) == null) {
/* 36 */                string = "";
                    }
/* 49 */            Bundle bundleI00000oIO2 = oI1Oo1II110.I00000oIO();
/* 53 */            if (bundleI00000oIO2 != null && (string2 = bundleI00000oIO2.getString("taskId")) != null) {
/* 64 */                str = string2;
                    }
/* 65 */            Bundle bundleI00000oIO3 = oI1Oo1II110.I00000oIO();
/* 78 */            String string3 = bundleI00000oIO3 != null ? bundleI00000oIO3.getString("conversationId") : null;
/* 79 */            Bundle bundleI00000oIO4 = oI1Oo1II110.I00000oIO();
/* 93 */            boolean z2 = bundleI00000oIO4 != null ? bundleI00000oIO4.getBoolean("autoResume") : true;
/* 94 */            Bundle bundleI00000oIO5 = oI1Oo1II110.I00000oIO();
/* 108 */           boolean z3 = bundleI00000oIO5 != null ? bundleI00000oIO5.getBoolean("voiceMode") : false;
/* 109 */           Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 113 */           Object obj5 = IOl11li.I00000oIO;
/* 115 */           if (objI00O0i0ii == obj5) {
/* 117 */               objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 121 */               iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 124 */           Ii0110 ii0110 = (Ii0110) objI00O0i0ii;
/* 132 */           Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 136 */           O1oIOiI11o0 o1oIOiI11o0I001IIilI0O = o1ol100o0O.I001IIilI0O(string);
/* 140 */           if (o1oIOiI11o0I001IIilI0O == null) {
/* 145 */               iloI0lOlll1.I00i01iIIliI(345900800);
/* 148 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 156 */               iloI0lOlll1.I00i01iIIliI(345900801);
/* 169 */               if (!O0000Ioio00.I0000O((String) oI10i0Il.getValue(), string)) {
/* 171 */                   o1ol100o0O.I00IlilI0i0i(o1oIOiI11o0I001IIilI0O);
/* 174 */                   oI10i0Il.setValue(string);
                        }
/* 177 */               Ii0ioo10iO0 ii0ioo10iO0I00111O = o1ol100o0O.I00111O(str);
/* 181 */               if (ii0ioo10iO0I00111O != null) {
/* 186 */                   iloI0lOlll1.I00i01iIIliI(1302805778);
/* 201 */                   if (OloO1olO.I00000oIO.contains(ii0ioo10iO0I00111O.I00000oOI().I00000oIO)) {
/* 206 */                       iloI0lOlll1.I00i01iIIliI(1302792448);
/* 209 */                       boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oI1o1o1iO1l);
/* 213 */                       Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                                Object obj6 = objI00O0i0ii2;
/* 217 */                       if (zI000OOo1O || objI00O0i0ii2 == obj5) {
/* 223 */                           Ilo10oOlI ilo10oOlI = new Ilo10oOlI(1);
/* 226 */                           ilo10oOlI.I00iiI = oI1o1o1iO1l;
/* 228 */                           ilo10oOlI.I00iiO = oI10i0Il2;
/* 230 */                           ilo10oOlI.I00iio = oI10i0Il;
/* 232 */                           VarHandle.storeStoreFence();
/* 235 */                           iloI0lOlll1.I00iio(ilo10oOlI);
                                    obj6 = ilo10oOlI;
                                }
/* 242 */                       Ii0l0ll1 ii0l0ll1 = new Ii0l0ll1();
/* 245 */                       ii0l0ll1.I00000oIO = o1ol100o0O;
/* 247 */                       ii0l0ll1.I00000oOI = (IllOOo00lI) obj6;
/* 249 */                       ii0l0ll1.I0000Il00O = string3;
/* 251 */                       ii0l0ll1.I0000O = z2;
/* 253 */                       ii0l0ll1.I0000oI00 = z3;
/* 255 */                       VarHandle.storeStoreFence();
/* 258 */                       z = false;
/* 259 */                       ii0ioo10iO0I00111O.I00000oIO(ii0l0ll1, iloI0lOlll1, 0);
/* 262 */                       iloI0lOlll1.I0010I0i(false);
                            } else {
/* 270 */                       iloI0lOlll1.I00i01iIIliI(1303401288);
/* 273 */                       Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 277 */                       if (objI00O0i0ii3 == obj5) {
/* 281 */                           objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 285 */                           iloI0lOlll1.I00iio(objI00O0i0ii3);
                                }
/* 288 */                       OI10i0Il oI10i0Il3 = (OI10i0Il) objI00O0i0ii3;
/* 290 */                       Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
/* 294 */                       if (objI00O0i0ii4 == obj5) {
/* 298 */                           objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 302 */                           iloI0lOlll1.I00iio(objI00O0i0ii4);
                                }
/* 305 */                       OI10i0Il oI10i0Il4 = (OI10i0Il) objI00O0i0ii4;
/* 307 */                       Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 311 */                       if (objI00O0i0ii5 == obj5) {
/* 313 */                           objI00O0i0ii5 = lOO00IiI0li.I00000oIO(null);
/* 317 */                           iloI0lOlll1.I00iio(objI00O0i0ii5);
                                }
/* 320 */                       OI10i0Il oI10i0Il5 = (OI10i0Il) objI00O0i0ii5;
/* 322 */                       OloIl1l1oOii oloIl1l1oOiiI00000oOI = ii0ioo10iO0I00111O.I00000oOI();
/* 332 */                       boolean zBooleanValue = ((Boolean) oI10i0Il3.getValue()).booleanValue();
/* 342 */                       boolean zBooleanValue2 = ((Boolean) oI10i0Il4.getValue()).booleanValue();
/* 352 */                       boolean z4 = ii0ioo10iO0I00111O.I00000oOI().I000o00OoI0I;
/* 380 */                       boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(oI1o1o1iO1l) | iloI0lOlll1.I000OOo1O(ii0ioo10iO0I00111O) | iloI0lOlll1.I000OOo1O(ii0110) | iloI0lOlll1.I000OOo1O(o1ol100o0O) | iloI0lOlll1.I000OOo1O(context);
/* 384 */                       Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                                Object obj7 = objI00O0i0ii6;
/* 388 */                       if (zI000OOo1O2 || objI00O0i0ii6 == obj5) {
/* 395 */                           I0IlIoI1oi0 i0IlIoI1oi0 = new I0IlIoI1oi0(2);
/* 398 */                           i0IlIoI1oi0.I00iio = oI1o1o1iO1l;
/* 400 */                           i0IlIoI1oi0.I00ilO0 = ii0ioo10iO0I00111O;
/* 402 */                           i0IlIoI1oi0.I00io1l = ii0110;
/* 404 */                           i0IlIoI1oi0.I00iiI = oI10i0Il5;
/* 406 */                           i0IlIoI1oi0.I00iiO = oI10i0Il2;
/* 408 */                           i0IlIoI1oi0.I00ilI0I1 = oI10i0Il;
/* 410 */                           i0IlIoI1oi0.I00ioIO = o1ol100o0O;
/* 412 */                           i0IlIoI1oi0.I00l0I0l0lO1 = context;
/* 414 */                           VarHandle.storeStoreFence();
/* 417 */                           iloI0lOlll1.I00iio(i0IlIoI1oi0);
                                    obj7 = i0IlIoI1oi0;
                                }
/* 425 */                       I1o0Il1lli1i i1o0Il1lli1i = new I1o0Il1lli1i(3);
/* 428 */                       i1o0Il1lli1i.I00iio = ii0ioo10iO0I00111O;
/* 430 */                       i1o0Il1lli1i.I00ilI0I1 = o1ol100o0O;
/* 432 */                       i1o0Il1lli1i.I00ilO0 = string3;
/* 434 */                       i1o0Il1lli1i.I00iiO = oI10i0Il3;
/* 436 */                       i1o0Il1lli1i.I00iiI = oI10i0Il4;
/* 438 */                       i1o0Il1lli1i.I00io1l = oI10i0Il5;
/* 440 */                       VarHandle.storeStoreFence();
/* 462 */                       Ilo1IoOo.I00000oIO(oloIl1l1oOiiI00000oOI, o1ol100o0O, zBooleanValue, zBooleanValue2, z4, false, (IllOOo00lI) obj7, iiioOl1O.I00000oOI(780552655, i1o0Il1lli1i, iloI0lOlll1), iloI0lOlll1, 12582912, 32);
/* 465 */                       z = false;
/* 466 */                       iloI0lOlll1.I0010I0i(false);
                            }
/* 469 */                   iloI0lOlll1.I0010I0i(z);
                        } else {
/* 473 */                   z = false;
/* 477 */                   iloI0lOlll1.I00i01iIIliI(1305328403);
/* 480 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 483 */               iloI0lOlll1.I0010I0i(z);
                    }
/* 486 */           return OoiIlOl1iI.I00000oIO;
                }
            }
