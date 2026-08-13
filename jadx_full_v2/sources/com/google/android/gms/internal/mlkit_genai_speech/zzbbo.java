            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Parcelable;
            import java.io.InputStream;
            
            public final class zzbbo implements zzaxj {
                private final Parcelable.Creator zza;

                public zzbbo(Parcelable.Creator creator, boolean z) {
/* 4 */             this.zza = creator;
                }

                @Override
                public final InputStream zza(Object obj) {
/* 8 */             return new zzbca(this.zza, (Parcelable) obj, false);
                }
            }
