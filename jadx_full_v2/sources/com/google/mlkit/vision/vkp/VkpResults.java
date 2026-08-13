            package com.google.mlkit.vision.vkp;

            import java.util.List;
            import p000.lIO1l111i;
            import p000.lIOiOOl;
            import p000.lIil0l010OO;
            
            public abstract class VkpResults {
                public static VkpResults zza(VkpStatus vkpStatus) {
/* 3 */             lIO1l111i lio1l111i = lIOiOOl.I00lll10;
/* 5 */             lIil0l010OO liil0l010oo = lIil0l010OO.I00o101lO;
/* 11 */            return new AutoValue_VkpResults(vkpStatus, liil0l010oo, liil0l010oo, false, null);
                }

                public abstract List<VkpDetectedObject> getDetectedObjects();

                public abstract List<VkpImageLabel> getImageLabels();

                public abstract VkpStatus getStatus();

                public abstract Boolean isAccelerated();

                public abstract boolean isFromColdCall();
            }
