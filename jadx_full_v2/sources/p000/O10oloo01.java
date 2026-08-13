            package p000;

            import android.accessibilityservice.AccessibilityServiceInfo;
            import android.view.accessibility.AccessibilityManager;
            import java.util.List;
            
            public final class O10oloo01 implements AccessibilityManager.AccessibilityStateChangeListener, OlO01l1oOil {
                public boolean I00iOIl;
                public boolean I00iiI;
                public OIooliIO0 I00iiO;
                public O10ol0 I00iio;
                public O10oilolI I00ilI0I1;

                public static boolean I00000oIO(AccessibilityManager accessibilityManager) {
/* 3 */             List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
/* 10 */            int size = enabledAccessibilityServiceList.size();
/* 16 */            for (int i = 0; i < size; i++) {
/* 24 */                String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
/* 28 */                if (settingsActivityName != null && OlOoOIi0o.I000oI1ioi(settingsActivityName, "SwitchAccess", true)) {
/* 32 */                    return true;
                        }
                    }
/* 14 */            return false;
                }

                public static boolean I00000oOI(AccessibilityManager accessibilityManager) {
/* 3 */             List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
/* 10 */            int size = enabledAccessibilityServiceList.size();
/* 16 */            for (int i = 0; i < size; i++) {
/* 24 */                String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
/* 28 */                if (settingsActivityName != null && OlOoOIi0o.I000oI1ioi(settingsActivityName, "VoiceAccess", true)) {
/* 32 */                    return true;
                        }
                    }
/* 14 */            return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object getValue() {
                    boolean z;
/* 1 */             O10oilolI o10oilolI = this.I00ilI0I1;
/* 15 */            if (((Boolean) this.I00iiO.getValue()).booleanValue()) {
/* 17 */                O10ol0 o10ol0 = this.I00iio;
/* 19 */                z = true;
/* 20 */                if ((o10ol0 == null || !((Boolean) o10ol0.I00iOIl.getValue()).booleanValue()) && ((!this.I00iOIl || o10oilolI == null || !((Boolean) o10oilolI.I00000oIO.getValue()).booleanValue()) && (!this.I00iiI || o10oilolI == null || !((Boolean) o10oilolI.I00000oOI.getValue()).booleanValue()))) {
/* 79 */                    z = false;
                        }
                    }
/* 80 */            return Boolean.valueOf(z);
                }

                @Override
                public final void onAccessibilityStateChanged(boolean z) {
/* 7 */             this.I00iiO.setValue(Boolean.valueOf(z));
                }
            }
