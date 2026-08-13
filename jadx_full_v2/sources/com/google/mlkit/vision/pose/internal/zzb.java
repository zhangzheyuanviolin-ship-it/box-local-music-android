            package com.google.mlkit.vision.pose.internal;

            import com.google.mlkit.vision.pose.PoseDetectorOptionsBase;
            import java.util.Collections;
            import java.util.List;
            import p000.I01l10Oi;
            import p000.I0l011I;
            import p000.iilOo0i10OI;
            
            final class zzb implements I0l011I {
                @Override
                public final String getBundledAllowlistAssetPath() {
/* 1 */             return "mlkit_pose/bundled_allowlist.binarypb";
                }

                @Override
                public final boolean isRunConfigCompatibleWithOptions(String str, I01l10Oi i01l10Oi) {
/* 3 */             int[] preferredHardwareConfigs = ((PoseDetectorOptionsBase) i01l10Oi).getPreferredHardwareConfigs();
/* 7 */             int length = preferredHardwareConfigs.length;
/* 16 */            List iiloo0i10oi = length == 0 ? Collections.EMPTY_LIST : new iilOo0i10OI(0, length, preferredHardwareConfigs);
/* 26 */            if ("default_config".equals(str)) {
/* 33 */                return iiloo0i10oi.contains(1);
                    }
/* 44 */            if ("cpu-gpu-opencl".equals(str)) {
/* 52 */                return iiloo0i10oi.contains(2);
                    }
/* 8 */             return false;
                }

                @Override
                public final boolean shouldCheckGenericGpuAllowlist(String str) {
/* 3 */             return "cpu-gpu-opencl".equals(str);
                }
            }
