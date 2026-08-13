            package p000;

            import android.os.Build;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.view.WindowManager;
            
/* 18 */    public final class O1o1lI0I extends IOiOOll1 {
                public IllOOo00lI I00ilI0I1;
                public O1oI0oOoi I00ilO0;
                public long I00io1l;
                public View I00ioIO;
                public O1o1iol1oO0 I00l0I0l0lO1;

                public final void I0001Ioi1lo(IllOOo00lI illOOo00lI, O1oI0oOoi o1oI0oOoi, long j, O0iOOoiioO o0iOOoiioO) {
                    int i;
/* 1 */             this.I00ilI0I1 = illOOo00lI;
/* 3 */             this.I00ilO0 = o1oI0oOoi;
/* 5 */             this.I00io1l = j;
/* 7 */             o1oI0oOoi.getClass();
/* 10 */            Oii0IOl oii0IOl = Oii0IOl.I00iOIl;
/* 18 */            ViewGroup.LayoutParams layoutParams = this.I00ioIO.getRootView().getLayoutParams();
/* 29 */            WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
/* 54 */            getWindow().setFlags(layoutParams2 != null && (layoutParams2.flags & 8192) != 0 ? 8192 : -8193, 8192);
/* 57 */            O1o1iol1oO0 o1o1iol1oO0 = this.I00l0I0l0lO1;
/* 59 */            int iOrdinal = o0iOOoiioO.ordinal();
/* 63 */            if (iOrdinal == 0) {
/* 73 */                i = 0;
                    } else {
/* 65 */                if (iOrdinal != 1) {
/* 69 */                    I000II.I00000oIO();
/* 72 */                    return;
                        }
/* 67 */                i = 1;
                    }
/* 74 */            o1o1iol1oO0.setLayoutDirection(i);
/* 77 */            Window window = getWindow();
/* 81 */            if (window != null) {
/* 84 */                window.setLayout(-1, -1);
                    }
/* 87 */            Window window2 = getWindow();
/* 91 */            if (window2 != null) {
/* 95 */                window2.setSoftInputMode(48);
                    }
/* 98 */            Window window3 = getWindow();
/* 112 */           new Oi00IilOloo0(getWindow().getDecorView());
/* 129 */           OoOlO1O0o i00ioooo11i = Build.VERSION.SDK_INT >= 35 ? new i00ioooO11i(window3) : new OoOlO1O0o(window3);
/* 132 */           long j2 = IOOiio0i.I000lI;
/* 154 */           i00ioooo11i.I0000oI00(!Ooi0i1.I00000oOI(j, j2) && ((double) iiO01ll11o1l.I000O01llI0(j)) <= 0.5d);
/* 174 */           i00ioooo11i.I0000Il00O(!Ooi0i1.I00000oOI(j, j2) && ((double) iiO01ll11o1l.I000O01llI0(j)) <= 0.5d);
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
/* 1 */             boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
/* 5 */             if (zOnTouchEvent) {
/* 9 */                 this.I00ilI0I1.invoke();
                    }
/* 29 */            return zOnTouchEvent;
                }

                @Override
/* 19 */        public final void cancel() {
                }
            }
