            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import p000.IlIi0I0;
            
/* 8 */     final class zzbca extends InputStream {
                InputStream zza;
                private final Parcelable zzb;

                public zzbca(Parcelable.Creator creator, Parcelable parcelable, boolean z) {
/* 4 */             this.zzb = parcelable;
/* 11 */            zzgo.zze(creator != null);
                }

                private final InputStream zzb() {
/* 1 */             InputStream inputStream = this.zza;
/* 3 */             if (inputStream != null) {
/* 55 */                return inputStream;
                    }
/* 5 */             Parcelable parcelable = this.zzb;
/* 7 */             Parcel parcelObtain = Parcel.obtain();
/* 12 */            parcelObtain.writeParcelable(parcelable, 0);
/* 15 */            byte[] bArrMarshall = parcelObtain.marshall();
/* 19 */            parcelObtain.recycle();
/* 24 */            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrMarshall);
/* 27 */            this.zza = byteArrayInputStream;
/* 29 */            return byteArrayInputStream;
                }

                @Override
                public final int available() {
/* 5 */             return zzb().available();
                }

                @Override
                public final void close() throws IOException {
/* 1 */             InputStream inputStream = this.zza;
/* 3 */             if (inputStream != null) {
/* 5 */                 inputStream.close();
                    }
                }

                @Override
                public final void mark(int i) {
/* 1 */             InputStream inputStream = this.zza;
/* 3 */             if (inputStream != null) {
/* 5 */                 inputStream.mark(i);
                    }
                }

                @Override
                public final boolean markSupported() {
/* 1 */             return true;
                }

                @Override
                public final int read() {
/* 5 */             return zzb().read();
                }

                @Override
                public final void reset() throws IOException {
/* 1 */             InputStream inputStream = this.zza;
/* 3 */             if (inputStream != null) {
/* 5 */                 inputStream.reset();
                    }
                }

                @Override
                public final long skip(long j) {
/* 5 */             if (j <= 0) {
/* 1 */                 return 0L;
                    }
/* 12 */            return zzb().skip(j);
                }

                public final String toString() {
/* 11 */            return IlIi0I0.I000lI("ParcelableInputStream[V: ", String.valueOf(this.zzb), "]");
                }

                public final int zza(Parcel parcel) {
/* 1 */             Parcelable parcelable = this.zzb;
/* 3 */             int iDataPosition = parcel.dataPosition();
/* 11 */            parcel.writeParcelable(parcelable, parcelable.describeContents());
/* 18 */            return parcel.dataPosition() - iDataPosition;
                }

                @Override
/* 9 */         public final int read(byte[] bArr, int i, int i2) {
/* 10 */            return zzb().read(bArr, i, i2);
                }
            }
