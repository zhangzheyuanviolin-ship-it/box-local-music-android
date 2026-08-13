            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO1i1O1I;", "LOooioIIoi0O;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class O1i1O1I extends OooioIIoi0O {
                public Ii1I1ooo10O0 I00000oOI;
                public Ii1I1ooo10O0 I0000Il00O;
                public OlO0OIIl1 I0000O;
                public OOli1O I0000oI00;
                public IoIlI1oli I0001Ioi1lo;

                public final void I0000oI00(String str, O1i0O00 o1i0O00, String str2, String str3) {
                    Object value;
                    Object value2;
/* 11 */            boolean zBooleanValue = ((Boolean) O1i1oIi1il.I00000oOI.I00iOIl.getValue()).booleanValue();
/* 15 */            OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 19 */            if (!zBooleanValue) {
/* 39 */                do {
/* 21 */                    value2 = olO0OIIl1.getValue();
/* 39 */                } while (!olO0OIIl1.I000iOII(value2, O1i1IIoO1IIl.I00000oIO((O1i1IIoO1IIl) value2, null, false, "MCP is disabled. Enable it in Settings to add a server.", 1)));
/* 41 */                return;
                    }
/* 57 */            do {
/* 42 */                value = olO0OIIl1.getValue();
/* 57 */            } while (!olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO((O1i1IIoO1IIl) value, null, true, null, 1)));
/* 59 */            IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 63 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 79 */            iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new I1iIiIIIio0(o1i0O00, str2, str3, this, str, (IOoil1iiIilo) null), 2);
                }

                public final void I0001Ioi1lo() {
                    Object value;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 21 */            do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 21 */            } while (!olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO((O1i1IIoO1IIl) value, null, false, null, 3)));
                }

                public final String I000II() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 16 */            Iterator it = ((O1i1IIoO1IIl) this.I0000O.getValue()).I00000oIO.iterator();
/* 24 */            while (it.hasNext()) {
/* 32 */                O1i1OolO o1i1OolO = ((O1i1Ooo0ll) it.next()).I00000oIO;
/* 67 */                sb.append(o1i1OolO.I001i1O0Ol() + ":" + o1i1OolO.I00111O() + ";");
/* 82 */                for (O1iI0OiI o1iI0OiI : o1i1OolO.I001IO000()) {
/* 119 */                   sb.append(o1iI0OiI.I001IO000() + ":" + o1iI0OiI.I00111O() + ";");
                        }
                    }
/* 123 */           return sb.toString();
                }

                public final String I000O01llI0() {
/* 9 */             List list = ((O1i1IIoO1IIl) this.I0000O.getValue()).I00000oIO;
/* 15 */            ArrayList arrayList = new ArrayList();
/* 26 */            for (Object obj : list) {
/* 41 */                if (((O1i1Ooo0ll) obj).I00000oIO.I00111O()) {
/* 43 */                    arrayList.add(obj);
                        }
                    }
/* 49 */            ArrayList arrayList2 = new ArrayList();
/* 52 */            Iterator it = arrayList.iterator();
/* 60 */            while (it.hasNext()) {
/* 74 */                IOOii0O10Io0.I00100l0(arrayList2, ((O1i1Ooo0ll) it.next()).I00000oIO.I001IO000());
                    }
/* 80 */            ArrayList arrayList3 = new ArrayList();
/* 83 */            Iterator it2 = arrayList2.iterator();
/* 91 */            while (it2.hasNext()) {
/* 93 */                Object next = it2.next();
/* 104 */               if (((O1iI0OiI) next).I00111O()) {
/* 106 */                   arrayList3.add(next);
                        }
                    }
/* 123 */           return IOOi0Ool1i.I00IlilI0i0i(arrayList3, "\n\n", null, null, new O0o01OIl(14), 30);
                }

                /* JADX WARN: Removed duplicated region for block: B:40:0x0181  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x01a3  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x01ab  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x01c4  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Serializable I000OOo1O(String str, Map map, Map map2, O1i0l0IO0i1 o1i0l0IO0i1, IOoilo iOoilo) {
                    O1i1O01OI1 o1i1O01OI1;
                    IOIo001i1o iOIo001i1o;
                    Object obj;
                    String str2;
                    Map map3;
                    O1i0l0IO0i1 o1i0l0IO0i12;
                    Map map4;
                    IOIo001i1o iOIo001i1o2;
                    Ii10ioolOI ii10ioolOI;
                    IOIo001i1o iOIo001i1o3;
                    Map map5;
                    Map map6;
                    Iterable iterable;
                    Boolean bool;
                    Boolean bool2;
/* 7 */             if (iOoilo instanceof O1i1O01OI1) {
/* 10 */                o1i1O01OI1 = (O1i1O01OI1) iOoilo;
/* 12 */                int i = o1i1O01OI1.I00io1l;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    o1i1O01OI1.I00io1l = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    o1i1O01OI1 = new O1i1O01OI1(this, iOoilo);
                        }
                    }
