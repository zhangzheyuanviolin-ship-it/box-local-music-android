            package p000;

            import android.view.View;
            import android.view.ViewParent;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.widget.TextView;
            
            public abstract class iOO0lI {
                public static void I00000oIO(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
/* 1 */             if (inputConnection == null || editorInfo.hintText != null) {
/* 98 */                return;
                    }
/* 13 */            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
                    }
                }
            }
