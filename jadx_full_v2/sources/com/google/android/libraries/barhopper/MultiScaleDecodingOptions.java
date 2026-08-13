            package com.google.android.libraries.barhopper;
            
            public final class MultiScaleDecodingOptions {
                private float[] extraScales = new float[0];
                private int minimumDetectedDimension = 10;
                private boolean skipProcessingIfBarcodeFound = true;

                public final void I00000oIO(float[] fArr) {
/* 1 */             this.extraScales = fArr;
                }

                public final void I00000oOI(int i) {
/* 1 */             this.minimumDetectedDimension = i;
                }

                public final void I0000Il00O(boolean z) {
/* 1 */             this.skipProcessingIfBarcodeFound = z;
                }
            }
