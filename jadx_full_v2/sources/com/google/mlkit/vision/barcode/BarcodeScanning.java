            package com.google.mlkit.vision.barcode;

            import com.google.mlkit.vision.barcode.internal.zzg;
            import p000.O1o0111OI00;
            import p000.lII0I0I000I;
            
/* 21 */    public class BarcodeScanning {
                private BarcodeScanning() {
                }

                public static BarcodeScanner getClient(BarcodeScannerOptions barcodeScannerOptions) {
/* 3 */             lII0I0I000I.I000O01llI0("You must provide a valid BarcodeScannerOptions.", barcodeScannerOptions);
/* 18 */            return ((zzg) O1o0111OI00.I0000Il00O().I00000oIO(zzg.class)).zzb(barcodeScannerOptions);
                }

/* 22 */        public static BarcodeScanner getClient() {
/* 23 */            return ((zzg) O1o0111OI00.I0000Il00O().I00000oIO(zzg.class)).zza();
                }
            }
