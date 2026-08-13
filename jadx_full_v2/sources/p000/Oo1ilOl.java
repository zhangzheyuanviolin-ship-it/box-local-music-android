            package p000;

            import android.graphics.drawable.Drawable;
            import android.text.TextUtils;
            import android.view.View;
            import android.view.Window;
            import androidx.appcompat.widget.Toolbar;
            import java.lang.invoke.VarHandle;
            
            public final class Oo1ilOl implements Ii1iOIIi {
                public Toolbar I00000oIO;
                public int I00000oOI;
                public View I0000Il00O;
                public Drawable I0000O;
                public Drawable I0000oI00;
                public Drawable I0001Ioi1lo;
                public boolean I000II;
                public CharSequence I000O01llI0;
                public CharSequence I000OOo1O;
                public CharSequence I000OiO;
                public Window.Callback I000iOII;
                public boolean I000l1;
                public I0I1ii0i I000lI;
                public int I000o00OoI0I;
                public Drawable I000oI1ioi;

                public final void I00000oIO(int i) {
                    View view;
/* 1 */             Toolbar toolbar = this.I00000oIO;
/* 5 */             int i2 = this.I00000oOI ^ i;
/* 6 */             this.I00000oOI = i;
/* 8 */             if (i2 != 0) {
/* 13 */                if ((i2 & 4) != 0) {
/* 17 */                    if ((i & 4) != 0) {
/* 19 */                        I0000Il00O();
                            }
/* 26 */                    if ((this.I00000oOI & 4) != 0) {
/* 28 */                        Drawable drawable = this.I0001Ioi1lo;
/* 30 */                        if (drawable == null) {
/* 33 */                            drawable = this.I000oI1ioi;
                                }
/* 35 */                        toolbar.setNavigationIcon(drawable);
                            } else {
/* 39 */                        toolbar.setNavigationIcon((Drawable) null);
                            }
                        }
/* 44 */                if ((i2 & 3) != 0) {
/* 46 */                    I0000O();
                        }
/* 51 */                if ((i2 & 8) != 0) {
/* 55 */                    if ((i & 8) != 0) {
/* 59 */                        toolbar.setTitle(this.I000O01llI0);
/* 64 */                        toolbar.setSubtitle(this.I000OOo1O);
                            } else {
/* 68 */                        toolbar.setTitle((CharSequence) null);
/* 71 */                        toolbar.setSubtitle((CharSequence) null);
                            }
                        }
/* 76 */                if ((i2 & 16) == 0 || (view = this.I0000Il00O) == null) {
/* 168 */                   return;
                        }
/* 84 */                if ((i & 16) != 0) {
/* 86 */                    toolbar.addView(view);
                        } else {
/* 90 */                    toolbar.removeView(view);
                        }
                    }
                }

                public final OoolOO I00000oOI(int i, long j) {
/* 3 */             OoolOO ooolOOI00000oIO = OooiOl0ioo0i.I00000oIO(this.I00000oIO);
/* 13 */            ooolOOI00000oIO.I00000oIO(i == 0 ? 1.0f : 0.0f);
/* 16 */            ooolOOI00000oIO.I0000Il00O(j);
/* 22 */            Oo1ii1o oo1ii1o = new Oo1ii1o(0);
/* 25 */            oo1ii1o.I0000O = this;
/* 27 */            oo1ii1o.I0000Il00O = i;
/* 29 */            oo1ii1o.I00000oOI = false;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            ooolOOI00000oIO.I0000O(oo1ii1o);
/* 37 */            return ooolOOI00000oIO;
                }

                public final void I0000Il00O() {
/* 5 */             if ((this.I00000oOI & 4) != 0) {
/* 9 */                 boolean zIsEmpty = TextUtils.isEmpty(this.I000OiO);
/* 13 */                Toolbar toolbar = this.I00000oIO;
/* 15 */                if (zIsEmpty) {
/* 19 */                    toolbar.setNavigationContentDescription(this.I000o00OoI0I);
                        } else {
/* 25 */                    toolbar.setNavigationContentDescription(this.I000OiO);
                        }
                    }
                }

                public final void I0000O() {
                    Drawable drawable;
/* 1 */             int i = this.I00000oOI;
/* 5 */             if ((i & 2) == 0) {
/* 22 */                drawable = null;
                    } else if ((i & 1) == 0 || (drawable = this.I0000oI00) == null) {
/* 16 */                drawable = this.I0000O;
                    }
/* 25 */            this.I00000oIO.setLogo(drawable);
                }
            }