/* 29 */            Object objI00000oIO = o1i1O01OI1.I00ilI0I1;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = o1i1O01OI1.I00io1l;
/* 39 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 40 */            if (i2 == 0) {
/* 99 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 106 */               IoioIli11o ioioIli11o = new IoioIli11o();
/* 111 */               ioioIli11o.I00000oIO = "google-ai-edge-gallery";
/* 115 */               ioioIli11o.I00000oOI = "3.3.3";
/* 117 */               ioioIli11o.I0000Il00O = null;
/* 119 */               ioioIli11o.I0000O = null;
/* 121 */               ioioIli11o.I0000oI00 = null;
/* 127 */               IOIoIi11i0ll iOIoIi11i0ll = new IOIoIi11i0ll();
/* 130 */               iOIoIi11i0ll.I00000oIO = null;
/* 132 */               iOIoIi11i0ll.I00000oOI = null;
/* 134 */               iOIoIi11i0ll.I0000Il00O = null;
/* 136 */               iOIoIi11i0ll.I0000O = null;
/* 138 */               VarHandle.storeStoreFence();
/* 141 */               O0Iioo1lO0o o0Iioo1lO0o = OOiIOloo0.I00000oIO;
/* 143 */               Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 146 */               oi00IilOloo0.I00iOIl = iOIoIi11i0ll;
/* 148 */               VarHandle.storeStoreFence();
/* 151 */               iOIo001i1o = new IOIo001i1o();
/* 154 */               iOIo001i1o.I00000oIO = oi00IilOloo0;
/* 156 */               OO0oi0 oO0oi0 = OO0oi0.I00iio;
/* 158 */               iOIo001i1o.I0000Il00O = oO0oi0;
/* 160 */               iOIo001i1o.I0000O = oO0oi0;
/* 162 */               iOIo001i1o.I0000oI00 = oO0oi0;
/* 164 */               iOIo001i1o.I0001Ioi1lo = oO0oi0;
/* 166 */               O1llIlI o1llIlI = O1llOIO.Companion;
/* 171 */               OIoO1Ol oIoO1Ol = new OIoO1Ol(5);
/* 174 */               oIoO1Ol.I00iiI = iOIo001i1o;
/* 176 */               VarHandle.storeStoreFence();
/* 207 */               do {
/* 179 */                   obj = iOIo001i1o.I0000O;
/* 207 */               } while (!I1Ioolli0l0o.I00000oIO.compareAndSwapObject(iOIo001i1o, OOiIOI10OOIi.I000OOo1O, obj, ((OO0oOlOi1) obj).I0000oI00("notifications/progress", new O00lOIIO(oIoO1Ol, iOoil1iiIilo, 22))));
/* 216 */               iOIo001i1o.I000O01llI0(O1llOIO.I00iio, new IillI1lo11l0(3, null, 2));
/* 219 */               iOIo001i1o.I000lI = ioioIli11o;
/* 223 */               IOIoIi11i0ll iOIoIi11i0ll2 = (IOIoIi11i0ll) oi00IilOloo0.I00iOIl;
/* 225 */               iOIo001i1o.I00100l0 = iOIoIi11i0ll2;
/* 229 */               iOIo001i1o.I00100o1O0lo = OO0oi0.I00iio;
/* 231 */               O0Iioo1lO0o o0Iioo1lO0o2 = IOIoli1ilo.I00000oIO;
/* 237 */               I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(19);
/* 240 */               i0OIOO00l0O.I00iiI = iOIo001i1o;
/* 242 */               VarHandle.storeStoreFence();
/* 245 */               o0Iioo1lO0o2.I000II(i0OIOO00l0O);
/* 250 */               if (iOIoIi11i0ll2.I00000oOI != null) {
/* 259 */                   iOIo001i1o.I000O01llI0(O1llOIO.I00oliIiO01i, new IOIllll(iOIo001i1o, null, 0));
                        }
/* 262 */               VarHandle.storeStoreFence();
/* 265 */               if (o1i0l0IO0i1 == null) {
/* 269 */                   IlOil1ii data = this.I0000Il00O.getData();
/* 273 */                   str2 = str;
/* 275 */                   o1i1O01OI1.I00iOIl = str2;
/* 277 */                   map3 = map;
/* 279 */                   o1i1O01OI1.I00iiI = map3;
/* 283 */                   o1i1O01OI1.I00iiO = map2;
/* 285 */                   o1i1O01OI1.I00iio = iOIo001i1o;
/* 287 */                   o1i1O01OI1.I00io1l = 1;
/* 289 */                   objI00000oIO = ilOoO00.I00000oIO(data, o1i1O01OI1);
/* 293 */                   if (objI00000oIO != ii0111o) {
/* 297 */                       map4 = map2;
/* 298 */                       iOIo001i1o2 = iOIo001i1o;
                            }
/* 419 */                   return ii0111o;
                        }
/* 313 */               str2 = str;
/* 315 */               map3 = map;
/* 319 */               o1i0l0IO0i12 = o1i0l0IO0i1;
/* 321 */               map4 = map2;
/* 322 */               if (o1i0l0IO0i12 == null && o1i0l0IO0i12.I0010I0i() == O1i0O00.I00iiI) {
/* 332 */                   O1i0iliilI o1i0iliilII00111O = o1i0l0IO0i12.I00111O();
/* 338 */                   IoIlI1oli ioIlI1oli = this.I0001Ioi1lo;
/* 344 */                   O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(14);
/* 347 */                   o0l0IlolloIO.I00iiI = o1i0iliilII00111O;
/* 349 */                   VarHandle.storeStoreFence();
/* 353 */                   ii10ioolOI = new Ii10ioolOI(ioIlI1oli, str2, o0l0IlolloIO, 4);
                        } else {
/* 363 */                   ii10ioolOI = new Ii10ioolOI(this.I0001Ioi1lo, str2, null, 12);
                        }
/* 366 */               o1i1O01OI1.I00iOIl = str2;
/* 368 */               o1i1O01OI1.I00iiI = map3;
/* 370 */               o1i1O01OI1.I00iiO = map4;
/* 372 */               o1i1O01OI1.I00iio = iOIo001i1o;
/* 374 */               o1i1O01OI1.I00io1l = 2;
/* 376 */               iOIo001i1o.getClass();
/* 383 */               if (IOIo001i1o.I000OOo1O(iOIo001i1o, ii10ioolOI, o1i1O01OI1) != ii0111o) {
/* 386 */                   iOIo001i1o3 = iOIo001i1o;
/* 387 */                   o1i1O01OI1.I00iOIl = str2;
/* 389 */                   o1i1O01OI1.I00iiI = map3;
/* 391 */                   o1i1O01OI1.I00iiO = map4;
/* 393 */                   o1i1O01OI1.I00iio = iOIo001i1o3;
/* 395 */                   o1i1O01OI1.I00io1l = 3;
/* 397 */                   int i3 = IOIo001i1o.I0010I0i;
/* 401 */                   O10li0l0 o10li0l0 = new O10li0l0();
/* 404 */                   o10li0l0.I00000oIO = null;
/* 408 */                   o10li0l0.I00000oOI = O1llOIO.I00oO101o;
/* 410 */                   VarHandle.storeStoreFence();
/* 413 */                   objI00000oIO = iOIo001i1o3.I000II(o10li0l0, o1i1O01OI1);
/* 417 */                   if (objI00000oIO != ii0111o) {
                            }
                        }
/* 419 */               return ii0111o;
                    }
