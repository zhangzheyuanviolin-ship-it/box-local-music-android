            package p000;

            import android.graphics.Matrix;
            import android.view.View;
            import android.view.inputmethod.CursorAnchorInfo;
            import android.view.inputmethod.EditorBoundsInfo;
            import android.view.inputmethod.InputMethodManager;
            import kotlin.jvm.functions.Function1;
            
            public final class Ii0i1000 {
                public I0lio1O01i01 I00000oIO;
                public IoIlOo1o0IIl I00000oOI;
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
                public Function1 I000lI;
                public OOo0IO I000o00OoI0I;
                public OOo0IO I000oI1ioi;
                public CursorAnchorInfo.Builder I00100l0;
                public float[] I00100o1O0lo;
                public Matrix I0010I0i;

                public final void I00000oIO() {
                    float f;
                    OOo0IO oOo0IO;
/* 3 */             Matrix matrix = this.I0010I0i;
/* 5 */             float[] fArr = this.I00100o1O0lo;
/* 7 */             IoIlOo1o0IIl ioIlOo1o0IIl = this.I00000oOI;
/* 11 */            O0ioIllo0i1 o0ioIllo0i1 = (O0ioIllo0i1) ioIlOo1o0IIl.I00iiO;
/* 17 */            InputMethodManager inputMethodManager = (InputMethodManager) o0ioIllo0i1.getValue();
/* 21 */            View view = (View) ioIlOo1o0IIl.I00iiI;
/* 27 */            if (inputMethodManager.isActive(view)) {
/* 36 */                this.I000lI.invoke(O1i010l1l.I00000oIO(fArr));
/* 41 */                this.I00000oIO.I00100l0(fArr);
/* 44 */                iOIli10iO0I.I00000oIO(matrix, fArr);
/* 47 */                CursorAnchorInfo.Builder builder = this.I00100l0;
/* 49 */                Oo0OI01Il oo0OI01Il = this.I000OiO;
/* 51 */                long j = oo0OI01Il.I00000oOI;
/* 53 */                OIOlOI oIOlOI = this.I000l1;
/* 55 */                Oo0iil0o0oI oo0iil0o0oI = this.I000iOII;
/* 57 */                OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 59 */                OOo0IO oOo0IO2 = this.I000o00OoI0I;
/* 61 */                float f2 = oOo0IO2.I0000O;
/* 63 */                float f3 = oOo0IO2.I00000oOI;
/* 65 */                OOo0IO oOo0IO3 = this.I000oI1ioi;
/* 67 */                boolean z = this.I0001Ioi1lo;
/* 71 */                boolean z2 = this.I000II;
/* 75 */                boolean z3 = this.I000O01llI0;
/* 79 */                boolean z4 = this.I000OOo1O;
/* 81 */                builder.reset();
/* 84 */                builder.setMatrix(matrix);
/* 87 */                Oo0lI00l oo0lI00l = oo0OI01Il.I0000Il00O;
/* 91 */                int iI000II = Oo0lI00l.I000II(j);
/* 99 */                builder.setSelectionRange(iI000II, Oo0lI00l.I0001Ioi1lo(j));
/* 104 */               if (!z || iI000II < 0) {
/* 204 */                   f = f3;
/* 205 */                   oOo0IO = oOo0IO3;
                        } else {
/* 110 */                   int iI000o00OoI0I = oIOlOI.I000o00OoI0I(iI000II);
/* 114 */                   OOo0IO oOo0IOI0000Il00O = oo0iil0o0oI.I0000Il00O(iI000o00OoI0I);
/* 131 */                   float fI00000oOI = lIiioliIlo.I00000oOI(oOo0IOI0000Il00O.I00000oIO, 0.0f, (int) (oo0iil0o0oI.I0000Il00O >> 32));
/* 139 */                   boolean zI00000oIO = il00liooo.I00000oIO(oOo0IO2, fI00000oOI, oOo0IOI0000Il00O.I00000oOI);
/* 147 */                   boolean zI00000oIO2 = il00liooo.I00000oIO(oOo0IO2, fI00000oOI, oOo0IOI0000Il00O.I0000O);
/* 164 */                   boolean z5 = oo0iil0o0oI.I00000oIO(iI000o00OoI0I) == Oi0il01O01IO.I00iiI;
/* 172 */                   int i = (zI00000oIO || zI00000oIO2) ? 1 : 0;
/* 174 */                   if (!zI00000oIO || !zI00000oIO2) {
/* 178 */                       i |= 2;
                            }
/* 180 */                   if (z5) {
/* 182 */                       i |= 4;
                            }
/* 184 */                   int i2 = i;
/* 185 */                   float f4 = oOo0IOI0000Il00O.I00000oOI;
/* 187 */                   float f5 = oOo0IOI0000Il00O.I0000O;
/* 194 */                   f = f3;
/* 196 */                   builder = builder;
/* 198 */                   oOo0IO = oOo0IO3;
/* 200 */                   builder.setInsertionMarkerLocation(fI00000oOI, f4, f5, f5, i2);
                        }
/* 207 */               if (z2) {
/* 219 */                   int iI000II2 = oo0lI00l != null ? Oo0lI00l.I000II(oo0lI00l.I00000oIO) : -1;
/* 224 */                   int iI0001Ioi1lo = oo0lI00l != null ? Oo0lI00l.I0001Ioi1lo(oo0lI00l.I00000oIO) : -1;
/* 229 */                   if (iI000II2 >= 0 && iI000II2 < iI0001Ioi1lo) {
/* 241 */                       builder.setComposingText(iI000II2, oo0OI01Il.I00000oIO.I00iiI.subSequence(iI000II2, iI0001Ioi1lo));
/* 244 */                       int iI000o00OoI0I2 = oIOlOI.I000o00OoI0I(iI000II2);
/* 248 */                       int iI000o00OoI0I3 = oIOlOI.I000o00OoI0I(iI0001Ioi1lo);
/* 256 */                       float[] fArr2 = new float[(iI000o00OoI0I3 - iI000o00OoI0I2) * 4];
/* 262 */                       oI0OIIiOi.I00000oIO(lOliOi0Oi.I00000oIO(iI000o00OoI0I2, iI000o00OoI0I3), fArr2);
/* 265 */                       int i3 = iI000II2;
/* 266 */                       while (i3 < iI0001Ioi1lo) {
/* 268 */                           int iI000o00OoI0I4 = oIOlOI.I000o00OoI0I(i3);
/* 274 */                           int i4 = (iI000o00OoI0I4 - iI000o00OoI0I2) * 4;
/* 276 */                           float f6 = fArr2[i4];
/* 280 */                           int i5 = iI0001Ioi1lo;
/* 282 */                           float f7 = fArr2[i4 + 1];
/* 286 */                           int i6 = iI000o00OoI0I2;
/* 288 */                           float f8 = fArr2[i4 + 2];
/* 292 */                           float f9 = fArr2[i4 + 3];
/* 294 */                           OIOlOI oIOlOI2 = oIOlOI;
/* 339 */                           int i7 = (oOo0IO2.I00000oIO < f8 ? 1 : 0) & (f6 < oOo0IO2.I0000Il00O ? 1 : 0) & (f < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
/* 345 */                           if (!il00liooo.I00000oIO(oOo0IO2, f6, f7) || !il00liooo.I00000oIO(oOo0IO2, f8, f9)) {
/* 353 */                               i7 |= 2;
                                    }
/* 363 */                           if (oo0iil0o0oI.I00000oIO(iI000o00OoI0I4) == Oi0il01O01IO.I00iiI) {
/* 365 */                               i7 |= 4;
                                    }
/* 375 */                           builder.addCharacterBounds(i3, f6, f7, f8, f9, i7);
/* 378 */                           i3++;
/* 380 */                           f2 = f2;
/* 381 */                           fArr2 = fArr2;
/* 382 */                           oIOlOI = oIOlOI2;
/* 384 */                           iI0001Ioi1lo = i5;
/* 386 */                           iI000o00OoI0I2 = i6;
                                }
                            }
                        }
/* 389 */               float f10 = f2;
/* 390 */               if (z3) {
/* 417 */                   builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(lIiool1i00.I00000oOI(oOo0IO)).setHandwritingBounds(lIiool1i00.I00000oOI(oOo0IO)).build());
                        }
/* 420 */               if (z4 && !oOo0IO2.I000II()) {
                            int i8 = oI0OIIiOi.I0001Ioi1lo - 1;
/* 432 */                   if (i8 < 0) {
/* 434 */                       i8 = 0;
                            }
/* 440 */                   int iI0000Il00O = lIiioliIlo.I0000Il00O(oI0OIIiOi.I0000oI00(f), 0, i8);
/* 448 */                   int iI0000Il00O2 = lIiioliIlo.I0000Il00O(oI0OIIiOi.I0000oI00(f10), 0, i8);
/* 452 */                   if (iI0000Il00O <= iI0000Il00O2) {
                                while (true) {
/* 470 */                           builder.addVisibleLineBounds(oo0iil0o0oI.I0001Ioi1lo(iI0000Il00O), oI0OIIiOi.I0001Ioi1lo(iI0000Il00O), oo0iil0o0oI.I000II(iI0000Il00O), oI0OIIiOi.I00000oOI(iI0000Il00O));
/* 473 */                           if (iI0000Il00O == iI0000Il00O2) {
                                        break;
                                    } else {
/* 475 */                               iI0000Il00O++;
                                    }
                                }
                            }
                        }
/* 488 */               ((InputMethodManager) o0ioIllo0i1.getValue()).updateCursorAnchorInfo(view, builder.build());
/* 492 */               this.I0000oI00 = false;
                    }
                }
            }
