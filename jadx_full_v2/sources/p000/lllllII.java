            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public enum lllllII implements io1OOio1100 {
                FORMAT_UNKNOWN(0),
                FORMAT_CODE_128(1),
                FORMAT_CODE_39(2),
                FORMAT_CODE_93(4),
                FORMAT_CODABAR(8),
                FORMAT_DATA_MATRIX(16),
                FORMAT_EAN_13(32),
                FORMAT_EAN_8(64),
                FORMAT_ITF(Barcode.FORMAT_ITF),
                FORMAT_QR_CODE(Barcode.FORMAT_QR_CODE),
                FORMAT_UPC_A(Barcode.FORMAT_UPC_A),
                FORMAT_UPC_E(Barcode.FORMAT_UPC_E),
                FORMAT_PDF417(Barcode.FORMAT_PDF417),
                FORMAT_AZTEC(Barcode.FORMAT_AZTEC);

                public final int I00iOIl;

                lllllII(int i) {
/* 4 */             this.I00iOIl = i;
                }

                @Override
                public final int zza() {
/* 1 */             return this.I00iOIl;
                }
            }