/* 42 */            if (i2 != 1) {
/* 44 */                if (i2 == 2) {
/* 65 */                    iOIo001i1o3 = o1i1O01OI1.I00iio;
/* 67 */                    Map map7 = o1i1O01OI1.I00iiO;
/* 69 */                    Map map8 = o1i1O01OI1.I00iiI;
/* 71 */                    String str3 = o1i1O01OI1.I00iOIl;
/* 73 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 76 */                    map3 = map8;
/* 77 */                    str2 = str3;
/* 78 */                    map4 = map7;
/* 387 */                   o1i1O01OI1.I00iOIl = str2;
/* 389 */                   o1i1O01OI1.I00iiI = map3;
/* 391 */                   o1i1O01OI1.I00iiO = map4;
/* 393 */                   o1i1O01OI1.I00iio = iOIo001i1o3;
/* 395 */                   o1i1O01OI1.I00io1l = 3;
/* 397 */                   int i32 = IOIo001i1o.I0010I0i;
/* 401 */                   O10li0l0 o10li0l02 = new O10li0l0();
/* 404 */                   o10li0l02.I00000oIO = null;
/* 408 */                   o10li0l02.I00000oOI = O1llOIO.I00oO101o;
/* 410 */                   VarHandle.storeStoreFence();
/* 413 */                   objI00000oIO = iOIo001i1o3.I000II(o10li0l02, o1i1O01OI1);
/* 417 */                   if (objI00000oIO != ii0111o) {
/* 420 */                       map5 = map4;
/* 421 */                       map6 = map3;
/* 424 */                       iterable = ((O10lioIi) objI00000oIO).I00000oIO;
/* 426 */                       if (iterable == null) {
                                }
/* 430 */                       Iterable<Oo1O11IOO0i> iterable2 = iterable;
/* 440 */                       ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable2, 10));
/* 451 */                       while (r1.hasNext()) {
                                }
/* 627 */                       arrayList.size();
/* 654 */                       IOOi0Ool1i.I00IlilI0i0i(arrayList, null, null, null, new O0o01OIl(16), 31);
/* 661 */                       return new OIoi0IIoi(iOIo001i1o3, arrayList);
                            }
