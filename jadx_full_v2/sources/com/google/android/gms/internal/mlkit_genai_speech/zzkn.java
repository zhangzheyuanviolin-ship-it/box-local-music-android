            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.AttributionSource;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            
            public final class zzkn {
                public static final zzko zza(String str) {
/* 5 */             return zzc("AttributionSource", AttributionSource.CREATOR);
                }

                public static final zzko zzb(String str) {
/* 5 */             return zzc("ParcelFileDescriptor", ParcelFileDescriptor.CREATOR);
                }

                private static final zzko zzc(String str, Parcelable.Creator creator) {
/* 4 */             zzbbo zzbboVar = new zzbbo(creator, false);
/* 9 */             String strConcat = str.concat("-bin");
/* 49 */            return new zzko(zzaxk.zzd(strConcat, zzbboVar), zzavb.zza("REQ-".concat(strConcat)), zzavb.zza("RESH-".concat(strConcat)), zzavb.zza("REST-".concat(strConcat)));
                }
            }
