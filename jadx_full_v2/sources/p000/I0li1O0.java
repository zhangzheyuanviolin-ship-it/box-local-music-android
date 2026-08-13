            package p000;

            import android.graphics.Rect;
            import android.view.FocusFinder;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import java.lang.invoke.VarHandle;
            
/* 27 */    public final class I0li1O0 extends O1ooOo implements III010o1O, OiiooOl, O0O1ll1l1o10, O0iOoioOoI, OoIOloiIii {
                public final IIOIlOoI111 I00o0iI0io1;
                public final I0lio1O01i01 I00o0l1o1o0;

                public I0li1O0(I0lio1O01i01 i0lio1O01i01) {
/* 1 */             this.I00o0l1o1o0 = i0lio1O01i01;
/* 10 */            IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(9);
/* 13 */            iIOIlOoI111.I00iiI = this;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            this.I00o0iI0io1 = iIOIlOoI111;
                }

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 1 */             OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j);
/* 5 */             int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 7 */             int i2 = oO1I0001000iI001lllioOl.I00iiI;
/* 12 */            I0li0o i0li0o = new I0li0o(0);
/* 15 */            i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 17 */            VarHandle.storeStoreFence();
/* 25 */            return o1iOIoOiO0.I00io1l(i, i2, Il011I1OiO0I.I00iOIl, this.I00o0iI0io1, i0li0o);
                }

                @Override
                public final boolean I000OOo1O(KeyEvent keyEvent) {
/* 1 */             return false;
                }

                @Override
                public final Object I000l1() {
/* 1 */             return "androidx.compose.ui.layout.WindowInsetsRulers";
                }

                @Override
                public final boolean I00II0oii1o(KeyEvent keyEvent) {
                    Ili0i1il0l0l ili0i1il0l0lI00000oIO;
/* 1 */             int[] iArr = Ili11o0l.I00000oIO;
/* 3 */             long jI00000oIO = l0iloO.I00000oIO(keyEvent);
/* 17 */            if (O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00000oOI)) {
/* 19 */                ili0i1il0l0lI00000oIO = Ili0i1il0l0l.I00000oIO(2);
                    } else if (O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0000Il00O)) {
/* 33 */                ili0i1il0l0lI00000oIO = Ili0i1il0l0l.I00000oIO(1);
                    } else if (O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00100l0)) {
/* 56 */                ili0i1il0l0lI00000oIO = Ili0i1il0l0l.I00000oIO(keyEvent.isShiftPressed() ? 2 : 1);
                    } else {
/* 188 */               ili0i1il0l0lI00000oIO = O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I000II) ? Ili0i1il0l0l.I00000oIO(4) : O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0001Ioi1lo) ? Ili0i1il0l0l.I00000oIO(3) : (O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0000O) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I001lloI)) ? Ili0i1il0l0l.I00000oIO(5) : (O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0000oI00) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00II0Ol1O0l)) ? Ili0i1il0l0l.I00000oIO(6) : (O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I000O01llI0) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0010I0i) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00II0oii1o)) ? Ili0i1il0l0l.I00000oIO(7) : (O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00000oIO) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I001IIilI0O)) ? Ili0i1il0l0l.I00000oIO(8) : null;
                    }
/* 193 */           if (ili0i1il0l0lI00000oIO != null) {
/* 195 */               int i = ili0i1il0l0lI00000oIO.I00000oIO;
/* 201 */               if (l0iloO.I00000oOI(keyEvent) == 2) {
/* 203 */                   I0lio1O01i01 i0lio1O01i01 = this.I00o0l1o1o0;
/* 211 */                   IliIO10oO0 iliIO10oO0I000II = ((Ili1ioOlo0oO) i0lio1O01i01.getFocusOwner()).I000II();
/* 215 */                   if (iliIO10oO0I000II != null && iliIO10oO0I000II.I00o0iI0io1 && i0lio1O01i01.I00111O(i)) {
/* 242 */                       i0lio1O01i01.getPlayNavigationSoundEffect$ui().invoke(ili0i1il0l0lI00000oIO, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
/* 15 */                        return true;
                            }
/* 246 */                   OOo0IO embeddedViewFocusRect = i0lio1O01i01.getEmbeddedViewFocusRect();
/* 250 */                   Ili1iIl focusOwner = i0lio1O01i01.getFocusOwner();
/* 256 */                   IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(8);
/* 259 */                   iIOIlOoI111.I00iiI = ili0i1il0l0lI00000oIO;
/* 261 */                   VarHandle.storeStoreFence();
/* 266 */                   Boolean boolI0001Ioi1lo = ((Ili1ioOlo0oO) focusOwner).I0001Ioi1lo(i, embeddedViewFocusRect, iIOIlOoI111);
/* 270 */                   if (boolI0001Ioi1lo == null) {
/* 15 */                        return true;
                            }
/* 276 */                   if (boolI0001Ioi1lo.booleanValue()) {
/* 293 */                       i0lio1O01i01.getPlayNavigationSoundEffect$ui().invoke(ili0i1il0l0lI00000oIO, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
/* 15 */                        return true;
                            }
/* 297 */                   if (i != 1 && i != 2) {
/* 192 */                       return false;
                            }
/* 302 */                   Integer numI0000Il00O = Ili11o0l.I0000Il00O(i);
/* 326 */                   View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) i0lio1O01i01.getRootView(), i0lio1O01i01.getView(), numI0000Il00O != null ? numI0000Il00O.intValue() : 2);
/* 330 */                   if (viewFindNextFocus == null || viewFindNextFocus.equals(i0lio1O01i01)) {
/* 344 */                       return ((Ili1ioOlo0oO) i0lio1O01i01.getFocusOwner()).I000OOo1O(i);
                            }
                        }
                    }
/* 192 */           return false;
                }

                @Override
                public final Object I00Iooi00oi(OIIlIII0Ili oIIlIII0Ili, I01ii1IIl i01ii1IIl, IOoilo iOoilo) {
/* 3 */             long jI00Iooi00oi = oIIlIII0Ili.I00Iooi00oi(0L);
/* 11 */            OOo0IO oOo0IO = (OOo0IO) i01ii1IIl.invoke();
/* 20 */            OOo0IO oOo0IOI000OiO = oOo0IO != null ? oOo0IO.I000OiO(jI00Iooi00oi) : null;
/* 21 */            if (oOo0IOI000OiO != null) {
/* 43 */                this.I00o0l1o1o0.requestRectangleOnScreen(new Rect((int) oOo0IOI000OiO.I00000oIO, (int) oOo0IOI000OiO.I00000oOI, (int) oOo0IOI000OiO.I0000Il00O, (int) oOo0IOI000OiO.I0000O), false);
                    }
/* 46 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
/* 28 */        public final void I00oOio10iI1(Oil0O0I oil0O0I) {
                }
            }