/* 419 */                   return ii0111o;
                        }
/* 46 */                if (i2 != 3) {
/* 61 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                    return null;
                        }
/* 48 */                iOIo001i1o3 = o1i1O01OI1.I00iio;
/* 50 */                map5 = o1i1O01OI1.I00iiO;
/* 52 */                map6 = o1i1O01OI1.I00iiI;
/* 54 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 424 */               iterable = ((O10lioIi) objI00000oIO).I00000oIO;
/* 426 */               if (iterable == null) {
/* 428 */                   iterable = Il01100l.I00iOIl;
                        }
/* 430 */               Iterable<Oo1O11IOO0i> iterable22 = iterable;
/* 440 */               ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(iterable22, 10));
/* 451 */               for (Oo1O11IOO0i oo1O11IOO0i : iterable22) {
/* 476 */                   boolean zBooleanValue = (map6 == null || (bool2 = (Boolean) map6.get(oo1O11IOO0i.I00000oIO)) == null) ? true : bool2.booleanValue();
/* 494 */                   boolean zBooleanValue2 = (map5 == null || (bool = (Boolean) map5.get(oo1O11IOO0i.I00000oIO)) == null) ? false : bool.booleanValue();
/* 499 */                   String strValueOf = String.valueOf(oo1O11IOO0i.I00000oOI.I00000oIO);
/* 505 */                   List list = oo1O11IOO0i.I00000oOI.I00000oOI;
/* 550 */                   String strI001IO000 = Oi010OO0.I001IO000("{\"type\":\"object\",\"properties\":", strValueOf, ",\"required\":", list != null ? IOOi0Ool1i.I00IlilI0i0i(list, null, "[", "]", new O0o01OIl(15), 25) : "[]", "}");
/* 554 */                   O1i1oiOO0O o1i1oiOO0OI001i1O0Ol = O1iI0OiI.I001i1O0Ol();
/* 558 */                   String str4 = oo1O11IOO0i.I00000oIO;
/* 560 */                   o1i1oiOO0OI001i1O0Ol.I0000O();
/* 567 */                   ((O1iI0OiI) o1i1oiOO0OI001i1O0Ol.I00iiI).I001lllioOl(str4);
/* 570 */                   String str5 = oo1O11IOO0i.I0000Il00O;
/* 572 */                   if (str5 == null) {
/* 574 */                       str5 = "";
                            }
/* 576 */                   o1i1oiOO0OI001i1O0Ol.I0000O();
/* 583 */                   ((O1iI0OiI) o1i1oiOO0OI001i1O0Ol.I00iiI).I001iOo1i0O(str5);
/* 586 */                   o1i1oiOO0OI001i1O0Ol.I0000O();
/* 593 */                   ((O1iI0OiI) o1i1oiOO0OI001i1O0Ol.I00iiI).I001lIiIIo1O(strI001IO000);
/* 596 */                   o1i1oiOO0OI001i1O0Ol.I0000O();
/* 603 */                   ((O1iI0OiI) o1i1oiOO0OI001i1O0Ol.I00iiI).I001l0I00(zBooleanValue);
/* 606 */                   o1i1oiOO0OI001i1O0Ol.I0000O();
/* 613 */                   ((O1iI0OiI) o1i1oiOO0OI001i1O0Ol.I00iiI).I001i1lo1io(zBooleanValue2);
/* 622 */                   arrayList2.add((O1iI0OiI) o1i1oiOO0OI001i1O0Ol.I00000oOI());
                        }
