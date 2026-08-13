            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Queue;
            import java.util.concurrent.LinkedBlockingQueue;
            
            final class zzbav {
                private static final int zza;
                private static final Queue zzb;

                static {
/* 5 */             int iMax = Math.max(16384, 8192);
/* 9 */             zza = iMax;
/* 19 */            zzb = new LinkedBlockingQueue(131072 / iMax);
                }

                public static void zza(byte[] bArr) {
/* 4 */             if (bArr.length == zza) {
/* 8 */                 zzb.offer(bArr);
                    }
                }

                public static byte[] zzb() {
/* 3 */             return zzc(zza);
                }

                public static byte[] zzc(int i) {
                    byte[] bArr;
                    return (i != zza || (bArr = (byte[]) zzb.poll()) == null) ? new byte[i] : bArr;
                }
            }
