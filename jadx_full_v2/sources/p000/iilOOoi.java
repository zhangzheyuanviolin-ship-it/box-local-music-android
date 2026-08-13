            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import com.box.gallery.R;
            import java.lang.ref.WeakReference;
            
            public abstract class iilOOoi {
                public static final int I00000oIO(View view, int i) {
/* 2 */             int i2 = 0;
/* 3 */             int i3 = Integer.MAX_VALUE;
/* 6 */             Object obj = null;
/* 7 */             while (view != null) {
/* 9 */                 Object tag = view.getTag(i);
/* 13 */                if (tag != null) {
/* 15 */                    if (obj != null) {
/* 23 */                        if (!tag.equals(obj)) {
                                    break;
                                }
                            } else {
/* 17 */                        obj = tag;
                            }
/* 26 */                    i3 = i2;
                        }
/* 27 */                i2++;
/* 29 */                Object objI00000oIO = li1l0O0Oil.I00000oIO(view);
/* 40 */                view = objI00000oIO instanceof View ? (View) objI00000oIO : null;
                    }
/* 106 */           return i3;
                }

                public static final View I00000oOI(View view) {
/* 5 */             if (!view.isAttachedToWindow()) {
/* 7 */                 return view;
                    }
/* 22 */            int iMin = Math.min(I00000oIO(view, R.id.view_tree_lifecycle_owner), I00000oIO(view, R.id.view_tree_saved_state_registry_owner));
/* 27 */            View view2 = view;
/* 28 */            int i = 0;
/* 29 */            View view3 = view2;
/* 30 */            while (view != null) {
/* 32 */                if (i == iMin) {
/* 40 */                    if (!(view.getParent() instanceof ViewGroup)) {
/* 42 */                        return view2;
                            }
                        } else if (I0000Il00O(view) == null) {
/* 50 */                    i++;
/* 52 */                    Object objI00000oIO = li1l0O0Oil.I00000oIO(view);
/* 64 */                    View view4 = view2;
/* 65 */                    view2 = view;
/* 63 */                    view = objI00000oIO instanceof View ? (View) objI00000oIO : null;
/* 67 */                    view3 = view4;
                        }
/* 49 */                return view;
                    }
/* 77 */            return view3;
                }

                public static final IOl10lI1 I0000Il00O(View view) {
/* 4 */             Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
/* 16 */            WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
/* 17 */            if (weakReference != null) {
/* 23 */                return (IOl10lI1) weakReference.get();
                    }
/* 10 */            return null;
                }
            }
