            package com.google.android.libraries.barhopper;
            
            public class RecognitionOptions {
                private int barcodeFormats = 0;
                private boolean outputUnrecognizedBarcodes = false;
                private boolean useQrMobilenetV3 = false;
                private boolean enableQrAlignmentGrid = true;
                private boolean enableUseKeypointAsFinderPattern = true;
                private boolean useHalideAffineCrop = false;
                private MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
                private MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
                private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();
                private boolean qrEnableFourthCornerApproximation = false;

                public final void I00000oIO(int i) {
/* 1 */             this.barcodeFormats = i;
                }

                public final void I00000oOI() {
/* 2 */             this.enableQrAlignmentGrid = true;
                }

                public final void I0000Il00O() {
/* 2 */             this.enableUseKeypointAsFinderPattern = true;
                }

                public final void I0000O(MultiScaleDecodingOptions multiScaleDecodingOptions) {
/* 1 */             this.multiScaleDecodingOptions = multiScaleDecodingOptions;
                }

                public final void I0000oI00(MultiScaleDetectionOptions multiScaleDetectionOptions) {
/* 1 */             this.multiScaleDetectionOptions = multiScaleDetectionOptions;
                }

                public final void I0001Ioi1lo(boolean z) {
/* 1 */             this.outputUnrecognizedBarcodes = z;
                }

                public final void I000II(boolean z) {
/* 1 */             this.qrEnableFourthCornerApproximation = z;
                }
            }
