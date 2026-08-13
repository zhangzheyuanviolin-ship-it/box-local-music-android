            package p000;

            import android.content.Context;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.View;
            import androidx.appcompat.widget.ActionBarContextView;
            import java.lang.ref.WeakReference;
            
            public final class OlIl0I1Il extends I0I1liIO0ii implements O1ilOII {
                public Context I00iio;
                public ActionBarContextView I00ilI0I1;
                public I1I0i0Ilo1Oi I00ilO0;
                public WeakReference I00io1l;
                public boolean I00ioIO;
                public O1illlIiilIl I00l0I0l0lO1;

                @Override
                public final void I00000oOI() {
/* 3 */             if (this.I00ioIO) {
/* 5 */                 return;
                    }
/* 7 */             this.I00ioIO = true;
/* 11 */            this.I00ilO0.I00OIo(this);
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
/* 7 */             return ((o01l1ioOo0) this.I00ilO0.I00iiI).I000l1(this, menuItem);
                }

                @Override
                public final O1illlIiilIl I0001Ioi1lo() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                @Override
                public final MenuInflater I000II() {
/* 9 */             return new OliioiiiOo(this.I00ilI0I1.getContext());
                }

                @Override
                public final CharSequence I000O01llI0() {
/* 3 */             return this.I00ilI0I1.getSubtitle();
                }

                @Override
                public final CharSequence I000OOo1O() {
/* 3 */             return this.I00ilI0I1.getTitle();
                }

                @Override
                public final void I000OiO() {
/* 5 */             this.I00ilO0.I00OOll1(this, this.I00l0I0l0lO1);
                }

                @Override
                public final boolean I000iOII() {
/* 3 */             return this.I00ilI0I1.I00oII;
                }

                @Override
                public final void I000lI(View view) {
/* 3 */             this.I00ilI0I1.setCustomView(view);
/* 15 */            this.I00io1l = view != null ? new WeakReference(view) : null;
                }

                @Override
                public final void I000o00OoI0I(int i) {
/* 7 */             I000oI1ioi(this.I00iio.getString(i));
                }

                @Override
                public final void I000oI1ioi(CharSequence charSequence) {
/* 3 */             this.I00ilI0I1.setSubtitle(charSequence);
                }

                @Override
                public final void I00100l0(int i) {
/* 7 */             I00100o1O0lo(this.I00iio.getString(i));
                }

                @Override
                public final void I00100o1O0lo(CharSequence charSequence) {
/* 3 */             this.I00ilI0I1.setTitle(charSequence);
                }

                @Override
                public final void I0010I0i(boolean z) {
/* 1 */             this.I00iiI = z;
/* 5 */             this.I00ilI0I1.setTitleOptional(z);
                }

                @Override
                public final void I00IlilI0i0i(O1illlIiilIl o1illlIiilIl) {
/* 1 */             I000OiO();
/* 6 */             I0I1ii0i i0I1ii0i = this.I00ilI0I1.I00iio;
/* 8 */             if (i0I1ii0i != null) {
/* 10 */                i0I1ii0i.I000l1();
                    }
                }
            }
