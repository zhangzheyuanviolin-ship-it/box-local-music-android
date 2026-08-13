            package p000;

            import android.content.DialogInterface;
            import android.view.View;
            import android.widget.AdapterView;
            
            public final class I0il01i1oii1 implements AdapterView.OnItemClickListener {
                public I0ilI1OoOo I00iOIl;
                public I0il0olIi1OO I00iiI;

                @Override
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
/* 1 */             I0il0olIi1OO i0il0olIi1OO = this.I00iiI;
/* 3 */             DialogInterface.OnClickListener onClickListener = i0il0olIi1OO.I000O01llI0;
/* 7 */             I0ilIO0oloO1 i0ilIO0oloO1 = this.I00iOIl.I00000oOI;
/* 9 */             onClickListener.onClick(i0ilIO0oloO1, i);
/* 14 */            if (i0il0olIi1OO.I000OOo1O) {
/* 204 */               return;
                    }
/* 16 */            i0ilIO0oloO1.dismiss();
                }
            }
