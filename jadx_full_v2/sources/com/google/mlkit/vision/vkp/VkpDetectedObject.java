            package com.google.mlkit.vision.vkp;

            import android.graphics.Rect;
            import java.util.List;
            
            public abstract class VkpDetectedObject {
                public abstract Rect getBoundingBox();

                public abstract List<VkpImageLabel> getLabels();

                public abstract Integer getTrackingId();
            }
