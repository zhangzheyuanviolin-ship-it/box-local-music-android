            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Parcel;
            import java.io.Closeable;
            
            final class zzbbz implements Closeable {
                private Parcel zza;

                public zzbbz(Parcel parcel) {
/* 4 */             this.zza = parcel;
                }

                public static zzbbz zzc() {
/* 7 */             return new zzbbz(Parcel.obtain());
                }

                @Override
                public final void close() {
/* 1 */             Parcel parcel = this.zza;
/* 3 */             if (parcel != null) {
/* 5 */                 parcel.recycle();
/* 9 */                 this.zza = null;
                    }
                }

                public final Parcel zza() {
/* 10 */            zzgo.zzn(this.zza != null, "get() after close()/release()");
/* 13 */            return this.zza;
                }

                public final Parcel zzb() {
/* 1 */             Parcel parcelZza = zza();
/* 6 */             this.zza = null;
/* 20 */            return parcelZza;
                }
            }
