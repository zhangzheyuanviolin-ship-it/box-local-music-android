            package p000;

            import android.graphics.Rect;
            import android.view.View;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            
            public final class I0oOiiOi0l implements OO1OOi {
                public O0oIIIiiO1 I00000oIO;
                public OlIl0i I00000oOI;
                public O0oIo1 I0000Il00O;
                public Oiolio I0000O;

                @Override
                public final void I00000oIO() {
/* 2 */             I000OOo1O(null);
                }

                @Override
                public final void I00000oOI() {
                    Ol1oolo ol1oolo;
/* 1 */             O0oIIIiiO1 o0oIIIiiO1 = this.I00000oIO;
/* 3 */             if (o0oIIIiiO1 == null || (ol1oolo = (Ol1oolo) iiliIooIliOo.I00000oIO(o0oIIIiiO1, IOlO0o100i1i.I00100o1O0lo)) == null) {
/* 20 */                return;
                    }
/* 17 */            ((IiIli1i1o) ol1oolo).I00000oOI();
                }

                @Override
                public final void I0000Il00O(Oo0OI01Il oo0OI01Il, IoiiO1O1 ioiiO1O1, O11IOOoiI10i o11IOOoiI10i, IOooI1o iOooI1o) {
/* 4 */             I0IO1io0I i0IO1io0I = new I0IO1io0I(2);
/* 7 */             i0IO1io0I.I00iiO = oo0OI01Il;
/* 9 */             i0IO1io0I.I00iio = this;
/* 11 */            i0IO1io0I.I00ilI0I1 = ioiiO1O1;
/* 13 */            i0IO1io0I.I00ilO0 = o11IOOoiI10i;
/* 15 */            i0IO1io0I.I00iiI = iOooI1o;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I000OOo1O(i0IO1io0I);
                }

                @Override
                public final void I0000O() throws Throwable {
/* 1 */             OlIl0i olIl0i = this.I00000oOI;
/* 4 */             if (olIl0i != null) {
/* 6 */                 olIl0i.I000II(null);
                    }
/* 9 */             this.I00000oOI = null;
/* 11 */            Oiolio oiolioI00000oOI = this.I0000O;
/* 13 */            if (oiolioI00000oOI == null) {
/* 20 */                oiolioI00000oOI = Oiolio0iO1.I00000oOI(0, 2, IIII0i.I00iiO);
/* 24 */                this.I0000O = oiolioI00000oOI;
                    }
/* 26 */            oiolioI00000oOI.I0000oI00();
                }

                @Override
                public final void I0000oI00(Oo0OI01Il oo0OI01Il, Oo0OI01Il oo0OI01Il2) {
/* 1 */             O0oIo1 o0oIo1 = this.I0000Il00O;
/* 3 */             if (o0oIo1 != null) {
/* 33 */                boolean z = (Oo0lI00l.I0000Il00O(o0oIo1.I000O01llI0.I00000oOI, oo0OI01Il2.I00000oOI) && O0000Ioio00.I0000O(o0oIo1.I000O01llI0.I0000Il00O, oo0OI01Il2.I0000Il00O)) ? false : true;
/* 34 */                o0oIo1.I000O01llI0 = oo0OI01Il2;
/* 38 */                int size = o0oIo1.I000OiO.size();
/* 43 */                for (int i = 0; i < size; i++) {
/* 57 */                    OOo010ill oOo010ill = (OOo010ill) ((WeakReference) o0oIo1.I000OiO.get(i)).get();
/* 59 */                    if (oOo010ill != null) {
/* 61 */                        oOo010ill.I000II = oo0OI01Il2;
                            }
                        }
/* 66 */                O0oIIi o0oIIi = o0oIo1.I000lI;
                        synchronized (o0oIIi.I0000Il00O) {
/* 72 */                    o0oIIi.I000OiO = null;
/* 74 */                    o0oIIi.I000l1 = null;
/* 76 */                    o0oIIi.I000iOII = null;
/* 78 */                    o0oIIi.I000lI = null;
/* 80 */                    o0oIIi.I000o00OoI0I = null;
                        }
/* 88 */                if (O0000Ioio00.I0000O(oo0OI01Il, oo0OI01Il2)) {
/* 90 */                    if (z) {
/* 92 */                        IoloOio0I ioloOio0I = o0oIo1.I00000oOI;
/* 96 */                        int iI000II = Oo0lI00l.I000II(oo0OI01Il2.I00000oOI);
/* 102 */                       int iI0001Ioi1lo = Oo0lI00l.I0001Ioi1lo(oo0OI01Il2.I00000oOI);
/* 108 */                       Oo0lI00l oo0lI00l = o0oIo1.I000O01llI0.I0000Il00O;
/* 120 */                       int iI000II2 = oo0lI00l != null ? Oo0lI00l.I000II(oo0lI00l.I00000oIO) : -1;
/* 123 */                       Oo0lI00l oo0lI00l2 = o0oIo1.I000O01llI0.I0000Il00O;
/* 143 */                       ioloOio0I.I00IoIO0lI().updateSelection((View) ioloOio0I.I00iiI, iI000II, iI0001Ioi1lo, iI000II2, oo0lI00l2 != null ? Oo0lI00l.I0001Ioi1lo(oo0lI00l2.I00000oIO) : -1);
/* 146 */                       return;
                            }
/* 332 */                   return;
                        }
/* 147 */               if (oo0OI01Il != null && (!O0000Ioio00.I0000O(oo0OI01Il.I00000oIO.I00iiI, oo0OI01Il2.I00000oIO.I00iiI) || (Oo0lI00l.I0000Il00O(oo0OI01Il.I00000oOI, oo0OI01Il2.I00000oOI) && !O0000Ioio00.I0000O(oo0OI01Il.I0000Il00O, oo0OI01Il2.I0000Il00O)))) {
/* 183 */                   IoloOio0I ioloOio0I2 = o0oIo1.I00000oOI;
/* 193 */                   ioloOio0I2.I00IoIO0lI().restartInput((View) ioloOio0I2.I00iiI);
/* 196 */                   return;
                        }
/* 199 */               int size2 = o0oIo1.I000OiO.size();
/* 203 */               for (int i2 = 0; i2 < size2; i2++) {
/* 217 */                   OOo010ill oOo010ill2 = (OOo010ill) ((WeakReference) o0oIo1.I000OiO.get(i2)).get();
/* 219 */                   if (oOo010ill2 != null) {
/* 221 */                       Oo0OI01Il oo0OI01Il3 = o0oIo1.I000O01llI0;
/* 223 */                       IoloOio0I ioloOio0I3 = o0oIo1.I00000oOI;
/* 227 */                       if (oOo010ill2.I000iOII) {
/* 230 */                           oOo010ill2.I000II = oo0OI01Il3;
/* 234 */                           if (oOo010ill2.I000OOo1O) {
/* 250 */                               ioloOio0I3.I00IoIO0lI().updateExtractedText((View) ioloOio0I3.I00iiI, oOo010ill2.I000O01llI0, lIioo1OOlO.I00000oIO(oo0OI01Il3));
                                    }
/* 253 */                           Oo0lI00l oo0lI00l3 = oo0OI01Il3.I0000Il00O;
/* 255 */                           long j = oo0OI01Il3.I00000oOI;
/* 267 */                           int iI000II3 = oo0lI00l3 != null ? Oo0lI00l.I000II(oo0lI00l3.I00000oIO) : -1;
/* 268 */                           Oo0lI00l oo0lI00l4 = oo0OI01Il3.I0000Il00O;
/* 298 */                           ioloOio0I3.I00IoIO0lI().updateSelection((View) ioloOio0I3.I00iiI, Oo0lI00l.I000II(j), Oo0lI00l.I0001Ioi1lo(j), iI000II3, oo0lI00l4 != null ? Oo0lI00l.I0001Ioi1lo(oo0lI00l4.I00000oIO) : -1);
                                }
                            }
                        }
                    }
                }

                @Override
                public final void I0001Ioi1lo() {
                    Ol1oolo ol1oolo;
/* 1 */             O0oIIIiiO1 o0oIIIiiO1 = this.I00000oIO;
/* 3 */             if (o0oIIIiiO1 == null || (ol1oolo = (Ol1oolo) iiliIooIliOo.I00000oIO(o0oIIIiiO1, IOlO0o100i1i.I00100o1O0lo)) == null) {
/* 20 */                return;
                    }
/* 17 */            ((IiIli1i1o) ol1oolo).I00000oIO();
                }

                @Override
                public final void I000II(OOo0IO oOo0IO) {
                    Rect rect;
/* 1 */             O0oIo1 o0oIo1 = this.I0000Il00O;
/* 3 */             if (o0oIo1 != null) {
/* 34 */                o0oIo1.I000l1 = new Rect(O1OooO0IlOo.I000II(oOo0IO.I00000oIO), O1OooO0IlOo.I000II(oOo0IO.I00000oOI), O1OooO0IlOo.I000II(oOo0IO.I0000Il00O), O1OooO0IlOo.I000II(oOo0IO.I0000O));
/* 42 */                if (!o0oIo1.I000OiO.isEmpty() || (rect = o0oIo1.I000l1) == null) {
/* 77 */                    return;
                        }
/* 55 */                o0oIo1.I00000oIO.requestRectangleOnScreen(new Rect(rect));
                    }
                }

                @Override
                public final void I000O01llI0(Oo0OI01Il oo0OI01Il, OIOlOI oIOlOI, Oo0iil0o0oI oo0iil0o0oI, OiI0lII1i oiI0lII1i, OOo0IO oOo0IO, OOo0IO oOo0IO2) {
/* 1 */             O0oIo1 o0oIo1 = this.I0000Il00O;
/* 3 */             if (o0oIo1 != null) {
/* 5 */                 O0oIIi o0oIIi = o0oIo1.I000lI;
                        synchronized (o0oIIi.I0000Il00O) {
                            try {
/* 10 */                        o0oIIi.I000OiO = oo0OI01Il;
/* 12 */                        o0oIIi.I000l1 = oIOlOI;
/* 14 */                        o0oIIi.I000iOII = oo0iil0o0oI;
/* 16 */                        o0oIIi.I000lI = oOo0IO;
/* 18 */                        o0oIIi.I000o00OoI0I = oOo0IO2;
/* 22 */                        if (o0oIIi.I0000oI00 || o0oIIi.I0000O) {
/* 31 */                            o0oIIi.I00000oIO();
                                }
                            } catch (Throwable th) {
/* 37 */                        throw th;
                            }
                        }
                    }
                }

                public final void I000OOo1O(I0IO1io0I i0IO1io0I) {
/* 1 */             O0oIIIiiO1 o0oIIIiiO1 = this.I00000oIO;
/* 3 */             if (o0oIIIiiO1 == null) {
/* 5 */                 return;
                    }
/* 38 */            this.I00000oOI = o0oIIIiiO1.I00lll10 ? iOi1II01i0.I0000O(o0oIIIiiO1.I00ooiO1I(), null, Ii01I10.I00iio, new Ii1O001loIoO(o0oIIIiiO1, new I0iOI0o1i(i0IO1io0I, this, o0oIIIiiO1, olIl0i, 1), olIl0i, 27), 1) : null;
                }

                public final void I000OiO(O0oIIIiiO1 o0oIIIiiO1) {
/* 1 */             O0oIIIiiO1 o0oIIIiiO12 = this.I00000oIO;
/* 3 */             if (o0oIIIiiO12 != o0oIIIiiO1) {
/* 28 */                Ioll0IliO1l.I0000Il00O("Expected textInputModifierNode to be " + o0oIIIiiO1 + " but was " + o0oIIIiiO12);
                    }
/* 32 */            this.I00000oIO = null;
                }
            }
