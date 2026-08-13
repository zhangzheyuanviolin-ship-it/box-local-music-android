            package p000;

            import android.widget.AbsListView;
            
/* 202 */   public final class O10Iol implements AbsListView.OnScrollListener {
                public O10O00o I00000oIO;

                @Override
                public final void onScrollStateChanged(AbsListView absListView, int i) {
/* 1 */             O10O00o o10O00o = this.I00000oIO;
/* 3 */             O10Il1o10iI o10Il1o10iI = o10O00o.I00oI0i;
/* 5 */             I1I0OoiI0o i1I0OoiI0o = o10O00o.I00oliIiO01i;
/* 8 */             if (i != 1 || i1I0OoiI0o.getInputMethodMode() == 2 || i1I0OoiI0o.getContentView() == null) {
/* 37 */                return;
                    }
/* 26 */            o10O00o.I00oOio10iI1.removeCallbacks(o10Il1o10iI);
/* 29 */            o10Il1o10iI.run();
                }

                @Override
/* 203 */       public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                }
            }
