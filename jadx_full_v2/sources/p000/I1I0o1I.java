            package p000;

            import android.content.DialogInterface;
            import android.graphics.drawable.Drawable;
            import android.util.Log;
            import android.widget.ListAdapter;
            import androidx.appcompat.app.AlertController$RecycleListView;
            
            public final class I1I0o1I implements I1I1O010, DialogInterface.OnClickListener {
                public I0ilIO0oloO1 I00iOIl;
                public I1I0oI1Olo1 I00iiI;
                public CharSequence I00iiO;
                public I1I1OI00IOo I00iio;

                @Override
                public final boolean I00000oIO() {
/* 1 */             I0ilIO0oloO1 i0ilIO0oloO1 = this.I00iOIl;
/* 3 */             if (i0ilIO0oloO1 != null) {
/* 5 */                 return i0ilIO0oloO1.isShowing();
                    }
/* 10 */            return false;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return 0;
                }

                @Override
                public final void I0000O(int i) {
/* 5 */             Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
                }

                @Override
                public final CharSequence I0000oI00() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Drawable I000II() {
/* 1 */             return null;
                }

                @Override
                public final void I000O01llI0(CharSequence charSequence) {
/* 1 */             this.I00iiO = charSequence;
                }

                @Override
                public final void I000OOo1O(Drawable drawable) {
/* 5 */             Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
                }

                @Override
                public final void I000iOII(int i) {
/* 5 */             Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
                }

                @Override
                public final void I000lI(int i) {
/* 5 */             Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
                }

                @Override
                public final void I000o00OoI0I(int i, int i2) {
/* 1 */             I1I1OI00IOo i1I1OI00IOo = this.I00iio;
/* 5 */             if (this.I00iiI == null) {
/* 7 */                 return;
                    }
/* 15 */            O1I1OO o1i1oo = new O1I1OO(i1I1OI00IOo.getPopupContext(), 1);
/* 20 */            I0il0olIi1OO i0il0olIi1OO = (I0il0olIi1OO) o1i1oo.I00iiO;
/* 22 */            CharSequence charSequence = this.I00iiO;
/* 24 */            if (charSequence != null) {
/* 26 */                i0il0olIi1OO.I0000O = charSequence;
                    }
/* 28 */            I1I0oI1Olo1 i1I0oI1Olo1 = this.I00iiI;
/* 30 */            int selectedItemPosition = i1I1OI00IOo.getSelectedItemPosition();
/* 34 */            i0il0olIi1OO.I000II = i1I0oI1Olo1;
/* 36 */            i0il0olIi1OO.I000O01llI0 = this;
/* 38 */            i0il0olIi1OO.I000OiO = selectedItemPosition;
/* 40 */            i0il0olIi1OO.I000OOo1O = true;
/* 42 */            I0ilIO0oloO1 i0ilIO0oloO1I0000oI00 = o1i1oo.I0000oI00();
/* 46 */            this.I00iOIl = i0ilIO0oloO1I0000oI00;
/* 50 */            AlertController$RecycleListView alertController$RecycleListView = i0ilIO0oloO1I0000oI00.I00io1l.I0000oI00;
/* 52 */            alertController$RecycleListView.setTextDirection(i);
/* 55 */            alertController$RecycleListView.setTextAlignment(i2);
/* 60 */            this.I00iOIl.show();
                }

                @Override
                public final int I000oI1ioi() {
/* 1 */             return 0;
                }

                @Override
                public final void I00100l0(ListAdapter listAdapter) {
/* 3 */             this.I00iiI = (I1I0oI1Olo1) listAdapter;
                }

                @Override
                public final void dismiss() {
/* 1 */             I0ilIO0oloO1 i0ilIO0oloO1 = this.I00iOIl;
/* 3 */             if (i0ilIO0oloO1 != null) {
/* 5 */                 i0ilIO0oloO1.dismiss();
/* 9 */                 this.I00iOIl = null;
                    }
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
/* 1 */             I1I1OI00IOo i1I1OI00IOo = this.I00iio;
/* 3 */             i1I1OI00IOo.setSelection(i);
/* 10 */            if (i1I1OI00IOo.getOnItemClickListener() != null) {
/* 19 */                i1I1OI00IOo.performItemClick(null, i, this.I00iiI.getItemId(i));
                    }
/* 22 */            dismiss();
                }
            }
