            package p000;

            import android.graphics.Path;
            import android.view.View;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.WeakHashMap;
            
            public final class i00lIlOOll0 {
                public static final WeakHashMap I001i1O0Ol = new WeakHashMap();
                public final I10OOlO I00000oIO;
                public final I10OOlO I00000oOI;
                public final I10OOlO I0000Il00O;
                public final I10OOlO I0000O;
                public final I10OOlO I0000oI00;
                public final I10OOlO I0001Ioi1lo;
                public final I10OOlO I000II;
                public final I10OOlO I000O01llI0;
                public final I10OOlO I000OOo1O;
                public final OololIOo I000OiO;
                public final OIooliIO0 I000iOII;
                public final OoiIOi11I I000l1;
                public final OololIOo I000lI;
                public final OololIOo I000o00OoI0I;
                public final OololIOo I000oI1ioi;
                public final OololIOo I00100l0;
                public final OololIOo I00100o1O0lo;
                public final OololIOo I0010I0i;
                public final OololIOo I0010o;
                public final boolean I00111O;
                public int I001IIilI0O;
                public final Ioo0oiliOI I001IO000;

                /* JADX WARN: Multi-variable type inference failed */
                public i00lIlOOll0(View view) {
/* 9 */             I10OOlO i10OOlOI0000Il00O = liIIiol0oI10.I0000Il00O(4, "captionBar");
/* 13 */            this.I00000oIO = i10OOlOI0000Il00O;
/* 19 */            I10OOlO i10OOlOI0000Il00O2 = liIIiol0oI10.I0000Il00O(Barcode.FORMAT_ITF, "displayCutout");
/* 23 */            this.I00000oOI = i10OOlOI0000Il00O2;
/* 29 */            I10OOlO i10OOlOI0000Il00O3 = liIIiol0oI10.I0000Il00O(8, "ime");
/* 33 */            this.I0000Il00O = i10OOlOI0000Il00O3;
/* 39 */            I10OOlO i10OOlOI0000Il00O4 = liIIiol0oI10.I0000Il00O(32, "mandatorySystemGestures");
/* 43 */            this.I0000O = i10OOlOI0000Il00O4;
/* 48 */            I10OOlO i10OOlOI0000Il00O5 = liIIiol0oI10.I0000Il00O(2, "navigationBars");
/* 52 */            this.I0000oI00 = i10OOlOI0000Il00O5;
/* 57 */            I10OOlO i10OOlOI0000Il00O6 = liIIiol0oI10.I0000Il00O(1, "statusBars");
/* 61 */            this.I0001Ioi1lo = i10OOlOI0000Il00O6;
/* 67 */            I10OOlO i10OOlOI0000Il00O7 = liIIiol0oI10.I0000Il00O(519, "systemBars");
/* 71 */            this.I000II = i10OOlOI0000Il00O7;
/* 77 */            I10OOlO i10OOlOI0000Il00O8 = liIIiol0oI10.I0000Il00O(16, "systemGestures");
/* 81 */            this.I000O01llI0 = i10OOlOI0000Il00O8;
/* 89 */            I10OOlO i10OOlOI0000Il00O9 = liIIiol0oI10.I0000Il00O(64, "tappableElement");
/* 93 */            this.I000OOo1O = i10OOlOI0000Il00O9;
/* 97 */            Ioo0l0I ioo0l0I = Ioo0l0I.I0000oI00;
/* 99 */            OololIOo oololIOoI00000oIO = liIIoi1I0i01.I00000oIO(ioo0l0I, "waterfall");
/* 103 */           this.I000OiO = oololIOoI00000oIO;
/* 111 */           this.I000iOII = lOO00IiI0li.I00000oIO(null);
/* 117 */           OoiIOi11I ooiIOi11II00000oOI = iO1OO0i0i.I00000oOI(iO1OO0i0i.I00000oOI(i10OOlOI0000Il00O7, i10OOlOI0000Il00O3), i10OOlOI0000Il00O2);
/* 121 */           this.I000l1 = ooiIOi11II00000oOI;
/* 135 */           iO1OO0i0i.I00000oOI(ooiIOi11II00000oOI, iO1OO0i0i.I00000oOI(iO1OO0i0i.I00000oOI(iO1OO0i0i.I00000oOI(i10OOlOI0000Il00O9, i10OOlOI0000Il00O4), i10OOlOI0000Il00O8), oololIOoI00000oIO));
/* 144 */           this.I000lI = liIIoi1I0i01.I00000oIO(ioo0l0I, "captionBarIgnoringVisibility");
/* 152 */           this.I000o00OoI0I = liIIoi1I0i01.I00000oIO(ioo0l0I, "navigationBarsIgnoringVisibility");
/* 160 */           this.I000oI1ioi = liIIoi1I0i01.I00000oIO(ioo0l0I, "statusBarsIgnoringVisibility");
/* 168 */           this.I00100l0 = liIIoi1I0i01.I00000oIO(ioo0l0I, "systemBarsIgnoringVisibility");
/* 176 */           this.I00100o1O0lo = liIIoi1I0i01.I00000oIO(ioo0l0I, "tappableElementIgnoringVisibility");
/* 184 */           this.I0010I0i = liIIoi1I0i01.I00000oIO(ioo0l0I, "imeAnimationTarget");
/* 192 */           this.I0010o = liIIoi1I0i01.I00000oIO(ioo0l0I, "imeAnimationSource");
/* 194 */           Object parent = view.getParent();
/* 205 */           View view2 = parent instanceof View ? (View) parent : null;
/* 217 */           Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
/* 225 */           Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
/* 234 */           boolean zBooleanValue = bool != null ? bool.booleanValue() : 0;
/* 235 */           this.I00111O = zBooleanValue;
/* 241 */           Ioo0oiliOI ioo0oiliOI = new Ioo0oiliOI(!zBooleanValue);
/* 244 */           ioo0oiliOI.I00iiI = this;
/* 246 */           VarHandle.storeStoreFence();
/* 249 */           this.I001IO000 = ioo0oiliOI;
/* 251 */           WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 253 */           i00iooo00li i00iooo00liVarI00000oIO = OooiIlOI0.I00000oIO(view);
/* 257 */           if (i00iooo00liVarI00000oIO != null) {
/* 259 */               i00i1I1 i00i1i1 = i00iooo00liVarI00000oIO.I00000oIO;
/* 265 */               i10OOlOI0000Il00O.I0001Ioi1lo(i00i1i1.I001IIilI0O(4));
/* 272 */               i10OOlOI0000Il00O2.I0001Ioi1lo(i00i1i1.I001IIilI0O(Barcode.FORMAT_ITF));
/* 281 */               i10OOlOI0000Il00O3.I0001Ioi1lo(i00i1i1.I001IIilI0O(8));
/* 290 */               i10OOlOI0000Il00O4.I0001Ioi1lo(i00i1i1.I001IIilI0O(32));
/* 298 */               i10OOlOI0000Il00O5.I0001Ioi1lo(i00i1i1.I001IIilI0O(2));
/* 307 */               i10OOlOI0000Il00O6.I0001Ioi1lo(i00i1i1.I001IIilI0O(1));
/* 316 */               i10OOlOI0000Il00O7.I0001Ioi1lo(i00i1i1.I001IIilI0O(519));
/* 325 */               i10OOlOI0000Il00O8.I0001Ioi1lo(i00i1i1.I001IIilI0O(16));
/* 334 */               i10OOlOI0000Il00O9.I0001Ioi1lo(i00i1i1.I001IIilI0O(64));
                    }
                }

                public static void I00000oOI(i00lIlOOll0 i00lilooll0, i00iooo00li i00iooo00liVar) {
                    Path cutoutPath;
/* 3 */             boolean z = false;
/* 4 */             i00lilooll0.I00000oIO.I000II(i00iooo00liVar, 0);
/* 9 */             i00lilooll0.I0000Il00O.I000II(i00iooo00liVar, 0);
/* 14 */            i00lilooll0.I00000oOI.I000II(i00iooo00liVar, 0);
/* 19 */            i00lilooll0.I0000oI00.I000II(i00iooo00liVar, 0);
/* 24 */            i00lilooll0.I0001Ioi1lo.I000II(i00iooo00liVar, 0);
/* 29 */            i00lilooll0.I000II.I000II(i00iooo00liVar, 0);
/* 34 */            i00lilooll0.I000O01llI0.I000II(i00iooo00liVar, 0);
/* 39 */            i00lilooll0.I000OOo1O.I000II(i00iooo00liVar, 0);
/* 44 */            i00lilooll0.I0000O.I000II(i00iooo00liVar, 0);
/* 60 */            i00lilooll0.I000lI.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(i00iooo00liVar.I00000oIO.I000OiO(4)));
/* 76 */            i00lilooll0.I000o00OoI0I.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(i00iooo00liVar.I00000oIO.I000OiO(2)));
/* 92 */            i00lilooll0.I000oI1ioi.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(i00iooo00liVar.I00000oIO.I000OiO(1)));
/* 109 */           i00lilooll0.I00100l0.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(i00iooo00liVar.I00000oIO.I000OiO(519)));
/* 126 */           i00lilooll0.I00100o1O0lo.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(i00iooo00liVar.I00000oIO.I000OiO(64)));
/* 131 */           IiiIlIlO iiiIlIlOI000O01llI0 = i00iooo00liVar.I00000oIO.I000O01llI0();
/* 156 */           i00lilooll0.I000OiO.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(iiiIlIlOI000O01llI0 != null ? Ioo0l0I.I00000oOI(iiiIlIlOI000O01llI0.I00000oIO.getWaterfallInsets()) : Ioo0l0I.I0000oI00));
/* 178 */           i00lilooll0.I000iOII.setValue((iiiIlIlOI000O01llI0 == null || (cutoutPath = iiiIlIlOI000O01llI0.I00000oIO.getCutoutPath()) == null) ? null : new I0ol0lI(cutoutPath));
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 186 */               OI10IIO oi10iio = Ol1l1lI1Ili.I000OiO.I000O01llI0;
/* 188 */               if (oi10iio != null) {
/* 194 */                   if (oi10iio.I000O01llI0()) {
/* 196 */                       z = true;
                            }
                        }
                    }
/* 198 */           if (z) {
/* 200 */               Ol1l1lI1Ili.I0000Il00O();
                    }
                }

                public final void I00000oIO(View view) {
/* 3 */             if (this.I001IIilI0O == 0) {
/* 5 */                 Ioo0oiliOI ioo0oiliOI = this.I001IO000;
/* 8 */                 ioo0oiliOI.I00iiO = false;
/* 10 */                ioo0oiliOI.I00iio = false;
/* 13 */                ioo0oiliOI.I00ilI0I1 = null;
/* 15 */                WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 17 */                OooiIOIoi.I00000oOI(view, ioo0oiliOI);
/* 24 */                if (view.isAttachedToWindow()) {
/* 26 */                    view.requestApplyInsets();
                        }
/* 29 */                view.addOnAttachStateChangeListener(ioo0oiliOI);
/* 32 */                IIOOoll.I00i0ilIl0i(view, ioo0oiliOI);
                    }
                    this.I001IIilI0O++;
                }
            }
