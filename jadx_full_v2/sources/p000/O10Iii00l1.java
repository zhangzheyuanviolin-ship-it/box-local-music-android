            package p000;

            import android.view.View;
            import android.widget.AdapterView;
            
/* 27 */    public final class O10Iii00l1 implements AdapterView.OnItemSelectedListener {
                public O10O00o I00iOIl;

                @Override
                public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
                    Iio010 iio010;
/* 2 */             if (i == -1 || (iio010 = this.I00iOIl.I00iiO) == null) {
/* 204 */               return;
                    }
/* 11 */            iio010.setListSelectionHidden(false);
                }

                @Override
/* 28 */        public final void onNothingSelected(AdapterView adapterView) {
                }
            }
