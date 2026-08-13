            package p000;

            import android.app.Notification;
            import android.view.accessibility.AccessibilityNodeInfo;
            
            public abstract class I01o11oO {
                public static int I00000oIO(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.getChecked();
                }

                public static int I00000oOI(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.getExpandedState();
                }

                public static CharSequence I0000Il00O(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.getSupplementalDescription();
                }

                public static boolean I0000O(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             return accessibilityNodeInfo.isFieldRequired();
                }

                public static void I0000oI00(Notification.Builder builder) {
/* 2 */             builder.setShortCriticalText(null);
                }
            }
