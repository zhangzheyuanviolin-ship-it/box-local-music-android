            package p000;

            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.view.WindowManager;
            
/* 18 */    public final class Iii0oiil extends IOiOOll1 {
                public IllOOo00lI I00ilI0I1;
                public Iii0io0OooO I00ilO0;
                public View I00io1l;
                public Iii0OO1IIiO I00ioIO;
                public boolean I00l0I0l0lO1;

                public static final void I0001Ioi1lo(ViewGroup viewGroup) {
/* 2 */             viewGroup.setClipChildren(false);
/* 7 */             if (viewGroup instanceof Iii0OO1IIiO) {
/* 77 */                return;
                    }
/* 10 */            int childCount = viewGroup.getChildCount();
/* 14 */            for (int i = 0; i < childCount; i++) {
/* 16 */                View childAt = viewGroup.getChildAt(i);
/* 27 */                ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
/* 28 */                if (viewGroup2 != null) {
/* 30 */                    I0001Ioi1lo(viewGroup2);
                        }
                    }
                }

                public final void I000II(IllOOo00lI illOOo00lI, Iii0io0OooO iii0io0OooO, O0iOOoiioO o0iOOoiioO) {
                    int i;
/* 1 */             Iii0OO1IIiO iii0OO1IIiO = this.I00ioIO;
/* 3 */             this.I00ilI0I1 = illOOo00lI;
/* 5 */             this.I00ilO0 = iii0io0OooO;
/* 7 */             Oii0IOl oii0IOl = iii0io0OooO.I0000Il00O;
/* 11 */            boolean zI00000oOI = I0olo0.I00000oOI(this.I00io1l);
/* 15 */            int iOrdinal = oii0IOl.ordinal();
/* 21 */            if (iOrdinal != 0) {
/* 23 */                if (iOrdinal == 1) {
/* 34 */                    zI00000oOI = true;
                        } else {
/* 26 */                    if (iOrdinal != 2) {
/* 30 */                        I000II.I00000oIO();
/* 33 */                        return;
                            }
/* 28 */                    zI00000oOI = false;
                        }
                    }
/* 47 */            getWindow().setFlags(zI00000oOI ? 8192 : -8193, 8192);
/* 50 */            int iOrdinal2 = o0iOOoiioO.ordinal();
/* 54 */            if (iOrdinal2 == 0) {
/* 64 */                i = 0;
                    } else {
/* 56 */                if (iOrdinal2 != 1) {
/* 60 */                    I000II.I00000oIO();
/* 63 */                    return;
                        }
/* 58 */                i = 1;
                    }
/* 65 */            iii0OO1IIiO.setLayoutDirection(i);
/* 68 */            boolean z = iii0io0OooO.I0000O;
/* 70 */            Window window = iii0OO1IIiO.I00l0OO0IO;
/* 87 */            boolean z2 = (iii0OO1IIiO.I00lll10 && z == iii0OO1IIiO.I00ll1 && true == iii0OO1IIiO.I00lli11) ? false : true;
/* 88 */            iii0OO1IIiO.I00ll1 = z;
/* 90 */            iii0OO1IIiO.I00lli11 = true;
/* 92 */            if (z2) {
/* 94 */                WindowManager.LayoutParams attributes = window.getAttributes();
/* 103 */               int i2 = z ? -2 : -1;
/* 106 */               if (i2 != attributes.width || !iii0OO1IIiO.I00lll10) {
/* 112 */                   window.setLayout(i2, -2);
/* 115 */                   iii0OO1IIiO.I00lll10 = true;
                        }
                    }
/* 119 */           setCanceledOnTouchOutside(iii0io0OooO.I00000oOI);
/* 122 */           Window window2 = getWindow();
/* 126 */           if (window2 != null) {
/* 128 */               window2.setSoftInputMode(0);
                    }
                }

                @Override
                public final boolean onKeyUp(int i, KeyEvent keyEvent) {
/* 5 */             if (!this.I00ilO0.I00000oIO || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
/* 30 */                return super.onKeyUp(i, keyEvent);
                    }
/* 25 */            this.I00ilI0I1.invoke();
/* 28 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    View childAt;
                    int iI000II;
/* 1 */             boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
/* 12 */            if (this.I00ilO0.I00000oOI) {
/* 14 */                Iii0OO1IIiO iii0OO1IIiO = this.I00ioIO;
/* 16 */                iii0OO1IIiO.getClass();
/* 32 */                if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = iii0OO1IIiO.getChildAt(0)) != null) {
/* 61 */                    int left = childAt.getLeft() + iii0OO1IIiO.getLeft();
/* 66 */                    int width = childAt.getWidth() + left;
/* 75 */                    int top = childAt.getTop() + iii0OO1IIiO.getTop();
/* 80 */                    int height = childAt.getHeight() + top;
/* 85 */                    int iI000II2 = O1OooO0IlOo.I000II(motionEvent.getX());
/* 89 */                    if (left <= iI000II2 && iI000II2 <= width && top <= (iI000II = O1OooO0IlOo.I000II(motionEvent.getY())) && iI000II <= height) {
/* 135 */                       int actionMasked = motionEvent.getActionMasked();
/* 139 */                       if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
/* 146 */                           this.I00l0I0l0lO1 = false;
/* 168 */                           return zOnTouchEvent;
                                }
                            }
                        }
/* 106 */               int actionMasked2 = motionEvent.getActionMasked();
/* 110 */               if (actionMasked2 == 0) {
/* 132 */                   this.I00l0I0l0lO1 = true;
/* 11 */                    return true;
                        }
/* 112 */               if (actionMasked2 != 1) {
/* 114 */                   if (actionMasked2 == 3) {
/* 117 */                       this.I00l0I0l0lO1 = false;
/* 119 */                       return zOnTouchEvent;
                            }
                        } else if (this.I00l0I0l0lO1) {
/* 126 */                   this.I00ilI0I1.invoke();
/* 129 */                   this.I00l0I0l0lO1 = false;
/* 11 */                    return true;
                        }
                    }
/* 145 */           return zOnTouchEvent;
                }

                @Override
/* 19 */        public final void cancel() {
                }
            }
