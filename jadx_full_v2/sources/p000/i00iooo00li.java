            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.WindowInsets;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            import java.util.WeakHashMap;
            
            public final class i00iooo00li {
                public static final i00iooo00li I00000oOI = i00i11.I0010I0i;
                public i00i1I1 I00000oIO;

                public i00iooo00li(i00iooo00li i00iooo00liVar) {
/* 4 */             if (i00iooo00liVar == null) {
/* 151 */               this.I00000oIO = new i00i1I1(this);
/* 168 */               return;
                    }
/* 6 */             i00i1I1 i00i1i1 = i00iooo00liVar.I00000oIO;
/* 12 */            if (Build.VERSION.SDK_INT >= 35 && (i00i1i1 instanceof i00i11O)) {
/* 26 */                this.I00000oIO = new i00i11O(this, (i00i11O) i00i1i1);
                    } else if (i00i1i1 instanceof i00i11) {
/* 42 */                this.I00000oIO = new i00i11(this, (i00i11) i00i1i1);
                    } else if (i00i1i1 instanceof i00i0o0I1i0o) {
/* 57 */                this.I00000oIO = new i00i0o0I1i0o(this, (i00i0o0I1i0o) i00i1i1);
                    } else if (i00i1i1 instanceof i00i0II) {
/* 72 */                this.I00000oIO = new i00i0II(this, (i00i0II) i00i1i1);
                    } else if (i00i1i1 instanceof i00Ooo0i11) {
/* 87 */                this.I00000oIO = new i00Ooo0i11(this, (i00Ooo0i11) i00i1i1);
                    } else if (i00i1i1 instanceof i00Oi1Ii01) {
/* 102 */               this.I00000oIO = new i00Oi1Ii01(this, (i00Oi1Ii01) i00i1i1);
                    } else if (i00i1i1 instanceof i00Oi000) {
/* 117 */               this.I00000oIO = new i00Oi000(this, (i00Oi000) i00i1i1);
                    } else if (i00i1i1 instanceof i00OOi) {
/* 132 */               this.I00000oIO = new i00OOi(this, (i00OOi) i00i1i1);
                    } else {
/* 140 */               this.I00000oIO = new i00i1I1(this);
                    }
/* 142 */           i00i1i1.I0000oI00(this);
                }

                public static Ioo0l0I I00000oIO(Ioo0l0I ioo0l0I, int i, int i2, int i3, int i4) {
/* 5 */             int iMax = Math.max(0, ioo0l0I.I00000oIO - i);
/* 12 */            int iMax2 = Math.max(0, ioo0l0I.I00000oOI - i2);
/* 19 */            int iMax3 = Math.max(0, ioo0l0I.I0000Il00O - i3);
/* 26 */            int iMax4 = Math.max(0, ioo0l0I.I0000O - i4);
                    return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? ioo0l0I : Ioo0l0I.I00000oIO(iMax, iMax2, iMax3, iMax4);
                }

                public static i00iooo00li I0000Il00O(View view, WindowInsets windowInsets) {
                    i00i1I1 i00i11Var;
/* 3 */             windowInsets.getClass();
/* 6 */             i00iooo00li i00iooo00liVar = new i00iooo00li();
/* 13 */            if (Build.VERSION.SDK_INT >= 35) {
/* 17 */                i00i11Var = new i00i11O(i00iooo00liVar, windowInsets);
/* 20 */                i00iooo00liVar.I00000oIO = i00i11Var;
                    } else {
/* 28 */                i00i11Var = new i00i11(i00iooo00liVar, windowInsets);
/* 31 */                i00iooo00liVar.I00000oIO = i00i11Var;
                    }
/* 22 */            VarHandle.storeStoreFence();
/* 34 */            if (view != null && view.isAttachedToWindow()) {
/* 42 */                WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 48 */                i00i11Var.I001iOo1i0O(OooiIlOI0.I00000oIO(view));
/* 51 */                View rootView = view.getRootView();
/* 55 */                i00i11Var.I0000O(rootView);
/* 58 */                i00i11Var.I00100l0(rootView);
/* 61 */                i00i11Var.I00100o1O0lo();
/* 68 */                i00i11Var.I001l0I00(view.getWindowSystemUiVisibility());
                    }
/* 106 */           return i00iooo00liVar;
                }

                public final WindowInsets I00000oOI() {
/* 1 */             i00i1I1 i00i1i1 = this.I00000oIO;
/* 5 */             if (i00i1i1 instanceof i00OOi) {
/* 9 */                 return ((i00OOi) i00i1i1).I0000Il00O;
                    }
/* 12 */            return null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof i00iooo00li) {
/* 17 */                return Objects.equals(this.I00000oIO, ((i00iooo00li) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 1 */             i00i1I1 i00i1i1 = this.I00000oIO;
/* 3 */             if (i00i1i1 == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return i00i1i1.hashCode();
                }
            }
