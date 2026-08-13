            package p000;

            import android.graphics.Rect;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.WindowManager;
            import android.window.OnBackInvokedDispatcher;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
/* 18 */    public final class OO1lio extends I0100o111I {
                public static final OI1lOo I00oooO = new OI1lOo(24);
                public IllOOo00lI I00l0OO0IO;
                public OO1loiii I00li1OI;
                public String I00ll1;
                public View I00lli11;
                public boolean I00lll10;
                public i1O01Ill I00o0iI0io1;
                public WindowManager I00o0l1o1o0;
                public WindowManager.LayoutParams I00o101lO;
                public OO1ll1 I00oI0i;
                public O0iOOoiioO I00oII;
                public OIooliIO0 I00oIiI10;
                public OIooliIO0 I00oO101o;
                public IooO1IOlo I00oOio10iI1;
                public IiO0o1I I00ol1;
                public Rect I00olI;
                public Ol1olI0o1I01 I00oli;
                public I11OOio1 I00oliIiO01i;
                public OIooliIO0 I00oo1iO0ll;
                public boolean I00ooIo0;
                public int[] I00ooiO1I;

                public static final boolean I000o00OoI0I(OO1lio oO1lio) {
/* 1 */             O0iOOo0Ii parentLayoutCoordinates = oO1lio.getParentLayoutCoordinates();
/* 6 */             if (parentLayoutCoordinates == null || !parentLayoutCoordinates.I0010o()) {
/* 15 */                parentLayoutCoordinates = null;
                    }
                    return (parentLayoutCoordinates == null || oO1lio.m36getPopupContentSizebOM6tXw() == null) ? false : true;
                }

                private final IlliIl1l11O getContent() {
/* 7 */             return (IlliIl1l11O) this.I00oo1iO0ll.getValue();
                }

                private final IooO1IOlo getDisplayBounds() {
/* 1 */             View view = this.I00lli11;
/* 3 */             Rect rect = this.I00olI;
/* 9 */             int i = this.I00li1OI.I00000oIO & Barcode.FORMAT_UPC_A;
/* 11 */            i1O01Ill i1o01ill = this.I00o0iI0io1;
/* 13 */            if (i == 0) {
/* 15 */                i1o01ill.getClass();
/* 18 */                view.getWindowVisibleDisplayFrame(rect);
                    } else {
/* 22 */                i1o01ill.getClass();
/* 45 */                rect.set(((WindowManager) view.getContext().getSystemService("window")).getCurrentWindowMetrics().getBounds());
                    }
/* 58 */            return new IooO1IOlo(rect.left, rect.top, rect.right, rect.bottom);
                }

                private final O0iOOo0Ii getParentLayoutCoordinates() {
/* 7 */             return (O0iOOo0Ii) this.I00oO101o.getValue();
                }

                private final void setContent(IlliIl1l11O illiIl1l11O) {
/* 3 */             this.I00oo1iO0ll.setValue(illiIl1l11O);
                }

                private final void setParentLayoutCoordinates(O0iOOo0Ii o0iOOo0Ii) {
/* 3 */             this.I00oO101o.setValue(o0iOOo0Ii);
                }

                @Override
                public final void I00000oIO(int i, IloI0lOlll1 iloI0lOlll1) {
/* 4 */             iloI0lOlll1.I00i0O(-857613600);
/* 17 */            int i2 = i | (iloI0lOlll1.I000OOo1O(this) ? 4 : 2);
/* 32 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 42 */                getContent().invoke(iloI0lOlll1, 0);
                    } else {
/* 46 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 49 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 53 */            if (oOloioIlI001IO000 != null) {
/* 59 */                O1IIii o1IIii = new O1IIii(14);
/* 62 */                o1IIii.I00iiI = this;
/* 64 */                VarHandle.storeStoreFence();
/* 67 */                oOloioIlI001IO000.I0000O = o1IIii;
                    }
                }

                @Override
                public final void I000II(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             WindowManager.LayoutParams layoutParams = this.I00o101lO;
/* 3 */             super.I000II(z, i, i2, i3, i4);
/* 8 */             this.I00li1OI.getClass();
/* 12 */            View childAt = getChildAt(0);
/* 16 */            if (childAt == null) {
/* 18 */                return;
                    }
/* 23 */            layoutParams.width = childAt.getMeasuredWidth();
/* 29 */            layoutParams.height = childAt.getMeasuredHeight();
/* 31 */            i1O01Ill i1o01ill = this.I00o0iI0io1;
/* 33 */            WindowManager windowManager = this.I00o0l1o1o0;
/* 35 */            i1o01ill.getClass();
/* 38 */            windowManager.updateViewLayout(this, layoutParams);
                }

                @Override
                public final void I000O01llI0(int i, int i2) {
/* 3 */             this.I00li1OI.getClass();
/* 6 */             IooO1IOlo displayBounds = getDisplayBounds();
/* 28 */            super.I000O01llI0(View.MeasureSpec.makeMeasureSpec(displayBounds.I0000O(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.I00000oOI(), Integer.MIN_VALUE));
                }

                public final void I000oI1ioi(IOl1ool0 iOl1ool0, IlliIl1l11O illiIl1l11O) {
/* 1 */             setParentCompositionContext(iOl1ool0);
/* 4 */             setContent(illiIl1l11O);
/* 8 */             this.I00ooIo0 = true;
                }

                public final void I00100l0(IllOOo00lI illOOo00lI, OO1loiii oO1loiii, String str, O0iOOoiioO o0iOOoiioO) {
                    int i;
/* 1 */             this.I00l0OO0IO = illOOo00lI;
/* 3 */             this.I00ll1 = str;
/* 5 */             WindowManager.LayoutParams layoutParams = this.I00o101lO;
/* 13 */            if (!O0000Ioio00.I0000O(this.I00li1OI, oO1loiii)) {
/* 16 */                oO1loiii.getClass();
/* 19 */                this.I00li1OI = oO1loiii;
/* 23 */                boolean zI00000oOI = I0olo0.I00000oOI(this.I00lli11);
/* 27 */                boolean z = oO1loiii.I00000oOI;
/* 29 */                int i2 = oO1loiii.I00000oIO;
/* 31 */                if (z && zI00000oOI) {
/* 35 */                    i2 |= 8192;
                        } else if (z && !zI00000oOI) {
/* 42 */                    i2 &= -8193;
                        }
/* 44 */                layoutParams.flags = i2;
/* 46 */                i1O01Ill i1o01ill = this.I00o0iI0io1;
/* 48 */                WindowManager windowManager = this.I00o0l1o1o0;
/* 50 */                i1o01ill.getClass();
/* 53 */                windowManager.updateViewLayout(this, layoutParams);
                    }
/* 56 */            int iOrdinal = o0iOOoiioO.ordinal();
/* 60 */            if (iOrdinal != 0) {
/* 62 */                i = 1;
/* 63 */                if (iOrdinal != 1) {
/* 66 */                    I000II.I00000oIO();
/* 69 */                    return;
                        }
                    } else {
/* 70 */                i = 0;
                    }
/* 71 */            super.setLayoutDirection(i);
                }

                public final void I00100o1O0lo() {
/* 1 */             O0iOOo0Ii parentLayoutCoordinates = getParentLayoutCoordinates();
/* 5 */             if (parentLayoutCoordinates != null) {
/* 11 */                if (!parentLayoutCoordinates.I0010o()) {
/* 14 */                    parentLayoutCoordinates = null;
                        }
/* 15 */                if (parentLayoutCoordinates == null) {
/* 110 */                   return;
                        }
/* 18 */                long jI000iOII = parentLayoutCoordinates.I000iOII();
/* 33 */                long jI001l0I00 = this.I00lll10 ? parentLayoutCoordinates.I001l0I00(0L) : parentLayoutCoordinates.I0000O(0L);
/* 71 */                IooO1IOlo iooO1IOloI00000oIO = ioooOioll1.I00000oIO((Math.round(Float.intBitsToFloat((int) (jI001l0I00 >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (jI001l0I00 & 4294967295L)))), jI000iOII);
/* 81 */                if (iooO1IOloI00000oIO.equals(this.I00oOio10iI1)) {
/* 110 */                   return;
                        }
/* 83 */                this.I00oOio10iI1 = iooO1IOloI00000oIO;
/* 85 */                I0010o();
                    }
                }

                public final void I0010I0i(O0iOOo0Ii o0iOOo0Ii) {
/* 1 */             setParentLayoutCoordinates(o0iOOo0Ii);
/* 4 */             I00100o1O0lo();
                }

                public final void I0010o() {
                    IooOl0ol01 iooOl0ol01M36getPopupContentSizebOM6tXw;
/* 1 */             i1O01Ill i1o01ill = this.I00o0iI0io1;
/* 3 */             WindowManager.LayoutParams layoutParams = this.I00o101lO;
/* 5 */             IooO1IOlo iooO1IOlo = this.I00oOio10iI1;
/* 7 */             if (iooO1IOlo == null || (iooOl0ol01M36getPopupContentSizebOM6tXw = m36getPopupContentSizebOM6tXw()) == null) {
/* 245 */               return;
                    }
/* 16 */            long j = iooOl0ol01M36getPopupContentSizebOM6tXw.I00000oIO;
/* 18 */            IooO1IOlo displayBounds = getDisplayBounds();
/* 41 */            long jI0000O = (displayBounds.I0000O() << 32) | (displayBounds.I00000oOI() & 4294967295L);
/* 45 */            OOo0o0oO oOo0o0oO = new OOo0o0oO();
/* 50 */            oOo0o0oO.I00iOIl = 0L;
/* 52 */            Ol1olI0o1I01 ol1olI0o1I01 = this.I00oli;
/* 56 */            OO1lil oO1lil = new OO1lil();
/* 59 */            oO1lil.I00iOIl = oOo0o0oO;
/* 61 */            oO1lil.I00iiI = this;
/* 63 */            oO1lil.I00iiO = iooO1IOlo;
/* 65 */            oO1lil.I00iio = jI0000O;
/* 67 */            oO1lil.I00ilI0I1 = j;
/* 69 */            VarHandle.storeStoreFence();
/* 74 */            ol1olI0o1I01.I0000oI00(this, I00oooO, oO1lil);
/* 77 */            long j2 = oOo0o0oO.I00iOIl;
/* 82 */            layoutParams.x = (int) (j2 >> 32);
/* 86 */            layoutParams.y = (int) (j2 & 4294967295L);
/* 92 */            if (this.I00li1OI.I0000oI00) {
/* 100 */               i1o01ill.getClass();
/* 117 */               setSystemGestureExclusionRects(IOOi1I.I000OiO(new Rect(0, 0, (int) (jI0000O >> 32), (int) (jI0000O & 4294967295L))));
                    }
/* 120 */           WindowManager windowManager = this.I00o0l1o1o0;
/* 122 */           i1o01ill.getClass();
/* 125 */           windowManager.updateViewLayout(this, layoutParams);
                }

                @Override
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 5 */             if (!this.I00li1OI.I0000Il00O) {
/* 7 */                 return super.dispatchKeyEvent(keyEvent);
                    }
/* 17 */            if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
/* 27 */                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
/* 31 */                if (keyDispatcherState == null) {
/* 33 */                    return super.dispatchKeyEvent(keyEvent);
                        }
/* 43 */                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
/* 51 */                    keyDispatcherState.startTracking(keyEvent, this);
/* 42 */                    return true;
                        }
/* 59 */                if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
/* 73 */                    IllOOo00lI illOOo00lI = this.I00l0OO0IO;
/* 75 */                    if (illOOo00lI != null) {
/* 77 */                        illOOo00lI.invoke();
                            }
/* 42 */                    return true;
                        }
                    }
