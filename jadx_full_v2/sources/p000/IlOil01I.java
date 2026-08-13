            package p000;

            import android.graphics.Rect;
            import android.view.ActionMode;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.View;
            
            public final class IlOil01I extends ActionMode.Callback2 implements ActionMode.Callback {
                public I100Iil1o1 I00000oIO;

                @Override
                public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
/* 3 */             this.I00000oIO.getClass();
/* 6 */             return false;
                }

                @Override
                public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
/* 3 */             this.I00000oIO.I00000oIO(menu);
                    return menu.size() > 0;
                }

                @Override
                public final void onDestroyActionMode(ActionMode actionMode) {
/* 5 */             this.I00000oIO.I00000oIO.close();
                }

                @Override
                public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
/* 9 */             OOo0IO oOo0IO = (OOo0IO) this.I00000oIO.I0000Il00O.invoke();
/* 35 */            rect.set(Math.round(oOo0IO.I00000oIO), Math.round(oOo0IO.I00000oOI), Math.round(oOo0IO.I0000Il00O), Math.round(oOo0IO.I0000O));
                }

                @Override
                public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
/* 3 */             return this.I00000oIO.I00000oIO(menu);
                }
            }
