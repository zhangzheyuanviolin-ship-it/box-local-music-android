            package p000;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.util.Log;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.accessibility.AccessibilityManager;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class IOl10lI1 {
                public final View I00000oIO;
                public boolean I00000oOI;
                public IOl1ool0 I0000Il00O;
                public O0oiOi I0000O;
                public OiIoOoIi01 I0000oI00;
                public Oool1Ii0I I0001Ioi1lo;
                public final IoiiIlOoiOo I000II;
                public final Oi0lI0 I000O01llI0;
                public final Configuration I000OOo1O;
                public final OI10i0Il I000OiO;
                public final I0lI110O1li I000iOII;
                public final I101liloIo1 I000l1;
                public final I0lOl0I0 I000lI;
                public final IOO0IOIll I000o00OoI0I;
                public final IliIlo I000oI1ioi;
                public final OI10i0Il I00100l0;
                public final Io1I0l I00100o1O0lo;
                public final I101olIil0oI I0010I0i;
                public final O0iiliOio I0010o;
                public final O0oI1IIioO0 I00111O;
                public final IIoll1I0 I001IIilI0O;
                public int I001IO000;
                public final I0OIOO00l0O I001i1O0Ol;
                public I1001Iilo I001i1lo1io;
                public final IOl1001oO1OI I001iOo1i0O;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v29, types: [Io1I0l] */
                public IOl10lI1(IOl10lI1 iOl10lI1, View view, IOl1ool0 iOl1ool0, O0oiOi o0oiOi, OiIoOoIi01 oiIoOoIi01, Oool1Ii0I oool1Ii0I) {
                    IoiiIlOoiOo ioiiIlOoiOo;
                    Oi0lI0 oi0lI0;
                    I0lI110O1li i0lI110O1li;
                    I101liloIo1 i101liloIo1;
                    I0lOl0I0 i0lOl0I0;
                    IOO0IOIll iOO0IOIll;
                    IliIlo liiooiio1oi;
                    OO1IIll00O oO1IIll00O;
                    I101olIil0oI i101olIil0oI;
                    O0iiliOio o0iiliOio;
                    IIoll1I0 iIoll1I0;
                    View view2;
/* 18 */            boolean zI0000O = O0000Ioio00.I0000O((iOl10lI1 == null || (view2 = iOl10lI1.I00000oIO) == null) ? null : view2.getContext(), view.getContext());
/* 25 */            this.I00000oIO = view;
/* 27 */            this.I0000Il00O = iOl1ool0;
/* 29 */            this.I0000O = o0oiOi;
/* 31 */            this.I0000oI00 = oiIoOoIi01;
/* 33 */            this.I0001Ioi1lo = oool1Ii0I;
/* 35 */            if (zI0000O) {
/* 37 */                ioiiIlOoiOo = iOl10lI1.I000II;
                    } else {
/* 42 */                ioiiIlOoiOo = new IoiiIlOoiOo();
/* 50 */                ioiiIlOoiOo.I00000oIO = new HashMap();
/* 52 */                VarHandle.storeStoreFence();
                    }
/* 55 */            this.I000II = ioiiIlOoiOo;
/* 57 */            if (iOl10lI1 == null || (oi0lI0 = iOl10lI1.I000O01llI0) == null) {
/* 65 */                oi0lI0 = new Oi0lI0();
/* 73 */                oi0lI0.I00000oIO = new OI0l1oli1I();
/* 75 */                VarHandle.storeStoreFence();
                    }
/* 78 */            this.I000O01llI0 = oi0lI0;
/* 99 */            Configuration configuration = zI0000O ? iOl10lI1.I000OOo1O : new Configuration(view.getContext().getResources().getConfiguration());
/* 102 */           this.I000OOo1O = configuration;
/* 118 */           this.I000OiO = zI0000O ? iOl10lI1.I000OiO : lOO00IiI0li.I00000oIO(new Configuration(configuration));
/* 120 */           if (zI0000O) {
/* 122 */               i0lI110O1li = iOl10lI1.I000iOII;
                    } else {
/* 127 */               Context context = view.getContext();
/* 131 */               i0lI110O1li = new I0lI110O1li();
/* 142 */               i0lI110O1li.I00000oIO = (AccessibilityManager) context.getSystemService("accessibility");
/* 144 */               VarHandle.storeStoreFence();
                    }
/* 147 */           this.I000iOII = i0lI110O1li;
/* 149 */           if (zI0000O) {
/* 151 */               i101liloIo1 = iOl10lI1.I000l1;
                    } else {
/* 156 */               Context context2 = view.getContext();
/* 160 */               i101liloIo1 = new I101liloIo1();
/* 163 */               i101liloIo1.I00000oIO = context2;
/* 165 */               VarHandle.storeStoreFence();
                    }
/* 168 */           this.I000l1 = i101liloIo1;
/* 170 */           if (zI0000O) {
/* 172 */               i0lOl0I0 = iOl10lI1.I000lI;
                    } else {
/* 177 */               Context context3 = view.getContext();
/* 181 */               i0lOl0I0 = new I0lOl0I0();
/* 184 */               i0lOl0I0.I00000oIO = context3;
/* 186 */               VarHandle.storeStoreFence();
                    }
/* 189 */           this.I000lI = i0lOl0I0;
/* 191 */           if (zI0000O) {
/* 193 */               iOO0IOIll = iOl10lI1.I000o00OoI0I;
                    } else {
/* 198 */               I0lOi1li1Ii i0lOi1li1Ii = new I0lOi1li1Ii();
/* 201 */               i0lOi1li1Ii.I00000oIO = i0lOl0I0;
/* 203 */               VarHandle.storeStoreFence();
/* 206 */               iOO0IOIll = i0lOi1li1Ii;
                    }
/* 207 */           this.I000o00OoI0I = iOO0IOIll;
/* 209 */           if (zI0000O) {
/* 211 */               liiooiio1oi = iOl10lI1.I000oI1ioi;
                    } else {
/* 216 */               view.getContext();
/* 221 */               liiooiio1oi = new liIoOiiO1Oi(8);
                    }
/* 224 */           this.I000oI1ioi = liiooiio1oi;
/* 247 */           this.I00100l0 = zI0000O ? iOl10lI1.I00100l0 : new OIooliIO0(iliO1oIl.I00000oIO(view.getContext()), IOO0o0I1l.I00ilI0I1);
/* 253 */           if (view == (iOl10lI1 != null ? iOl10lI1.I00000oIO : null)) {
/* 255 */               oO1IIll00O = iOl10lI1.I00100o1O0lo;
                    } else {
/* 260 */               OO1IIll00O oO1IIll00O2 = new OO1IIll00O();
/* 263 */               oO1IIll00O2.I00000oIO = view;
/* 265 */               VarHandle.storeStoreFence();
                        oO1IIll00O = oO1IIll00O2;
                    }
/* 268 */           this.I00100o1O0lo = oO1IIll00O;
/* 270 */           if (zI0000O) {
/* 272 */               i101olIil0oI = iOl10lI1.I0010I0i;
                    } else {
/* 281 */               ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
/* 285 */               I101olIil0oI i101olIil0oI2 = new I101olIil0oI();
/* 288 */               i101olIil0oI2.I00000oIO = viewConfiguration;
/* 290 */               VarHandle.storeStoreFence();
/* 293 */               i101olIil0oI = i101olIil0oI2;
                    }
/* 294 */           this.I0010I0i = i101olIil0oI;
/* 296 */           if (iOl10lI1 == null || (o0iiliOio = iOl10lI1.I0010o) == null) {
/* 306 */               IIolilIo iIolilIo = new IIolilIo();
/* 309 */               o0iiliOio = new O0iiliOio();
/* 312 */               o0iiliOio.I00iOIl = iIolilIo;
/* 314 */               VarHandle.storeStoreFence();
                    }
/* 317 */           this.I0010o = o0iiliOio;
/* 321 */           O0oI1IIioO0 o0oI1IIioO0 = new O0oI1IIioO0();
/* 330 */           o0oI1IIioO0.I0000Il00O = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 332 */           VarHandle.storeStoreFence();
/* 335 */           this.I00111O = o0oI1IIioO0;
/* 348 */           this.I001IIilI0O = (iOl10lI1 == null || (iIoll1I0 = iOl10lI1.I001IIilI0O) == null) ? new IIoll1I0() : iIoll1I0;
/* 354 */           I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(23);
/* 357 */           i0OIOO00l0O.I00iiI = this;
/* 359 */           VarHandle.storeStoreFence();
/* 362 */           this.I001i1O0Ol = i0OIOO00l0O;
/* 366 */           IOl1001oO1OI iOl1001oO1OI = new IOl1001oO1OI();
/* 369 */           iOl1001oO1OI.I00iOIl = this;
/* 371 */           VarHandle.storeStoreFence();
/* 374 */           this.I001iOo1i0O = iOl1001oO1OI;
                }

                public final void I00000oIO(I0lio1O01i01 i0lio1O01i01, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
/* 12 */            iloI0lOlll1.I00i0O(123858079);
/* 50 */            int i2 = i | (iloI0lOlll1.I000OOo1O(i0lio1O01i01) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16) | (iloI0lOlll1.I000OOo1O(this) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 55 */            int i3 = 0;
/* 67 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 72 */                Object tag = i0lio1O01i01.getTag(R.id.inspection_slot_table_set);
/* 78 */                Set set = null;
/* 92 */                Set set2 = (!(tag instanceof Set) || ((tag instanceof O0IlIoi) && !(tag instanceof O0Io11IiO0l))) ? null : (Set) tag;
/* 93 */                if (set2 == null) {
/* 95 */                    Object parent = i0lio1O01i01.getParent();
/* 106 */                   View view = parent instanceof View ? (View) parent : null;
/* 114 */                   Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
/* 117 */                   if ((tag2 instanceof Set) && (!(tag2 instanceof O0IlIoi) || (tag2 instanceof O0Io11IiO0l))) {
/* 128 */                       set = (Set) tag2;
                            }
                        } else {
/* 131 */                   set = set2;
                        }
/* 132 */               if (set != null) {
/* 138 */                   set.add(iloI0lOlll1.I001l0I00());
/* 141 */                   iloI0lOlll1.I00100o1O0lo = true;
/* 143 */                   iloI0lOlll1.I001lloI = true;
/* 147 */                   iloI0lOlll1.I0000Il00O.I0000O();
/* 152 */                   iloI0lOlll1.I00IOO.I0000O();
/* 155 */                   Ol11il011o0 ol11il011o0 = iloI0lOlll1.I00IioO0OiOi;
/* 157 */                   Ol11i0000Oo ol11i0000Oo = ol11il011o0.I00000oIO;
/* 161 */                   ol11il011o0.I0000oI00 = ol11i0000Oo.I00l0OO0IO;
/* 165 */                   ol11il011o0.I0001Ioi1lo = ol11i0000Oo.I00li1OI;
                        }
/* 171 */               boolean zI000II = iloI0lOlll1.I000II(i0lio1O01i01.getView());
/* 175 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 179 */               Object obj = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 181 */               if (zI000II || objI00O0i0ii == obj) {
/* 187 */                   View view2 = i0lio1O01i01.getView();
/* 191 */                   OoollliO110 ooollliO110 = new OoollliO110();
/* 194 */                   ooollliO110.I00000oIO = view2;
/* 196 */                   VarHandle.storeStoreFence();
/* 199 */                   iloI0lOlll1.I00iio(ooollliO110);
                            obj2 = ooollliO110;
                        }
/* 202 */               OoollliO110 ooollliO1102 = (OoollliO110) obj2;
/* 204 */               OlO1iIi1ol0 olO1iIi1ol0 = O11looOii.I00000oIO;
/* 206 */               I0000oI00();
/* 211 */               OOiIo1lll oOiIo1lllI00000oIO = olO1iIi1ol0.I00000oIO(this.I0000O);
/* 215 */               OOiIOoiOO oOiIOoiOO = O11oI0.I00000oIO;
/* 217 */               I0000oI00();
/* 222 */               OOiIo1lll oOiIo1lllI00000oIO2 = oOiIOoiOO.I00000oIO(this.I0000oI00);
/* 230 */               OOiIo1lll oOiIo1lllI00000oIO3 = I0lloOI0oio.I0000O.I00000oIO(this.I000II);
/* 238 */               OOiIo1lll oOiIo1lllI00000oIO4 = I0lloOI0oio.I0000oI00.I00000oIO(this.I000O01llI0);
/* 242 */               OlO1iIi1ol0 olO1iIi1ol02 = IOlO0o100i1i.I001IO000;
/* 244 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(this);
/* 248 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii2;
/* 252 */               if (zI000OOo1O || objI00O0i0ii2 == obj) {
/* 260 */                   IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(25);
/* 263 */                   iIOIlOoI111.I00iiI = this;
/* 265 */                   VarHandle.storeStoreFence();
/* 268 */                   iloI0lOlll1.I00iio(iIOIlOoI111);
                            obj3 = iIOIlOoI111;
                        }
/* 273 */               OOiIo1lll oOiIo1lllI0000Il00O = olO1iIi1ol02.I0000Il00O((Function1) obj3);
/* 283 */               OOiIo1lll oOiIo1lllI00000oIO5 = I0lloOI0oio.I00000oOI.I00000oIO(i0lio1O01i01.getContext());
/* 289 */               OOiIo1lll oOiIo1lllI00000oIO6 = Ioo1OOo0Ol10.I00000oIO.I00000oIO(set);
/* 299 */               OOiIo1lll oOiIo1lllI00000oIO7 = I0lloOI0oio.I00000oIO.I00000oIO(i0lio1O01i01.getConfiguration());
/* 303 */               OlO1iIi1ol0 olO1iIi1ol03 = OiIl0oI.I00000oIO;
/* 305 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(i0lio1O01i01);
/* 309 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii3;
/* 313 */               if (zI000OOo1O2 || objI00O0i0ii3 == obj) {
/* 320 */                   I0lOl1 i0lOl1 = new I0lOl1(3);
/* 323 */                   i0lOl1.I00iiI = i0lio1O01i01;
/* 325 */                   VarHandle.storeStoreFence();
/* 328 */                   iloI0lOlll1.I00iio(i0lOl1);
                            obj4 = i0lOl1;
                        }
/* 333 */               OOiIo1lll oOiIo1lllI0000Il00O2 = olO1iIi1ol03.I0000Il00O((Function1) obj4);
/* 343 */               OOiIo1lll oOiIo1lllI00000oIO8 = I0lloOI0oio.I0001Ioi1lo.I00000oIO(i0lio1O01i01.getView());
/* 347 */               IOlO1IilOlOl iOlO1IilOlOl = IOlO0o100i1i.I001i1lo1io;
/* 349 */               boolean zI000OOo1O3 = iloI0lOlll1.I000OOo1O(i0lio1O01i01);
/* 353 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii4;
/* 357 */               if (zI000OOo1O3 || objI00O0i0ii4 == obj) {
/* 363 */                   I0lOl1 i0lOl12 = new I0lOl1(4);
/* 366 */                   i0lOl12.I00iiI = i0lio1O01i01;
/* 368 */                   VarHandle.storeStoreFence();
/* 371 */                   iloI0lOlll1.I00iio(i0lOl12);
                            obj5 = i0lOl12;
                        }
/* 396 */               OOiIo1lll[] oOiIo1lllArr = {oOiIo1lllI00000oIO, oOiIo1lllI00000oIO2, oOiIo1lllI00000oIO3, oOiIo1lllI00000oIO4, oOiIo1lllI0000Il00O, oOiIo1lllI00000oIO5, oOiIo1lllI00000oIO6, oOiIo1lllI00000oIO7, oOiIo1lllI0000Il00O2, oOiIo1lllI00000oIO8, iOlO1IilOlOl.I0000Il00O((Function1) obj5), IOlO0o100i1i.I00111O.I00000oIO(i0lio1O01i01.getViewConfiguration()), IoI1OoO0.I00000oIO.I00000oIO(ooollliO1102)};
/* 402 */               IOl1001O1 iOl1001O1 = new IOl1001O1(i3);
/* 405 */               iOl1001O1.I00iiO = i0lio1O01i01;
/* 407 */               iOl1001O1.I00iiI = this;
/* 409 */               iOl1001O1.I00iio = illiIl1l11O;
/* 411 */               VarHandle.storeStoreFence();
/* 423 */               iiliio0o.I00000oOI(oOiIo1lllArr, iiioOl1O.I00000oOI(1317454175, iOl1001O1, iloI0lOlll1), iloI0lOlll1, 56);
                    } else {
/* 427 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 430 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 434 */           if (oOloioIlI001IO000 != null) {
/* 439 */               IOl1001O1 iOl1001O12 = new IOl1001O1(1);
/* 442 */               iOl1001O12.I00iiI = this;
/* 444 */               iOl1001O12.I00iiO = i0lio1O01i01;
/* 446 */               iOl1001O12.I00iio = illiIl1l11O;
/* 448 */               VarHandle.storeStoreFence();
/* 451 */               oOloioIlI001IO000.I0000O = iOl1001O12;
                    }
                }

                public final void I00000oOI() {
                    int i = this.I001IO000 - 1;
/* 5 */             this.I001IO000 = i;
/* 7 */             if (i < 0) {
/* 13 */                Log.e("ComposeViewContext", "View count has dropped below 0");
/* 16 */                i = 0;
/* 17 */                this.I001IO000 = 0;
                    }
/* 19 */            if (i == 0) {
/* 21 */                View view = this.I00000oIO;
/* 23 */                Context context = view.getContext();
/* 27 */                IOl1001oO1OI iOl1001oO1OI = this.I001iOo1i0O;
/* 29 */                context.unregisterComponentCallbacks(iOl1001oO1OI);
/* 32 */                O0oI1IIioO0 o0oI1IIioO0 = this.I00111O;
/* 36 */                if (o0oI1IIioO0.I00000oOI == null) {
/* 39 */                    o0oI1IIioO0.I00000oIO = null;
                        }
/* 45 */                view.getViewTreeObserver().removeOnWindowFocusChangeListener(iOl1001oO1OI);
                    }
                }

                public final void I0000Il00O() {
/* 4 */             int i = this.I001IO000 + 1;
/* 5 */             this.I001IO000 = i;
/* 7 */             if (i == 1) {
/* 9 */                 View view = this.I00000oIO;
/* 11 */                Context context = view.getContext();
/* 15 */                IOl1001oO1OI iOl1001oO1OI = this.I001iOo1i0O;
/* 17 */                context.registerComponentCallbacks(iOl1001oO1OI);
/* 28 */                I0000O(view.getResources().getConfiguration());
/* 31 */                boolean zHasWindowFocus = view.hasWindowFocus();
/* 35 */                O0oI1IIioO0 o0oI1IIioO0 = this.I00111O;
/* 43 */                o0oI1IIioO0.I0000Il00O.setValue(Boolean.valueOf(zHasWindowFocus));
/* 46 */                OIooliIO0 oIooliIO0 = o0oI1IIioO0.I00000oOI;
/* 48 */                I0OIOO00l0O i0OIOO00l0O = this.I001i1O0Ol;
/* 50 */                if (oIooliIO0 == null) {
/* 52 */                    o0oI1IIioO0.I00000oIO = i0OIOO00l0O;
                        }
/* 54 */                if (oIooliIO0 != null) {
/* 60 */                    oIooliIO0.setValue(i0OIOO00l0O.invoke());
                        }
/* 67 */                view.getViewTreeObserver().addOnWindowFocusChangeListener(iOl1001oO1OI);
                    }
                }

                public final void I0000O(Configuration configuration) {
/* 3 */             int iUpdateFrom = this.I000OOo1O.updateFrom(configuration);
/* 7 */             if (iUpdateFrom != 0) {
/* 17 */                Iterator it = this.I000II.I00000oIO.entrySet().iterator();
/* 25 */                while (it.hasNext()) {
/* 43 */                    IoiOoolI ioiOoolI = (IoiOoolI) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
/* 45 */                    if (ioiOoolI == null || Configuration.needNewResources(iUpdateFrom, ioiOoolI.I00000oOI)) {
/* 55 */                        it.remove();
                            }
                        }
/* 66 */                this.I000OiO.setValue(new Configuration(configuration));
/* 69 */                Oi0lI0 oi0lI0 = this.I000O01llI0;
                        synchronized (oi0lI0) {
/* 74 */                    oi0lI0.I00000oIO.I0000Il00O();
                        }
/* 81 */                if ((268435456 & iUpdateFrom) != 0) {
/* 95 */                    this.I00100l0.setValue(iliO1oIl.I00000oIO(this.I00000oIO.getContext()));
                        }
/* 102 */               if ((805248384 & iUpdateFrom) != 0) {
/* 104 */                   O0oI1IIioO0 o0oI1IIioO0 = this.I00111O;
/* 106 */                   I0OIOO00l0O i0OIOO00l0O = this.I001i1O0Ol;
/* 108 */                   OIooliIO0 oIooliIO0 = o0oI1IIioO0.I00000oOI;
/* 110 */                   if (oIooliIO0 != null) {
/* 116 */                       oIooliIO0.setValue(i0OIOO00l0O.invoke());
                            }
                        }
                    }
                }

                public final void I0000oI00() {
/* 3 */             if (this.I00000oOI) {
/* 110 */               return;
                    }
/* 6 */             this.I00000oOI = true;
/* 8 */             IOl1ool0 iOl1ool0 = this.I0000Il00O;
/* 10 */            View view = this.I00000oIO;
/* 12 */            if (iOl1ool0 == null) {
/* 14 */                IOl1ool0 iOl1ool0I00000oIO = i0101iOI1I.I00000oIO(view);
/* 18 */                if (iOl1ool0I00000oIO == null) {
/* 21 */                    Object parent = view.getParent();
/* 25 */                    while (iOl1ool0I00000oIO == null && (parent instanceof View)) {
/* 31 */                        View view2 = (View) parent;
/* 33 */                        iOl1ool0I00000oIO = i0101iOI1I.I00000oIO(view2);
/* 37 */                        parent = li1l0O0Oil.I00000oIO(view2);
                            }
                        }
/* 42 */                if (iOl1ool0I00000oIO == null) {
/* 44 */                    iOl1ool0I00000oIO = i0101iOI1I.I00000oOI(view);
                        }
/* 48 */                this.I0000Il00O = iOl1ool0I00000oIO;
                    }
/* 52 */            if (this.I0000O == null) {
/* 54 */                O0oiOi o0oiOiI00000oIO = li1lOloO.I00000oIO(view);
/* 58 */                if (o0oiOiI00000oIO == null) {
/* 65 */                    I000II.I001IO000("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
/* 68 */                    return;
                        }
/* 60 */                this.I0000O = o0oiOiI00000oIO;
                    }
/* 71 */            if (this.I0000oI00 == null) {
/* 73 */                OiIoOoIi01 oiIoOoIi01I00000oIO = li1lOolIO.I00000oIO(view);
/* 77 */                if (oiIoOoIi01I00000oIO == null) {
/* 84 */                    I000II.I001IO000("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
/* 87 */                    return;
                        }
/* 79 */                this.I0000oI00 = oiIoOoIi01I00000oIO;
                    }
/* 90 */            if (this.I0001Ioi1lo == null) {
/* 96 */                this.I0001Ioi1lo = li1li1Ol11Io.I00000oIO(view);
                    }
                }
            }
