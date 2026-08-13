            package p000;

            import android.database.DataSetObserver;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ListAdapter;
            import android.widget.SpinnerAdapter;
            
            public final class I1I0oI1Olo1 implements ListAdapter, SpinnerAdapter {
                public SpinnerAdapter I00000oIO;
                public ListAdapter I00000oOI;

                @Override
                public final boolean areAllItemsEnabled() {
/* 1 */             ListAdapter listAdapter = this.I00000oOI;
/* 3 */             if (listAdapter != null) {
/* 5 */                 return listAdapter.areAllItemsEnabled();
                    }
/* 10 */            return true;
                }

                @Override
                public final int getCount() {
/* 1 */             SpinnerAdapter spinnerAdapter = this.I00000oIO;
/* 3 */             if (spinnerAdapter == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return spinnerAdapter.getCount();
                }

                @Override
                public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
/* 1 */             SpinnerAdapter spinnerAdapter = this.I00000oIO;
/* 3 */             if (spinnerAdapter == null) {
/* 5 */                 return null;
                    }
/* 7 */             return spinnerAdapter.getDropDownView(i, view, viewGroup);
                }

                @Override
                public final Object getItem(int i) {
/* 1 */             SpinnerAdapter spinnerAdapter = this.I00000oIO;
/* 3 */             if (spinnerAdapter == null) {
/* 5 */                 return null;
                    }
/* 7 */             return spinnerAdapter.getItem(i);
                }

                @Override
                public final long getItemId(int i) {
/* 1 */             SpinnerAdapter spinnerAdapter = this.I00000oIO;
/* 3 */             if (spinnerAdapter == null) {
/* 5 */                 return -1L;
                    }
/* 8 */             return spinnerAdapter.getItemId(i);
                }

                @Override
                public final int getItemViewType(int i) {
/* 1 */             return 0;
                }

                @Override
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 1 */             return getDropDownView(i, view, viewGroup);
                }

                @Override
                public final int getViewTypeCount() {
/* 1 */             return 1;
                }

                @Override
                public final boolean hasStableIds() {
/* 1 */             SpinnerAdapter spinnerAdapter = this.I00000oIO;
                    return spinnerAdapter != null && spinnerAdapter.hasStableIds();
                }

                @Override
                public final boolean isEmpty() {
                    return getCount() == 0;
                }

                @Override
                public final boolean isEnabled(int i) {
/* 1 */             ListAdapter listAdapter = this.I00000oOI;
/* 3 */             if (listAdapter != null) {
/* 5 */                 return listAdapter.isEnabled(i);
                    }
/* 10 */            return true;
                }

                @Override
                public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
/* 1 */             SpinnerAdapter spinnerAdapter = this.I00000oIO;
/* 3 */             if (spinnerAdapter != null) {
/* 5 */                 spinnerAdapter.registerDataSetObserver(dataSetObserver);
                    }
                }

                @Override
                public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
/* 1 */             SpinnerAdapter spinnerAdapter = this.I00000oIO;
/* 3 */             if (spinnerAdapter != null) {
/* 5 */                 spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
                    }
                }
            }
