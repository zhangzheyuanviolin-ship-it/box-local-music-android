            package p000;

            import android.view.KeyboardShortcutGroup;
            import android.view.Menu;
            import android.view.Window;
            import java.util.List;
            
            public abstract class i00IIiilIoOO {
                public static void I00000oIO(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
/* 1 */             callback.onProvideKeyboardShortcuts(list, menu, i);
                }
            }
