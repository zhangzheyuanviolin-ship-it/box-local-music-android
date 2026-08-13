            package p000;

            import android.os.Bundle;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.accessibility.AccessibilityNodeProvider;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            import java.util.WeakHashMap;
            
            public final class I01lli extends View.AccessibilityDelegate {
                public I01lloolio1l I00000oIO;

                @Override
                public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
/* 5 */             return this.I00000oIO.I00iOIl.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                @Override
                public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
/* 3 */             IIloOI iIloOII00000oIO = this.I00000oIO.I00000oIO(view);
/* 7 */             if (iIloOII00000oIO != null) {
/* 11 */                return (AccessibilityNodeProvider) iIloOII00000oIO.I00iiI;
                    }
/* 14 */            return null;
                }

                @Override
                public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             this.I00000oIO.I00000oOI(view, accessibilityEvent);
                }

                @Override
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
/* 3 */             I01oII0IOOO i01oII0IOOO = new I01oII0IOOO();
/* 7 */             i01oII0IOOO.I00000oOI = -1;
/* 9 */             i01oII0IOOO.I0000Il00O = -1;
/* 11 */            i01oII0IOOO.I00000oIO = accessibilityNodeInfo;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 22 */            accessibilityNodeInfo.setScreenReaderFocusable(OooiO10Oo1.I0000Il00O(view));
/* 29 */            accessibilityNodeInfo.setHeading(OooiO10Oo1.I00000oOI(view));
/* 36 */            accessibilityNodeInfo.setPaneTitle(OooiO10Oo1.I00000oIO(view));
/* 43 */            accessibilityNodeInfo.setStateDescription(OooiOi0I0l.I00000oOI(view));
/* 48 */            this.I00000oIO.I0000Il00O(view, i01oII0IOOO);
/* 51 */            accessibilityNodeInfo.getText();
/* 61 */            List list = (List) view.getTag(R.id.tag_accessibility_actions);
/* 63 */            if (list == null) {
/* 65 */                list = Collections.EMPTY_LIST;
                    }
/* 72 */            for (int i = 0; i < list.size(); i++) {
/* 80 */                i01oII0IOOO.I00000oIO((I01o0l) list.get(i));
                    }
                }

                @Override
                public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
/* 5 */             this.I00000oIO.I00iOIl.onPopulateAccessibilityEvent(view, accessibilityEvent);
                }

                @Override
                public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
/* 5 */             return this.I00000oIO.I00iOIl.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }

                @Override
                public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
/* 3 */             return this.I00000oIO.I0000O(view, i, bundle);
                }

                @Override
                public final void sendAccessibilityEvent(View view, int i) {
/* 5 */             this.I00000oIO.I00iOIl.sendAccessibilityEvent(view, i);
                }

                @Override
                public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
/* 5 */             this.I00000oIO.I00iOIl.sendAccessibilityEventUnchecked(view, accessibilityEvent);
                }
            }
