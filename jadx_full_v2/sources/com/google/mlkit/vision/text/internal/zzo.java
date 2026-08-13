            package com.google.mlkit.vision.text.internal;

            import com.google.mlkit.vision.text.TextRecognizer;
            import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
            import p000.Il1I0i;
            import p000.looiI0OO0;
            
            public final class zzo {
                private final zzp zza;
                private final Il1I0i zzb;

                public zzo(zzp zzpVar, Il1I0i il1I0i) {
/* 4 */             this.zza = zzpVar;
/* 6 */             this.zzb = il1I0i;
                }

                public final TextRecognizer zza(TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
/* 29 */            return new zzn((TextRecognizerTaskWithResource) this.zza.get(textRecognizerOptionsInterface), this.zzb.I00000oIO(textRecognizerOptionsInterface.getExecutor()), looiI0OO0.I00000oIO(textRecognizerOptionsInterface.getLoggingLibraryName()), textRecognizerOptionsInterface);
                }
            }