/* 81 */            return super.dispatchKeyEvent(keyEvent);
                }

                public final boolean getCanCalculatePosition() {
/* 9 */             return ((Boolean) this.I00ol1.getValue()).booleanValue();
                }

                public final WindowManager.LayoutParams getParams$ui() {
/* 1 */             return this.I00o101lO;
                }

                public final O0iOOoiioO getParentLayoutDirection() {
/* 1 */             return this.I00oII;
                }

                public final IooOl0ol01 m36getPopupContentSizebOM6tXw() {
/* 7 */             return (IooOl0ol01) this.I00oIiI10.getValue();
                }

                public final OO1ll1 getPositionProvider() {
/* 1 */             return this.I00oI0i;
                }

                @Override
                public boolean getShouldCreateCompositionOnAttachedToWindow() {
/* 1 */             return this.I00ooIo0;
                }

                public final String getTestTag() {
/* 1 */             return this.I00ll1;
                }

                public View getViewRoot() {
/* 1 */             return null;
                }

                @Override
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             this.I00oli.I0001Ioi1lo();
/* 13 */            if (this.I00li1OI.I0000Il00O) {
/* 15 */                I11OOio1 i11OOio1 = this.I00oliIiO01i;
/* 17 */                if (i11OOio1 == null) {
/* 19 */                    IllOOo00lI illOOo00lI = this.I00l0OO0IO;
/* 24 */                    I11OOio1 i11OOio12 = new I11OOio1(0);
/* 27 */                    i11OOio12.I00000oOI = illOOo00lI;
/* 29 */                    VarHandle.storeStoreFence();
/* 32 */                    this.I00oliIiO01i = i11OOio12;
/* 34 */                    i11OOio1 = i11OOio12;
                        }
/* 35 */                OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
/* 39 */                if (onBackInvokedDispatcherFindOnBackInvokedDispatcher != null) {
/* 44 */                    onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, i11OOio1);
                        }
                    }
                }

                @Override
                public final void onDetachedFromWindow() {
                    OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
/* 1 */             super.onDetachedFromWindow();
/* 4 */             Ol1olI0o1I01 ol1olI0o1I01 = this.I00oli;
/* 6 */             I0IOIlIOIII i0IOIlIOIII = ol1olI0o1I01.I000O01llI0;
/* 8 */             if (i0IOIlIOIII != null) {
/* 10 */                i0IOIlIOIII.I000II();
                    }
/* 13 */            ol1olI0o1I01.I00000oIO();
/* 16 */            I11OOio1 i11OOio1 = this.I00oliIiO01i;
/* 18 */            if (i11OOio1 != null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) != null) {
/* 26 */                onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(i11OOio1);
                    }
