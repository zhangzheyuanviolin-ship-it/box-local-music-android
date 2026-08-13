            package p000;

            import android.graphics.Matrix;
            import android.view.View;
            import android.view.inputmethod.CursorAnchorInfo;
            import android.view.inputmethod.EditorBoundsInfo;
            import android.view.inputmethod.InputMethodManager;
            
            public final class O0oIIi {
                public II1lOl I00000oIO;
                public IoloOio0I I00000oOI;
                public Object I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;
                public boolean I000II;
                public boolean I000O01llI0;
                public boolean I000OOo1O;
                public Oo0OI01Il I000OiO;
                public Oo0iil0o0oI I000iOII;
                public OIOlOI I000l1;
                public OOo0IO I000lI;
                public OOo0IO I000o00OoI0I;
                public CursorAnchorInfo.Builder I000oI1ioi;
                public float[] I00100l0;
                public Matrix I00100o1O0lo;

                public final void I00000oIO() {
                    float f;
                    OOo0IO oOo0IO;
/* 3 */             Matrix matrix = this.I00100o1O0lo;
/* 5 */             float[] fArr = this.I00100l0;
/* 7 */             IoloOio0I ioloOio0I = this.I00000oOI;
/* 9 */             InputMethodManager inputMethodManagerI00IoIO0lI = ioloOio0I.I00IoIO0lI();
/* 15 */            View view = (View) ioloOio0I.I00iiI;
/* 21 */            if (!inputMethodManagerI00IoIO0lI.isActive(view) || this.I000OiO == null || this.I000l1 == null || this.I000iOII == null || this.I000lI == null || this.I000o00OoI0I == null) {
/* 743 */               return;
                    }
/* 45 */            O1i010l1l.I0000oI00(fArr);
/* 54 */            this.I00000oIO.invoke(O1i010l1l.I00000oIO(fArr));
/* 57 */            OOo0IO oOo0IO2 = this.I000o00OoI0I;
/* 65 */            O1i010l1l.I000O01llI0(fArr, -oOo0IO2.I00000oIO, -oOo0IO2.I00000oOI);
/* 68 */            iOIli10iO0I.I00000oIO(matrix, fArr);
/* 71 */            CursorAnchorInfo.Builder builder = this.I000oI1ioi;
/* 73 */            Oo0OI01Il oo0OI01Il = this.I000OiO;
/* 75 */            long j = oo0OI01Il.I00000oOI;
/* 77 */            OIOlOI oIOlOI = this.I000l1;
/* 79 */            Oo0iil0o0oI oo0iil0o0oI = this.I000iOII;
/* 81 */            OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 83 */            OOo0IO oOo0IO3 = this.I000lI;
/* 85 */            float f2 = oOo0IO3.I0000O;
/* 87 */            float f3 = oOo0IO3.I00000oOI;
/* 89 */            OOo0IO oOo0IO4 = this.I000o00OoI0I;
/* 91 */            boolean z = this.I0001Ioi1lo;
/* 95 */            boolean z2 = this.I000II;
/* 99 */            boolean z3 = this.I000O01llI0;
/* 103 */           boolean z4 = this.I000OOo1O;
/* 105 */           builder.reset();
/* 108 */           builder.setMatrix(matrix);
/* 111 */           Oo0lI00l oo0lI00l = oo0OI01Il.I0000Il00O;
/* 115 */           int iI000II = Oo0lI00l.I000II(j);
/* 123 */           builder.setSelectionRange(iI000II, Oo0lI00l.I0001Ioi1lo(j));
/* 128 */           if (!z || iI000II < 0) {
/* 228 */               f = f3;
/* 229 */               oOo0IO = oOo0IO4;
                    } else {
/* 134 */               int iI000o00OoI0I = oIOlOI.I000o00OoI0I(iI000II);
/* 138 */               OOo0IO oOo0IOI0000Il00O = oo0iil0o0oI.I0000Il00O(iI000o00OoI0I);
/* 155 */               float fI00000oOI = lIiioliIlo.I00000oOI(oOo0IOI0000Il00O.I00000oIO, 0.0f, (int) (oo0iil0o0oI.I0000Il00O >> 32));
/* 163 */               boolean zI00000oIO = l10IIliI1oIi.I00000oIO(oOo0IO3, fI00000oOI, oOo0IOI0000Il00O.I00000oOI);
/* 171 */               boolean zI00000oIO2 = l10IIliI1oIi.I00000oIO(oOo0IO3, fI00000oOI, oOo0IOI0000Il00O.I0000O);
/* 188 */               boolean z5 = oo0iil0o0oI.I00000oIO(iI000o00OoI0I) == Oi0il01O01IO.I00iiI;
/* 196 */               int i = (zI00000oIO || zI00000oIO2) ? 1 : 0;
/* 198 */               if (!zI00000oIO || !zI00000oIO2) {
/* 202 */                   i |= 2;
                        }
/* 204 */               if (z5) {
/* 206 */                   i |= 4;
                        }
/* 208 */               int i2 = i;
/* 209 */               float f4 = oOo0IOI0000Il00O.I00000oOI;
/* 211 */               float f5 = oOo0IOI0000Il00O.I0000O;
/* 218 */               f = f3;
/* 220 */               builder = builder;
/* 222 */               oOo0IO = oOo0IO4;
/* 224 */               builder.setInsertionMarkerLocation(fI00000oOI, f4, f5, f5, i2);
                    }
/* 231 */           if (z2) {
/* 243 */               int iI000II2 = oo0lI00l != null ? Oo0lI00l.I000II(oo0lI00l.I00000oIO) : -1;
/* 248 */               int iI0001Ioi1lo = oo0lI00l != null ? Oo0lI00l.I0001Ioi1lo(oo0lI00l.I00000oIO) : -1;
/* 253 */               if (iI000II2 >= 0 && iI000II2 < iI0001Ioi1lo) {
/* 265 */                   builder.setComposingText(iI000II2, oo0OI01Il.I00000oIO.I00iiI.subSequence(iI000II2, iI0001Ioi1lo));
/* 268 */                   int iI000o00OoI0I2 = oIOlOI.I000o00OoI0I(iI000II2);
/* 272 */                   int iI000o00OoI0I3 = oIOlOI.I000o00OoI0I(iI0001Ioi1lo);
/* 280 */                   float[] fArr2 = new float[(iI000o00OoI0I3 - iI000o00OoI0I2) * 4];
/* 286 */                   oI0OIIiOi.I00000oIO(lOliOi0Oi.I00000oIO(iI000o00OoI0I2, iI000o00OoI0I3), fArr2);
/* 289 */                   int i3 = iI000II2;
/* 290 */                   while (i3 < iI0001Ioi1lo) {
/* 292 */                       int iI000o00OoI0I4 = oIOlOI.I000o00OoI0I(i3);
/* 298 */                       int i4 = (iI000o00OoI0I4 - iI000o00OoI0I2) * 4;
/* 300 */                       float f6 = fArr2[i4];
/* 304 */                       int i5 = iI0001Ioi1lo;
/* 306 */                       float f7 = fArr2[i4 + 1];
/* 310 */                       int i6 = iI000o00OoI0I2;
/* 312 */                       float f8 = fArr2[i4 + 2];
/* 316 */                       float f9 = fArr2[i4 + 3];
/* 318 */                       OIOlOI oIOlOI2 = oIOlOI;
/* 363 */                       int i7 = (oOo0IO3.I00000oIO < f8 ? 1 : 0) & (f6 < oOo0IO3.I0000Il00O ? 1 : 0) & (f < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
/* 369 */                       if (!l10IIliI1oIi.I00000oIO(oOo0IO3, f6, f7) || !l10IIliI1oIi.I00000oIO(oOo0IO3, f8, f9)) {
/* 377 */                           i7 |= 2;
                                }
/* 387 */                       if (oo0iil0o0oI.I00000oIO(iI000o00OoI0I4) == Oi0il01O01IO.I00iiI) {
/* 389 */                           i7 |= 4;
                                }
/* 399 */                       builder.addCharacterBounds(i3, f6, f7, f8, f9, i7);
/* 402 */                       i3++;
/* 404 */                       f2 = f2;
/* 405 */                       fArr2 = fArr2;
/* 406 */                       oIOlOI = oIOlOI2;
/* 408 */                       iI0001Ioi1lo = i5;
/* 410 */                       iI000o00OoI0I2 = i6;
                            }
                        }
                    }
/* 413 */           float f10 = f2;
/* 414 */           if (z3) {
/* 441 */               builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(lIiool1i00.I00000oOI(oOo0IO)).setHandwritingBounds(lIiool1i00.I00000oOI(oOo0IO)).build());
                    }
/* 444 */           if (z4 && !oOo0IO3.I000II()) {
                        int i8 = oI0OIIiOi.I0001Ioi1lo - 1;
/* 456 */               if (i8 < 0) {
/* 458 */                   i8 = 0;
                        }
/* 464 */               int iI0000Il00O = lIiioliIlo.I0000Il00O(oI0OIIiOi.I0000oI00(f), 0, i8);
/* 472 */               int iI0000Il00O2 = lIiioliIlo.I0000Il00O(oI0OIIiOi.I0000oI00(f10), 0, i8);
/* 476 */               if (iI0000Il00O <= iI0000Il00O2) {
                            while (true) {
/* 494 */                       builder.addVisibleLineBounds(oo0iil0o0oI.I0001Ioi1lo(iI0000Il00O), oI0OIIiOi.I0001Ioi1lo(iI0000Il00O), oo0iil0o0oI.I000II(iI0000Il00O), oI0OIIiOi.I00000oOI(iI0000Il00O));
/* 497 */                       if (iI0000Il00O == iI0000Il00O2) {
                                    break;
                                } else {
/* 499 */                           iI0000Il00O++;
                                }
                            }
                        }
                    }
/* 510 */           ioloOio0I.I00IoIO0lI().updateCursorAnchorInfo(view, builder.build());
/* 514 */           this.I0000oI00 = false;
                }
            }
