            package p000;

            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import android.os.Message;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.ViewStub;
            import android.view.Window;
            import android.widget.Button;
            import android.widget.ImageView;
            import android.widget.ListAdapter;
            import android.widget.TextView;
            import androidx.appcompat.app.AlertController$RecycleListView;
            import androidx.core.widget.NestedScrollView;
            
            public final class I0ilI1OoOo {
                public Context I00000oIO;
                public I0ilIO0oloO1 I00000oOI;
                public Window I0000Il00O;
                public CharSequence I0000O;
                public AlertController$RecycleListView I0000oI00;
                public View I0001Ioi1lo;
                public boolean I000II;
                public Button I000O01llI0;
                public Button I000OOo1O;
                public CharSequence I000OiO;
                public Message I000iOII;
                public Button I000l1;
                public NestedScrollView I000lI;
                public Drawable I000o00OoI0I;
                public ImageView I000oI1ioi;
                public TextView I00100l0;
                public TextView I00100o1O0lo;
                public View I0010I0i;
                public ListAdapter I0010o;
                public int I00111O;
                public int I001IIilI0O;
                public boolean I001IO000;
                public I0il100iO I001i1O0Ol;
                public I0I0o01l I001i1lo1io;

                public static boolean I00000oIO(View view) {
/* 6 */             if (view.onCheckIsTextEditor()) {
/* 5 */                 return true;
                    }
/* 12 */            if (!(view instanceof ViewGroup)) {
/* 11 */                return false;
                    }
/* 15 */            ViewGroup viewGroup = (ViewGroup) view;
/* 17 */            int childCount = viewGroup.getChildCount();
/* 21 */            while (childCount > 0) {
                        childCount--;
/* 33 */                if (I00000oIO(viewGroup.getChildAt(childCount))) {
/* 5 */                     return true;
                        }
                    }
/* 11 */            return false;
                }

                public static ViewGroup I00000oOI(View view, View view2) {
/* 1 */             if (view == null) {
/* 5 */                 if (view2 instanceof ViewStub) {
/* 9 */                     view2 = ((ViewStub) view2).inflate();
                        }
/* 13 */                return (ViewGroup) view2;
                    }
/* 16 */            if (view2 != null) {
/* 18 */                ViewParent parent = view2.getParent();
/* 24 */                if (parent instanceof ViewGroup) {
/* 28 */                    ((ViewGroup) parent).removeView(view2);
                        }
                    }
/* 33 */            if (view instanceof ViewStub) {
/* 37 */                view = ((ViewStub) view).inflate();
                    }
/* 41 */            return (ViewGroup) view;
                }
            }