/* 30 */            this.I00oliIiO01i = null;
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 5 */             if (!this.I00li1OI.I0000O) {
/* 7 */                 return super.onTouchEvent(motionEvent);
                    }
/* 13 */            if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
/* 64 */                IllOOo00lI illOOo00lI = this.I00l0OO0IO;
/* 66 */                if (illOOo00lI != null) {
/* 68 */                    illOOo00lI.invoke();
/* 12 */                    return true;
                        }
                    } else {
/* 72 */                if (motionEvent == null || motionEvent.getAction() != 4) {
/* 89 */                    return super.onTouchEvent(motionEvent);
                        }
/* 81 */                IllOOo00lI illOOo00lI2 = this.I00l0OO0IO;
/* 83 */                if (illOOo00lI2 != null) {
/* 85 */                    illOOo00lI2.invoke();
                        }
                    }
/* 12 */            return true;
                }

                public final void setParentLayoutDirection(O0iOOoiioO o0iOOoiioO) {
/* 1 */             this.I00oII = o0iOOoiioO;
                }

                public final void m37setPopupContentSizefhxjrPA(IooOl0ol01 iooOl0ol01) {
/* 3 */             this.I00oIiI10.setValue(iooOl0ol01);
                }

                public final void setPositionProvider(OO1ll1 oO1ll1) {
/* 1 */             this.I00oI0i = oO1ll1;
                }

                public final void setTestTag(String str) {
/* 1 */             this.I00ll1 = str;
                }

/* 19 */        public static void getParams$ui$annotations() {
                }

/* 19 */        public I0100o111I getSubCompositionView() {
/* 20 */            return this;
                }

                @Override
/* 28 */        public void setLayoutDirection(int i) {
                }
            }