/* 627 */               arrayList2.size();
/* 654 */               IOOi0Ool1i.I00IlilI0i0i(arrayList2, null, null, null, new O0o01OIl(16), 31);
/* 661 */               return new OIoi0IIoi(iOIo001i1o3, arrayList2);
                    }
/* 81 */            iOIo001i1o2 = o1i1O01OI1.I00iio;
/* 83 */            map4 = o1i1O01OI1.I00iiO;
/* 85 */            Map map9 = o1i1O01OI1.I00iiI;
/* 87 */            String str6 = o1i1O01OI1.I00iOIl;
/* 89 */            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 94 */            map3 = map9;
/* 95 */            str2 = str6;
/* 309 */           o1i0l0IO0i12 = (O1i0l0IO0i1) ((Ooli101Iii1) objI00000oIO).I00111O().get(str2);
/* 311 */           iOIo001i1o = iOIo001i1o2;
/* 322 */           if (o1i0l0IO0i12 == null) {
                    }
/* 363 */           ii10ioolOI = new Ii10ioolOI(this.I0001Ioi1lo, str2, null, 12);
/* 366 */           o1i1O01OI1.I00iOIl = str2;
/* 368 */           o1i1O01OI1.I00iiI = map3;
/* 370 */           o1i1O01OI1.I00iiO = map4;
/* 372 */           o1i1O01OI1.I00iio = iOIo001i1o;
/* 374 */           o1i1O01OI1.I00io1l = 2;
/* 376 */           iOIo001i1o.getClass();
/* 383 */           if (IOIo001i1o.I000OOo1O(iOIo001i1o, ii10ioolOI, o1i1O01OI1) != ii0111o) {
                    }
