            package p000;

            import android.view.ActionMode;
            import android.view.SearchEvent;
            import android.view.Window;
            
            public abstract class i00IIOoOoOI {
                public static boolean I00000oIO(Window.Callback callback, SearchEvent searchEvent) {
/* 1 */             return callback.onSearchRequested(searchEvent);
                }

                public static ActionMode I00000oOI(Window.Callback callback, ActionMode.Callback callback2, int i) {
/* 1 */             return callback.onWindowStartingActionMode(callback2, i);
                }
            }
