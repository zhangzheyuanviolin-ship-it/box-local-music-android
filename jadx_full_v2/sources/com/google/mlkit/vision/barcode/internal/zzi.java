            package com.google.mlkit.vision.barcode.internal;

            import android.content.Context;
            import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
            import p000.Io0iI1l01il;
            import p000.Io0ii0lOoi;
            import p000.O0l10o00l;
            import p000.O1o0111OI00;
            import p000.o0OiOio;
            import p000.o0iO0lI0ilO0;
            
            public final class zzi extends O0l10o00l {
                private final O1o0111OI00 zza;

                public zzi(O1o0111OI00 o1o0111OI00) {
/* 4 */             this.zza = o1o0111OI00;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object create(Object obj) {
                    zzm zzoVar;
/* 3 */             BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
/* 5 */             Context contextI00000oOI = this.zza.I00000oOI();
/* 13 */            o0OiOio o0oioioI00000oIO = o0iO0lI0ilO0.I00000oIO(zzb.zzd());
/* 21 */            if (!zzo.zzd(contextI00000oOI)) {
/* 25 */                Io0iI1l01il.I00000oOI.getClass();
/* 46 */                zzoVar = Io0ii0lOoi.I00000oIO(contextI00000oOI) >= 204500000 ? new zzo(contextI00000oOI, barcodeScannerOptions, o0oioioI00000oIO) : new zzq(contextI00000oOI, barcodeScannerOptions, o0oioioI00000oIO);
                    }
/* 53 */            return new zzl(this.zza, barcodeScannerOptions, zzoVar, o0oioioI00000oIO);
                }
            }
