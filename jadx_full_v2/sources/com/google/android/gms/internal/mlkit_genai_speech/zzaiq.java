            package com.google.android.gms.internal.mlkit_genai_speech;

            import sun.misc.Unsafe;
            
            final class zzaiq extends zzais {
                public zzaiq(Unsafe unsafe) {
/* 1 */             super(unsafe);
                }

                @Override
                public final double zza(Object obj, long j) {
/* 7 */             return Double.longBitsToDouble(this.zza.getLong(obj, j));
                }

                @Override
                public final float zzb(Object obj, long j) {
/* 7 */             return Float.intBitsToFloat(this.zza.getInt(obj, j));
                }

                /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_genai_speech.zzait.zzi(java.lang.Object, long, boolean):void */
                /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_genai_speech.zzait.zzj(java.lang.Object, long, boolean):void */
                /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: com.google.android.gms.internal.mlkit_genai_speech.zzait.zzi(java.lang.Object, long, boolean):void */
                /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: com.google.android.gms.internal.mlkit_genai_speech.zzait.zzj(java.lang.Object, long, boolean):void */
                @Override
                public final void zzc(Object obj, long j, boolean z) {
/* 3 */             if (zzait.zzb) {
/* 5 */                 zzait.zzi(obj, j, z);
                    } else {
/* 9 */                 zzait.zzj(obj, j, z);
                    }
                }

                @Override
                public final void zzd(Object obj, long j, byte b) {
/* 3 */             if (zzait.zzb) {
/* 1 */                 zzait.zzD(obj, j, b);
                    } else {
/* 1 */                 zzait.zzE(obj, j, b);
                    }
                }

                @Override
                public final void zze(Object obj, long j, double d) {
/* 7 */             this.zza.putLong(obj, j, Double.doubleToLongBits(d));
                }

                @Override
                public final void zzf(Object obj, long j, float f) {
/* 7 */             this.zza.putInt(obj, j, Float.floatToIntBits(f));
                }

                @Override
                public final boolean zzg(Object obj, long j) {
                    return zzait.zzb ? zzait.zzt(obj, j) : zzait.zzu(obj, j);
                }
            }
