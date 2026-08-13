            package com.google.mlkit.vision.text.internal;

            import android.content.Context;
            import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
            import p000.Io0iI1l01il;
            import p000.Io0ii0lOoi;
            import p000.O0l10o00l;
            import p000.O1o0111OI00;
            import p000.loloOlli1l0;
            import p000.looiI0OO0;
            
            public final class zzp extends O0l10o00l {
                private final O1o0111OI00 zza;

                public zzp(O1o0111OI00 o1o0111OI00) {
/* 4 */             this.zza = o1o0111OI00;
                }

                @Override
                public final Object create(Object obj) {
/* 1 */             TextRecognizerOptionsInterface textRecognizerOptionsInterface = (TextRecognizerOptionsInterface) obj;
/* 7 */             loloOlli1l0 loloolli1l0I00000oIO = looiI0OO0.I00000oIO(textRecognizerOptionsInterface.getLoggingLibraryName());
/* 15 */            Context contextI00000oOI = this.zza.I00000oOI();
/* 21 */            Io0iI1l01il.I00000oOI.getClass();
/* 51 */            return new TextRecognizerTaskWithResource(loloolli1l0I00000oIO, (Io0ii0lOoi.I00000oIO(contextI00000oOI) >= 204700000 || textRecognizerOptionsInterface.getIsThickClient()) ? new zzd(contextI00000oOI, textRecognizerOptionsInterface, loloolli1l0I00000oIO) : new zze(contextI00000oOI), textRecognizerOptionsInterface);
                }
            }
