            package p000;

            import android.R;
            import android.view.View;
            import android.view.ViewGroup;
            import java.lang.invoke.VarHandle;
            
            public abstract class IOiOII1 {
                public static final ViewGroup.LayoutParams I00000oIO = new ViewGroup.LayoutParams(-2, -2);

                public static void I00000oIO(Ill0oOi0 ill0oOi0, IOii1l iOii1l) {
/* 19 */            View childAt = ((ViewGroup) ill0oOi0.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
/* 31 */            IOl0ol01OO1 iOl0ol01OO1 = childAt instanceof IOl0ol01OO1 ? (IOl0ol01OO1) childAt : null;
/* 32 */            if (iOl0ol01OO1 != null) {
/* 34 */                iOl0ol01OO1.setParentCompositionContext(null);
/* 37 */                iOl0ol01OO1.setContent(iOii1l);
/* 40 */                return;
                    }
/* 43 */            IOl0ol01OO1 iOl0ol01OO12 = new IOl0ol01OO1(ill0oOi0);
/* 50 */            iOl0ol01OO12.I00l0OO0IO = lOO00IiI0li.I00000oIO(null);
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            iOl0ol01OO12.setParentCompositionContext(null);
/* 58 */            iOl0ol01OO12.setContent(iOii1l);
/* 65 */            View decorView = ill0oOi0.getWindow().getDecorView();
/* 73 */            if (li1lOloO.I00000oIO(decorView) == null) {
/* 78 */                decorView.setTag(com.box.gallery.R.id.view_tree_lifecycle_owner, ill0oOi0);
                    }
/* 85 */            if (li1li1Ol11Io.I00000oIO(decorView) == null) {
/* 90 */                decorView.setTag(com.box.gallery.R.id.view_tree_view_model_store_owner, ill0oOi0);
                    }
/* 97 */            if (li1lOolIO.I00000oIO(decorView) == null) {
/* 102 */               decorView.setTag(com.box.gallery.R.id.view_tree_saved_state_registry_owner, ill0oOi0);
                    }
/* 107 */           ill0oOi0.setContentView(iOl0ol01OO12, I00000oIO);
                }
            }
