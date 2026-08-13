            package p000;

            import android.content.Context;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.View;
            import androidx.appcompat.widget.ActionBarContextView;
            import java.lang.ref.WeakReference;
            
            public final class i00IOOoolO extends I0I1liIO0ii implements O1ilOII {
                public Context I00iio;
                public O1illlIiilIl I00ilI0I1;
                public I1I0i0Ilo1Oi I00ilO0;
                public WeakReference I00io1l;
                public i00IOoliil0i I00ioIO;

                @Override
                public final void I00000oOI() {
/* 1 */             i00IOoliil0i i00iooliil0i = this.I00ioIO;
/* 5 */             if (i00iooliil0i.I000OOo1O != this) {
/* 7 */                 return;
                    }
/* 8 */             boolean z = i00iooliil0i.I00100l0;
/* 10 */            boolean z2 = i00iooliil0i.I00100o1O0lo;
/* 12 */            if (z || z2) {
/* 23 */                i00iooliil0i.I000OiO = this;
/* 27 */                i00iooliil0i.I000iOII = this.I00ilO0;
                    } else {
/* 19 */                this.I00ilO0.I00OIo(this);
                    }
/* 30 */            this.I00ilO0 = null;
/* 33 */            i00iooliil0i.I00000oIO(false);
/* 36 */            ActionBarContextView actionBarContextView = i00iooliil0i.I0001Ioi1lo;
/* 40 */            if (actionBarContextView.I00li1OI == null) {
/* 42 */                actionBarContextView.I0000oI00();
                    }
/* 49 */            i00iooliil0i.I0000Il00O.setHideOnContentScrollEnabled(i00iooliil0i.I001IO000);
/* 52 */            i00iooliil0i.I000OOo1O = null;
                }

                @Override
                public final View I0000Il00O() {
/* 1 */             WeakReference weakReference = this.I00io1l;
/* 3 */             if (weakReference != null) {
/* 9 */                 return (View) weakReference.get();
                    }
/* 12 */            return null;
                }

                @Override
                public final boolean I0000O(O1illlIiilIl o1illlIiilIl, MenuItem menuItem) {
/* 1 */             I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I00ilO0;
/* 3 */             if (i1I0i0Ilo1Oi != null) {
/* 9 */                 return ((o01l1ioOo0) i1I0i0Ilo1Oi.I00iiI).I000l1(this, menuItem);
                    }
/* 14 */            return false;
                }

                @Override
                public final O1illlIiilIl I0001Ioi1lo() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final MenuInflater I000II() {
/* 5 */             return new OliioiiiOo(this.I00iio);
                }

                @Override
                public final CharSequence I000O01llI0() {
/* 5 */             return this.I00ioIO.I0001Ioi1lo.getSubtitle();
                }

                @Override
                public final CharSequence I000OOo1O() {
/* 5 */             return this.I00ioIO.I0001Ioi1lo.getTitle();
                }

                @Override
                public final void I000OiO() {
/* 1 */             O1illlIiilIl o1illlIiilIl = this.I00ilI0I1;
/* 7 */             if (this.I00ioIO.I000OOo1O != this) {
/* 9 */                 return;
                    }
/* 10 */            o1illlIiilIl.I001i1O0Ol();
                    try {
/* 15 */                this.I00ilO0.I00OOll1(this, o1illlIiilIl);
                    } finally {
/* 23 */                o1illlIiilIl.I001IO000();
                    }
                }

                @Override
                public final boolean I000iOII() {
/* 5 */             return this.I00ioIO.I0001Ioi1lo.I00oII;
                }

                @Override
                public final void I000lI(View view) {
/* 5 */             this.I00ioIO.I0001Ioi1lo.setCustomView(view);
/* 13 */            this.I00io1l = new WeakReference(view);
                }

                @Override
                public final void I000o00OoI0I(int i) {
/* 13 */            I000oI1ioi(this.I00ioIO.I00000oIO.getResources().getString(i));
                }

                @Override
                public final void I000oI1ioi(CharSequence charSequence) {
/* 5 */             this.I00ioIO.I0001Ioi1lo.setSubtitle(charSequence);
                }

                @Override
                public final void I00100l0(int i) {
/* 13 */            I00100o1O0lo(this.I00ioIO.I00000oIO.getResources().getString(i));
                }

                @Override
                public final void I00100o1O0lo(CharSequence charSequence) {
/* 5 */             this.I00ioIO.I0001Ioi1lo.setTitle(charSequence);
                }

                @Override
                public final void I0010I0i(boolean z) {
/* 1 */             this.I00iiI = z;
/* 7 */             this.I00ioIO.I0001Ioi1lo.setTitleOptional(z);
                }

                @Override
                public final void I00IlilI0i0i(O1illlIiilIl o1illlIiilIl) {
/* 3 */             if (this.I00ilO0 == null) {
/* 29 */                return;
                    }
/* 6 */             I000OiO();
/* 13 */            I0I1ii0i i0I1ii0i = this.I00ioIO.I0001Ioi1lo.I00iio;
/* 15 */            if (i0I1ii0i != null) {
/* 17 */                i0I1ii0i.I000l1();
                    }
                }
            }
