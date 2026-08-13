            package p000;

            import android.graphics.Rect;
            import android.view.View;
            import kotlin.jvm.functions.Function1;
            
            public final class Ili0o0i implements Function1 {
                public final int I00iOIl;
                public Ili0oiOI1i10 I00iiI;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ili0oiOI1i10 ili0oiOI1i10 = this.I00iiI;
/* 7 */             IIoOi1IoOO iIoOi1IoOO = (IIoOi1IoOO) obj;
                    switch (i) {
                        case 0:
/* 16 */                    View viewI00000oIO = ili0OllOi.I00000oIO(ili0oiOI1i10);
/* 24 */                    if (!viewI00000oIO.isFocused() && !viewI00000oIO.hasFocus()) {
/* 38 */                        Ili1iIl focusOwner = ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(ili0oiOI1i10)).getFocusOwner();
/* 42 */                        View viewI00000oIO2 = il0lIIII.I00000oIO(ili0oiOI1i10);
/* 48 */                        Integer numI0000Il00O = Ili11o0l.I0000Il00O(iIoOi1IoOO.I00000oIO);
/* 53 */                        int[] iArr = new int[2];
/* 55 */                        viewI00000oIO2.getLocationOnScreen(iArr);
/* 58 */                        int[] iArr2 = new int[2];
/* 60 */                        viewI00000oIO.getLocationOnScreen(iArr2);
/* 67 */                        IliIO10oO0 iliIO10oO0I00000oIO = iliI1i0.I00000oIO(((Ili1ioOlo0oO) focusOwner).I0000Il00O);
/* 71 */                        Rect rect = null;
/* 79 */                        OOo0IO oOo0IOI00000oOI = iliIO10oO0I00000oIO != null ? iliI1i0.I00000oOI(iliIO10oO0I00000oIO) : null;
/* 81 */                        if (oOo0IOI00000oOI != null) {
/* 88 */                            int i2 = (int) oOo0IOI00000oOI.I00000oIO;
/* 90 */                            int i3 = iArr[0];
/* 93 */                            int i4 = iArr2[0];
/* 98 */                            int i5 = (int) oOo0IOI00000oOI.I00000oOI;
/* 99 */                            int i6 = iArr[1];
/* 102 */                           int i7 = iArr2[1];
/* 115 */                           rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) oOo0IOI00000oOI.I0000Il00O) + i3) - i4, (((int) oOo0IOI00000oOI.I0000O) + i6) - i7);
                                }
/* 122 */                       if (!Ili11o0l.I00000oOI(viewI00000oIO, numI0000Il00O, rect)) {
/* 124 */                           iIoOi1IoOO.I00000oOI = true;
                                    break;
                                }
                            }
                            break;
                        default:
/* 12 */                    ili0OllOi.I00000oIO(ili0oiOI1i10);
                            break;
                    }
/* 15 */            return ooiIlOl1iI;
                }
            }