/* 419 */           return ii0111o;
                }

                public final void I000OiO(ArrayList arrayList) {
/* 1 */             IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 5 */             IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 18 */            iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new Ii1O001loIoO(this, arrayList, null, 28), 2);
                }

                public final void I000iOII(boolean z) {
                    Object value;
                    O1i1IIoO1IIl o1i1IIoO1IIl;
                    ArrayList arrayList;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 91 */            do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 8 */                 o1i1IIoO1IIl = (O1i1IIoO1IIl) value;
/* 10 */                List<O1i1Ooo0ll> list = o1i1IIoO1IIl.I00000oIO;
/* 22 */                arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 33 */                for (O1i1Ooo0ll o1i1Ooo0ll : list) {
/* 43 */                    if (o1i1Ooo0ll.I0000Il00O == null) {
/* 52 */                        O1i1OO0O10Io o1i1OO0O10Io = (O1i1OO0O10Io) o1i1Ooo0ll.I00000oIO.I00100o1O0lo();
/* 54 */                        o1i1OO0O10Io.I000O01llI0(z);
/* 69 */                        o1i1Ooo0ll = new O1i1Ooo0ll((O1i1OolO) o1i1OO0O10Io.I00000oOI(), o1i1Ooo0ll.I00000oOI, o1i1Ooo0ll.I0000Il00O);
                            }
/* 73 */                    arrayList.add(o1i1Ooo0ll);
                        }
/* 77 */                I000OiO(arrayList);
/* 91 */            } while (!olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO(o1i1IIoO1IIl, arrayList, false, null, 6)));
                }

                public final void I000l1(String str, boolean z) {
                    Object value;
                    O1i1IIoO1IIl o1i1IIoO1IIl;
                    ArrayList arrayList;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000O;
/* 161 */           do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 8 */                 o1i1IIoO1IIl = (O1i1IIoO1IIl) value;
/* 10 */                List<O1i1Ooo0ll> list = o1i1IIoO1IIl.I00000oIO;
/* 22 */                arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 33 */                for (O1i1Ooo0ll o1i1Ooo0ll : list) {
/* 41 */                    O1i1OolO o1i1OolO = o1i1Ooo0ll.I00000oIO;
/* 51 */                    if (O0000Ioio00.I0000O(o1i1OolO.I001i1O0Ol(), str)) {
/* 53 */                        Iool1IOO1o0i iool1IOO1o0iI001IO000 = o1i1OolO.I001IO000();
/* 63 */                        ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(iool1IOO1o0iI001IO000, 10));
/* 66 */                        Iterator<E> it = iool1IOO1o0iI001IO000.iterator();
/* 74 */                        while (it.hasNext()) {
/* 86 */                            O1i1oiOO0O o1i1oiOO0O = (O1i1oiOO0O) ((O1iI0OiI) it.next()).I00100o1O0lo();
/* 88 */                            o1i1oiOO0O.I0000O();
/* 95 */                            ((O1iI0OiI) o1i1oiOO0O.I00iiI).I001l0I00(z);
/* 104 */                           arrayList2.add((O1iI0OiI) o1i1oiOO0O.I00000oOI());
                                }
/* 112 */                       O1i1OO0O10Io o1i1OO0O10Io = (O1i1OO0O10Io) o1i1OolO.I00100o1O0lo();
/* 114 */                       o1i1OO0O10Io.I0000O();
/* 121 */                       ((O1i1OolO) o1i1OO0O10Io.I00iiI).I0010o();
/* 124 */                       o1i1OO0O10Io.I000II(arrayList2);
/* 139 */                       o1i1Ooo0ll = new O1i1Ooo0ll((O1i1OolO) o1i1OO0O10Io.I00000oOI(), o1i1Ooo0ll.I00000oOI, o1i1Ooo0ll.I0000Il00O);
                            }
/* 143 */                   arrayList.add(o1i1Ooo0ll);
                        }
/* 147 */               I000OiO(arrayList);
/* 161 */           } while (!olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO(o1i1IIoO1IIl, arrayList, false, null, 6)));
                }
            }
