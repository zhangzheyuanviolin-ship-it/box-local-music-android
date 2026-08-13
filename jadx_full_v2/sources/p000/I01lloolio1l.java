            package p000;

            import android.os.Bundle;
            import android.text.Spanned;
            import android.text.style.ClickableSpan;
            import android.util.SparseArray;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeProvider;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.Collections;
            import java.util.List;
            
            public class I01lloolio1l {
                public static final View.AccessibilityDelegate I00iiO = new View.AccessibilityDelegate();
                public final View.AccessibilityDelegate I00iOIl = I00iiO;
                public final I01lli I00iiI;

                public I01lloolio1l() {
/* 10 */            I01lli i01lli = new I01lli();
/* 13 */            i01lli.I00000oIO = this;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            this.I00iiI = i01lli;
                }

                public IIloOI I00000oIO(View view) {
/* 3 */             AccessibilityNodeProvider accessibilityNodeProvider = this.I00iOIl.getAccessibilityNodeProvider(view);
/* 7 */             if (accessibilityNodeProvider == null) {
/* 21 */                return null;
                    }
/* 12 */            IIloOI iIloOI = new IIloOI(2);
/* 15 */            iIloOI.I00iiI = accessibilityNodeProvider;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            return iIloOI;
                }

                public void I00000oOI(View view, AccessibilityEvent accessibilityEvent) {
/* 3 */             this.I00iOIl.onInitializeAccessibilityEvent(view, accessibilityEvent);
                }

                public void I0000Il00O(View view, I01oII0IOOO i01oII0IOOO) {
/* 5 */             this.I00iOIl.onInitializeAccessibilityNodeInfo(view, i01oII0IOOO.I00000oIO);
                }

                public boolean I0000O(View view, int i, Bundle bundle) {
                    WeakReference weakReference;
                    ClickableSpan clickableSpan;
/* 8 */             List list = (List) view.getTag(R.id.tag_accessibility_actions);
/* 10 */            if (list == null) {
/* 12 */                list = Collections.EMPTY_LIST;
                    }
/* 14 */            boolean z = false;
/* 20 */            for (int i2 = 0; i2 < list.size() && ((I01o0l) list.get(i2)).I00000oIO() != i; i2++) {
                    }
/* 40 */            boolean zPerformAccessibilityAction = this.I00iOIl.performAccessibilityAction(view, i, bundle);
/* 44 */            if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
/* 408 */               return zPerformAccessibilityAction;
                    }
/* 56 */            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
/* 67 */            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
/* 69 */            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
/* 91 */                CharSequence text = view.createAccessibilityNodeInfo().getText();
/* 115 */               ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
/* 116 */               int i4 = 0;
                        while (true) {
/* 117 */                   if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                                break;
                            }
/* 128 */                   if (clickableSpan.equals(clickableSpanArr[i4])) {
/* 130 */                       clickableSpan.onClick(view);
/* 133 */                       z = true;
                                break;
                            }
/* 135 */                   i4++;
                        }
                    }
/* 138 */           return z;
                }
            }
