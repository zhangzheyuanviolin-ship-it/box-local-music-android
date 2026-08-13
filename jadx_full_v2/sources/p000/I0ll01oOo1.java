            package p000;

            import android.app.Notification;
            import android.view.accessibility.AccessibilityEvent;
            
            public abstract class I0ll01oOo1 {
                public static void I00000oIO(Notification.Action.Builder builder) {
/* 2 */             builder.setEmphasisHint(0);
                }

                public static final void I00000oOI(Oil000 oil000, AccessibilityEvent accessibilityEvent) {
/* 1 */             OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 7 */             Object objI000II = oiioiIIlooo.I00iOIl.I000II(Oil0I1O.I00IoIO0lI);
/* 12 */            if (objI000II == null) {
/* 14 */                objI000II = null;
                    }
/* 15 */            if (objI000II != null) {
/* 45 */                OIiilo1Ool0o.I00000oIO();
                    } else {
/* 21 */                Object objI000II2 = oiioiIIlooo.I00iOIl.I000II(Oil0I1O.I00IioO0OiOi);
/* 41 */                accessibilityEvent.setTextChangeTypes((((Oo0lI00l) (objI000II2 != null ? objI000II2 : null)) != null ? 1 : 0) | accessibilityEvent.getTextChangeTypes());
                    }
                }

                public static void I0000Il00O(Notification.Action.Builder builder) {
/* 2 */             builder.setStyleHint(0);
                }
            }
