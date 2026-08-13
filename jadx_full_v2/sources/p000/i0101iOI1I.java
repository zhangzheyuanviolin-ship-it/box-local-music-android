            package p000;

            import android.content.Context;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.View;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public abstract class i0101iOI1I {
                public static final OI10I1IoI0Ol I00000oIO;

                static {
/* 1 */             long[] jArr = OiO10oio.I00000oIO;
/* 8 */             I00000oIO = new OI10I1IoI0Ol();
                }

                public static final IOl1ool0 I00000oIO(View view) {
/* 4 */             Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
/* 10 */            if (tag instanceof IOl1ool0) {
/* 12 */                return (IOl1ool0) tag;
                    }
/* 15 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final OOloolilI11i I00000oOI(View view) {
                    Ii00l101O ii00l101O;
                    I101iI1i i101iI1i;
/* 5 */             if (!view.isAttachedToWindow()) {
/* 26 */                IolioOO1.I0000Il00O("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
                    }
/* 29 */            Object objI00000oIO = li1l0O0Oil.I00000oIO(view);
/* 35 */            while (objI00000oIO instanceof View) {
/* 37 */                View view2 = (View) objI00000oIO;
/* 46 */                if (view2.getId() == 16908290) {
                            break;
                        }
/* 49 */                objI00000oIO = view2.getParent();
/* 55 */                view = view2;
                    }
/* 57 */            IOl1ool0 iOl1ool0I00000oIO = I00000oIO(view);
/* 61 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 62 */            if (iOl1ool0I00000oIO != null) {
/* 617 */               if (iOl1ool0I00000oIO instanceof OOloolilI11i) {
/* 619 */                   return (OOloolilI11i) iOl1ool0I00000oIO;
                        }
/* 624 */               I000II.I001IO000("root viewTreeParentCompositionContext is not a Recomposer");
/* 61 */                return null;
                    }
/* 72 */            ((i00ol0OIIo) i00ol0iI1IO.I00000oIO.get()).getClass();
/* 75 */            Il00o11 il00o11 = Il00o11.I00iOIl;
/* 77 */            OllO00oiil ollO00oiil = I101OO01.I00ll1;
/* 87 */            if (Looper.myLooper() == Looper.getMainLooper()) {
/* 95 */                ii00l101O = (Ii00l101O) I101OO01.I00ll1.getValue();
                    } else {
/* 104 */               ii00l101O = (Ii00l101O) I101OO01.I00lli11.get();
/* 106 */               if (ii00l101O == null) {
/* 611 */                   I000II.I001IO000("no AndroidUiDispatcher for this thread");
/* 61 */                    return null;
                        }
                    }
/* 108 */           Ii00l101O ii00l101OI00ioIO = ii00l101O.I00ioIO(il00o11);
/* 118 */           I101iI1i i101iI1i2 = (I101iI1i) ii00l101OI00ioIO.I00lli11(loilIl10Ii.I00ilI0I1);
/* 120 */           int i = 2;
/* 121 */           boolean z = false;
/* 123 */           if (i101iI1i2 != null) {
/* 127 */               I101iI1i i101iI1i3 = new I101iI1i(2);
/* 130 */               i101iI1i3.I00iiI = i101iI1i2;
/* 134 */               I1ii1l10IO i1ii1l10IO = new I1ii1l10IO();
/* 139 */               Object obj = new Object();
/* 142 */               i1ii1l10IO.I00000oOI = obj;
/* 149 */               i1ii1l10IO.I0000Il00O = new ArrayList();
/* 156 */               i1ii1l10IO.I0000O = new ArrayList();
/* 158 */               i1ii1l10IO.I00000oIO = true;
/* 160 */               VarHandle.storeStoreFence();
/* 163 */               i101iI1i3.I00iiO = i1ii1l10IO;
/* 165 */               VarHandle.storeStoreFence();
                        synchronized (obj) {
/* 169 */                   i1ii1l10IO.I00000oIO = false;
                            i101iI1i = i101iI1i3;
                        }
                    } else {
/* 176 */               i101iI1i = 0;
                    }
/* 179 */           OOo0ooi oOo0ooi = new OOo0ooi();
/* 188 */           OI01II0li oI01II0li = (OI01II0li) ii00l101OI00ioIO.I00lli11(lolIo0.I00ilO0);
                    OI01II0li oI01II0li2 = oI01II0li;
/* 190 */           if (oI01II0li == null) {
/* 198 */               Context applicationContext = view.getContext().getApplicationContext();
/* 202 */               OI01Ilio oI01Ilio = new OI01Ilio();
/* 205 */               oI01Ilio.I00iOIl = applicationContext;
/* 214 */               oI01Ilio.I00iiO = new OIooO1iiliI(1.0f);
/* 216 */               VarHandle.storeStoreFence();
/* 219 */               oOo0ooi.I00iOIl = oI01Ilio;
                        oI01II0li2 = oI01Ilio;
                    }
/* 221 */           if (i101iI1i != 0) {
/* 223 */               il00o11 = i101iI1i;
                    }
/* 228 */           Ii00l101O ii00l101OI00ioIO2 = ii00l101OI00ioIO.I00ioIO(il00o11).I00ioIO(oI01II0li2);
/* 234 */           OOloolilI11i oOloolilI11i = new OOloolilI11i();
/* 241 */           OOlol1ilOllO oOlol1ilOllO = new OOlol1ilOllO(0);
/* 244 */           oOlol1ilOllO.I00iiI = oOloolilI11i;
/* 246 */           VarHandle.storeStoreFence();
/* 249 */           I101iI1i i101iI1i4 = new I101iI1i(1);
/* 252 */           i101iI1i4.I00iiI = oOlol1ilOllO;
/* 259 */           i101iI1i4.I00iiO = new I1ii1o0(2);
/* 261 */           VarHandle.storeStoreFence();
/* 264 */           oOloolilI11i.I00000oIO = i101iI1i4;
/* 270 */           OOlol1ilOllO oOlol1ilOllO2 = new OOlol1ilOllO(1);
/* 273 */           oOlol1ilOllO2.I00iiI = oOloolilI11i;
/* 275 */           VarHandle.storeStoreFence();
/* 280 */           IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(20, z);
/* 288 */           ioIlOo1o0IIl.I00iiI = new I1Ooo1ii0l(0);
/* 295 */           ioIlOo1o0IIl.I00iiO = new I1ii1o0(2);
/* 301 */           O1l110o o1l110o = new O1l110o(9);
/* 304 */           o1l110o.I00iiI = ioIlOo1o0IIl;
/* 306 */           o1l110o.I00iiO = oOlol1ilOllO2;
/* 308 */           VarHandle.storeStoreFence();
/* 311 */           ioIlOo1o0IIl.I00iio = o1l110o;
/* 313 */           VarHandle.storeStoreFence();
/* 316 */           oOloolilI11i.I00000oOI = ioIlOo1o0IIl;
/* 320 */           Object obj2 = new Object();
/* 323 */           oOloolilI11i.I0000Il00O = obj2;
/* 330 */           oOloolilI11i.I0001Ioi1lo = new ArrayList();
/* 337 */           oOloolilI11i.I000O01llI0 = new OI10IIO();
/* 348 */           oOloolilI11i.I000OOo1O = new OI110O0(new IOlIOiI0iiI1[16]);
/* 355 */           oOloolilI11i.I000OiO = new ArrayList();
/* 362 */           oOloolilI11i.I000iOII = new ArrayList();
/* 369 */           oOloolilI11i.I000l1 = new OI10I1IoI0Ol();
/* 375 */           IIlio101Io iIlio101Io = new IIlio101Io(19);
/* 383 */           iIlio101Io.I00iiI = new OI10I1IoI0Ol();
/* 390 */           iIlio101Io.I00iiO = new OI10I1IoI0Ol();
/* 392 */           VarHandle.storeStoreFence();
/* 395 */           oOloolilI11i.I000lI = iIlio101Io;
/* 402 */           oOloolilI11i.I000o00OoI0I = new OI10I1IoI0Ol();
/* 409 */           oOloolilI11i.I000oI1ioi = new OI10I1IoI0Ol();
/* 415 */           oOloolilI11i.I0010o = OlO0iOl0il.I00000oIO(null);
/* 423 */           oOloolilI11i.I001IIilI0O = OlO0iOl0il.I00000oIO(OOloloOII0ol.I00iiO);
/* 430 */           oOloolilI11i.I001IO000 = new IOO000ilo();
/* 442 */           O010loOOi0Oo o010loOOi0Oo = new O010loOOi0Oo((O010OIi) ii00l101OI00ioIO2.I00lli11(Iioi0lilII.I00iio));
/* 447 */           int i2 = 14;
/* 449 */           OIoO1Ol oIoO1Ol = new OIoO1Ol(i2);
/* 452 */           oIoO1Ol.I00iiI = oOloolilI11i;
/* 454 */           VarHandle.storeStoreFence();
/* 457 */           o010loOOi0Oo.I00iiI(oIoO1Ol);
/* 460 */           oOloolilI11i.I001i1O0Ol = o010loOOi0Oo;
/* 470 */           oOloolilI11i.I001i1lo1io = ii00l101OI00ioIO2.I00ioIO(i101iI1i4).I00ioIO(o010loOOi0Oo);
/* 477 */           oOloolilI11i.I001iOo1i0O = new l1I0oI(14);
/* 479 */           VarHandle.storeStoreFence();
                    synchronized (obj2) {
/* 483 */               oOloolilI11i.I00111O = true;
                    }
/* 486 */           IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO(ii00l101OI00ioIO2);
/* 490 */           O0oiOi o0oiOiI00000oIO = li1lOloO.I00000oIO(view);
/* 501 */           I01O1lIi i01O1lIiI000iOII = o0oiOiI00000oIO != null ? o0oiOiI00000oIO.I000iOII() : null;
/* 502 */           if (i01O1lIiI000iOII == null) {
/* 599 */               IolioOO1.I0000O("ViewTreeLifecycleOwner not found from " + view);
/* 602 */               IOOlIIilOl0.I0000Il00O();
/* 61 */                return null;
                    }
/* 506 */           Ill0oo1l1 ill0oo1l1 = new Ill0oo1l1(i);
/* 509 */           ill0oo1l1.I00iiI = view;
/* 511 */           ill0oo1l1.I00iiO = oOloolilI11i;
/* 513 */           VarHandle.storeStoreFence();
/* 516 */           view.addOnAttachStateChangeListener(ill0oo1l1);
/* 521 */           i00oo10 i00oo10Var = new i00oo10();
/* 524 */           i00oo10Var.I00iOIl = iIOlO1iiI00000oIO;
/* 526 */           i00oo10Var.I00iiI = i101iI1i;
/* 528 */           i00oo10Var.I00iiO = oOloolilI11i;
/* 530 */           i00oo10Var.I00iio = oOo0ooi;
/* 532 */           VarHandle.storeStoreFence();
/* 535 */           i01O1lIiI000iOII.I00li1OI(i00oo10Var);
/* 541 */           view.setTag(R.id.androidx_compose_ui_view_composition_context, oOloolilI11i);
/* 544 */           Io0IoOIl1o io0IoOIl1o = Io0IoOIl1o.I00iOIl;
/* 546 */           Handler handler = view.getHandler();
/* 552 */           int i3 = Io11lOo1OOi.I00000oIO;
/* 566 */           OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(io0IoOIl1o, new Io11l1li(handler, "windowRecomposer cleanup", false).I00ilI0I1, null, new Ol110ii1I(oOloolilI11i, view, iOoil1iiIilo, i2), 2);
/* 573 */           I0oIl0io0II1 i0oIl0io0II1 = new I0oIl0io0II1(5);
/* 576 */           i0oIl0io0II1.I00iiI = olIl0iI0000O;
/* 578 */           VarHandle.storeStoreFence();
/* 581 */           view.addOnAttachStateChangeListener(i0oIl0io0II1);
/* 584 */           return oOloolilI11i;
                }
            }
