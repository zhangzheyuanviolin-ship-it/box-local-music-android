            package p000;

            import android.graphics.Rect;
            import android.view.View;
            import android.view.inputmethod.InputMethodManager;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class Oo0Ooo1Oi implements OO1OOi {
                public View I00000oIO;
                public IoIlOo1o0IIl I00000oOI;
                public I0lOoloIoi I0000Il00O;
                public boolean I0000O;
                public Function1 I0000oI00;
                public Function1 I0001Ioi1lo;
                public Oo0OI01Il I000II;
                public IoiiO1O1 I000O01llI0;
                public ArrayList I000OOo1O;
                public O0ioIllo0i1 I000OiO;
                public Rect I000iOII;
                public Ii0i1000 I000l1;
                public OI110O0 I000lI;
                public OOIl1i1 I000o00OoI0I;

                @Override
                public final void I00000oIO() {
/* 3 */             I000OOo1O(Oo0OoOo00.I00iOIl);
                }

                @Override
                public final void I00000oOI() {
/* 3 */             I000OOo1O(Oo0OoOo00.I00iiO);
                }

                @Override
                public final void I0000Il00O(Oo0OI01Il oo0OI01Il, IoiiO1O1 ioiiO1O1, O11IOOoiI10i o11IOOoiI10i, IOooI1o iOooI1o) {
/* 2 */             this.I0000O = true;
/* 4 */             this.I000II = oo0OI01Il;
/* 6 */             this.I000O01llI0 = ioiiO1O1;
/* 8 */             this.I0000oI00 = o11IOOoiI10i;
/* 10 */            this.I0001Ioi1lo = iOooI1o;
/* 14 */            I000OOo1O(Oo0OoOo00.I00iOIl);
                }

                @Override
                public final void I0000O() {
/* 2 */             this.I0000O = false;
/* 10 */            this.I0000oI00 = new Oo011oIOO1(5);
/* 18 */            this.I0001Ioi1lo = new Oo011oIOO1(6);
/* 21 */            this.I000iOII = null;
/* 25 */            I000OOo1O(Oo0OoOo00.I00iiI);
                }

                @Override
                public final void I0000oI00(Oo0OI01Il oo0OI01Il, Oo0OI01Il oo0OI01Il2) {
/* 29 */            boolean z = (Oo0lI00l.I0000Il00O(this.I000II.I00000oOI, oo0OI01Il2.I00000oOI) && O0000Ioio00.I0000O(this.I000II.I0000Il00O, oo0OI01Il2.I0000Il00O)) ? false : true;
/* 30 */            this.I000II = oo0OI01Il2;
/* 34 */            int size = this.I000OOo1O.size();
/* 39 */            for (int i = 0; i < size; i++) {
/* 53 */                OOo010II0IOI oOo010II0IOI = (OOo010II0IOI) ((WeakReference) this.I000OOo1O.get(i)).get();
/* 55 */                if (oOo010II0IOI != null) {
/* 57 */                    oOo010II0IOI.I0000O = oo0OI01Il2;
                        }
                    }
/* 62 */            Ii0i1000 ii0i1000 = this.I000l1;
                    synchronized (ii0i1000.I0000Il00O) {
/* 68 */                ii0i1000.I000OiO = null;
/* 70 */                ii0i1000.I000l1 = null;
/* 72 */                ii0i1000.I000iOII = null;
/* 76 */                ii0i1000.I000lI = I0ollliOo0.I00ooIo0;
/* 78 */                ii0i1000.I000o00OoI0I = null;
/* 80 */                ii0i1000.I000oI1ioi = null;
                    }
/* 88 */            if (O0000Ioio00.I0000O(oo0OI01Il, oo0OI01Il2)) {
/* 90 */                if (z) {
/* 92 */                    IoIlOo1o0IIl ioIlOo1o0IIl = this.I00000oOI;
/* 96 */                    int iI000II = Oo0lI00l.I000II(oo0OI01Il2.I00000oOI);
/* 102 */                   int iI0001Ioi1lo = Oo0lI00l.I0001Ioi1lo(oo0OI01Il2.I00000oOI);
/* 108 */                   Oo0lI00l oo0lI00l = this.I000II.I0000Il00O;
/* 120 */                   int iI000II2 = oo0lI00l != null ? Oo0lI00l.I000II(oo0lI00l.I00000oIO) : -1;
/* 123 */                   Oo0lI00l oo0lI00l2 = this.I000II.I0000Il00O;
/* 150 */                   ((InputMethodManager) ((O0ioIllo0i1) ioIlOo1o0IIl.I00iiO).getValue()).updateSelection((View) ioIlOo1o0IIl.I00iiI, iI000II, iI0001Ioi1lo, iI000II2, oo0lI00l2 != null ? Oo0lI00l.I0001Ioi1lo(oo0lI00l2.I00000oIO) : -1);
/* 153 */                   return;
                        }
/* 330 */               return;
                    }
/* 154 */           if (oo0OI01Il != null && (!O0000Ioio00.I0000O(oo0OI01Il.I00000oIO.I00iiI, oo0OI01Il2.I00000oIO.I00iiI) || (Oo0lI00l.I0000Il00O(oo0OI01Il.I00000oOI, oo0OI01Il2.I00000oOI) && !O0000Ioio00.I0000O(oo0OI01Il.I0000Il00O, oo0OI01Il2.I0000Il00O)))) {
/* 190 */               IoIlOo1o0IIl ioIlOo1o0IIl2 = this.I00000oOI;
/* 206 */               ((InputMethodManager) ((O0ioIllo0i1) ioIlOo1o0IIl2.I00iiO).getValue()).restartInput((View) ioIlOo1o0IIl2.I00iiI);
/* 209 */               return;
                    }
/* 212 */           int size2 = this.I000OOo1O.size();
/* 216 */           for (int i2 = 0; i2 < size2; i2++) {
/* 230 */               OOo010II0IOI oOo010II0IOI2 = (OOo010II0IOI) ((WeakReference) this.I000OOo1O.get(i2)).get();
/* 232 */               if (oOo010II0IOI2 != null) {
/* 234 */                   Oo0OI01Il oo0OI01Il3 = this.I000II;
/* 236 */                   IoIlOo1o0IIl ioIlOo1o0IIl3 = this.I00000oOI;
/* 240 */                   if (oOo010II0IOI2.I000O01llI0) {
/* 243 */                       oOo010II0IOI2.I0000O = oo0OI01Il3;
/* 247 */                       if (oOo010II0IOI2.I0001Ioi1lo) {
/* 269 */                           ((InputMethodManager) ((O0ioIllo0i1) ioIlOo1o0IIl3.I00iiO).getValue()).updateExtractedText((View) ioIlOo1o0IIl3.I00iiI, oOo010II0IOI2.I0000oI00, iooI10OI1O.I00000oIO(oo0OI01Il3));
                                }
/* 272 */                       Oo0lI00l oo0lI00l3 = oo0OI01Il3.I0000Il00O;
/* 274 */                       long j = oo0OI01Il3.I00000oOI;
/* 286 */                       int iI000II3 = oo0lI00l3 != null ? Oo0lI00l.I000II(oo0lI00l3.I00000oIO) : -1;
/* 287 */                       Oo0lI00l oo0lI00l4 = oo0OI01Il3.I0000Il00O;
/* 324 */                       ((InputMethodManager) ((O0ioIllo0i1) ioIlOo1o0IIl3.I00iiO).getValue()).updateSelection((View) ioIlOo1o0IIl3.I00iiI, Oo0lI00l.I000II(j), Oo0lI00l.I0001Ioi1lo(j), iI000II3, oo0lI00l4 != null ? Oo0lI00l.I0001Ioi1lo(oo0lI00l4.I00000oIO) : -1);
                            }
                        }
                    }
                }

                @Override
                public final void I0001Ioi1lo() {
/* 3 */             I000OOo1O(Oo0OoOo00.I00iio);
                }

                @Override
                public final void I000II(OOo0IO oOo0IO) {
                    Rect rect;
/* 30 */            this.I000iOII = new Rect(O1OooO0IlOo.I000II(oOo0IO.I00000oIO), O1OooO0IlOo.I000II(oOo0IO.I00000oOI), O1OooO0IlOo.I000II(oOo0IO.I0000Il00O), O1OooO0IlOo.I000II(oOo0IO.I0000O));
/* 38 */            if (!this.I000OOo1O.isEmpty() || (rect = this.I000iOII) == null) {
/* 77 */                return;
                    }
/* 51 */            this.I00000oIO.requestRectangleOnScreen(new Rect(rect));
                }

                @Override
                public final void I000O01llI0(Oo0OI01Il oo0OI01Il, OIOlOI oIOlOI, Oo0iil0o0oI oo0iil0o0oI, OiI0lII1i oiI0lII1i, OOo0IO oOo0IO, OOo0IO oOo0IO2) {
/* 1 */             Ii0i1000 ii0i1000 = this.I000l1;
                    synchronized (ii0i1000.I0000Il00O) {
                        try {
/* 6 */                     ii0i1000.I000OiO = oo0OI01Il;
/* 8 */                     ii0i1000.I000l1 = oIOlOI;
/* 10 */                    ii0i1000.I000iOII = oo0iil0o0oI;
/* 12 */                    ii0i1000.I000lI = oiI0lII1i;
/* 14 */                    ii0i1000.I000o00OoI0I = oOo0IO;
/* 16 */                    ii0i1000.I000oI1ioi = oOo0IO2;
/* 20 */                    if (ii0i1000.I0000oI00 || ii0i1000.I0000O) {
/* 29 */                        ii0i1000.I00000oIO();
                            }
                        } catch (Throwable th) {
/* 685 */                   throw th;
                        }
                    }
                }

                public final void I000OOo1O(Oo0OoOo00 oo0OoOo00) {
/* 3 */             this.I000lI.I00000oOI(oo0OoOo00);
/* 8 */             if (this.I000o00OoI0I == null) {
/* 14 */                OOIl1i1 oOIl1i1 = new OOIl1i1(13);
/* 17 */                oOIl1i1.I00iiI = this;
/* 19 */                VarHandle.storeStoreFence();
/* 24 */                this.I0000Il00O.execute(oOIl1i1);
/* 27 */                this.I000o00OoI0I = oOIl1i1;
                    }
                }
            }
